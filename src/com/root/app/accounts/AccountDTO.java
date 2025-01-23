package com.root.app.accounts;

import java.sql.Date;

public class AccountDTO {
	
	private String accountnum;
	private String username;
	private long productnum;
	private long accountbalance;
	private Date accountdate;
	
	
	
	
	public String getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getProductnum() {
		return productnum;
	}
	public void setProductnum(long productnum) {
		this.productnum = productnum;
	}
	public long getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(long accountbalance) {
		this.accountbalance = accountbalance;
	}
	public Date getAccountdate() {
		return accountdate;
	}
	public void setAccountdate(Date accountdate) {
		this.accountdate = accountdate;
	}
	
	
	
	
	

}
