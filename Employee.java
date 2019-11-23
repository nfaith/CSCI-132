package outlab4;
/*
 * This is a class to create an average employee with a name, and ID number.
 */
public class Employee {
	String first;
	String last;
	int id;
	
	public Employee(String firstIn, String lastIn, int idIn) {
		first = firstIn;
		last = lastIn;
		id = idIn;
	}
	
	public void setFirst(String firstName) {
		first = firstName;
	}
	
	public void setLast(String lastName) {
		last = lastName;
	}
	
	public void setId(int idIn) {
		id = idIn;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		String words = first + " " + last + " Id #: "+ id;
		return words;
	}
}
