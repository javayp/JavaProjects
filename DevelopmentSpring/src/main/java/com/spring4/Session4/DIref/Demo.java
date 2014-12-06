package com.spring4.Session4.DIref;

public class Demo{
	private int id;
	private String name;
	private ExtraClass extrvariable;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setExtrvariable(ExtraClass extrvariable) {
		this.extrvariable = extrvariable;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", extrvariable="
				+ extrvariable + "]";
	}
}
