package fileHandling_serialize_deserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	
	public void issueBook(Book b) {
		boolean flag = true;
		for(Book book:books) {
			if (book.equals(b)) {
				book.setIssued(true);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("the book is not available");
		}
	}
	
	public void serialize() {
		try(Scanner sc = new Scanner(System.in);
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
				){
			oos.writeObject(books);
			System.out.println("Books are serealized");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void deserialized() {
		try(Scanner sc = new Scanner(System.in);
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			books = (Set<Book>) ois.readObject();
			System.out.println("The deserialization is done....");
			books.forEach((b) -> System.out.println(b));
			System.out.println("this is the deserialized data");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
