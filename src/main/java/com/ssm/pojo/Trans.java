package com.ssm.pojo;

import java.util.Date;

import com.util.MyUtil;

public class Trans extends Tran{
	private Date month;

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Trans [province=" + getProvince() + ", fixture_number=" + getFixture_number() + ", agency_fees=" + getAgency_fees()
				+ ", month=" + MyUtil.Date2Month(month) + "]";
	}
	
}
