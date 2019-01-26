package com.ssm.service;

import java.util.Date;
import java.util.List;

import com.ssm.pojo.Earning;
import com.ssm.pojo.Tran;
import com.ssm.pojo.Trans;

public interface IEarningService {
	public int add(Date month,String country,String province,String city,Long income); 	//更新收益(增加一条内容)
	public List<Earning> select(Date from,Date to);//查询from到to月内的收益信息
	public List<Earning> select(String country,String province,String city,Date from,Date to);
	public List<Earning> select_all();
	public String selectByMonth(Date from,Date to,String province);
	public String selectSortNo(Date from,Date to);
	public String selectSortFee(Date from,Date to);
}
