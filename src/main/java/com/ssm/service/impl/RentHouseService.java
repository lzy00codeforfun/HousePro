package com.ssm.service.impl;

import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.DealMapper;
import com.ssm.dao.RentHouseMapper;
import com.ssm.pojo.RentHouse;
import com.ssm.pojo.RentHouseExample;
import com.ssm.pojo.RentHouseExample.Criteria;
import com.ssm.service.IRentHouseService;
import com.util.MyUtil;
import com.ssm.service.IDealService;

@Service("RentHouseService")

public class RentHouseService implements IRentHouseService{
	@Resource
    private RentHouseMapper RentHouseDao;
	@Resource
	private IDealService dealSer; 
	public List<RentHouse> select(String country, String province, String city, String district){
		RentHouseExample example = new RentHouseExample();
		Criteria criteria = example.createCriteria();
		if(country!=null) criteria.andCountryEqualTo(country);
		if(province!=null) criteria.andProvinceEqualTo(province);
		if(city!=null) criteria.andCityEqualTo(city);
		if(district!=null) criteria.andDistrictEqualTo(district);
		return RentHouseDao.selectByExample(example);
	}
	public List<RentHouse> select(String username){
		RentHouseExample example = new RentHouseExample();
		Criteria criteria = example.createCriteria();
		if(username!=null) criteria.andUsernameEqualTo(username);
		return RentHouseDao.selectByExample(example);
	}
	public List<RentHouse> select(String country, String province, String city, String district,
			String type, Integer area_lb, Integer area_ub,Integer elevator, Integer floor_lb,Integer floor_ub,Integer rent_lb,Integer rent_ub,String state){
		RentHouseExample example = new RentHouseExample();
		Criteria criteria = example.createCriteria();
		if(country!=null) criteria.andCountryEqualTo(country);
		if(province!=null) criteria.andProvinceEqualTo(province);
		if(city!=null) criteria.andCityEqualTo(city);
		if(district!=null) criteria.andDistrictEqualTo(district);
		if(type!=null) criteria.andTypeEqualTo(type);
		if(area_lb!=null&&area_ub!=null) criteria.andAreaBetween(area_lb,area_ub);
		if(elevator!=null) criteria.andElevatorEqualTo(elevator);
		if(rent_lb!=null&&rent_ub!=null) criteria.andRentBetween(rent_lb,rent_ub);
		if(floor_lb!=null&&floor_ub!=null) criteria.andFloorBetween(floor_lb,floor_ub);
		if(state!=null)criteria.andStateEqualTo(state);
		return RentHouseDao.selectByExample(example);
	}
	public RentHouse select(Integer house_id){
		return RentHouseDao.selectByPrimaryKey(house_id);
	}
	public List<RentHouse> select_all(){
		RentHouseExample example=new RentHouseExample();
		return RentHouseDao.selectByExample(example);
	}
	public int insert(RentHouse house) throws ParseException {
		house.setHouse_id(null);
		house.setRegistration_time(MyUtil.getNowDate());
		house.setModification_time(MyUtil.getNowDate());
		RentHouseDao.insert(house);
		return house.getHouse_id();
	}
	public int delete(Integer house_id) {
		if(house_id==null) return -1; 	//	null of house_id is forbidden
		RentHouseDao.deleteByPrimaryKey(house_id);
		dealSer.delete_house(house_id);
		return 1;
	}
	public int update(RentHouse house) throws ParseException {
		if(house.getHouse_id()==null) return -1; 	//	null of house_id is forbidden
		house.setModification_time(MyUtil.getNowDate());
		RentHouseDao.updateByPrimaryKeySelective(house);
		return 1;
	}
}
