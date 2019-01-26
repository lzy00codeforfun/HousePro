package com.ssm.pojo;

public class Member {
    public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(Integer level, String member_name, Float fee_rate) {
		super();
		this.level = level;
		this.member_name = member_name;
		this.fee_rate = fee_rate;
	}

	private Integer level;

    private String member_name;

    private Float fee_rate;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name == null ? null : member_name.trim();
    }

    public Float getFee_rate() {
        return fee_rate;
    }

    public void setFee_rate(Float fee_rate) {
        this.fee_rate = fee_rate;
    }

	@Override
	public String toString() {
		return "Member [level=" + level + ", member_name=" + member_name + ", fee_rate=" + fee_rate + "]";
	}
	public String toJSONString() {
		return "{level:" + level + ", member_name:" + member_name + ", fee_rate:" + fee_rate + "}";
	}
}