package com.ssm.controller;


import java.util.ArrayList;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.WantedHouse;
import com.ssm.pojo.Photo;
import com.ssm.pojo.RentHouse;
import com.ssm.pojo.User;
import com.ssm.service.IPhotoService;
import com.ssm.service.IWantedHouseService;
import com.util.MyUtil;


@Controller

@RequestMapping("/wantedInfor")
public class WantedInforController {
	
    @Resource
    private IWantedHouseService wantedHouseService;
    @Resource 
    private IPhotoService photoService;
    @RequestMapping("/searchFront")		//������ҳ
    public String searchFront(HttpServletRequest request,Model model) {
    	System.out.println("ask for wantedinfor/searchFront");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("msg","�ȵ�¼");
    		return "redirect:../../tologin";
    	}
    	System.out.println("wantedhouselist begin");
    	List<WantedHouse> houselist=this.wantedHouseService.select_all();
    	System.out.println("wantedhouselist done");
    	System.out.println(houselist.toString());
    	int i=0;
    	//该处需要申请图片
   	List<Photo> photolist=new ArrayList<Photo>();
    /* 	for(i=0;i<houselist.size();i++) {
    		List<Photo> tmplist=this.photoService.select(houselist.get(i).getHouse_id());
    		Photo photo=tmplist.get(0);
    		photolist.add(photo);
    	} */
    	System.out.println("phonelist get done");
    	model.addAttribute("photolist",photolist);
    	model.addAttribute("login",1);
    	model.addAttribute("cuser",curuser);
    	System.out.println(curuser);
    	System.out.println(houselist.toString());
    	model.addAttribute("houselist",houselist);
    	return "WantedHouse/SearchPage";
    }
    
