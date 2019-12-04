package com.shepherd.entity;

public class Society {

	private int sID;
	private String question;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String answer;
	
	
	public Society() {
		super();
	}
	public Society(String question, String answerA, String answerB, String answerC, String answerD, String answer) {
		super();
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answer = answer;
	}
	
	public Society(int sID, String question, String answerA, String answerB, String answerC, String answerD,
			String answer) {
		super();
		this.sID = sID;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answer = answer;
	}
	
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
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
		return "Society [sID=" + sID + ", question=" + question + ", answerA=" + answerA + ", answerB="
				+ answerB + ", answerC=" + answerC + ", answerD=" + answerD + ", answer=" + answer + "]";
	}
	
	
}
