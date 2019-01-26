package com.ssm.controller;


import java.util.ArrayList;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.ssm.pojo.RentHouse;
import com.ssm.pojo.Photo;
import com.ssm.pojo.User;
import com.ssm.service.IRentHouseService;
import com.ssm.service.IPhotoService;
import com.util.MyUtil;


@Controller

@RequestMapping("/houseInfor")
public class HouseInforController {
	
    @Resource
    private IRentHouseService rentHouseService;
    @Resource 
    private IPhotoService photoService;

    @RequestMapping("/searchFront")
    public String searchFront(HttpServletRequest request,Model model) {
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	System.out.println(curuser);
    	if(curuser==null) {
    		model.addAttribute("msg","�ȵ�¼");
    		return "redirect:../tologin";
    	}
    	List<RentHouse> houselist=this.rentHouseService.select_all();
    	int i;
    	String url="http://localhost:8080/housepro/localimg/"+"cover.jpg";
    	for(i=0;i<houselist.size();i++) {
    		Photo hphoto=this.photoService.select_cover(houselist.get(i).getHouse_id());
    		if(hphoto==null) {
    			System.out.println("no cover pic");
    			houselist.get(i).setCover(url);
    		}
    		else {
    			System.out.println("get right cover");
    			houselist.get(i).setCover(hphoto.getUrl());
    		}
    		System.out.println("houselist cover "+houselist.get(i).getCover());
    	}
    	
    	System.out.println("phonelist get done");
    	model.addAttribute("login",1);
    	model.addAttribute("cuser",curuser);
    	System.out.println(curuser);
    	System.out.println(houselist.toString());
    	model.addAttribute("houselist",houselist);

    	return "RentHouse/SearchPage";
    }
    
    @RequestMapping("/conditionSearch")
	public String SearchFor(HttpServletRequest request, Model model) throws ParseException {
    	System.out.println("HouseInfor/ConditionSearch");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("msg","�ȵ�¼");
    		return "redirect:../tologin";
    	}
    	System.out.println("begin to get parameter");
    //	String country = request.getParameter("country");
    	
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
    	String bedroom = request.getParameter("bedroom");
    	String hall = request.getParameter("hall");
    	String bath = request.getParameter("bath");
    	String type=bedroom+"/"+hall+"/"+bath;
    	type=null;
    	System.out.println("type="+type);
    	String s_area_lb = request.getParameter("s_area_l");
    	String s_area_ub = request.getParameter("s_area_u");
    	String s_rent_lb = request.getParameter("s_rent_l");
    	String s_rent_ub = request.getParameter("s_rent_u");
    	String s_floor_lb = request.getParameter("s_floor_l");
    	String s_floor_ub = request.getParameter("s_floor_u");
    	String s_elevator = request.getParameter("s_elevator");
    	System.out.println(province);
    	System.out.println(city);
    	System.out.println(district);
    	System.out.println(community);
    	
    	System.out.println("al "+s_area_lb);
    	System.out.println("au "+s_area_ub);
    	System.out.println(s_rent_lb);
    	System.out.println(s_rent_ub);
    	System.out.println(s_floor_lb);
    	System.out.println(s_floor_ub);
    //	String type = request.getParameter("type");
    	System.out.println("string getdone");
    	Integer area_ub=null;
    	Integer area_lb=null;
    	Integer rent_lb=null;
    	Integer rent_ub=null;
    	Integer floor_lb=null;
    	Integer floor_ub=null;
    	Integer elevator=null;
    	if(s_area_lb!="") {
    		area_lb = Integer.parseInt(s_area_lb);
    	} 
    	if(s_area_ub!="") {
    		area_ub = Integer.parseInt(s_area_ub);
 
    	} 
    	if(s_rent_lb!="") {
    		System.out.println("s_rent_lb not null+++:"+s_rent_lb);
    		rent_lb = Integer.parseInt(s_rent_lb);
    	} 
    	if(s_rent_ub!=null&&s_rent_ub!="") {
    		System.out.println("s_floor_lb not null+:"+s_floor_lb);
    		rent_ub = Integer.parseInt(s_rent_ub);
    	} 
    	if(s_floor_lb!=""&&s_floor_lb!=null) {
    		System.out.println("s_floor_lb not null++:"+s_floor_lb);
    		floor_lb = Integer.parseInt(s_floor_lb);
    	} 
    	if(s_floor_ub!=""&&s_floor_ub!=null) {
    		System.out.println("s_floor_lb not null+++:"+s_floor_lb);
    		floor_ub = Integer.parseInt(s_floor_ub);
    	} 
    	if(s_elevator!=""&&s_elevator!=null) {
    		System.out.println("s_floor_lb not null++++:"+s_floor_lb);
    		elevator = Integer.parseInt(s_elevator);
    	} 
    	if(elevator==2) {
    		elevator=null;
    	}
    //	System.out.println("elevator "+elevator.toString());
    //	System.out.println("floor_lb"+floor_lb.toString());
    		 
