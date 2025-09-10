package assignment2;

public class TwoWheeler extends Vehicle {
	
	public TwoWheeler(int registration_no,String make,String model,double price) {
		super(registration_no,make,model,price);
	}

	@Override
	public double calculateInsurance() {
		return price * 0.5;
	}
	

}
