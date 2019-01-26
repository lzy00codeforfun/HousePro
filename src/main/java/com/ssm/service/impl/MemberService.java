package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.MemberMapper;
import com.ssm.pojo.Member;
import com.ssm.pojo.MemberExample;
import com.ssm.service.IMemberService;

@Service("MemberService")
public class MemberService implements IMemberService{
	@Resource
    private MemberMapper MemberDao;
	public Member select(Integer level) {
		return MemberDao.selectByPrimaryKey(level);
	}
	public List<Member> select_all() {
		MemberExample example=new MemberExample();
		return MemberDao.selectByExample(example);
	}
	public int update(Integer level,String member_name,Float fee_rate) {
		Member member=new Member(level,member_name,fee_rate);
		MemberDao.updateByPrimaryKeySelective(member);
		return 1;
	}
	public int insert(Integer level,String member_name,Float fee_rate) {
		Member member=new Member(level,member_name,fee_rate);
		if(MemberDao.selectByPrimaryKey(level)!=null) return -1;	//level already existed
		MemberDao.insert(member);
		return 1;
	}
	public int getrate(Integer level) {
		Member member=MemberDao.selectByPrimaryKey(level);
		return (int)(member.getFee_rate()*100);
	}
}
