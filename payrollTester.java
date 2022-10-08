package part_1;

/*
 * Naveen reddy
 * C0838989
 * Project-1
 * 23-4-2022
 */

// importing all the packges for the program
import java.util.ArrayList;



public class payrollTester {

	public static void main(String[] args) {
        // variable to store totalpay
		double totalPay = 0;
		// creating objects for all the classes
		SalariedEmployee salariedEmployee_1 = new SalariedEmployee("Joe", "Francis", "123456789", 2500);
		SalariedEmployee salariedEmployee_2 = new SalariedEmployee("Samantha", "Hughes", "444555666", 1400);
		HourlyEmployee hourlyEmployee_1 = new HourlyEmployee("Kim", "Adams", "888999000", 42, 18.50);
		CommissionEmployee commissionEmployee_1 = new CommissionEmployee("Ryan", "Goodall", "111222333", 0.10, 9000);

		// adding the values into arraylist 
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(salariedEmployee_1);
		employeeList.add(salariedEmployee_2);
		employeeList.add(hourlyEmployee_1);
		employeeList.add(commissionEmployee_1);
		int n = employeeList.size();
        
		// using for loop for printing all employees and printing earnings
		for (Employee employee : employeeList) {
			System.out.println(employee);
			totalPay = totalPay + employee.earnings();
			System.out.println("TOTAL: $"+employee.earnings());
			System.out.println("--------------------------------------------------");
		}
		
		//creating two variables for min and max salries of employees
		Employee minEmployee = employeeList.get(0);
		Employee maxEmployee = employeeList.get(0);
        
		// for loop for max employee
	    for (int i = 1; i < n; i++) {
	       if (employeeList.get(i).earnings() > maxEmployee.earnings()) {
	    	   maxEmployee = employeeList.get(i);
	        }
	    }
       
	    // for loop for min employee
	    for (int i = 1; i < n; i++) {
	       if (employeeList.get(i).earnings() < minEmployee.earnings()) {
	    	   minEmployee = employeeList.get(i);
	        }
	    }
	    
	    // printing all the summary
	    System.out.println("SUMMARY STATISTICS");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Highest Paid Employee: "+maxEmployee.getLastName()+", "+maxEmployee.getFirstName());
		System.out.println("Lowest Paid Employee: "+minEmployee.getFirstName()+", "+minEmployee.getLastName());
		System.out.println("Number of Salaried employees: "+SalariedEmployee.numEmployee);
		System.out.println("Number of Hourly employees: "+HourlyEmployee.numEmployee);
		System.out.println("Number of Commission employees: "+CommissionEmployee.numEmployee);
		System.out.println("Total for Pay Period: $"+totalPay);
		System.out.println("-----------------------------------------------------------------------------------------------------");

	}
}

/*
 ***************************************************************************************************************************************
 *************************************************************END-OF-THE-PROJECT-1********************************************************
 ***************************************************************************************************************************************
 */
