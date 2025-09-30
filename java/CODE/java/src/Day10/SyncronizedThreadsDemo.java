package Day10;

public class SyncronizedThreadsDemo {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		Runnable r = () -> {
			synchronized(c) {
				for(int i = 0; i<5; i++) {
					c.increment();
				}
				
			}
			
		}
		
	}

}
