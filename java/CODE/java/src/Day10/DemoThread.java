package Day10;

public class DemoThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		t1.setName("extender: ");
		t1.start(); 
		
		Thread t2 = new Thread(new Thread2());
		t2.setName("implementer: ");
		t2.start();
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for  (int i =0; i<10; i++) {
					System.out.println(i);
				}
			}
			
		});
		
		t3.start();
		
		for (int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		
		
	}
		
	

	
}
