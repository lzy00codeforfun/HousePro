package com.ssm.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.alibaba.fastjson.*;
import com.ssm.pojo.User;
import com.ssm.pojo.Deal;
import com.ssm.pojo.Earning;
import com.ssm.service.IEarningService;
import com.ssm.service.IAdminService;
import com.ssm.service.IDealService;
///import com.ssm.service.IDataService;
import com.util.MyUtil;

@Controller
public class DataController {
	@Resource 
	private IEarningService earningService;
	@Resource 
	private IDealService dealService;
	
	@RequestMapping("/ProvinceData")
	public String ProvinceData(HttpServletRequest request,Model model) {
		System.out.println("go to ChinaMapShow");
		model.addAttribute("donestartTime","2018-01-01");
		model.addAttribute("doneendTime","2019-01-10");
		return "ChinaMapShow";
	}
	
	@ResponseBody
	@RequestMapping(value="/getProvinceData",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
	public String getProvinceData(HttpServletRequest request) throws ParseException {
	//	String ret="[{Hunan:{'num':'10','value':'1000','rank':'27'},Anhui:{'num':'11','value':'1400','rank':'13'},Beijing:{'num':'11','value':'2300','rank':'3'}}]";
	//	String ret="[{Hunan:{'num':'10','value':'1000','rank':'1'},Anhui:{'num':'11','value':'1400','rank':'2'}}]";
	//	System.out.println(ret);
	//	String jsonstr=JSON.parseArray(ret).toJSONString();
	//	System.out.println(jsonstr);
		String startTime=request.getParameter("startTime");
		String endTime=request.getParameter("endTime");
		System.out.println(startTime);
		System.out.println(endTime);
		String results=this.earningService.selectSortNo(MyUtil.S2D(startTime), MyUtil.S2D(endTime));
		System.out.println(results);
		
		//String ret=this.dataService.getProvinceData();
		return results;
	}
	
	@RequestMapping("/toProvinceMap")
	public String toProvinceMap(HttpServletRequest request,Model model) throws ParseException {
	//	System.out.println();
		String startTime=request.getParameter("startTime");
		String endTime=request.getParameter("endTime");
		System.out.println(startTime+" "+endTime);
		model.addAttribute("donestartTime",startTime);
		model.addAttribute("doneendTime",endTime);

		return "ChinaMapShow";
	}
	
	@RequestMapping("/getTransactionDetail")
	public String getTransactionDetail(HttpServletRequest request,Model model) throws ParseException {
		System.out.println("TranscationDetail");
		String province=request.getParameter("province");
		String startTime=request.getParameter("startTime");
		String endTime=request.getParameter("endTime");
		System.out.println(province+" "+startTime+" "+endTime);

		List<Deal> deallist=this.dealService.selectByDate(MyUtil.S2D(startTime), MyUtil.S2D(endTime),"1");
		model.addAttribute("startTime",startTime);
		model.addAttribute("endTime",endTime);
		model.addAttribute("province",province);
		model.addAttribute("deallist",deallist);
		System.out.println("deallist"+deallist.toString());
		return "TransactionDetail";
	}
	@ResponseBody
	@RequestMapping(value="/getGraphData",produces="text/html;charset=UTF-8",method = {RequestMethod.GET,RequestMethod.POST})
	public String getGraphData(HttpServletRequest request) throws ParseException {
		System.out.println("getGraphData");
		String province=request.getParameter("province");
		String startTime=request.getParameter("startTime");
		String endTime=request.getParameter("endTime");
		System.out.println(startTime);
		System.out.println(endTime);
		String graphdata=this.earningService.selectByMonth(MyUtil.S2D(startTime), MyUtil.S2D(endTime), province);
		System.out.println(graphdata);
		return graphdata;
	}
}
