package Day3;

public class Manager extends Salaried {
	protected double allownces;
	
	public Manager(String ename,int empid, double basic, double allownces){
		super(ename,empid,basic);
		this.allownces = allownces;
		
	}
	public double grossSalary() {
		double hra = basic * 0.4;
		double da = basic * 0.25;
		
		return basic + hra + da + allownces ;
	}
	public double netSalary() {
		return super.netSalary()+allownces;
	}
	

}
