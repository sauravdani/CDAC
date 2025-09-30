package fileHandling_serialize_deserialize;

public class FileHandlingTester {

	public static void main(String[] args) {
		Util u = new Util("BookListFile");
		Book b1 = new Book("python");
		Book b2 = new Book("maths");
		Book b3 = new Book("hindi");
		Book b4 = new Book("french");
		Book b5 = new Book("c++");
		
		u.addBook(b5);
		u.addBook(b4);
		u.addBook(b3);
		u.addBook(b2);
		u.addBook(b1);
		
		u.serialize();
		u.deserialized();
		
		u.issueBook(b2);
		u.issueBook(b4);
		
		u.serialize();
		u.deserialized();
		

	}

}
