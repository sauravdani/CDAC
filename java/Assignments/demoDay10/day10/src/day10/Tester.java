package day10;

import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		StudentCollection lst = new StudentCollection();
		
//		List<String> getStudentNamesByCourse(List<Student> students, String course)
//		   - Return names of all students from the specified course
		System.out.println("Enter the course name ou wnat to filter it with: ");
		Scanner sc = new Scanner(System.in);
		String cname = sc.next();
		Student s = new Student();
		s.setCourse(cname);
		List<String> nameList = lst.studentList.stream().filter((s) -> {s.getCourse().equalsIgnoreCase(s);});
	}

}
