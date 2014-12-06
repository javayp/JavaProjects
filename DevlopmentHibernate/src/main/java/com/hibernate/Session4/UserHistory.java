package com.hibernate.Session4;

import java.util.Date;

public class UserHistory {
	private Date entry_time;
	private String entry;
	
	public UserHistory() {
		super();
	}

	public UserHistory(Date entry_time, String entry) {
		super();
		this.entry_time = entry_time;
		this.entry = entry;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entry == null) ? 0 : entry.hashCode());
		result = prime * result
				+ ((entry_time == null) ? 0 : entry_time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserHistory other = (UserHistory) obj;
		if (entry == null) {
			if (other.entry != null)
				return false;
		} else if (!entry.equals(other.entry))
			return false;
		if (entry_time == null) {
			if (other.entry_time != null)
				return false;
		} else if (!entry_time.equals(other.entry_time))
			return false;
		return true;
	}

	public Date getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}
	
}
