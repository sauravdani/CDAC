package Day3;

public class SalesManager extends Manager {
	protected double insentives;
	
	public SalesManager(String ename,int empid, double basic, double allownces,double insentives) {
		super(ename,empid,basic,allownces);
		this.insentives=insentives;
		
		
	}
	public double grossSalary() {
		return super.grossSalary()+insentives;
	}
	
	public double netSalary() {
		return super.netSalary()+insentives;
	}
	
	
	
	
}
