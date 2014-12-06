package com.hibernate.Session6;

import java.util.Date;

public class UserHistory {
	private Date entry_time;
	private String entry;
	public UserHistory() {
		
	}
	public UserHistory(Date entry_time, String entry) {
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
