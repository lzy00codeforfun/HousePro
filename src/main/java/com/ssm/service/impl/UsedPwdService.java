package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UsedPwdMapper;
import com.ssm.pojo.UsedPwdExample;
import com.ssm.pojo.UsedPwdExample.Criteria;
import com.ssm.pojo.UsedPwdKey;
import com.ssm.service.IUsedPwdService;

@Service("UsedPwdService")

public class UsedPwdService implements IUsedPwdService{
	@Resource
    private UsedPwdMapper UsedPwdDao;
	public Boolean insert(String username, String password) {
		UsedPwdExample example = new UsedPwdExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<UsedPwdKey> list=UsedPwdDao.selectByExample(example);
		if(list.isEmpty()==false) {
			return false;
		}
		UsedPwdDao.insert(new UsedPwdKey(username,password));
		return true;
	}
    public List<UsedPwdKey> select(String username) {
		UsedPwdExample example = new UsedPwdExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		return UsedPwdDao.selectByExample(example);
	}
    public List<UsedPwdKey> select_all() {
		UsedPwdExample example = new UsedPwdExample();
		return UsedPwdDao.selectByExample(example);
	}
}
