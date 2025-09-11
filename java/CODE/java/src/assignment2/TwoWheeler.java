package assignment2;

import assignment3.Rentable;

public class TwoWheeler extends Vehicle {
	
	public TwoWheeler(int registration_no,String make,String model,double price) {
		super(registration_no,make,model,price);
	}

	@Override
	public double calculateInsurance() {
		System.out.print("It is Two Wheeler: ");
		return price * 0.05;
	}
	
	public double rent(Vehicle v, int hrs) {
		System.out.print("It is Two Wheeler Rent: ");
		if (hrs <= 3) {
			return hrs*300;
		}
		else {
			return hrs*300+((hrs-3)*100);
		}
	}
	

}
