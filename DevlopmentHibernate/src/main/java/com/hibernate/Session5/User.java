package com.hibernate.Session5;

import java.util.Map;
import java.util.HashMap;

public class User {
	private int id;
	private String name;
	private ProtienData protienData=new ProtienData();
	private Map<String,UserHistory> maptype=new HashMap<String,UserHistory>();

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
	public ProtienData getProtienData() {
		return protienData;
	}
	public void setProtienData(ProtienData protienData) {
		this.protienData = protienData;
	}
	public Map<String,UserHistory> getMaptype() {
		return maptype;
	}
	public void setMaptype(Map<String,UserHistory> maptype) {
		this.maptype = maptype;
	}
	
}
