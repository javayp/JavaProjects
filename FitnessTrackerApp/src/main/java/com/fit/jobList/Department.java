package com.fit.jobList;

import java.util.ArrayList;
import java.util.List;

public class Department{
	
	private  List<String> departments=new ArrayList<String>();
	
	public  List<String> getJobList(){
		departments.add("Developers");
		departments.add("Mangaer");
		departments.add("Tester");
		departments.add("R&D");
		departments.add("Content Editor");
		departments.add("Programmer");
		return departments;
	}

}
