package com.hibernate.Session4;

import java.util.List;
import java.util.ArrayList;

public class User {
	private int id;
	private String name; 
	private ProtienData protienData=new ProtienData();
	private List<UserHistory> userHistory=new ArrayList<UserHistory>();
	
	public ProtienData getProtienData() {
		return protienData;
	}
	public void setProtienData(ProtienData protienData) {
		this.protienData = protienData;
	}
	public List<UserHistory> getUserHistory() {
		return userHistory;
	}
	public void setUserHistory(List<UserHistory> userHistory) {
		this.userHistory = userHistory;
	}
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
}
