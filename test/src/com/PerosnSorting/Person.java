package com.PerosnSorting;

/**
 * Created by yp on 11/26/2014.
 */
public class Person {
    private int id;
    private String name;
    private String date;
    private String city;

   public  Person(int id,String name,String date,String city){
        this.id=id;
        this.name=name;
        this.date=date;
        this.city=city;
    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
