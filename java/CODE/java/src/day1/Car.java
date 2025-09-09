package day1;

public class Car {
		private String make;
		private String mode;
		private double price;
		
	 	public Car(){
			this.make = "none";
			this.mode = "sedan";
			this.price = 500000.0f;
		}
		
		public void setMake(String make){
			this.make = make;
		}
		public void setMode(String mode){
			this.mode = mode;
		}
		public void setPrice(double price){
			this.price = price;
		}

		public double getPrice(){
			return price;
		} 
		public String getMake(){
			return make;
		}
		public String getMode(){
			return mode;
		}
	
	
public static void main(String[] args) {
		Car car = new Car();
		
		car.setPrice(500000);
		System.out.print(car.getPrice());

	}

}

