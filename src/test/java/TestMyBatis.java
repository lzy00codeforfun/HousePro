
import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.ssm.service.IAdminService;
import com.ssm.service.IDealService;
import com.ssm.service.IEarningService;
import com.ssm.service.IMemberService;
import com.ssm.service.IPhotoService;
import com.ssm.service.IRentHouseService;
import com.ssm.service.IUsedPwdService;
import com.ssm.service.IUserService;
import com.ssm.service.IWantedHouseService;
import com.alibaba.fastjson.JSON;
import com.ssm.pojo.User;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.text.*;

import com.ssm.dao.AdminMapper;
import com.ssm.dao.EarningMapper;
import com.ssm.dao.UserMapper;
import com.ssm.pojo.Admin;
import com.ssm.pojo.AdminExample;
import com.ssm.pojo.AdminExample.Criteria;
import com.ssm.pojo.Earning;
import com.ssm.pojo.EarningKey;
import com.util.MyUtil;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })


public class TestMyBatis {
	@Resource
	private IAdminService adminSer; 
	@Resource
	private IEarningService earningSer; 
	@Resource
	private IUserService userSer; 
	@Resource
	private IDealService dealSer; 
	@Resource
	private IPhotoService photoSer; 
	@Resource
	private IMemberService memberSer; 
	@Resource
	private IRentHouseService rhSer; 
	@Resource
	private IWantedHouseService whSer; 
	@Resource
	private IUsedPwdService pwdSer; 
	
    @Test
    public void test() throws ParseException {
    	System.out.println("hello world");
    	//insert();
    	/*
    	adminSer.select();
    	
    	adminSer.update("abc1","aaa");
    	adminSer.select();
    	//insert_user();*/
    	System.out.println(userSer.insert("user123","Abc1234","zk","ID_card","130203198003042456","18812341234","Beijing"));
    	System.out.println(userSer.upd_pwd("user123","123abc1"));
    	System.out.println("login:"+userSer.login("user123","123abc"));
    	System.out.println("inc_ll:"+userSer.inc_ll("user123"));
    	userSer.upd_info("user123","zkb",null,"3211231","333333","Beijing");
    	earningSer.add(MyUtil.S2D("2018-12-1"),"China","Beijing","Beijing",(long) 1000);
    	System.out.println(rhSer.select("abc"));
    	System.out.println(earningSer.select(MyUtil.S2D("2018-12-2"),MyUtil.S2D("2018-12-2")));
    }
}
