package assignment2;

public class Main {
	public static void main(String[] args) {
		FourWheeler f = new FourWheeler(123,"bajaj","latest",250600.00);
		System.out.println("Insurance amount for fourwheeler: "+f.calculateInsurance());
	
	TwoWheeler t = new TwoWheeler(123,"bajaj","latest",25453.00);
	System.out.println("Insurance amount for twowheeler: "+t.calculateInsurance());
	}

}
