package com.hibernate.Session6;

import java.util.ArrayList;
import java.util.Collection;

public class User {
	private int id;
	private String name;
	private Collection<UserHistory> userhistory=new ArrayList<UserHistory>();
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
	public Collection<UserHistory> getUserhistory() {
		return userhistory;
	}
	public void setUserhistory(Collection<UserHistory> userhistory) {
		this.userhistory = userhistory;
	}
}
