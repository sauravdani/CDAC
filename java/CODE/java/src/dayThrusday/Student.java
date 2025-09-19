package dayThrusday;

public class Student {
	String prn;
	String name;
	Course course;
	double marks;
	
	public Student(String prn){
		this.prn = prn;
	}
	
	public Student(String prn, String name, String course, double marks) {
		super();
		this.prn = prn;
		this.name = name;
		this.course = Course.valueOf(course.toUpperCase());
		this.marks = marks;
	}
	
//	public boolean equals(String prnS) {	
//		if (prnS == this.getPrn()) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student s = (Student)o;
			if (this.getPrn().equals(s.getPrn()) ) {
				return true;
			}
		}
		return false;
	}
	
	public String getPrn() {
		return prn;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course.name();
	}

	public void setCourse(String course) {
		this.course = Course.valueOf(course);
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	
}
