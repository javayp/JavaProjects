package com.hibernate.Session5;

import java.util.Date;

public class UserHistory {
	private Date entry_time;
	private String entry;
	
	public UserHistory() {
		super();
	}
	public UserHistory(Date entry_time, String entry) {
		super();
		this.entry_time = entry_time;
		this.entry = entry;
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
}
