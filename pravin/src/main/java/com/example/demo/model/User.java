package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class User {
	
	
	@Override
	public String toString() {
		return "User [uname=" + uname + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	private String uname;
	private String password;
	private String name;
	private String email;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
	}
	public User(String uname, String password, String name, String email) {
		super();
		this.uname = uname;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	
	
}
