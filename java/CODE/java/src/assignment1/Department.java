package assignment1;

public class Department {
	int n;
	student arr[];
	
	public Department(int size) {
		student arr[] = new student[size];
		n = 0;
	}
	
	public void addStud(student stud) {
		n = n + 1;
		arr[n-1] = stud;
	}
	
	public void diplayStud() {
		for(student i:arr) {
			System.out.println(i);
		}
	}
	
	public double avgStud() {
		int sum = 0;
		for(student i:arr) {
			sum += i.getMarks();
		}
		return sum / n;
	}
	
	public int count() {
		return n;
	}
	
	public static void main(String[] args) {
		Department d1 = new Department(4);
		d1.addStud(new student("tony", 79));
		d1.addStud(new student());
		d1.addStud(new student("max", 99));
		
		System.out.println("the avg is: " + d1.avgStud());
		System.out.println("The number of students are: "+ d1.count());
		System.out.println("all the students are: ");
		d1.diplayStud();

	}

}
