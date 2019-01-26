package com.ssm.pojo;

public class UsedPwdKey {
    public UsedPwdKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedPwdKey(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	private String username;

    private String password;

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
		return "UsedPwdKey [username=" + username + ", password=" + password + "]";
	}
	public String toJSONString() {
		return "{username:" + username + ", password:" + password + "}";
	}
}