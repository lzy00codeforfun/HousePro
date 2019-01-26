package com.ssm.pojo;

import java.util.Date;

public class Deal {
    public Deal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deal(Integer contract_id, String tenant_username, String landlord_username, Integer house_id,
			Date start_date, Date end_date, Integer monthly_rent, Integer tot_rent, Integer landlord_agency_fee,
			Integer tenant_agency_fee, String state, Date registration_time, Date modification_time) {
		super();
		this.contract_id = contract_id;
		this.tenant_username = tenant_username;
		this.landlord_username = landlord_username;
		this.house_id = house_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.monthly_rent = monthly_rent;
		this.tot_rent = tot_rent;
		this.landlord_agency_fee = landlord_agency_fee;
		this.tenant_agency_fee = tenant_agency_fee;
		this.state = state;
		this.registration_time = registration_time;
		this.modification_time = modification_time;
	}

	private Integer contract_id;

    private String tenant_username;

    private String landlord_username;

    private Integer house_id;

    private Date start_date;

    private Date end_date;

    private Integer monthly_rent;

    private Integer tot_rent;

    private Integer landlord_agency_fee;

    private Integer tenant_agency_fee;

    private String state;

    private Date registration_time;

    private Date modification_time;

    public Integer getContract_id() {
        return contract_id;
    }

    public void setContract_id(Integer contract_id) {
        this.contract_id = contract_id;
    }

    public String getTenant_username() {
        return tenant_username;
    }

    public void setTenant_username(String tenant_username) {
        this.tenant_username = tenant_username == null ? null : tenant_username.trim();
    }

    public String getLandlord_username() {
        return landlord_username;
    }

    public void setLandlord_username(String landlord_username) {
        this.landlord_username = landlord_username == null ? null : landlord_username.trim();
    }

    public Integer getHouse_id() {
        return house_id;
    }

    public void setHouse_id(Integer house_id) {
        this.house_id = house_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Integer getMonthly_rent() {
        return monthly_rent;
    }

    public void setMonthly_rent(Integer monthly_rent) {
        this.monthly_rent = monthly_rent;
    }

    public Integer getTot_rent() {
        return tot_rent;
    }

    public void setTot_rent(Integer tot_rent) {
        this.tot_rent = tot_rent;
    }

    public Integer getLandlord_agency_fee() {
        return landlord_agency_fee;
    }

    public void setLandlord_agency_fee(Integer landlord_agency_fee) {
        this.landlord_agency_fee = landlord_agency_fee;
    }

    public Integer getTenant_agency_fee() {
        return tenant_agency_fee;
    }

    public void setTenant_agency_fee(Integer tenant_agency_fee) {
        this.tenant_agency_fee = tenant_agency_fee;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getRegistration_time() {
        return registration_time;
    }

    public void setRegistration_time(Date registration_time) {
        this.registration_time = registration_time;
    }

    public Date getModification_time() {
        return modification_time;
    }

    public void setModification_time(Date modification_time) {
        this.modification_time = modification_time;
    }

	@Override
	public String toString() {
		return "Deal [contract_id=" + contract_id + ", tenant_username=" + tenant_username + ", landlord_username="
				+ landlord_username + ", house_id=" + house_id + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", monthly_rent=" + monthly_rent + ", tot_rent=" + tot_rent + ", landlord_agency_fee="
				+ landlord_agency_fee + ", tenant_agency_fee=" + tenant_agency_fee + ", state=" + state
				+ ", registration_time=" + registration_time + ", modification_time=" + modification_time + "]";
	}
	public String toJSONString() {
		return "{contract_id:" + contract_id + ", tenant_username:" + tenant_username + ", landlord_username:"
				+ landlord_username + ", house_id:" + house_id + ", start_date:" + start_date + ", end_date:" + end_date
				+ ", monthly_rent:" + monthly_rent + ", tot_rent:" + tot_rent + ", landlord_agency_fee:"
				+ landlord_agency_fee + ", tenant_agency_fee:" + tenant_agency_fee + ", state:" + state
				+ ", registration_time:" + registration_time + ", modification_time:" + modification_time + "}";
	}
}