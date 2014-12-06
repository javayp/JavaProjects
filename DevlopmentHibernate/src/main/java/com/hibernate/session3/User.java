package com.hibernate.session3;

import java.util.HashSet;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private ProtienData protienData=new ProtienData();
	private Set<UserHistory> userHistory=new HashSet<UserHistory>();
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public ProtienData getProtienData() {
		return protienData;
	}
	public void setProtienData(ProtienData protienData) {
		this.protienData = protienData;
	}
	public Set<UserHistory> getUserHistory() {
		return userHistory;
	}
	public void setUserHistory(Set<UserHistory> userHistory) {
		this.userHistory = userHistory;
	}
}
