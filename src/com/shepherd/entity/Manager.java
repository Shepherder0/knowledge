package com.shepherd.entity;


public class Manager {
	
	private int mID;
	private String mName;
	private String mPwd;
	private int mPermission;
	
	public Manager(int mID, String mName, String mPwd) {
		super();
		this.mID = mID;
		this.mName = mName;
		this.mPwd = mPwd;
	}
	
	public Manager() {
		super();
	}
	
	public Manager(String mName, String mPwd) {
		super();
		this.mName = mName;
		this.mPwd = mPwd;
	}
	
	public Manager(int mID, String mName, String mPwd, int mPermission) {
		super();
		this.mID = mID;
		this.mName = mName;
		this.mPwd = mPwd;
		this.mPermission = mPermission;
	}

	public int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmPwd() {
		return mPwd;
	}
	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}
	public int getmPermission() {
		return mPermission;
	}

	public void setmPermission(int mPermission) {
		this.mPermission = mPermission;
	}

	@Override
	public String toString() {
		return "Manager [mID=" + mID + ", mName=" + mName + ", mPwd=" + mPwd + ", mPermission=" + mPermission + "]";
	}
	
	

}
