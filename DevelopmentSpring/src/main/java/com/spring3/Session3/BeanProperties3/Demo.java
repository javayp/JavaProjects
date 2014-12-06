package com.spring3.Session3.BeanProperties3;

public class Demo {
	//we can use the setter method to set the value of the variable and we dont have to worry about the constructor intilization
	
	private int id;
	private String name;
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String toString(){
		return "[ID="+id+" "+" NAME="+name+"]";
	}
}
