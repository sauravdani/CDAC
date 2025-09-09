package assignment1;

public class student {
	private String name;
	private int rollno;
	private double totalmarks;
	
	public static int incrementer = 1;
	
	public student(String name, int marks) {
		this.name = name;
		this.rollno = incrementer;
		incrementer++;
		this.totalmarks = marks;
	}
	
	public student() {
		this.name = "defaultName";
		rollno = incrementer;
		incrementer++;
		totalmarks = 0;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setTotalMark(double marks) {
		this.totalmarks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMarks() {
		return totalmarks;
	}
	
	public static int displaycount() {
		return incrementer;
	}
	
	public String toString() {
		return "name: " + name + " " + "roll no: " + rollno + "total Marks: " + totalmarks;
	}
	
	public static void main(String[] args) {
		student stud = new student();
		stud.setName("Max");
		stud.setTotalMark(96);
		
		student stud1 = new student("Toney",98);
		
		System.out.println(stud1.toString());
		System.out.println(stud.toString());
		
		System.out.print(student.displaycount()-1);
		

	}

}
