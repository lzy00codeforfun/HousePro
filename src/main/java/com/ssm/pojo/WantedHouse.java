package com.ssm.pojo;

import java.util.Date;

public class WantedHouse {
    public WantedHouse(Integer house_id, String username, String country, String province, String city, String district,
			String community, String type, Integer area_lb, Integer area_ub, Integer floor_lb, Integer floor_ub,
			Integer elevator, String title, String description, Integer rent_lb, Integer rent_ub,
			Date registration_time, Date modification_time) {
		super();
		this.house_id = house_id;
		this.username = username;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
		this.community = community;
		this.type = type;
		this.area_lb = area_lb;
		this.area_ub = area_ub;
		this.floor_lb = floor_lb;
		this.floor_ub = floor_ub;
		this.elevator = elevator;
		this.title = title;
		this.description = description;
		this.rent_lb = rent_lb;
		this.rent_ub = rent_ub;
		this.registration_time = registration_time;
		this.modification_time = modification_time;
	}

	public WantedHouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer house_id;

    private String username;

    private String country;

    private String province;

    private String city;

    private String district;

    private String community;

    private String type;

    private Integer area_lb;

    private Integer area_ub;

    private Integer floor_lb;

    private Integer floor_ub;

    private Integer elevator;

    private String title;

    private String description;

    private Integer rent_lb;

    private Integer rent_ub;

    private Date registration_time;

    private Date modification_time;

    public Integer getHouse_id() {
        return house_id;
    }

    public void setHouse_id(Integer house_id) {
        this.house_id = house_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getArea_lb() {
        return area_lb;
    }

    public void setArea_lb(Integer area_lb) {
        this.area_lb = area_lb;
    }

    public Integer getArea_ub() {
        return area_ub;
    }

    public void setArea_ub(Integer area_ub) {
        this.area_ub = area_ub;
    }

    public Integer getFloor_lb() {
        return floor_lb;
    }

    public void setFloor_lb(Integer floor_lb) {
        this.floor_lb = floor_lb;
    }

    public Integer getFloor_ub() {
        return floor_ub;
    }

    public void setFloor_ub(Integer floor_ub) {
        this.floor_ub = floor_ub;
    }

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getRent_lb() {
        return rent_lb;
    }

    public void setRent_lb(Integer rent_lb) {
        this.rent_lb = rent_lb;
    }

    public Integer getRent_ub() {
        return rent_ub;
    }

    public void setRent_ub(Integer rent_ub) {
        this.rent_ub = rent_ub;
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
		return "WantedHouse [house_id=" + house_id + ", username=" + username + ", country=" + country + ", province="
				+ province + ", city=" + city + ", district=" + district + ", community=" + community + ", type=" + type
				+ ", area_lb=" + area_lb + ", area_ub=" + area_ub + ", floor_lb=" + floor_lb + ", floor_ub=" + floor_ub
				+ ", elevator=" + elevator + ", title=" + title + ", description=" + description + ", rent_lb="
				+ rent_lb + ", rent_ub=" + rent_ub + ", registration_time=" + registration_time + ", modification_time="
				+ modification_time + "]";
	}
	public String toJSONString() {
		return "{house_id:" + house_id + ", username:" + username + ", country:" + country + ", province:"
				+ province + ", city:" + city + ", district:" + district + ", community:" + community + ", type:" + type
				+ ", area_lb:" + area_lb + ", area_ub:" + area_ub + ", floor_lb:" + floor_lb + ", floor_ub:" + floor_ub
				+ ", elevator:" + elevator + ", title:" + title + ", description:" + description + ", rent_lb:"
				+ rent_lb + ", rent_ub:" + rent_ub + ", registration_time:" + registration_time + ", modification_time:"
				+ modification_time + "}";
	}
}