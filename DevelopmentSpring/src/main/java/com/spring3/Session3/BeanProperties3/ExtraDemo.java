package com.spring3.Session3.BeanProperties3;

public class ExtraDemo {
	private int pid;
	private String pname;
	private ExtraClass extra;
	
	public ExtraDemo(int pid, String pname, ExtraClass extra) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.extra = extra;
	}

	@Override
	public String toString() {
		return "ExtraDemo [pid=" + pid + ", pname=" + pname + ", extra="
				+ extra + "]";
	}
}
