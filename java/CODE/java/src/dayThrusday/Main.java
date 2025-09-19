package dayThrusday;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PRN,name, Course:");
		for (Course c: Course.values()) {
			System.out.println(c);
		}
		
//----------------------------------CREATE---------------------------------------
		ArrayList<Student> st= new ArrayList<Student>();
		
		Student s = new Student("123","Mohan","pg_dbda",89.34);
		st.add(s);
		
		Student s1 = new Student("124","Max","pg_dac",89.34);
		st.add(s1);
		
		Student s2 = new Student("125","Monica","pg_dai",89.34);
		st.add(s2);
		
		
//---------------------------------READ------------------------------------------	
//		for (Student stu:st) {
//			System.out.println(stu.getName());
//			System.out.println(stu.getPrn());
//			System.out.println(stu.getCourse());
//			System.out.println(stu.getMarks() + "\n");
//		}
		
//		System.out.println("Enter the prin you wat to print: ");
//		String prn = sc.next();
//		boolean flag = true;
//		
//		for (Student stu:st) {
//			if (stu.getPrn().equals(prn)){
//				System.out.println(stu.getName());
//				System.out.println(stu.getPrn());
//				System.out.println(stu.getCourse());
//				System.out.println(stu.getMarks() + "\n");
//				flag = false;
//				break;
//			}
//			
//		}
//		if (flag) {
//			System.out.println("Student not available");
//		}
		

//		System.out.println("Enter the prin you wat to print: ");
//		Student temp = new Student(sc.next());
//		boolean flag = true;
//		
//		for (Student stu:st) {
//			if (stu.equals(temp)){
//				System.out.println(stu.getName());
//				System.out.println(stu.getPrn());
//				System.out.println(stu.getCourse());
//				System.out.println(stu.getMarks() + "\n");
//				flag = false;
//				break;
//			}
//			
//		}
//		if (flag) {
//			System.out.println("Student not available");
//		}
		
		
//---------------------------------UPDATE----------------------------------------		
//		System.out.println("Enter new prn");
//		String str = sc.next();
//		
//		s1.setPrn(str);
//		System.out.println(s1.getName());
//		System.out.println(s1.getPrn());
//		System.out.println(s1.getCourse());
//		System.out.println(s1.getMarks() + "\n");
		
		
//--------------------------------DELETE--------------------------------------------
		
		System.out.println("Enter the prin you wat to print: ");
		Student temp = new Student(sc.next());
		boolean flag = true;
		int index = -1;
		
		for (int i = 0; i<st.size(); i++) {
			if (st.get(i).equals(temp)){
				index = i;
				flag = false;
				break;
			}
		}
		
		if (index != -1) {
			System.out.println(st.get(index).getName());
			System.out.println(st.get(index).getPrn());
			System.out.println(st.get(index).getCourse());
			System.out.println(st.get(index).getMarks() + "\n");
			st.remove(index);
		}
		
		
		
	}

}
