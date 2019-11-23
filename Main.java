package outlab4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		int numEmployee = 0;
		boolean countinue = true;
		Scanner sc;
		HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();
		
		do{
			System.out.println("1. Add Employee");
			System.out.println("2. Edit Employee");
			System.out.println("3. View Sales");
			System.out.println("4. Exit");
			sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			if (input == 1){
				System.out.println("1. Employee");
				System.out.println("2. Hourly Employee");
				System.out.println("3. Commission Employee");
				System.out.println("4. Commission + Base Employee");
				
				sc = new Scanner(System.in);
				input = sc.nextInt();
				if (input == 1) {
		
					System.out.println("Input employee's first name: ");
					sc = new Scanner(System.in);
					String first = sc.next();
					
					System.out.println("Input employee's last name: ");
					sc = new Scanner(System.in);
					String last = sc.next();
					
					System.out.println("Input employee's ID number: ");
					sc = new Scanner(System.in);
					int id = sc.nextInt();
					
					Employee newEmployee = new Employee(first, last, id);
					employee.put(newEmployee.getId(), newEmployee);
					System.out.println(employee.get(newEmployee.getId()));
				
				}else if(input == 2) {
					
					System.out.println("Input employee's first name: ");
					sc = new Scanner(System.in);
					String first = sc.next();
					
					System.out.println("Input employee's last name: ");
					sc = new Scanner(System.in);
					String last = sc.next();
					
					System.out.println("Input employee's ID number: ");
					sc = new Scanner(System.in);
					int id = sc.nextInt();
					
					System.out.println("Input employee's wage: ");
					sc = new Scanner(System.in);
					double wage = sc.nextDouble();
					
					System.out.println("Input employee's number of hours worked: ");
					sc = new Scanner(System.in);
					int numHours = sc.nextInt();
					
					Hourly newEmployee = new Hourly(first, last, id, wage, numHours);
					employee.put(newEmployee.getId(), newEmployee);
					System.out.println(employee.get(newEmployee.getId()));
				
				}else if (input == 3) {
					
					System.out.println("Input employee's first name: ");
					sc = new Scanner(System.in);
					String first = sc.next();
					
					System.out.println("Input employee's last name: ");
					sc = new Scanner(System.in);
					String last = sc.next();
					
					System.out.println("Input employee's ID number: ");
					sc = new Scanner(System.in);
					int id = sc.nextInt();
					
					System.out.println("Input employee's rate: ");
					sc = new Scanner(System.in);
					double rate = sc.nextDouble();
					
					System.out.println("Input gross sales: ");
					sc = new Scanner(System.in);
					double grossSales = sc.nextDouble();
					
					Commission newEmployee = new Commission(first, last, id, rate, grossSales);
					employee.put(newEmployee.getId(), newEmployee);
					System.out.println(employee.get(newEmployee.getId()));
				
				}else if(input == 4){
					System.out.println("Input employee's first name: ");
					sc = new Scanner(System.in);
					String first = sc.next();
					
					System.out.println("Input employee's last name: ");
					sc = new Scanner(System.in);
					String last = sc.next();
					
					System.out.println("Input employee's ID number: ");
					sc = new Scanner(System.in);
					int id = sc.nextInt();
					
					System.out.println("Input employee's rate: ");
					sc = new Scanner(System.in);
					double rate = sc.nextDouble();
					
					System.out.println("Input gross sales: ");
					sc = new Scanner(System.in);
					double grossSales = sc.nextDouble();
					
					System.out.println("Input employee's base salary: ");
					sc = new Scanner(System.in);
					double baseSalary = sc.nextDouble();
					
					CommisionBase newEmployee = new CommisionBase(first, last, id, rate, grossSales, baseSalary);
					employee.put(newEmployee.getId(), newEmployee);
					System.out.println(employee.get(newEmployee.getId()));
				}
				
			}else if(input == 2) {

				System.out.println("Id of employee: ");
				sc = new Scanner(System.in);
				int toChange = sc.nextInt();
				
				System.out.println("What do you want to edit?");
				System.out.println("1. First Name");
				System.out.println("2. Last Name");
				System.out.println("3. Commission Rate");
				System.out.println("4. Gross Sales");
				System.out.println("5. Base Salary");
				System.out.println("6. Wage");
				System.out.println("7. Hours Worked");
				sc= new Scanner(System.in);
				int choice = sc.nextInt();
				if (choice == 1) {
					sc = new Scanner(System.in);
					System.out.println("New first name: ");
					String first = sc.next();
					employee.get(toChange).setFirst(first);
					employee.get(toChange);	
				}else if (choice == 2) {
					
					sc = new Scanner(System.in);
					System.out.println("New last name: ");
					String last = sc.next();
					employee.get(toChange).setLast(last);
					
				}else if (choice == 3) {
					
					sc = new Scanner(System.in);
					System.out.println("New commission rate: ");
					double rate = sc.nextDouble();
					((Commission) employee.get(toChange)).setRate(rate);
					
				} else if(choice == 4) {
					sc = new Scanner(System.in);
					System.out.println("New gross sales: ");
					double grossSales = sc.nextDouble();
					((Commission) employee.get(toChange)).setGrossSales(grossSales);
				}else if(choice == 5) {
					sc = new Scanner(System.in);
					System.out.println("New base salary: ");
					double baseSalary = sc.nextDouble();
					((CommisionBase) employee.get(toChange)).setBaseSalary(baseSalary);
				}else if(choice == 6) {
					System.out.println("New wage: ");
					sc = new Scanner(System.in);
					double wage = sc.nextDouble();
					((Hourly) employee.get(toChange)).setWage(wage);
				}else if(choice == 7) {
					System.out.println("Hours worked: ");
					sc = new Scanner(System.in);
					int numHours = sc.nextInt();
					((Hourly) employee.get(toChange)).setNumHours(numHours);
				}
	
			}else if (input == 3) {
				double totalSales = 0;
				for(Entry m: employee.entrySet()) {
					if (((Commission) m.getValue()).getGrossSales() > 0) {
						totalSales += ((Commission) m.getValue()).getGrossSales();
					}
				}
				System.out.println("Total Sales " + totalSales);
			}else if(input == 4) {
				countinue = false;
			}
		}while(countinue);
		
	}

}
