package entities;

public class Employee {

	public double gross;
	public String name;
	public double tax;
	public double increasetax;

	public double netsalary() {
		return gross - tax;
	}

	public double incresesalary() {
		return netsalary()+(gross/100*increasetax);	
	}
	
	
}
