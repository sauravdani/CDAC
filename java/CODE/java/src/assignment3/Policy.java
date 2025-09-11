package assignment3;
import assignment2.*;

public class Policy{
	
	Vehicle v[];
	
	public Policy(Vehicle vh[]) {
		v=vh;
	}
	
	public double displayInsurance(Vehicle v) {
		double insurance = v.calculateInsurance();
		return insurance;
	}
	
	
	
} 
