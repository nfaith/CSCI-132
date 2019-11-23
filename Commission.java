package outlab4;

/*
 * This is a class that inherits from Employee however it adds a rate and gross sales the employee makes. 
 */
public class Commission extends Employee {
	
	double rate;
	double grossSales;
	
	public Commission(String firstIn, String lastIn, int idIn, double rateIn,double grossSalesIn) {
		super(firstIn, lastIn, idIn);
		rate = rateIn;
		grossSales = grossSalesIn;
	}
	
	public void setRate(double rateIn) {
		rate = rateIn;
	}
	
	public void setGrossSales(double grossSalesIn) {
		grossSales = grossSalesIn;
	}
	
	public double getRate() {
		return rate;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public String toString() {
		String words = first + " " + last + " Id #: "+ id + ", Rate of Commission: "+ rate + " , Gross sales: "+ grossSales;
		return words;
	}

}
