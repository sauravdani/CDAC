package assignment3;

import assignment2.FourWheeler;
import assignment2.TwoWheeler;
import assignment2.Vehicle;

public class Main {

	public static void main(String[] args) {
		
//		question 1
//		Policy p = new Policy();
//		Vehicle v1 = new TwoWheeler(3456, "hyundai", "sedan", 49000);
//		Vehicle v2 = new FourWheeler(2345, "toyota", "SUV", 49000);
//		
//		System.out.println("insurance of two wheeler:" + p.displayInsurance(v1));
//		System.out.println("insurance of four wheeler:" + p.displayInsurance(v2));
		
		Vehicle v[] = new Vehicle[4];
		v[0] = new TwoWheeler(3456, "hyundai", "sedan", 49000);
		v[1] = new TwoWheeler(3457, "toyta", "sedan", 492000);
		v[2] = new FourWheeler(2345, "toyota", "SUV", 499000);
		v[3] = new FourWheeler(2345, "toyota", "Sedan", 490100);
		

		
		for (Vehicle i : v) {
			System.out.println(i.rent(i,6));
		}
		
	}

}