//    @RequestMapping("/searchWanted")	
//	public String SearchWanted(HttpServletRequest request, Model model) {
//    	String curuser=(String)request.getSession().getAttribute("username");
//    	if(curuser==null) {
//    		model.addAttribute("msg","�ȵ�¼");
//    		return "redirct:tologin";
//    	}
//    	model.addAttribute("login",1);
//    	model.addAttribute("username",request.getSession().getAttribute("username").toString());
//    	Integer house_id = Integer.parseInt(request.getParameter("houseid"));
//    	String username = request.getParameter("username");
//    	String country = request.getParameter("country");
//    	String province = request.getParameter("province");
//    	String city = request.getParameter("city");
//    	String district = request.getParameter("district");
//    	String type = request.getParameter("type");
//    	Integer area = Integer.parseInt(request.getParameter("area"));
//    	Integer floor= Integer.parseInt(request.getParameter("floor"));
//    	Integer elevator = Integer.parseInt(request.getParameter("elevator"));
//    	String description = request.getParameter("description");
//    	Integer deposit = Integer.parseInt(request.getParameter("deposit"));
//    	Integer rent = Integer.parseInt(request.getParameter("rent"));
//    	String payment_of_rent = request.getParameter("payment_of_rent");
//    	String address = request.getParameter("address");
//    	Date registration_time = MyUtil.getNowDate();
//    	Date modification_time = MyUtil.getNowDate();
//    	List<WantedHouse> searchlist=this.wantedHouseService.s
//    			
//    			.selectWantedHouseInfor(house_id, username, country, 
//    			province,  city, district, type, area, floor, elevator, description, deposit,
//    			payment_of_rent, rent, registration_time, modification_time, address);
//    	model.addAttribute("houselist",searchlist);
//    	model.addAttribute("msg","forsearch");
//    	return "WantedHouse/searchPage";
//    }
    
    @RequestMapping("/conditionSearch")		//��������
	public String SearchFor(HttpServletRequest request, Model model) throws ParseException {
    	System.out.println("wantedhouse/conditionSearch");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("msg","�ȵ�¼");
    		return "redirect:../tologin";
    	}
    	
    	
    	System.out.println("insert house begin");
       	String cuser = (String)request.getSession().getAttribute("curuser");
      	String province = request.getParameter("province");
    	if(province=="") {
    		province=null;
    	}
    	String country=request.getParameter("country");
    	country="China";
    	
    	String city = request.getParameter("city");
    	if(city=="") {
    		city=null;
    	}
    	String district = request.getParameter("district");
    	if(district=="") {
    		district=null;
    	}
    	String community = request.getParameter("community");
    	if(community=="") {
    		community=null;
    	}
       	String type = null;
    	String s_area = request.getParameter("area");
    	
    	String s_rent = request.getParameter("rent");
    	
    	String s_floor = request.getParameter("floor");
    	
    	String s_elevator = request.getParameter("elevator");
    	Integer area=null,rent=null,floor=null,elevator=null;
    	if(s_area!=""&&s_area!=null) {
    		area = Integer.parseInt(s_area);
    		System.out.println(area.toString());
    	} else {
    		System.out.println("no area required");
    	}
    	
    	if(s_rent!=null&&s_rent!="") {
    		rent = Integer.parseInt(s_rent);
    		System.out.println(rent.toString());
    	} 
    	else {
    		System.out.println("no rent required");
    	}
    	if(s_floor!=""&&s_floor!=null) {
    		floor = Integer.parseInt(s_floor);
    	} else {
    		System.out.println("no floor required");
    	}

    	if(s_elevator!=""&&s_elevator!=null) {
    		elevator = Integer.parseInt(s_elevator);
    	} else {
    		System.out.println("no elevator required");
    	}
    	
    
    	if(elevator!=null&&elevator==2) {
    		elevator=null;
    	}
    	
       	System.out.println("begin to insert in database");
    	
    	model.addAttribute("login",1);
    	model.addAttribute("cuser",curuser);

    	List<WantedHouse> searchlist=this.wantedHouseService.select(country,  province, city,  district,
    			 type,  area, elevator,  floor, rent);
    	model.addAttribute("houselist",searchlist);
    	model.addAttribute("msg","forsearch");
    	return "WantedHouse/SearchPage";
    }
    
    @RequestMapping("/toinsertWanted")
	public String toInsertHouse(HttpServletRequest request, Model model) {
    	System.out.println("toInsertWanted");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("msg","�ȵ�¼");
    		return "redirect:../tologin";
    	}
    	model.addAttribute("cuser",curuser);
    	return "WantedHouse/ToInsert";
    }
    
    
    @RequestMapping("/insertWanted")
   	public String InsertHouse(HttpServletRequest request, Model model) throws ParseException {
    	System.out.println("insertWanted request");
       	String curuser=(String)request.getSession().getAttribute("curuser");
       	if(curuser==null) {
       		model.addAttribute("msg","�ȵ�¼");
       		return "redirect:../tologin";
       	}
       	String username = curuser;
       	String country = request.getParameter("country");
       	country="China";
       	String province = request.getParameter("province");
       	String city = request.getParameter("city");
       	String district = request.getParameter("district");
       	String bedroom=request.getParameter("bedroom");
    	System.out.println(bedroom);
       	String hall=request.getParameter("hall");
    	System.out.println(hall);
       	String bath=request.getParameter("bath");
    	System.out.println(bath);
       	String type = bedroom+"/"+hall+"/"+bath;
    	Integer area_lb = Integer.parseInt(request.getParameter("area_lb"));
    	Integer area_ub = Integer.parseInt(request.getParameter("area_ub"));
    	Integer floor_lb= Integer.parseInt(request.getParameter("floor_lb"));
    	Integer floor_ub= Integer.parseInt(request.getParameter("floor_ub"));
    	Integer elevator = Integer.parseInt(request.getParameter("elevator"));
    	Integer rent_lb = Integer.parseInt(request.getParameter("rent_lb"));
    	Integer rent_ub = Integer.parseInt(request.getParameter("rent_ub"));
       	String description = request.getParameter("description");
       	String title=request.getParameter("title");
       	Date registration_time = MyUtil.getNowDate();
       	Date modification_time = MyUtil.getNowDate();
       	String community="test";
       	Integer house_id=null;
       	Integer results=this.wantedHouseService.insert(new WantedHouse(house_id, username, country, province, city, district,
			community,  type,  area_lb,  area_ub, floor_lb,  floor_ub,
			 elevator,  title,  description,  rent_lb,  rent_ub,
			registration_time, modification_time));
       			
       	if(results==1) {
       		model.addAttribute("cuser",curuser);
       		model.addAttribute("username",curuser);
       		return "redirect:getCuserHouse";
       	}
       	else {
       		model.addAttribute("msg","����Դ��Ϣʧ��");
       		model.addAttribute("cuser",curuser);
       		return "WantedHouse/ToInsert";
       	}
       	
       }
    
    
    //������ʾ
    @RequestMapping("/getCuserHouse")
    public String GetUserHouse(HttpServletRequest request, Model model) {
    	String username =request.getParameter("username");
    	List<WantedHouse> houselist=this.wantedHouseService.select(username);  
    	int i=0;
    	List<Photo> photolist=new ArrayList<Photo>();
    	/*for(i=0;i<houselist.size();i++) {
    		List<Photo> tmplist=this.photoService.select(houselist.get(i).getHouse_id());
    		Photo photo=tmplist.get(0);
    		photolist.add(photo);
    	}*/
    	model.addAttribute("photolist",photolist);
    	model.addAttribute("houselist",houselist);
    	model.addAttribute("username",username);
    	model.addAttribute("cuser",username);
    	Integer mode=4;
    	model.addAttribute("mode",mode);
    	return "UserControl";
    }
    
    
    
    //��ʾ����ϸ��
    @RequestMapping("/getHouseDetail")
    public String GetHouse(HttpServletRequest request, Model model) {
    	System.out.println("getHouseDetail");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("login",0);
    		return "redirect:../tologin";
    	}
    	Integer HouseId = Integer.parseInt(request.getParameter("house_id"));
    	WantedHouse house=this.wantedHouseService.select(HouseId);
    //	List<Photo> photolist=this.photoService.select(HouseId);
    //	model.addAttribute("photolist",photolist);
    	model.addAttribute("house",house);
    	model.addAttribute("cuser",curuser);
    	model.addAttribute("login",1);
    	return "WantedHouse/ShowHouseDetail";
    }
    
    @RequestMapping("/updateHouse")
    public String UpdateHouse(HttpServletRequest request, Model model) throws ParseException {
    	Integer house_id = Integer.parseInt(request.getParameter("houseid"));
       	String username = request.getParameter("username");
       	String country = request.getParameter("country");
       	String province = request.getParameter("province");
       	String city = request.getParameter("city");
       	String district = request.getParameter("district");
       	String type = request.getParameter("type");
    	Integer area_lb = Integer.parseInt(request.getParameter("area_lb"));
    	Integer area_ub = Integer.parseInt(request.getParameter("area_ub"));
    	Integer floor_lb= Integer.parseInt(request.getParameter("floor_lb"));
    	Integer floor_ub= Integer.parseInt(request.getParameter("floor_ub"));
    	Integer elevator = Integer.parseInt(request.getParameter("elevator"));
    	Integer rent_lb = Integer.parseInt(request.getParameter("rent_lb"));
    	Integer rent_ub = Integer.parseInt(request.getParameter("rent_ub"));
       	String description = request.getParameter("description");
       	String community=request.getParameter("community");
       	String title=request.getParameter("title");
    	Date registration_time = null;
    	Date modification_time = MyUtil.getNowDate();
    	WantedHouse house=new WantedHouse(house_id, username, country, province, city, district,
    			community,  type,  area_lb,  area_ub, floor_lb,  floor_ub,
   			 elevator,  title,  description,  rent_lb,  rent_ub,
   			registration_time, modification_time);
    	Integer results=this.wantedHouseService.update(house);
    	if(results==1) {
    		String user=(String)request.getSession().getAttribute("username");
    		model.addAttribute("username",user);
    		return "redirect:wantedInfor/getUserHouse";
    	}
    	else {
    		model.addAttribute("msg","����Դ��Ϣʧ��");
    		return "WantedHouse/ToUpdate";
    	}
    }
    
    
    @RequestMapping("/deleteHouse")
    public String DeleteHouse(HttpServletRequest request,Model model) {
    	Integer house_id=Integer.parseInt(request.getParameter("houseid"));
    	this.wantedHouseService.delete(house_id);
    	String  username=(String)request.getSession().getAttribute("username");
		model.addAttribute("username",username);
		return "redirect:getCuserHouse";
		
    	
    }
    
    
}