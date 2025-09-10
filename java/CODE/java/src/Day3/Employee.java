package Day3;

public abstract class Employee {
	
	protected String ename;
	protected int empid;
	
	public Employee(String ename, int empid) {
		this.ename = ename;
		this.empid = empid;
	}
	
	public abstract double grossSalary();
	
	public String toString() {
		
		return "Name: " + ename + " empid: " + empid ;
	}
}
