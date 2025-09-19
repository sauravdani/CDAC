package com.cdac.Students;



public class Student {
	String name;
	String prn;
	String course;
	double marks;
	public Student(String name, String prn, String course, double marks) {
		super();
		this.name = name;
		this.prn = prn;
		this.course = course;
		this.marks = marks;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Student ) {
			Student s = (Student)o;
			
			if (this.getPrn().equals(s.getPrn())) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
		
}

	
