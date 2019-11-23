package outlab4;
/*
 * This is a class that inherits from Employee however it adds a wage and numHours the employee works. 
 */
public class Hourly extends Employee{
	
	double wage;
	int numHours;
	
	public Hourly(String firstIn, String lastIn, int idIn, double wageIn, int numHoursIn) {
		super(firstIn, lastIn, idIn);
		wage = wageIn;
		numHours = numHoursIn;
	}
	
	public void setWage(double wageIn) {
		wage = wageIn;
	}
	
	public void setNumHours(int numHoursIn) {
		numHours = numHoursIn;
	}
	
	public double getWage() {
		return wage;
	}
	
	public int getNumHours() {
		return numHours;
	}
	
	public String toString() {
		String words = first + " " + last + " Id #: "+ id + " ,Wage: " + wage+ " ,Number of hours worked: " + numHours;
		return words;
	}

}
