//This class is meant for one-to-many Association
package com.hibernate.Session8;

import java.util.Date;

public class UserHistory {
	private int userHistoryId;
	private Date entry_time;
	private String user_name;
	private User user;
	
	public UserHistory() {
		super();
	}
	public UserHistory(Date entry_time, String user_name) {
		super();
		this.entry_time = entry_time;
		this.user_name = user_name;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUserHistoryId() {
		return userHistoryId;
	}
	public void setUserHistoryId(int userHistoryId) {
		this.userHistoryId = userHistoryId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
