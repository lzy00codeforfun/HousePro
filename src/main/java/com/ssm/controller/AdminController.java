package com.ssm.controller;

import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.alibaba.fastjson.*;
import com.ssm.pojo.User;
import com.ssm.pojo.Deal;
import com.ssm.service.IUserService;
import com.ssm.service.IAdminService;
import com.ssm.service.IDealService;
import com.ssm.service.IMemberService;
import com.util.MyUtil;

@Controller

@RequestMapping("/admin")
public class AdminController {
	 	@Resource
	    private IUserService userService;
	 	@Resource
	    private IAdminService adminService;
	    @Resource 
	    private IDealService dealService;
	    @Resource
	    private IMemberService memberService;

		@RequestMapping("/AdminFront")
		public String showUserInfor(HttpServletRequest request,Model model) {
			String username=(String)request.getSession().getAttribute("curuser");
			List<User> userlist=this.userService.select_all();
			model.addAttribute("cuser",username);
			model.addAttribute("userlist",userlist);
		//	model.addAttribute("username",username);
//			List<deallist> deallist=this.userService.getUserRequestByUserName(username);
//			model.addAttribute("deallist",deallist);
			return "admin/frontpage";
		}
		
		@RequestMapping("/exit")
		public String exit(HttpServletRequest request, Model model) {
			request.getSession().invalidate();
			return "redirect:/FrontPage";
		}
		
		
		 @RequestMapping(value="/logincheck/turn",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
		    public String logincheckturn(HttpServletRequest request,Model model) {
		    	System.out.println("login turn request");
		    	model.addAttribute("login",1);
		    	model.addAttribute("username",request.getSession().getAttribute("curuser").toString());
		        return "redirect:/FrontPage"; 	
		    }
		  
		    @RequestMapping(value="/loginturn",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
		    public String loginturn(HttpServletRequest request,Model model) {
		    	System.out.println("login direct turn");
		    	String username=request.getParameter("account");
		    	String password=request.getParameter("password");
		        Integer result=this.adminService.login(username,password);
		        if(result==1) {		//��½�ɹ���ֱ����ת��ҳ;
		        	request.getSession().setAttribute("curuser", username);
		        	model.addAttribute("login",1);
		        	model.addAttribute("username",username);
		        	model.addAttribute("cuser",username);
		        	return "redirect:AdminFront";
		        }
		        else if (result==-1) {
		        	model.addAttribute("msg","account already have");
		        	return "../tologin";	
		        }
		        else {
		        	model.addAttribute("msg","password wrong");
		        	return "../tologin";
		        }
		    }
		    
		    @ResponseBody
		    @RequestMapping(value="/logincheck/ret",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
		    public String logincheckmsg(String account, String password,HttpServletRequest request) {
		    	System.out.println("login Check ResponseBody");
		    	String username=account;
		    	System.out.println(username);
		        System.out.println(password);
		        Integer result=this.adminService.login(account,password);
		        System.out.println("result"+result.toString());
		        String jsonstr="";
		        if(result==1) {
		        	request.getSession().setAttribute("curuser", account);
		        	jsonstr="{code:'1',msg:'login sucessfully'}";
		        }
		        else if (result==-1) {
		        	jsonstr="{code:'-1',msg:'用户名不存在'}";
		        }
		        else {
		        	jsonstr="{code:'-2',msg:'密码错误'}";
		        }
		        jsonstr="["+jsonstr+"]";
		        System.out.println(jsonstr);
		        String ret=JSON.parseArray(jsonstr).toJSONString();
		        System.out.println(ret);
		        return ret;
		
		    }
		    
		    
		    @RequestMapping("/getUserDetail")
		    public String getUserDetail(HttpServletRequest request,Model model) {
		    	String getuser=request.getParameter("getuser");
		    	User user=this.userService.select(getuser);
		    	int rl=this.memberService.getrate(user.getRenter_lv());
		    	int ll=this.memberService.getrate(user.getLandlord_lv());
		    	model.addAttribute("renter_lv",rl);
		    	model.addAttribute("landlord_lv",ll);
		    	model.addAttribute("cuser",request.getSession().getAttribute("curuser"));
		    	model.addAttribute("user",user);
		    	
		    	return "admin/adminGetUser";
		    }
		    
		    @RequestMapping("/levelUpRenter")
		    public String levelUpRenter(HttpServletRequest request,Model model) {
		    	String getuser=request.getParameter("getuser");
		    	this.userService.inc_rl(getuser);
		    	User user=this.userService.select(getuser);
		    	model.addAttribute("cuser",request.getSession().getAttribute("curuser"));
		    	model.addAttribute("user",user);
		    	int rl=this.memberService.getrate(user.getRenter_lv());
		    	int ll=this.memberService.getrate(user.getLandlord_lv());
		    	model.addAttribute("renter_lv",rl);
		    	model.addAttribute("landlord_lv",ll);
		    	return "admin/adminGetUser";
		    }
		    
		    @RequestMapping("/deleteUser")
		    public String deleteUser(HttpServletRequest request,Model model) {
		    	String getuser=request.getParameter("getuser");
		    	this.userService.delete(getuser);
		    	model.addAttribute("cuser",request.getSession().getAttribute("curuser"));
		    	return "admin/AdminFront";
		    }
		    
		    @RequestMapping("/levelUpLandlord")
		    public String levelUpLandlord(HttpServletRequest request,Model model) {
		    	String getuser=request.getParameter("getuser");
		    	this.userService.inc_ll(getuser);
		    	User user=this.userService.select(getuser);
		    	model.addAttribute("cuser",request.getSession().getAttribute("curuser"));
		    	int rl=this.memberService.getrate(user.getRenter_lv());
		    	int ll=this.memberService.getrate(user.getLandlord_lv());
		    	model.addAttribute("renter_lv",rl);
		    	model.addAttribute("landlord_lv",ll);
		    	model.addAttribute("user",user);
		    	return "admin/adminGetUser";
		    }
}
