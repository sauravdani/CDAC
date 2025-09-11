package assignment2;

import assignment3.*;
import assignment2.*;

public class FourWheeler extends Vehicle {
	
	public FourWheeler(int registration_no,String make,String model,double price) {
		super(registration_no,make,model,price);
	}

	@Override
	public double calculateInsurance() {
		System.out.print("It is Four Wheeler: ");
		return price * 0.10;
	}
	public double rent(Vehicle v, int hrs) {
		System.out.print("It is Four Wheeler Rent: ");
		if (hrs <= 3) {
			return hrs*500;
		}
		else {
			return hrs*500+((hrs-3)*200);
		}
	}

}
