package com.Spring7.FactoryMethod7;

public class PersonFactory {
	public Person getInstance(int id,String name){
		return new Person(id,name);
	}
}
