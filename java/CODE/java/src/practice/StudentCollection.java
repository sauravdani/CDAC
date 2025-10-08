package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentCollection {

	List<Student> students = null;
	
	StudentCollection(List<Student> s){
		students = s;
	}
	
//	 Return names of all students from the specified course
	 List<String> getStudentNamesByCourse(List<Student> students, String course){
		 Stream<Student> s = this.students.stream();
		 
		 
	 }

	

	
		
	
}
