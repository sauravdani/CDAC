package com.cdac.test;

import com.cdac.book.Book;
import com.cdac.utils.Util;

public class Tester {

	public static void main(String[] args) {
		
		Util util =new Util();
		util.deserialize();
		Book b1= new Book("Java Programming");
		Book b2= new Book("Big Data Analytics");
		util.issueBook(b1);
		util.issueBook(b2);
		util.issueBook(b1);
		util.serialize();
	}

}
