package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Member;

public interface IMemberService {
	public Member select(Integer level);
	public int update(Integer level,String member_name,Float fee_rate);
	public int insert(Integer level,String member_name,Float fee_rate);
	public List<Member> select_all();
	public int getrate(Integer level);
}
