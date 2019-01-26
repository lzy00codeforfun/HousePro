package com.ssm.pojo;

import java.util.Date;

public class User {
    public User(String username, String password, String real_name, String iD_type, String iD_no, String phone,
			String registration_area, Date registration_time, Date modification_time, Integer renter_lv,
			Integer landlord_lv) {
		super();
		this.username = username;
		this.password = password;
		this.real_name = real_name;
		ID_type = iD_type;
		ID_no = iD_no;
		this.phone = phone;
		this.registration_area = registration_area;
		this.registration_time = registration_time;
		this.modification_time = modification_time;
		this.renter_lv = renter_lv;
		this.landlord_lv = landlord_lv;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String username;

    private String password;

    private String real_name;

    private String ID_type;

    private String ID_no;

    private String phone;

    private String registration_area;

    private Date registration_time;

    private Date modification_time;

    private Integer renter_lv;

    private Integer landlord_lv;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name == null ? null : real_name.trim();
    }

    public String getID_type() {
        return ID_type;
    }

    public void setID_type(String ID_type) {
        this.ID_type = ID_type == null ? null : ID_type.trim();
    }

    public String getID_no() {
        return ID_no;
    }

    public void setID_no(String ID_no) {
        this.ID_no = ID_no == null ? null : ID_no.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRegistration_area() {
        return registration_area;
    }

    public void setRegistration_area(String registration_area) {
        this.registration_area = registration_area == null ? null : registration_area.trim();
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

    public Integer getRenter_lv() {
        return renter_lv;
    }

    public void setRenter_lv(Integer renter_lv) {
        this.renter_lv = renter_lv;
    }

    public Integer getLandlord_lv() {
        return landlord_lv;
    }

    public void setLandlord_lv(Integer landlord_lv) {
        this.landlord_lv = landlord_lv;
    }

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", real_name=" + real_name + ", ID_type="
				+ ID_type + ", ID_no=" + ID_no + ", phone=" + phone + ", registration_area=" + registration_area
				+ ", registration_time=" + registration_time + ", modification_time=" + modification_time
				+ ", renter_lv=" + renter_lv + ", landlord_lv=" + landlord_lv + "]";
	}
	public String toJSONString() {
		return "{username:" + username + ", password:" + password + ", real_name:" + real_name + ", ID_type:"
				+ ID_type + ", ID_no:" + ID_no + ", phone:" + phone + ", registration_area:" + registration_area
				+ ", registration_time:" + registration_time + ", modification_time:" + modification_time
				+ ", renter_lv:" + renter_lv + ", landlord_lv:" + landlord_lv + "}";
	}
}