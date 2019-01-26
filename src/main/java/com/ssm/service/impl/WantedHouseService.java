package com.ssm.service.impl;
import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.WantedHouseMapper;
import com.ssm.pojo.WantedHouse;
import com.ssm.pojo.WantedHouseExample;
import com.ssm.pojo.WantedHouseExample.Criteria;
import com.ssm.service.IWantedHouseService;
import com.util.MyUtil;

@Service("WantedHouseService")
    
public class WantedHouseService implements IWantedHouseService{
	@Resource
    private WantedHouseMapper WantedHouseDao;
	public List<WantedHouse> select(String country, String province, String city, String district){
		WantedHouseExample example = new WantedHouseExample();
		Criteria criteria = example.createCriteria();
		if(country!=null) criteria.andCountryEqualTo(country);
		if(province!=null) criteria.andProvinceEqualTo(province);
		if(city!=null) criteria.andCityEqualTo(city);
		if(district!=null) criteria.andDistrictEqualTo(district);
		return WantedHouseDao.selectByExample(example);
	}
	public List<WantedHouse> select(String username){
		WantedHouseExample example = new WantedHouseExample();
		Criteria criteria = example.createCriteria();
		if(username!=null) criteria.andUsernameEqualTo(username);
		return WantedHouseDao.selectByExample(example);
	}
	public WantedHouse select(Integer house_id){
		return WantedHouseDao.selectByPrimaryKey(house_id);
	}
	public List<WantedHouse> select_all(){
		WantedHouseExample example=new WantedHouseExample();
		return WantedHouseDao.selectByExample(example);
	}
	public List<WantedHouse> select(String country, String province, String city, String district,
			String type, Integer area,Integer elevator, Integer floor,Integer rent){
		WantedHouseExample example = new WantedHouseExample();
		Criteria criteria = example.createCriteria();
		if(country!=null) criteria.andCountryEqualTo(country);
		if(province!=null) criteria.andProvinceEqualTo(province);
		if(city!=null) criteria.andCityEqualTo(city);
		if(district!=null) criteria.andDistrictEqualTo(district);
		if(type!=null) criteria.andTypeEqualTo(type);
		if(area!=null) {
			criteria.andArea_lbLessThanOrEqualTo(area);
			criteria.andArea_ubGreaterThanOrEqualTo(area);
		}
		if(elevator!=null) criteria.andElevatorEqualTo(elevator);
		if(floor!=null) {
			criteria.andFloor_lbLessThanOrEqualTo(floor);
			criteria.andFloor_ubGreaterThanOrEqualTo(floor);
		}
		if(rent!=null) {
			criteria.andRent_lbLessThanOrEqualTo(rent);
			criteria.andRent_ubGreaterThanOrEqualTo(rent);
		}
		return WantedHouseDao.selectByExample(example);
	}
	public int insert(WantedHouse house) throws ParseException{
		house.setHouse_id(null);
		house.setRegistration_time(MyUtil.getNowDate());
		house.setModification_time(MyUtil.getNowDate());
		WantedHouseDao.insert(house);
		return 1;
	}
	public int delete(Integer house_id) {
		WantedHouseDao.deleteByPrimaryKey(house_id);
		return 1;
	}
	public int update(WantedHouse house) throws ParseException {
		house.setModification_time(MyUtil.getNowDate());
		WantedHouseDao.updateByPrimaryKeySelective(house);
		return 1;
	}
}
