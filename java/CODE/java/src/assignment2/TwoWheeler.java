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
	public int getRegis() {
		return this.registration_no;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TwoWheeler) {
			TwoWheeler tw = (TwoWheeler)o;
			if (tw.getRegis() == this.getRegis()) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		TwoWheeler v1 = new TwoWheeler(1234, "tata", "nexon", 1200000);
		TwoWheeler v2 = new TwoWheeler(1234, "tata", "nexon", 1200000);
		
		if (v1 == v2) {
			System.out.println("v1 == v2");
		}
		else {
			System.out.println("v1 != v2");
		}
		
	}

}
