package com.cdac.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.cdac.book.Book;

public class Util {

	String file;
	Set<Book> issuedBooks;
	
	public Util(){
		file="books";
		issuedBooks= new HashSet<>();
	}
	
	public void issueBook(Book b) {
		if(issuedBooks.contains(b)) {
			System.out.println("Book already issued!");
		}else {
			issuedBooks.add(b);
			System.out.println("Book issued!");
		}
	}
	
	public void serialize() {
		/*
		 Get populated set of books 
		 Store it in a bin file using serialization
		 */
		//System.out.println("Enter file name to store product details in bin format");
		try (Scanner sc = new Scanner(System.in);
				// Java App --> OOS --> FOS ---> bin file
				ObjectOutputStream out = new ObjectOutputStream(
						new FileOutputStream(file))) {
			
			//store issued book details in bin file
			out.writeObject(issuedBooks);//serialiazation
			System.out.println("serialization done !");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deserialize() {
		System.out.println("Enter file name for resting product details");
		try (Scanner sc = new Scanner(System.in);
				// Java APP <--- OIS <--- FIS <--- bin file
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
			issuedBooks = (Set<Book>) in.readObject();
			System.out.println("Restored products");
			issuedBooks.forEach(b->System.out.println(b));
			System.out.println("data restored....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
