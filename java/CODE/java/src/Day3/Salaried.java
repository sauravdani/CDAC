package Day3;

public class Salaried extends Employee {
	
	protected double basic;
	
	public Salaried(String ename,int empid,double basic) {
		super (ename,empid);
		this.basic = basic;
	}
	
	public double grossSalary() {
		double hra = basic * 0.4;
		double da = basic * 0.25;
		
		return basic + hra + da ;
	}
	
	public  double netSalary(){
		double pf = grossSalary() * 0.12;
		return grossSalary() - pf;
	}

}
