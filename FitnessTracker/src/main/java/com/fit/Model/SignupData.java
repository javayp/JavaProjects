package com.fit.Model;

public class SignupData {
	private long id;
	private String firstname;
	private String lastname;
	private long phoneNumber;
	private String profeession;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getProfeession() {
		return profeession;
	}
	public void setProfeession(String profeession) {
		this.profeession = profeession;
	}
}
