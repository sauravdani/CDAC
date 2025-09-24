package day10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentCollection {
	List<Student> studentList = new ArrayList<Student>();
	
	public StudentCollection() {
		Student s1 = new Student("1", "Aman", 16, "CSE", LocalDate.of(2014, 5, 13), 98.09, "Amritsar");
		Student s2 = new Student("2", "bhavika", 18, "CSE", LocalDate.of(2014, 2, 17), 92.09, "rampur");
		Student s3 = new Student("3", "chaman", 16, "mechenical", LocalDate.of(2013, 3, 1), 95.09, "ranibagh");
		Student s4 = new Student("4", "david", 16, "civil", LocalDate.of(2016, 3, 13), 93.09, "pune");
		Student s5 = new Student("5", "eric", 17, "CSE", LocalDate.of(2017, 4, 1), 94.09, "nagpur");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
	}
	
}
