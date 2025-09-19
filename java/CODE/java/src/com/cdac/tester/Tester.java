package com.cdac.tester;

import com.cdac.Exceptions.DuplicateException;
import com.cdac.Students.Student;
import com.cdac.Utils.Utils;

public class Tester {
	
	public static void main(String[] args)  {
		try {
			System.out.println("before first add");
			Utils u = new Utils();
			Student s = new Student("max","123","dbda",89.90);
			u.addStudent(s);
			System.out.println("before second add");
			Student s1 = new Student("maxx","124","dbda",89.90);
			u.addStudent(s1);
			
			//------------------------display all students-----------------------
			u.display();
			
		}
		catch(DuplicateException d){
			System.out.print(d);
		}
			
			
		

		
		
	}

}
