package com.ssm.service;

import com.ssm.pojo.UsedPwdExample;
import com.ssm.pojo.UsedPwdKey;
import com.ssm.pojo.User;
import com.ssm.pojo.UsedPwdExample.Criteria;

import java.text.ParseException;
import java.util.List;

public interface IUserService {
	 public int insert(String username,String pwd,String rname,String idtype,String idno,String phone,String area) throws ParseException;//插入用户
	 public User select(String username);//选择用户
	 //public Boolean update(String username,String pwd,String rname,String idtype,String idno,String phone,String area,Integer rentlv,Integer landlv) throws ParseException;//更新用户
	 public List<User> select_all();
	 public int upd_info(String username,String rname,String idtype,String idno,String phone,String area) throws ParseException;//update information
	 public int upd_phone(String username,String phone) throws ParseException;//update phone number
	 public int upd_pwd(String username,String pwd) throws ParseException ;//update password
	 public int inc_rl(String username) ;//upgrade the tenant member level
	 public int inc_ll(String username);//upgrade the landlord member level
	 public int login(String username,String password);//try to login
	 public int delete(String username);
}