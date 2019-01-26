package com.ssm.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.ssm.pojo.RentHouse;
import com.ssm.pojo.WantedHouse;

public interface IRentHouseService {
	public List<RentHouse> select(String country, String province, String city, String district);//根据区域选择
	public List<RentHouse> select(String username);//根据用户名选择
	public List<RentHouse> select(String country, String province, String city, String district,
			String type, Integer area_lb, Integer area_ub,Integer elevator, Integer floor_lb,
			Integer floor_ub,Integer rent_lb,Integer rent_ub,String state);
	public List<RentHouse> select_all();
	public RentHouse select(Integer house_id);
	public int delete(Integer house_id) ;//根据房屋号码删除
	public int update(RentHouse house)throws ParseException;//根据主键更新
	public int insert (RentHouse house)throws ParseException;
	
}
