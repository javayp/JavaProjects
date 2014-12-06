package com.spring5.Session5.SingeltonPrototype;

public class Person{
	private int id;
	private String name;
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
	void init(){
		System.out.println("bean instantiated!!!");
	}
	void destroy(){
		System.out.println("bean DEinstantiated!!");
	}
	@Override
	public String toString() {
		return "Perosn [id=" + id + ", name=" + name + "]";
	}
}
