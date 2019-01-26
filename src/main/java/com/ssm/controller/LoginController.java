package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

  //  @Resource
   // private IUserService userService;

    @RequestMapping("/login/validate")
    public String toIndex(HttpServletRequest request, Model model) {
        String username=request.getParameter("UserAccount");
        String password=request.getParameter("UserPassword");
        if(username.equals("liuzhaoyan")&password.equals("123456")){
        	model.addAttribute("username",request.getSession().getAttribute("useraccount"));
        	model.addAttribute("ttt",request.getSession().getAttribute("testtt"));
        	return "customer";
        }
       return "login";
    }
    @RequestMapping("/userInfor")
    public String UserInforShow(HttpServletRequest request, Model model) {
    	
    	return "userInfor";
    }
    @RequestMapping("/logout")
    public String logOut(HttpServletRequest request, Model model) {
    	return "login";
    }
    @RequestMapping("/transferlogin")
    public String Transfer(HttpServletRequest request, Model model) {
    	String username=request.getParameter("account");
    	String pass=request.getParameter("pass");
    	request.getSession().setAttribute("useraccount", username);
    	request.getSession().setAttribute("testtt","ksdfjksdl");
    	model.addAttribute("testsession",request.getSession().getAttribute("useraccount"));
    	return "login";
    }
}