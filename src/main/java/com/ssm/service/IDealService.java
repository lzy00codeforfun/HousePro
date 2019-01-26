package com.ssm.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.ssm.pojo.Deal;

public interface IDealService {
	public int insert(Deal deal);
	public int update(Deal deal);
	public int delete(Integer contract_id);
	public int delete_house(Integer house_id) ;
	public int undo(Integer contract_id) throws ParseException;
	public int make(Integer contract_id) throws ParseException;
	public List<Deal> selectByRenter(String username, String state);
	public List<Deal> selectByLandlord(String username, String state) ;
	public List<Deal> selectByState(String state);
	public List<Deal> selectByDate(Date from,Date to,String state);
	public int reject(Integer contract_id) throws ParseException;
	public List<Deal> selectByPlace(String province,Date from,Date to);
	public int request_deal(String renter_username,Integer house_id,Integer month) throws ParseException;
}
