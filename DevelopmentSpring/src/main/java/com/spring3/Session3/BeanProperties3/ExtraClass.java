package com.spring3.Session3.BeanProperties3;

public class ExtraClass {
	private int id;
	private String name;
	public ExtraClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ExtraClass [id=" + id + ", name=" + name + "]";
	}
	
}
