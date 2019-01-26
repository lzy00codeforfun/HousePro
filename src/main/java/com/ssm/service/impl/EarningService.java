package com.ssm.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ssm.dao.EarningMapper;
import com.ssm.pojo.Earning;
import com.ssm.pojo.EarningExample;
import com.ssm.pojo.EarningExample.Criteria;
import com.ssm.pojo.EarningKey;
import com.ssm.pojo.Tran;
import com.ssm.pojo.Trans;
import com.ssm.service.IEarningService;
import com.util.MyUtil;

@Service("EarningService")
public class EarningService implements IEarningService{
	@Resource
    private EarningMapper EarningDao;
	public int add(Date month,String country,String province,String city,Long income) {	//更新收益
    	Earning earn=new Earning();
    	earn.setMonth(month);
    	earn.setCountry(country);
    	earn.setProvince(province);
    	earn.setCity(city);
    	EarningKey ek=new EarningKey();
    	ek=earn;
    	Earning tmp=EarningDao.selectByPrimaryKey(ek);
    	if(tmp==null) {
    		//System.out.println("insert");
    		earn.setFixture_number(1);
    		earn.setAgency_fees(income);
    		EarningDao.insert(earn);
    	}
    	else {
    		//System.out.println("update");
    		earn.setAgency_fees(income+tmp.getAgency_fees());
    		earn.setFixture_number(1+tmp.getFixture_number());
    		EarningDao.updateByPrimaryKey(earn);
    	}
    	return 1;
    }
	public List<Earning> select(Date from,Date to){
		EarningExample example = new EarningExample();
		Criteria criteria = example.createCriteria();
		if(from!=null&&to!=null) criteria.andMonthBetween(from,to);
		example.setOrderByClause("month asc,country asc,province asc,city asc");
		return EarningDao.selectByExample(example);
	}
	public List<Earning> select(String country,String province,String city,Date from,Date to){
		EarningExample example = new EarningExample();
		Criteria criteria = example.createCriteria();
		if(country!=null) criteria.andCountryEqualTo(country);
		if(province!=null) criteria.andProvinceEqualTo(province);
		if(city!=null) criteria.andCityEqualTo(city);
		if(from!=null&&to!=null) criteria.andMonthBetween(from,to);
		example.setOrderByClause("month asc,country asc,province asc,city asc");
		return EarningDao.selectByExample(example);
	}
	public List<Earning> select_all(){
		EarningExample example = new EarningExample();
		return EarningDao.selectByExample(example);
	}
	public String selectByMonth(Date from,Date to,String province){
		List<Trans> list=EarningDao.selectByMonth(from,to,province);
		int sz=list.size();
		Trans value;
		String ret=new String();
		ret+="[";
		int cnt=0;
		for(int i = 0 ; i < sz ; i++) {
			value=list.get(i);
			while(from.compareTo(value.getMonth())==-1) {
				if(cnt!=0) ret+=",";
				//ret+="{'month':'"+MyUtil.Date2Month(from)+"','value':'"+0+"','num':'"+0+"'}";
				ret+="{'month':'"+MyUtil.Date2Month(from)+"','value':'"+0+"'}";
				cnt++;
				from=MyUtil.NextMonth(from,1);
			}
			if(cnt!=0) ret+=",";
			ret+="{'month':'"+MyUtil.Date2Month(from)+"','value':'"+value.getFixture_number()+"'}";
			from=MyUtil.NextMonth(from,1);
			cnt++;
		}
		ret+="]";
		System.out.println(ret);
		String jsonstr=JSON.parseArray(ret).toJSONString();
		System.out.println(jsonstr);
		return jsonstr;
	}
	public String selectSortNo(Date from,Date to){
		List<Tran> list=EarningDao.selectSortNo(from,to);
		int sz=list.size();
		String ret=new String();
		ret+="[{";
		Tran value;
		for(int i = 0 ; i < sz ; i++) {
			if(i!=0) ret+=",";
			value=list.get(i);
			ret+="'"+value.getProvince()+"':{'num':'"+value.getAgency_fees()+"','value':'"+value.getFixture_number()+"','rank':'"+(int)(Math.ceil(1.0*i/sz*34)+1)+"'}";
		}
		ret+="}]";
		System.out.println(ret);
		String jsonstr=JSON.parseArray(ret).toJSONString();
		System.out.println(jsonstr);
		return jsonstr;
	}
	public String selectSortFee(Date from,Date to){
		List<Tran> list=EarningDao.selectSortFee(from,to);
		int sz=list.size();
		String ret=new String();
		ret+="[{";
		Tran value;
		for(int i = 0 ; i < sz ; i++) {
			if(i!=0) ret+=",";
			value=list.get(i);
			ret+="'"+value.getProvince()+"':{'num':'"+value.getAgency_fees()+"','value':'"+value.getFixture_number()+"','rank':'"+(int)(Math.ceil(1.0*i/sz*34)+1)+"'}";
		}
		ret+="}]";
		System.out.println(ret);
		String jsonstr=JSON.parseArray(ret).toJSONString();
		System.out.println(jsonstr);
		return jsonstr;
	}
	
	
}
