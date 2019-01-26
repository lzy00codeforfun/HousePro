package com.ssm.pojo;

public class Admin {
    private String username;

    private String password;
    public Admin(){}
    public Admin(String un,String pwd){
    	username=un;
    	password=pwd;
    }
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

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}
	
	public String toJSONString() {
		return "{username:" + username + ", password:" + password + "}";
	}
}