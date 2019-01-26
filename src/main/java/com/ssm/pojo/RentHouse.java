package com.ssm.pojo;

import java.util.Date;

public class RentHouse {
    public RentHouse(Integer house_id, String username, String country, String province, String city, String district,
			String community, String building, String unit, String no, String type, Integer area, Integer floor,
			Integer elevator, String title, String description, Integer deposit, String payment_of_rent, Integer rent,
			Date registration_time, Date modification_time, String state) {
		super();
		this.house_id = house_id;
		this.username = username;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
		this.community = community;
		this.building = building;
		this.unit = unit;
		this.no = no;
		this.type = type;
		this.area = area;
		this.floor = floor;
		this.elevator = elevator;
		this.title = title;
		this.description = description;
		this.deposit = deposit;
		this.payment_of_rent = payment_of_rent;
		this.rent = rent;
		this.registration_time = registration_time;
		this.modification_time = modification_time;
		this.state = state;
	}

	public RentHouse() {
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

    private String building;

    private String unit;

    private String no;

    private String type;

    private Integer area;

    private Integer floor;

    private Integer elevator;

    private String title;

    private String description;

    private Integer deposit;

    private String payment_of_rent;

    private Integer rent;

    private Date registration_time;

    private Date modification_time;

    private String state;
    
    private String cover;

    public Integer getHouse_id() {
        return this.house_id;
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
    
    public String getCover() {
        return this.cover;
    }

    public void setCover(String url) {
        this.cover=url;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
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

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public String getPayment_of_rent() {
        return payment_of_rent;
    }

    public void setPayment_of_rent(String payment_of_rent) {
        this.payment_of_rent = payment_of_rent == null ? null : payment_of_rent.trim();
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	@Override
	public String toString() {
		return "RentHouse [house_id=" + house_id + ", username=" + username + ", country=" + country + ", province="
				+ province + ", city=" + city + ", district=" + district + ", community=" + community + ", building="
				+ building + ", unit=" + unit + ", no=" + no + ", type=" + type + ", area=" + area + ", floor=" + floor
				+ ", elevator=" + elevator + ", title=" + title + ", description=" + description + ", deposit="
				+ deposit + ", payment_of_rent=" + payment_of_rent + ", rent=" + rent + ", registration_time="
				+ registration_time + ", modification_time=" + modification_time + ", state=" + state + "]";
	}
	public String toJSONString() {
		return "{house_id:" + house_id + ", username:" + username + ", country:" + country + ", province:"
				+ province + ", city:" + city + ", district:" + district + ", community:" + community + ", building:"
				+ building + ", unit:" + unit + ", no:" + no + ", type:" + type + ", area:" + area + ", floor:" + floor
				+ ", elevator:" + elevator + ", title:" + title + ", description:" + description + ", deposit:"
				+ deposit + ", payment_of_rent:" + payment_of_rent + ", rent:" + rent + ", registration_time:"
				+ registration_time + ", modification_time:" + modification_time + ", state:" + state + "}";
	}
}