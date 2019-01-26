package com.ssm.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.ssm.pojo.WantedHouse;

public interface IWantedHouseService {
	public List<WantedHouse> select(String country, String province, String city, String district);//根据区域选择
	public List<WantedHouse> select(String username);//根据用户名选择
	public List<WantedHouse> select(String country, String province, String city, String district,
			String type, Integer area,Integer elevator, Integer floor,Integer rent);
	public WantedHouse select(Integer house_id);
	public List<WantedHouse> select_all();
	public int delete(Integer house_id) ;//根据房屋号码删除
	public int update(WantedHouse house)throws ParseException;//根据主键更新
	public int insert(WantedHouse house)throws ParseException;
	
}

