package com.hibernate.session3;

import java.util.Date;

public class UserHistory {
	private Date entrytime;
	private String entry;
	public UserHistory(){}
	public UserHistory(Date entrytime, String entry) {
		super();
		this.entrytime = entrytime;
		this.entry = entry;
	}
	public Date getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
}
