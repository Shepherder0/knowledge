package com.shepherd.entity;

public class Comprehensive {
	
	private int cID;
	private String question;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String answer;
	
	
	public Comprehensive() {
		super();
	}
	public Comprehensive(String question, String answerA, String answerB, String answerC, String answerD,
			String answer) {
		super();
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answer = answer;
	}
	public Comprehensive(int cID, String question, String answerA, String answerB, String answerC, String answerD,
			String answer) {
		super();
		this.cID = cID;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answer = answer;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswerA() {
		return answerA;
	}
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	public String getAnswerB() {
		return answerB;
	}
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	public String getAnswerC() {
		return answerC;
	}
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	public String getAnswerD() {
		return answerD;
	}
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Comprehensive [cID=" + cID + ", question=" + question + ", answerA=" + answerA + ", answerB=" + answerB
				+ ", answerC=" + answerC + ", answerD=" + answerD + ", answer=" + answer + "]";
	}
	
	

}
