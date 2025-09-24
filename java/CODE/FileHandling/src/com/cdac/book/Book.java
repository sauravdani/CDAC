package com.cdac.book;

import java.io.Serializable;

public class Book implements Serializable{

	int regNo;
	String title;
	boolean isIssued;
	static int count = 1;
	//static members can be initialised directly
	//or in a static initializer block
	
	//Parameterised constructor which accepts only title
	//Reg. no. auto-increment and isIssued initially true
	public Book(String title) {
		this.regNo = count++;
		this.title = title;
		this.isIssued = true;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}

	public int getRegNo() {
		return regNo;
	}

	public String getTitle() {
		return title;
	}

	public boolean isIssued() {
		return isIssued;
	}

	@Override
	public String toString() {
		return "Book [regNo=" + regNo + ", title=" + title + ", isIssued=" + isIssued + "]";
	}
	
	
}
