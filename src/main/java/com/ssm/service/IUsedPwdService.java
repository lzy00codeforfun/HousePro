package com.ssm.service;

import java.util.List;

import com.ssm.pojo.UsedPwdKey;

public interface IUsedPwdService {
	public Boolean insert(String username, String password);
	public List<UsedPwdKey> select(String username);
	public List<UsedPwdKey> select_all();
}
