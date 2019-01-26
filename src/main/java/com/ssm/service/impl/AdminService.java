package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.AdminMapper;
import com.ssm.pojo.Admin;
import com.ssm.pojo.AdminExample;
import com.ssm.pojo.User;
import com.ssm.service.IAdminService;

@Service("AdminService")
public class AdminService implements IAdminService{
	@Resource
    private AdminMapper AdminDao;
    public int insert(String username,String pwd)  {	//插入管理员账户
		if(AdminDao.selectByPrimaryKey(username)!=null) return -1;	//User name already exists
		Admin admin = new Admin(username,pwd);
    	AdminDao.insert(admin);
    	return 1;
	}
    public List<Admin> select() {	//select all
    	AdminExample example = new AdminExample();
    	return AdminDao.selectByExample(example);
    }
    public Admin select(String username) {	//根据用户名选择管理员账户
    	return AdminDao.selectByPrimaryKey(username);
    }
    public int delete(String username) {	//根据主键删除管理员账户
    	AdminDao.deleteByPrimaryKey(username);
    	return 1;
    }
    public int update(String name,String pwd) {	//根据主键更新管理员账户
    	Admin admin = new Admin();
    	admin.setUsername(name);
    	admin.setPassword(pwd);
    	AdminDao.updateByPrimaryKeySelective(admin);
    	return 1;
    }
    public int login(String username,String password) {
    	Admin user=select(username);
    	if(user==null) {			
    		return -1;//username not found
    	}
    	if(user.getPassword().equals(password)) return 1; //success
    	return -2;	//password error
    }
}
