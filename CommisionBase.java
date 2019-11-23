package outlab4;

/*
 * This is a class that inherits from Commission however it adds a base salary. 
 */
public class CommisionBase extends Commission {

	double baseSalary;
	public CommisionBase(String firstIn, String lastIn, int idIn, double rateIn, double grossSalesIn, double baseSalaryIn) {
		super(firstIn, lastIn, idIn, rateIn, grossSalesIn);
		baseSalary = baseSalaryIn;
	}
	
	public void setBaseSalary(double baseSalaryIn) {
		baseSalary = baseSalaryIn;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public String toString() {
		String words = first + " " + last + " Id #: "+ id + ", Rate of Commission: "+ rate + ", Base Salary: " + baseSalary + " , Gross sales: "+ grossSales;
		return words;
	}

}
