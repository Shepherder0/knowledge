package com.shepherd.entity;

public class Questions {
	
	private int ID;
	private String question;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String answer;
	private String flag;
	
	public Questions(String question, String answerA, String answerB, String answerC, String answerD,
			String answer, String flag) {
		super();
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answer = answer;
		this.flag = flag;
	}
	public Questions() {
		super();
		
	}
	
	public Questions(int iD, String question, String answerA, String answerB, String answerC, String answerD,
			String answer, String flag) {
		super();
		ID = iD;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answer = answer;
		this.flag = flag;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Questions [ID=" + ID + ", question=" + question + ", answerA=" + answerA + ", answerB=" + answerB
				+ ", answerC=" + answerC + ", answerD=" + answerD + ", answer=" + answer + ", flag=" + flag + "]";
	}
	

}
