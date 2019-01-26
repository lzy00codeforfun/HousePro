package com.ssm.controller;


import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.RentHouse;
import com.ssm.pojo.User;
import com.ssm.service.IRentHouseService;
import com.util.MyUtil;
@Controller
public class FrontPageController {

	@RequestMapping("/tologin")
    public String tologin(HttpServletRequest request,Model model) {
    	model.addAttribute("msg","�ȵ�¼");
    	return "/tologin";
    }
	@RequestMapping("/toadminlogin")
    public String toadminlogin(HttpServletRequest request,Model model) {
    	model.addAttribute("msg","�ȵ�¼");
    	return "admin/tologin";
    }
	@RequestMapping("/toregister")
    public String toregister(HttpServletRequest request,Model model) {
    	model.addAttribute("msg","ע��");
    	return "/toregister";
    }
	@RequestMapping("/FrontPage")
    public String toFrontPage(HttpServletRequest request,Model model) {
		System.out.println("ask for FrontPage");
		String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("login",0);
    		return "../../index";
    	}	
    	System.out.println("login ok front page");
		model.addAttribute("login",1);
    	model.addAttribute("username",curuser);
    	model.addAttribute("cuser",curuser);
    	return "../../index";
    }
}
