package com.spring6.Session6.intiANDdestroy;

public class Person {
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
	public void onCreate(){
		System.out.println("Person instanitated!!!"+this);
	}
	public void onDestroy(){
		System.out.println("Person dinstantiated");
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
