package com.cdac.Utils;


import com.cdac.Exceptions.DuplicateException;
import com.cdac.Students.Student;

import java.util.*;

public class Utils {
	List<Student> student;
	
	public Utils() {
		this.student = new ArrayList<>();
	}
	
	public void addStudent(Student s) throws DuplicateException {
		boolean duplicate=false;
		for (Student st:student) {
			if (st.equals(s)) {
				duplicate=true;
				break;
			}
		}
		student.add(s);
		if(! duplicate) {
			student.add(s);
		}
		else {
			throw new DuplicateException ("Student already exists");
		}
	}
	public void display() {
		for (Student s :student) {
			System.out.println("Name: " + s.getName());
			System.out.println("prn: " + s.getPrn());
			System.out.println("course: " + s.getCourse());
			System.out.println("marks: " + s.getMarks() + "\n");
			
		}
	}
	
	
}