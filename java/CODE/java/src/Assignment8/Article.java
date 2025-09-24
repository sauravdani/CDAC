package Assignment8;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Article {
	static int srno = 1;
	String subject;
	LocalDate pdate;
	Type category;
	
	Scanner sc = new Scanner(System.in);
	
	Article(LocalDate date, String subject, Type cat){
		this.subject = subject;
		pdate = date;
		System.out.println("Enter the categry out of: healthcare, covid, child");
		category = cat;
	}
	
	
	
}
