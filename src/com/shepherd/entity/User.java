package com.shepherd.entity;

public class User {
	
	private int uID;
	private String uName;
	private String uPwd;
	private int uPermission;
	
	
	public User() {
		super();
	}
	public User(String uName, String uPwd) {
		super();
		this.uName = uName;
		this.uPwd = uPwd;
	}
	public User(String uName, String uPwd, int uPermission) {
		super();
		
		this.uName = uName;
		this.uPwd = uPwd;
		this.uPermission = uPermission;
	}
	public User(int uID, String uName, String uPwd) {
		super();
		this.uID = uID;
		this.uName = uName;
		this.uPwd = uPwd;
		
	}
	public User(int uID, String uName, String uPwd, int uPermission) {
		super();
		this.uID = uID;
		this.uName = uName;
		this.uPwd = uPwd;
		this.uPermission = uPermission;
	}
	
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public int getuPermission() {
		return uPermission;
	}
	public void setuPermission(int uPermission) {
		this.uPermission = uPermission;
	}
	
	@Override
	public String toString() {
		return "User [uID=" + uID + ", uName=" + uName + ", uPwd=" + uPwd + ", uPermission=" + uPermission + "]";
	}
	
	

}
