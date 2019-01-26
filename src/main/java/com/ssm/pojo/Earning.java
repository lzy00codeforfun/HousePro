package com.ssm.pojo;

import java.util.Date;

public class Earning extends EarningKey {

	public Earning() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Earning(Date month, String country, String province, String city) {
		super(month, country, province, city);
		// TODO Auto-generated constructor stub
	}

	public Earning(Integer fixture_number, Long agency_fees) {
		super();
		this.fixture_number = fixture_number;
		this.agency_fees = agency_fees;
	}
	public Earning(Date month, String country, String province, String city,Integer fixture_number, Long agency_fees) {
		super(month, country, province, city);
		this.fixture_number = fixture_number;
		this.agency_fees = agency_fees;
	}
	private Integer fixture_number;

    private Long agency_fees;

    public Integer getFixture_number() {
        return fixture_number;
    }

    public void setFixture_number(Integer fixture_number) {
        this.fixture_number = fixture_number;
    }

    public Long getAgency_fees() {
        return agency_fees;
    }

    public void setAgency_fees(Long agency_fees) {
        this.agency_fees = agency_fees;
    }

	@Override
	public String toString() {
		return "Earning [fixture_number=" + fixture_number + ", agency_fees=" + agency_fees + "]";
	}
	public String toJSONString() {
		return "{month:" + getMonth() + ", country:" + getCountry() + ", province:" + getProvince() + ", city:" + getCity()+"fixture_number:" + fixture_number + ", agency_fees:" + agency_fees + "}";
	}
}