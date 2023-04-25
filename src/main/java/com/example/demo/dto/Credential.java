package com.example.demo.dto;

public class Credential {
	
	private String userName;
	private String password;
	
	public Credential() {
		
	}
	
	public Credential(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
