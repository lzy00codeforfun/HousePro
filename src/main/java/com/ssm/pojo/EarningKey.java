package com.ssm.pojo;

import java.util.Date;

public class EarningKey {
    public EarningKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EarningKey(Date month, String country, String province, String city) {
		super();
		this.month = month;
		this.country = country;
		this.province = province;
		this.city = city;
	}

	private Date month;

    private String country;

    private String province;

    private String city;

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

	@Override
	public String toString() {
		return "EarningKey [month=" + month + ", country=" + country + ", province=" + province + ", city=" + city
				+ "]";
	}
	public String toJSONString() {
		return "{month:" + month + ", country:" + country + ", province:" + province + ", city:" + city+ "}";
	}
}