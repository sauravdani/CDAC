package Day9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import javax.sql.rowset.Predicate;

import Day8.*;


public class EmployeeStream {
	
	public static void main(String [] args) {
		 List <Emp> emplist = EmpCollection.getEmployeeDate();
		 Stream <Emp> stream = emplist.stream();
		 
		 System.out .println("---------------sort by empID------------------");
		 stream.sorted().forEach(System.out::println);
		 
		 System.out .println("---------------sort by emp name------------------");
		 stream = emplist.stream();
		 Comparator<Emp> byName = Comparator.comparing(Emp::getName);
		 stream.sorted(byName).forEach(System.out::println);
		 
		 System.out .println("---------------filter by sal range------------------");
		 stream = emplist.stream();
		 Predicate<Emp> salRange = (Emp) -> Emp.getsalary() > 5000 && Emp.getSalary() < 8000;
		 
		 System.out .println("---------------filter by skill------------------");
		 stream = emplist.stream();
		 stream.filter(Emp) -> emp.getSkills().comtains("Java").forEach(emp) -> System.out.println(emp);

}

}
