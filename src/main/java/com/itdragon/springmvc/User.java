package com.itdragon.springmvc;

public class User {
	
	private Integer id;
	private String account;
	private String password;
	private Position position;
	
	public User() {
	}
	public User(Integer id, String account, String password) {
		this.id = id;
		this.account = account;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password="
				+ password + ", position=" + position + "]";
	}
}
