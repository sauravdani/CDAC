package assignment6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Util{
	String fileName;
	Set<Book> books = new HashSet<Book>();
	
	public Util(String file) {
		fileName = file;
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
	
	public void isIssued(Book b){
		for (Book book:books) {
			if (book.equals(b)) {
				if (b.isIssued()) {
					System.out.println("the book is already issued");
				}
				else {
					System.out.println("the book is already issued");
				}
			}
		}
	}
	
	public void Serialize(){
		try(Scanner sc = new Scanner(System.in);
				)
	}
	
}
