package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Admin;

public interface IAdminService {
    public int insert(String username,String pwd);	//插入管理员账户
    public List<Admin> select();	//选择管理员账户
    public Admin select(String username);	//根据用户名选择管理员账户
    public int delete(String username);	//根据主键删除管理员账户
    public int update(String name,String pwd) ;	//根据主键更新管理员账户
    public int login(String username,String password);
}
