package practice;

public class Faculty {
	String name;
	String course;
	public Faculty(String name, String course) {
		this.name = name;
		this.course = course;
	}
	
	public boolean equal(Object o) {
		if (o instanceof Faculty ) {
			Faculty tw = (Faculty)o;
		}
	}
	public static void main(String[] args) {
		Faculty f1 = new Faculty("XYZ","DBDA");
		Faculty f2 = new Faculty("XYZ","CDAC");
		
		if (f1 == f2) {
			System.out.print("Not equal");
			
		}
		if (f1 != f2) {
			System.out.print("Equal");
		}
	}
}
