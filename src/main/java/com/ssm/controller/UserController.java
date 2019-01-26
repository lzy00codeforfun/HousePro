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
import com.ssm.service.IDealService;
import com.ssm.service.IMemberService;
import com.util.MyUtil;


@Controller

@RequestMapping("/user")
public class UserController {
	
    @Resource
    private IUserService userService;
    @Resource 
    private IDealService dealService;
    @Resource 
    private IMemberService memberService;
	@RequestMapping("/UserFront")
	public String showUserInfor(HttpServletRequest request,Model model) {
		String username=(String)request.getSession().getAttribute("curuser");
		User user=this.userService.select(username);
		model.addAttribute("cuser",username);
	//	model.addAttribute("username",username);
//		List<deallist> deallist=this.userService.getUserRequestByUserName(username);
//		model.addAttribute("deallist",deallist);
		return "UserControl";
	}
    
	@RequestMapping("/exit")
	public String exit(HttpServletRequest request, Model model) {
		request.getSession().invalidate();
		return "redirect:/FrontPage";
	}
    
    @RequestMapping("/registercheck/turn")
    public String RegisterCheckturn(HttpServletRequest request, Model model) throws ParseException {
    	return "login";
    }
    
    @ResponseBody
    @RequestMapping(value="/registercheck/ret" ,produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
    public String RegisterCheckret(HttpServletRequest request, String account,String password,String real_name,String iD_type,String iD_no,String phone,String register_area) throws ParseException {
    	System.out.println("registercheck responsebody");
    	String username=(String)request.getSession().getAttribute("curuser");
        Date registration_time=MyUtil.getNowDate();
        Integer renant_lv=1;
        Integer results=this.userService.insert(username,password, real_name, iD_type, iD_no, phone, register_area);
        String jsonstr="";
        if(results==1) {
        	jsonstr="{code:'1',msg:'注册成功'}";
        }
        else if (results==-1) {
        	jsonstr="{code:'-1',msg:'注册失败'}";
        }
        String ret=JSON.parseArray(jsonstr).toJSONString();
        System.out.println(ret);
        return ret;
        
    }
    @RequestMapping(value="/registerturn",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
    public String registerturn(HttpServletRequest request,Model model) throws ParseException {
    	System.out.println("register turn request");
    	String username=request.getParameter("username");
    	String pwd=request.getParameter("password");
    	String rname=request.getParameter("real_name");
    	String phone=request.getParameter("phone");
    	String area=request.getParameter("province")+";"+request.getParameter("city");
    	String idtype=request.getParameter("card");
    	String idno=request.getParameter("id_num");
    	System.out.println(username+" "+pwd+" "+rname+" "+idtype+" "+idno+" "+phone+" "+area);
    	Integer result=this.userService.insert(username, pwd, rname, idtype, idno, phone, area);
    	if(result==1) {
    		model.addAttribute("msg","register successfully");
    		return "redirect:/tologin";
    	}
    	else  {
    		model.addAttribute("msg","account already have");
    		return "redirect:/toregister";
    	}
    //	model.addAttribute("login",1);
    //	model.addAttribute("username",request.getSession().getAttribute("username").toString());
    }
    
    @RequestMapping(value="/logincheck/turn",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
    public String logincheckturn(HttpServletRequest request,Model model) {
    	System.out.println("login turn request");
    	model.addAttribute("login",1);
    	model.addAttribute("username",request.getSession().getAttribute("username").toString());
        return "redirect:/FrontPage"; 	
    }
  
    @RequestMapping(value="/loginturn",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
    public String loginturn(HttpServletRequest request,Model model) {
    	System.out.println("login direct turn");
    	String username=request.getParameter("account");
    	String password=request.getParameter("password");
        Integer result=this.userService.login(username,password);
        if(result==1) {		//��½�ɹ���ֱ����ת��ҳ;
        	request.getSession().setAttribute("curuser", username);
        	model.addAttribute("login",1);
        	model.addAttribute("username",username);
        	return "redirect:/FrontPage";
        }
        else if (result==-1) {
        	model.addAttribute("msg","account already have");
        	return "tologin";	
        }
        else {
        	model.addAttribute("msg","password wrong");
        	return "tologin";
        }
    }
    
    @ResponseBody
    @RequestMapping(value="/logincheck/ret",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
    public String logincheckmsg(String account, String password,HttpServletRequest request) {
    	System.out.println("login Check ResponseBody");
    	String username=account;
    	System.out.println(username);
        System.out.println(password);
        Integer result=this.userService.login(account,password);
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
/*        if(username.equals("liuzhaoyan")&password.equals("123456")){
        	String jsonString="[{ttt:'12345'},{ttt:'1234'},{ttt:'1235'}"+",{ans:'"+request.getSession().getAttribute("curuser")+"'}]";
        	//Staff response=JSON.parseObject(jsonString);
        	String ret=JSON.parseArray(jsonString).toJSONString();
        	System.out.println("error in right");
        	System.out.println(ret);
        	return ret;
        	
        }
        else {
        	System.out.println("error in wrong");
        	return JSON.parseObject("{notsucessful:'object'}").toJSONString();
        }*/
    }
    
    @ResponseBody
    @RequestMapping(value="/getCuruser",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
    public String getCurUser(HttpServletRequest request)
    {
    	System.out.println("getCurUser ResponseBody");
    	String username=request.getSession().getAttribute("username").toString();
    	User user=this.userService.select(username);
    	String jsonstr_user=user.toJSONString();
    	String ret=JSON.parseArray(jsonstr_user).toJSONString();
        System.out.println("getCuruserJson: "+ret);
    	return ret;
    
    	
/*   	jsobj.put("username",user.get(username));//���int������
    	jsobj.put("password",user.password);//���string������
    	jsobj.put("real_name",user.real_name);//���string������
    	jsobj.put("ID_type",user.ID_type);//���string������
    	jsobj.put("ID_no",user.ID_no);//���string������
    	jsobj.put("phone",user.phone);//���string������
    	jsobj.put("registration_area",user.registration_area);//���string������
    	jsobj.put("registration_time",user.registration_time);//���string������
    	jsobj.put("modification_time",user.modification_time);//���string������
    	jsobj.put("password",user.password);//���string������
    	String jsonstr=JSON.parseArray(user).toJSONString();	
        //2��ʹ��JSONArray
        JSONArray jsonarray=JSONArray.parse(user);
        
        String strJson=json.toString();
        String strArray=array.toString();		*/
    }
    
    @RequestMapping("/getUserDetail")
    public String getUserDetail(HttpServletRequest request,Model model) {
    	String getuser=request.getParameter("getuser");
    	User user=this.userService.select(getuser);
    	model.addAttribute("cuser",request.getSession().getAttribute("curuser"));
    	Integer rent_lv=this.memberService.getrate(user.getRenter_lv());
    	Integer landlord_lv=this.memberService.getrate(user.getLandlord_lv());
    	model.addAttribute("rl",rent_lv);
    	model.addAttribute("ll",landlord_lv);
    	model.addAttribute("user",user);
    	return "userGetUser";
    }
    
    @RequestMapping("/getSelfInfor")
    public String getSelfInfor(HttpServletRequest request,Model model) {
    	System.out.println("getselfinfor");
    	String username=request.getParameter("username");
    	User user=this.userService.select(username);
    	Integer rl=this.memberService.getrate(user.getRenter_lv());
    	Integer ll=this.memberService.getrate(user.getLandlord_lv());
    	model.addAttribute("rl",rl);
    	model.addAttribute("ll",ll);
    	System.out.println(user.toString());
    	model.addAttribute("user",user);
    	model.addAttribute("cuser",username);
    	Integer mode=6;
    	model.addAttribute("mode",mode);
    	return "UserControl";
    }
    
    @RequestMapping("/getBeingAsked")
    public String getBeingAsked(HttpServletRequest request,Model model) {
    	System.out.println("getbeingAsked");
    	String username=request.getParameter("username");
    	List<Deal> deallist=this.dealService.selectByLandlord(username, "0");
    	model.addAttribute("deallist",deallist);
    	model.addAttribute("cuser",username);
    	model.addAttribute("mode",1);
    	return "UserControl";
    }
    
    @RequestMapping("/getSelfAsk")
    public String getSelfAsk(HttpServletRequest request,Model model) {
    	System.out.println("getSelfAsk");
    	String username=request.getParameter("username");
    	System.out.println(username);
    	List<Deal> deallist=this.dealService.selectByRenter(username, "0");
    	System.out.println(deallist.toString());
    	model.addAttribute("deallist",deallist);
    	model.addAttribute("cuser",username);
    	model.addAttribute("mode",2);
    	return "UserControl";
    }
    
    @RequestMapping("/getSelfDoneDeal")
    public String getSelfDoneDeal(HttpServletRequest request,Model model) {
    	System.out.println("getSelfDoneDeal");
    	String username=request.getParameter("username");
    	String state="1";
    	List<Deal> wantdeallist=this.dealService.selectByRenter(username, state);
    	wantdeallist.addAll(this.dealService.selectByRenter(username, "-1"));
    	List<Deal> housedeallist=this.dealService.selectByLandlord(username, state);
    	housedeallist.addAll(this.dealService.selectByLandlord(username, "-1"));
    	String url="http://localhost:8080/housepro/localimg/"+"cover.jpg";
    	model.addAttribute("wantdeallist",wantdeallist);
    	model.addAttribute("housedeallist",housedeallist);
    	System.out.println("want"+wantdeallist.toString());
    	System.out.println("house"+housedeallist.toString());
    	model.addAttribute("cuser",username);
    	model.addAttribute("mode",3);
    	return "UserControl";
    }
    
    @RequestMapping("/updatephone")
    public String updatephone(HttpServletRequest request,Model model) throws ParseException {
    	System.out.println("updatephone");
    	String phone=request.getParameter("newphone");
    	
    	String username=(String)request.getSession().getAttribute("curuser");
    	System.out.println(username);
    	this.userService.upd_phone(username, phone);
    	User user=this.userService.select(username);
    	model.addAttribute("user",user);
    	model.addAttribute("cuser",username);
    	model.addAttribute("mode",6);
    	return "UserControl";
    }
    
    @RequestMapping("/updatepassword")
    public String updatepassword(HttpServletRequest request,Model model) throws ParseException {
    	System.out.println("updatepassword");
    	String password=request.getParameter("newpassword");
    	String username=(String)request.getSession().getAttribute("curuser");
    	System.out.println(username);
    	this.userService.upd_pwd(username, password);
    	System.out.println(password);
    	User user=this.userService.select(username);
    	model.addAttribute("user",user);
    	model.addAttribute("cuser",username);
    	model.addAttribute("mode",6);
    	return "UserControl";
    }
    
    
    @RequestMapping("/RequireHouse")		//用户申请预定房源
    public String RequireHosue(HttpServletRequest request,Model model) throws ParseException {
    	System.out.println("require house contract");
    	Integer house_id=Integer.parseInt(request.getParameter("house_id"));
    	System.out.println(house_id);
    //	Integer contract_id=null;
    	String tenant_username=(String)request.getSession().getAttribute("curuser");
    	System.out.println(tenant_username);
 // landlord_username=request.getParameter("landlord");
    	Integer month=Integer.parseInt(request.getParameter("month"));
    	System.out.println(month);
    	//MyUtil myutil=new MyUtil();
    	this.dealService.request_deal(tenant_username, house_id, month);
    	System.out.println("request_deal done");
    	model.addAttribute("username",tenant_username);
    	return "redirect:getSelfAsk";
    }
    
    @RequestMapping("/DenyDeal")
    public String DenyDeal(HttpServletRequest request,Model model) throws ParseException {
    	System.out.println("Deny Deal");
    	Integer contract_id=Integer.parseInt(request.getParameter("contract_id"));
    	this.dealService.reject(contract_id);
    	String username=(String)request.getSession().getAttribute("curuser");
    	model.addAttribute("username",username);
    	return "redirect:getSelfDoneDeal";
    }
    
    @RequestMapping("/MakeDeal")
    public String MakeDeal(HttpServletRequest request,Model model) throws ParseException {
    	System.out.println("make_deal");
    	Integer contract_id=Integer.parseInt(request.getParameter("contract_id"));
    	System.out.println("contract_id"+contract_id.toString());
    	this.dealService.make(contract_id);
    	System.out.println("make_deal done");
    	String username=(String)request.getSession().getAttribute("curuser");
    	model.addAttribute("username",username);
    	return "redirect:getSelfDoneDeal";
    }
}