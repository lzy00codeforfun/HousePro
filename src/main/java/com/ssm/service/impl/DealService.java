package com.ssm.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.DealMapper;
import com.ssm.dao.RentHouseMapper;
import com.ssm.pojo.Deal;
import com.ssm.pojo.DealExample;
import com.ssm.pojo.DealExample.Criteria;
import com.ssm.pojo.Member;
import com.ssm.pojo.RentHouse;
import com.ssm.pojo.User;
import com.ssm.service.IDealService;
import com.util.MyUtil;
import com.ssm.service.IEarningService;
import com.ssm.service.IMemberService;
import com.ssm.service.IRentHouseService;
import com.ssm.service.IUserService;
@Service("DealService")
public class DealService implements IDealService{
	@Resource
    private DealMapper DealDao;
	@Resource
	private RentHouseMapper RentHouseDao;
	@Resource
	private IEarningService earningSer;
	@Resource
	private IUserService userSer; 
	@Resource
	private IMemberService memberSer; 
	@Resource
	private IRentHouseService rhSer; 
	public int insert(Deal deal) {
		if(DealDao.selectByPrimaryKey(deal.getContract_id())!=null) return -1;
		DealDao.insert(deal);
		return 1;
	}
	public int update(Deal deal) {
		DealDao.updateByPrimaryKeySelective(deal);
		return 1;
	}
	public int delete(Integer contract_id) {
		DealDao.deleteByPrimaryKey(contract_id);
		return 1;
	}
	public int delete_house(Integer house_id) {
		DealExample example = new DealExample();
		Criteria criteria = example.createCriteria();
		criteria.andHouse_idEqualTo(house_id);
		return 1;
	}
	public int undo(Integer contract_id) throws ParseException {
		Deal deal=DealDao.selectByPrimaryKey(contract_id);
		RentHouse rh=new RentHouse();
		rh.setHouse_id(deal.getHouse_id());
		rh.setModification_time(MyUtil.getNowDate());
		rh.setState("0");
		RentHouseDao.updateByPrimaryKeySelective(rh);
		return 1;
	}
	public List<Deal> selectByRenter(String username, String state) {
		DealExample example = new DealExample();
		Criteria criteria = example.createCriteria();
		if(username!=null) criteria.andTenant_usernameEqualTo(username);
		if(state!=null) criteria.andStateEqualTo(state);
		return DealDao.selectByExample(example);
	}
	public List<Deal> selectByLandlord(String username, String state) {
		DealExample example = new DealExample();
		Criteria criteria = example.createCriteria();
		if(username!=null) criteria.andLandlord_usernameEqualTo(username);
		if(state!=null) criteria.andStateEqualTo(state);
		return DealDao.selectByExample(example);
	}
	public List<Deal> selectByState(String state) {
		DealExample example = new DealExample();
		Criteria criteria = example.createCriteria();
		if(state!=null) criteria.andStateEqualTo(state);
		return DealDao.selectByExample(example);
	}
	public List<Deal> selectByDate(Date from,Date to,String state) {
		DealExample example = new DealExample();
		Criteria criteria = example.createCriteria();
		if(from!=null&&to!=null) {
			criteria.andModification_timeBetween(from,to);
		}
		if(state!=null) criteria.andStateEqualTo(state);
		return DealDao.selectByExample(example);
	}
	public int make(Integer contract_id) throws ParseException {
		Deal deal=DealDao.selectByPrimaryKey(contract_id);
		deal.setModification_time(MyUtil.getNowDate());
		deal.setState("1");		//accept
		DealDao.updateByPrimaryKeySelective(deal);
		DealExample example = new DealExample();
		Criteria criteria = example.createCriteria();
		criteria.andHouse_idEqualTo(deal.getHouse_id());
		criteria.andContract_idNotEqualTo(contract_id);
		Deal udeal=new Deal();
		udeal.setState("-1");	//reject
		DealDao.updateByExampleSelective(udeal,example);
		RentHouse rh=new RentHouse();
		rh.setHouse_id(deal.getHouse_id());
		rh.setModification_time(MyUtil.getNowDate());
		rh.setState("1");	//Have been leased
		RentHouseDao.updateByPrimaryKeySelective(rh);
		//System.out.println("update completed"+deal.getHouse_id());
		rh=RentHouseDao.selectByPrimaryKey(deal.getHouse_id());
		//System.out.println(rh==null);
		earningSer.add(MyUtil.S2D(MyUtil.Date2Month(deal.getModification_time())+"-1"),rh.getCountry(),rh.getProvince(),rh.getCity(),(long)deal.getLandlord_agency_fee()+deal.getTenant_agency_fee());
		return 1;
	}
	public int reject(Integer contract_id) throws ParseException {
		Deal deal=DealDao.selectByPrimaryKey(contract_id);
		deal.setModification_time(MyUtil.getNowDate());
		deal.setState("-1");
		DealDao.updateByPrimaryKeySelective(deal);
		return 1;
	}
	public List<Deal> selectByPlace(String province,Date from,Date to) {
		return DealDao.selectByPlace(province,from,MyUtil.EndMonth(to));
	}
	
	public int request_deal(String renter_username,Integer house_id,Integer month) throws ParseException { //number of month
		System.out.println("in request myutil");
		System.out.println("house_id"+house_id);
		RentHouse house=rhSer.select(house_id);
		System.out.println("select house done");
		
		if(house==null) {
			return -1;
		}
		System.out.println("house"+house.toString());
		User renter=userSer.select(renter_username);
		if(renter==null) return -1;
		User landlord=userSer.select(house.getUsername());
		if(landlord==null) return -1; 
		Date nowd=MyUtil.getNowDate();
		Integer tol=house.getRent()*month;
		Member rm=memberSer.select(renter.getRenter_lv());
		Member lm=memberSer.select(landlord.getLandlord_lv());
		Integer coid=null;
		System.out.println("begin insert deal");
		Deal deal=new Deal(coid,renter_username,landlord.getUsername(),house_id,nowd,MyUtil.NextDay(nowd,month),house.getRent(),tol,(int)(tol*rm.getFee_rate()),(int)(tol*lm.getFee_rate()),
					"0",nowd,nowd);
		insert(deal);
		System.out.println("insert deal done");
		return 1;
	}
}
