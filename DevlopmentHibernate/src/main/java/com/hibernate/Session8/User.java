package com.hibernate.Session8;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class User {
	private int userId;
	private String userName;
	private List<ProtienData> proteinData=new ArrayList<ProtienData>(); 
	private Map<String,UserHistory> personMap=new HashMap<String,UserHistory>();
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<ProtienData> getProteinData() {
		return proteinData;
	}
	public void setProteinData(List<ProtienData> proteinData) {
		this.proteinData = proteinData;
	}
	public Map<String, UserHistory> getPersonMap() {
		return personMap;
	}
	public void setPersonMap(Map<String, UserHistory> personMap) {
		this.personMap = personMap;
	}
	
}
