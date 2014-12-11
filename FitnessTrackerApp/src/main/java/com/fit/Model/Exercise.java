package com.fit.Model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


public class Exercise {
	private Long goal;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dateEntry;
	private String firstName;
	private String lastName;
	private List<String> Department;
	
	@NotNull
	@Range(min=1,max=30)
	public Long getGoal() {
		return goal;
	}
	public void setGoal(Long goal) {
		this.goal = goal;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getDepartment() {
		return Department;
	}
	public void setDepartment(List<String> department) {
		Department = department;
	}
	public Date getDateEntry() {
		return dateEntry;
	}
	public void setDateEntry(Date dateEntry) {
		this.dateEntry = dateEntry;
	}
	
}
