package com.shepherd.entity;

public class Scores {
	
	private int ID;
	private int uID;
	private String topic;
	private String score;
	
	
	
	public Scores() {
		super();
	}
	public Scores(int iD, String topic, String score) {
		super();
		ID = iD;
		this.topic = topic;
		this.score = score;
	}
	public Scores(int iD, int uID, String topic, String score) {
		super();
		ID = iD;
		this.uID = uID;
		this.topic = topic;
		this.score = score;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Scores [ID=" + ID + ", uID=" + uID +  ", topic=" + topic + ", score=" + score + "]";
	}
	
	

}
