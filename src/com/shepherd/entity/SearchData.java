package com.shepherd.entity;

public class SearchData {
	
	private String Type;
	private String idString;
	private int ID;
	
	
	public SearchData() {
		super();
	}
	public SearchData(String type, String idString, int iD) {
		super();
		Type = type;
		this.idString = idString;
		ID = iD;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "SearchData [Type=" + Type + ", idString=" + idString + ", ID=" + ID + "]";
	}
	
}
