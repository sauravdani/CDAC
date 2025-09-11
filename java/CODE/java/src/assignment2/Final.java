package assignment2;

public class Final {

	public static void main(String[] args) {
		Current current = new Current(122,"Max",2000);
		current.deposit(1000);
		
		Saving s= new Saving(122,"Max",2000);
		s.withdraw(4000);

	}

}
