//This class is meant for one-to-one Association
package com.hibernate.Session8;

public class ProtienData {
	private int protienid;
	private int goal;
	
	public ProtienData() {
		super();
	}
	public ProtienData(int goal, int total) {
		super();
		this.goal = goal;
		this.total = total;
	}
	private int total;
	private User user;
	
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getProtienid() {
		return protienid;
	}
	public void setProtienid(int protienid) {
		this.protienid = protienid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
