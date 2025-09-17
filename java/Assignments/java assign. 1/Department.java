package assignment1;

import java.util.Scanner;
public class Department {
	student arr[] ;
	
	public Department(student arr[]) {
		this.arr = arr;
	}
	
//	public void addStud(student stud) {
//		n = n + 1;
//		arr[n-1] = stud;
//	}
	
	public void diplayStud() {
		for(student i:arr) {
			System.out.println("the name: " + i.getName());
			System.out.println("the marks are: " + i.getMarks());
		}
	}
	
	public double avgStud() {
		int sum = 0;
		for(student i:arr) {
			sum += i.getMarks();
		}
		return sum / arr.length;
	}
	
	public int count() {
		return arr.length;
	}
	
	public static void main(String[] args) {
//		Department d1 = new Department(2);
//		d1.addStud(new student("tony", 79));
//		d1.addStud(new student());
//		d1.addStud(new student("max", 99));
		Scanner sc = new Scanner(System.in);
		student [] arr = new student[3];
		arr[0] = new student("tony", 79);
		arr[1] = new student();
		arr[2] = new student("max", 99);
		
		Department dept = new Department(arr);
		
		System.out.println("the avg is: " + dept.avgStud());
		System.out.println("The number of students are: "+ dept.count());
		System.out.println("all the students are: ");
		dept.diplayStud();
		sc.close();
	}

}
