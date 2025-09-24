package assignment6;

import java.io.Serializable;

public class Book implements Serializable {
	int regno;
	String title;
	transient boolean isIssued;
	static int count=1;
	
	Book(String t){
		regno = count++;
		title = t;
		isIssued = false;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	
	
}
