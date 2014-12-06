package com.hibernate.Session7;

import java.util.List;
import java.util.ArrayList;

public class User {
	private int id;
	private String name;
	private List<UserHistory> userHistory=new ArrayList<UserHistory>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<UserHistory> getUserHistory() {
		return userHistory;
	}
	public void setUserHistory(List<UserHistory> userHistory) {
		this.userHistory = userHistory;
	}	
	
	//this method shows the foreign key update
	public void addUserHistory(UserHistory history){
		history.setUser(this);
		userHistory.add(history);
	}
}