    /*	Integer area_ub = Integer.parseInt(request.getParameter("area_ub"));
    	Integer floor_lb= Integer.parseInt(request.getParameter("floor_lb"));
    	Integer floor_ub= Integer.parseInt(request.getParameter("floor_ub"));
    	Integer elevator = Integer.parseInt(request.getParameter("elevator"));
    	Integer rent_lb = Integer.parseInt(request.getParameter("rent_lb"));
    	Integer rent_ub = Integer.parseInt(request.getParameter("rent_ub"));*/
    	String state = "0";
    	System.out.println("select begin");
    	List<RentHouse> houselist=this.rentHouseService.select(country, province, city, district, type, area_lb, area_ub, elevator, floor_lb, floor_ub, rent_lb, rent_ub, state);
    	int i;
    	System.out.println("select done");
    	if(houselist.size()!=0) {
        	System.out.println(houselist.toString());
    	}
    	else {
    		System.out.println("no house");
    	}
    	String url="http://localhost:8080/housepro/localimg/"+"cover.jpg";
    	for(i=0;i<houselist.size();i++) {
    		Photo hphoto=this.photoService.select_cover(houselist.get(i).getHouse_id());
    		if(hphoto==null) {
    			System.out.println("no cover pic");
    			houselist.get(i).setCover(url);
    		}
    		else {
    			System.out.println("get right cover");
    			houselist.get(i).setCover(hphoto.getUrl());
    		}
    		System.out.println("houselist cover "+houselist.get(i).getCover());
    	}
    	model.addAttribute("houselist",houselist);
    	model.addAttribute("cuser",curuser);
    	return "RentHouse/SearchPage";
    }
    
    
    @RequestMapping("/toinsertHouse")
	public String toInsertHouse(HttpServletRequest request, Model model) {
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("msg","�ȵ�¼");
    		return "redirect:../tologin";
    	}
    	model.addAttribute("cuser",curuser);
    	return "RentHouse/ToInsert";	
    }
    
    @RequestMapping("/insertHouse")
   	public String InsertHouse(HttpServletRequest request, Model model) throws ParseException, IllegalStateException, IOException {
    	System.out.println("insert house begin");
       	String username = (String)request.getSession().getAttribute("curuser");
       	String building = request.getParameter("building");
      	System.out.println(building);
      	String country = request.getParameter("country");
      	country="china";
      	System.out.println(country);
      	String unit = request.getParameter("unit");
      	System.out.println(unit);
      	String no = request.getParameter("no");
      	System.out.println(no);
      	String title = request.getParameter("title");
      	System.out.println(title);
       	String province = request.getParameter("province");
       	province="beijing";
       	System.out.println(province);
       	String city = request.getParameter("city");
       	city="beijing";
       	System.out.println(city);
       	String community=request.getParameter("community");
    	System.out.println(community);
       	String district = request.getParameter("district");
       	district="haidian";
    	System.out.println(district);
       	String bedroom=request.getParameter("bedroom");
    	System.out.println(bedroom);
       	String hall=request.getParameter("hall");
    	System.out.println(hall);
       	String bath=request.getParameter("bath");
    	System.out.println(bath);
       	String type = bedroom+"/"+hall+"/"+bath;
       	Integer area = Integer.parseInt(request.getParameter("area"));
    	System.out.println(area);
       	Integer floor= Integer.parseInt(request.getParameter("floor"));
    	System.out.println(floor);
       	Integer elevator = Integer.parseInt(request.getParameter("elevator"));
    	System.out.println(elevator);
       	String description = request.getParameter("description");
    	System.out.println(description);
       	Integer deposit= Integer.parseInt(request.getParameter("deposit"));
    	System.out.println(deposit);
       	Integer rent = Integer.parseInt(request.getParameter("rent"));
       	String payment_of_rent = request.getParameter("payment_of_rent");
      // 	String address = request.getParameter("address");
       	String state = "0";
       	Date registration_time = MyUtil.getNowDate();
       	Date modification_time = MyUtil.getNowDate();
       	Integer houseid=null;
       	System.out.println("begin to insert in database");
       	Integer house_id=this.rentHouseService.insert(new RentHouse(houseid, username, country,province, city,district,
    			community, building, unit,  no,  type,  area,  floor,
    			 elevator, title,  description,  deposit,  payment_of_rent,  rent,
    			 registration_time, modification_time,  state));
       	System.out.println("insert over ");
       	
       	
       	
       	System.out.println("uploadpic  here!!!");
    	
    	CommonsMultipartResolver coMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
    	if(coMultipartResolver.isMultipart(request)) {
    		System.out.println("pic333");
        	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        	List<MultipartFile> fileList = multipartRequest.getFiles("reportFile");
        	System.out.println("size"+fileList.size());
        	String fileUploadPath="D:/webpic";
        	Integer num=0;
        	for (MultipartFile item : fileList) {                
        		String fileName = "";        //当前上传文件全名称              
        		String fileType = "";        //当前上传文件类型                
        		String saveFileName = "";    //保存到服务器目录的文件名称               
        		String reportAddr = "";      //保存到服务器目录的文件全路径                                   
        			fileName = item.getOriginalFilename();                    
        			fileType = item.getContentType();                    
        			saveFileName = "_" + fileName;  
        			saveFileName=house_id.toString()+num.toString();
        			reportAddr = fileUploadPath + "/" + saveFileName;                    
        			reportAddr = reportAddr.replace("/", File.separator).replace("\\", File.separator);                                      
        			File savedFile = new File(fileUploadPath, saveFileName); 
        			System.out.println(saveFileName+" "+fileType+" "+fileName+" "+" "+reportAddr);
   
        			num++;
        			item.transferTo(savedFile);
        			this.photoService.insert(house_id, "http://localhost:8080/housepro/localimg/"+saveFileName);
        	} 	
    	}else {
    		System.out.println("no pic");
    	}

   		System.out.println("insert successfully");
   		String user=(String)request.getSession().getAttribute("curuser");
   //		model.addAttribute("username",user);
   		model.addAttribute("cuser",user);
   		model.addAttribute("username",user);
   		return "redirect:getCuserHouse";
       	
       }
    
    //������ʾ
    
    @RequestMapping("/getCuserHouse")
    public String GetUserHouse(HttpServletRequest request, Model model) {
    	System.out.println("getCuserHouse request");
    	String cuser =request.getParameter("username");
    	List<RentHouse> houselist=this.rentHouseService.select(cuser);  
    	int i=0;
    	List<Photo> photolist=new ArrayList<Photo>();
    /*	for(i=0;i<houselist.size();i++) {
    		List<Photo> tmplist=this.photoService.select(houselist.get(i).getHouse_id());
    		Photo photo=tmplist.get(0);
    		photolist.add(photo);
    	}*/ 
		String url="http://localhost:8080/housepro/localimg/"+"cover.jpg";
    	for(i=0;i<houselist.size();i++) {
    		Photo hphoto=this.photoService.select_cover(houselist.get(i).getHouse_id());
    		if(hphoto==null) {
    			System.out.println("no cover pic");
    			houselist.get(i).setCover(url);
    		}
    		else {
    			System.out.println("get right cover");
    			houselist.get(i).setCover(hphoto.getUrl());
    		}
    		System.out.println("houselist cover "+houselist.get(i).getCover());
    	}
    	
    	model.addAttribute("photolist",photolist);
    	model.addAttribute("houselist",houselist);
    	model.addAttribute("cuser",cuser);
    	Integer mode=5;
    	model.addAttribute("mode",mode);
    	return "UserControl";
    }
    
    @RequestMapping("/getHouseDetail")
    public String GetHouse(HttpServletRequest request, Model model) {
    	System.out.println("getHouseDetail");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("login",0);
    		return "redirect:../tologin";
    	}
    	Integer house_id = Integer.parseInt(request.getParameter("house_id"));
    	System.out.println(house_id.toString());
    	RentHouse house=this.rentHouseService.select(house_id);
    	house.setCover("http://localhost:8080/localimg/"+"cover.jpg");
    	model.addAttribute("house",house);
    	int i=0;
    	List<Photo> photolist=this.photoService.select(house.getHouse_id());
    	if(photolist.size()==0) {
    		Photo photo=new Photo(12, 13, "http://localhost:8080/localimg/"+"cover.jpg", "0");
    		photolist.add(photo);
    	}
    	model.addAttribute("photolist",photolist);
    	model.addAttribute("cuser",curuser);
    	model.addAttribute("login",1);
    	return "RentHouse/ShowHouseDetail";
    }
    
    @RequestMapping("/updateHouse")
    public String UpdateHouse(HttpServletRequest request, Model model) throws ParseException {
    	System.out.println("updateHouse");
    	Integer house_id = Integer.parseInt(request.getParameter("house_id"));
    	System.out.println("houseId"+house_id.toString());
    	String username = (String)request.getSession().getAttribute("curuser");
    	String country = "China";
    	String building = request.getParameter("building");
    	System.out.println(building);
      	String unit = request.getParameter("unit");
      	System.out.println(unit);
      	String no = request.getParameter("no");
      	String title = request.getParameter("title");
       	String province = null;
       	String city = null;
       	String community=request.getParameter("community");
       	System.out.println(building);
       	System.out.println("community get done");
    	String district = null;
    	//Integer area = Integer.parseInt(request.getParameter("area"));
    	//System.out.println("area"+area.toString());
    	Integer floor= Integer.parseInt(request.getParameter("floor"));
    	System.out.println("floor"+floor.toString());
    	Integer elevator = Integer.parseInt(request.getParameter("elevator"));
    	String description = request.getParameter("description");
    	System.out.println("community get done");
    	Integer deposit = Integer.parseInt(request.getParameter("deposit"));
    	Integer rent = Integer.parseInt(request.getParameter("rent"));
    	String payment_of_rent = request.getParameter("payment_of_rent");
    	System.out.println("community get done");
    	String state = "0";
    	Date registration_time = null;
    	Date modification_time = MyUtil.getNowDate();
    	System.out.println("parameter done");
    	Integer results=this.rentHouseService.update(new RentHouse(house_id, username, country,province, city,district,
    			community, building, unit,  no,  null,  null,  floor,
   			 elevator, title,  description,  deposit,  payment_of_rent,  rent,
   			 registration_time, modification_time,  state)); 
		model.addAttribute("username",username);
		model.addAttribute("cuser",username);
		return "redirect:getCuserHouse";
    	
    }
    
    
    @RequestMapping("/toupdateHouse")
    public String toUpdateHouse(HttpServletRequest request, Model model) throws ParseException {
    	System.out.println("toUpdateHouse");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("login",0);
    		return "redirect:../tologin";
    	}
    	Integer house_id = Integer.parseInt(request.getParameter("house_id"));
    	System.out.println(house_id.toString());
    	RentHouse house=this.rentHouseService.select(house_id);
    	house.setCover("http://localhost:8080/localimg/"+"cover.jpg");
    	model.addAttribute("house",house);
    	int i=0;
    	List<Photo> photolist=this.photoService.select(house.getHouse_id());
    	if(photolist.size()==0) {
    		Photo photo=new Photo(12, 13, "http://localhost:8080/localimg/"+"cover.jpg", "0");
    		photolist.add(photo);
    	}
    	model.addAttribute("photolist",photolist);
    	model.addAttribute("cuser",curuser);
    	model.addAttribute("login",1);
    	return "RentHouse/ToUpdateHouse";
    //	return "redirect:../user/UserFront";
    }
    
    
    
    @RequestMapping("/deleteHouse")
    public String DeleteHouse(HttpServletRequest request,Model model) {
    	Integer house_id=Integer.parseInt(request.getParameter("house_id"));
    	this.rentHouseService.delete(house_id);
    	String username=(String)request.getSession().getAttribute("curuser");
    	model.addAttribute("cuser",username);
		model.addAttribute("username",username);
		return "redirect:getCuserHouse";
    }
    
    
    
    
    @RequestMapping("/toUpload")
    public String toUpload(HttpServletRequest request,Model mode) {
    	System.out.println("toUpload");
    	return "testfile1";
    }
    
    @RequestMapping("/uploadpic")
    public String uploadpic(HttpServletRequest request ,Model model) throws IllegalStateException, IOException {
    	System.out.println("uploadpic  here!!!");
    	
    	CommonsMultipartResolver coMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
    	if(coMultipartResolver.isMultipart(request)) {
    		System.out.println("pic333");
        	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        	List<MultipartFile> fileList = multipartRequest.getFiles("reportFile");
        	System.out.println("size"+fileList.size());
        	String fileUploadPath="D:/webpic";
        	for (MultipartFile item : fileList) {                
        		String fileName = "";        //当前上传文件全名称              
        		String fileType = "";        //当前上传文件类型                
        		String saveFileName = "";    //保存到服务器目录的文件名称               
        		String reportAddr = "";      //保存到服务器目录的文件全路径                                   
        			fileName = item.getOriginalFilename();                    
        			fileType = item.getContentType();                    
        			saveFileName = "_" + fileName;                    
        			reportAddr = fileUploadPath + "/" + saveFileName;                    
        			reportAddr = reportAddr.replace("/", File.separator).replace("\\", File.separator);                                      
        			File savedFile = new File(fileUploadPath, saveFileName); 
        			System.out.println(saveFileName+" "+fileType+" "+fileName+" "+" "+reportAddr);
        			item.transferTo(savedFile);
        			
        	} 	
    	}else {
    		System.out.println("no pic");
    	}
    	 return "redirect:getUserHouse";
    }
    
    
    @RequestMapping("/indexSearch")
	public String indexSearchFor(HttpServletRequest request, Model model) throws ParseException {
    	System.out.println("HouseInfor/indexSearch");
    	String curuser=(String)request.getSession().getAttribute("curuser");
    	if(curuser==null) {
    		model.addAttribute("msg","�ȵ�¼");
    		return "redirect:../tologin";
    	}
    	System.out.println("begin to get parameter");
    //	String country = request.getParameter("country");
    	
    	String province =null;
    	String country="China";
    	String city=null;
    	String district = request.getParameter("district");
    	String community=null;
    	
    	String type=null;
    	System.out.println("type="+type);
    	String s_area_lb = request.getParameter("area_lb");
    	String s_area_ub = request.getParameter("area_ub");
    	String s_rent_lb = request.getParameter("rent_lb");
    	String s_rent_ub = request.getParameter("rent_ub");
    	System.out.println(province);
    	System.out.println(city);
    	System.out.println(district);
    	System.out.println(community);
    	
    	System.out.println("al "+s_area_lb);
    	System.out.println("au "+s_area_ub);
    	System.out.println(s_rent_lb);
    	System.out.println(s_rent_ub);
    //	String type = request.getParameter("type");
    	System.out.println("string getdone");
    	Integer area_ub=null;
    	Integer area_lb=null;
    	Integer rent_lb=null;
    	Integer rent_ub=null;
    	Integer floor_lb=null;
    	Integer floor_ub=null;
    	Integer elevator=null;
    	if(s_area_lb!="") {
    		area_lb = Integer.parseInt(s_area_lb);
    		area_lb=null;
    	} 
    	if(s_area_ub!="") {
    		area_ub = Integer.parseInt(s_area_ub);
    		area_ub=null;
    	} 
    	if(s_rent_lb!="") {
    		System.out.println("s_rent_lb not null+++:"+s_rent_lb);
    		rent_lb = Integer.parseInt(s_rent_lb);
    	} 
    	if(s_rent_ub!=null&&s_rent_ub!="") {
    		rent_ub = Integer.parseInt(s_rent_ub);
    	} 
    //	System.out.println("floor_lb"+floor_lb.toString());
    		 
    /*	Integer area_ub = Integer.parseInt(request.getParameter("area_ub"));
    	Integer floor_lb= Integer.parseInt(request.getParameter("floor_lb"));
    	Integer floor_ub= Integer.parseInt(request.getParameter("floor_ub"));
    	Integer elevator = Integer.parseInt(request.getParameter("elevator"));
    	Integer rent_lb = Integer.parseInt(request.getParameter("rent_lb"));
    	Integer rent_ub = Integer.parseInt(request.getParameter("rent_ub"));*/
    	String state = "0";
    	System.out.println("select begin");
    	List<RentHouse> houselist=this.rentHouseService.select(country, province, city, district, type, area_lb, area_ub, elevator, floor_lb, floor_ub, rent_lb, rent_ub, state);
    	int i;
    	System.out.println("select done");
    	if(houselist.size()!=0) {
        	System.out.println(houselist.toString());
    	}
    	else {
    		System.out.println("no house");
    	}
    	String url="http://localhost:8080/housepro/localimg/"+"cover.jpg";
    	for(i=0;i<houselist.size();i++) {
    		Photo hphoto=this.photoService.select_cover(houselist.get(i).getHouse_id());
    		if(hphoto==null) {
    			System.out.println("no cover pic");
    			houselist.get(i).setCover(url);
    		}
    		else {
    			System.out.println("get right cover");
    			houselist.get(i).setCover(hphoto.getUrl());
    		}
    		System.out.println("houselist cover "+houselist.get(i).getCover());
    	}
    	model.addAttribute("houselist",houselist);
    	model.addAttribute("cuser",curuser);
    	return "RentHouse/SearchPage";
    }
    
}