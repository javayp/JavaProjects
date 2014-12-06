package com.spring2.session2.Constructors2;

public class ConstructorDemo {
	private int id;
	private String name;
	public ConstructorDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ConstructorDemo [id=" + id + ", name=" + name + "]";
	}
}
