package com.spring4.Session4.DIref;

public class ExtraClass {
	private int extraId;
	private String extraName;
	public void setExtraId(int extraId) {
		this.extraId = extraId;
	}
	public void setExtraName(String extraName) {
		this.extraName = extraName;
	}
	@Override
	public String toString() {
		return "ExtraClass [extraId=" + extraId + ", extraName=" + extraName
				+ "]";
	}
}
