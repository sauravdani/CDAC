package Day10;

public class DemoThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		t1.setName("extender: ");
		t1.start(); 
		
		Runnable t2 = new Thread2();
		t2.run();
		
		
		
		
		for (int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		
		
	}
		
	

	
}
