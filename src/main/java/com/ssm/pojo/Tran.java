package com.ssm.pojo;

import java.util.Date;

public class Tran {
    private String province;
    
    private Integer fixture_number;

    private Long agency_fees;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

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
		return "Tran [province=" + province + ", fixture_number=" + fixture_number + ", agency_fees=" + agency_fees
				+ "]";
	}
}
