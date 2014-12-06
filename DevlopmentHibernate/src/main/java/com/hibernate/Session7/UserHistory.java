package com.hibernate.Session7;

import java.util.Date;

public class UserHistory {
	
	private int hid;
	private Date entry_time;
	private String entry;
	private User user;
	
	public UserHistory(int hid, Date entry_time, String entry) {
		super();
		this.hid = hid;
		this.entry_time = entry_time;
		this.entry = entry;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
