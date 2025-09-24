package Day8;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;

public class EmpCollection {
	
	
	
	public static List<Emp> getEmployeeDate()
	{
		
		
		List <Emp> emplist = new ArrayList<>();
		
//		Set <String> skills1 = new TreeSet<>();
//		skills1.add("java");
//		skills1.add("python");
//		emplist.add(new Emp(3221,"aa",50000,skills1));
//		
	
		Set<String> skills1 = new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		emplist.add(new Emp(3221, "aa", 50000, skills1));

		// Employee 2
		Set<String> skills2 = new TreeSet<>();
		skills2.add("javascript");
		skills2.add("react");
		skills2.add("nodejs");
		emplist.add(new Emp(3222, "bb", 65000, skills2));

		// Employee 3
		Set<String> skills3 = new TreeSet<>();
		skills3.add("sql");
		skills3.add("python");
		skills3.add("data analysis");
		emplist.add(new Emp(3223, "cc", 55000, skills3));

		// Employee 4
		Set<String> skills4 = new TreeSet<>();
		skills4.add("java");
		skills4.add("spring");
		skills4.add("hibernate");
		emplist.add(new Emp(3224, "dd", 70000, skills4));

		// Employee 5
		Set<String> skills5 = new TreeSet<>();
		skills5.add("python");
		skills5.add("machine learning");
		skills5.add("tensorflow");
		emplist.add(new Emp(3225, "ee", 80000, skills5));

		// Employee 6
		Set<String> skills6 = new TreeSet<>();
		skills6.add("aws");
		skills6.add("docker");
		skills6.add("kubernetes");
		emplist.add(new Emp(3226, "ff", 75000, skills6));
		
		
		return emplist;
	}
	
	public static void printList(List<Emp> emplist) {
		for (Emp e: emplist) {
			System.out.println(e);
			
			LocalDate dt = LocalDate.now();
			System.out.print(dt);
		}
	}
	
	
	

}
