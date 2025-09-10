package assignment2;

public class FourWheeler extends Vehicle {
	
	public FourWheeler(int registration_no,String make,String model,double price) {
		super(registration_no,make,model,price);
	}

	@Override
	public double calculateInsurance() {
		return price * 0.10;
	}

}
