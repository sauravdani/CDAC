package Day6;

public class DemoException {

	public static void main(String[] args) {
		try {
			int dividend = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			
			
			int result = dividend/divisor;
			
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
