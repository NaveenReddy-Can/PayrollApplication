package part_1;

public class SalariedEmployee extends Employee {
 // required variables to store the data for this class
	private double weeklySalary;
	protected static int numEmployee;

	// four parameterd constructor with count for num of employees
	public SalariedEmployee(String first, String last, String sin, double weeklySalary) {
		super(first, last, sin);
		this.weeklySalary = weeklySalary;
		numEmployee++;
	}
	// getters and setters

	public double getSalary() {
		return weeklySalary;
	}

	public void setSalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	// Earnings method to return the weeklysalary
	@Override
	public double earnings() {
		return weeklySalary;
	}

	// to string method to print all the data
	@Override
	public String toString() {
		return "Type: Salaried\n" + "Name: " + this.getLastName() + ", " + this.getFirstName() + "\n" + "SIN: "
				+ getSin() + "\nWeekly Salary: $" + this.getSalary();
	}
	
}
