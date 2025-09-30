package fileHandling_serialize_deserialize;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
	int regno;
	String title;
	boolean isIssued;
	static int count = 1;

	Book(String t) {
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return regno == other.regno;
	}
	
	public String toString() {
		return ("Book with regno: " + regno + "and title: " + title + "the book is issued: " + isIssued);
	}

}
