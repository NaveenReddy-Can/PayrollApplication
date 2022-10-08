package part_1;

public class CommissionEmployee extends Employee {
    // variables required for CommisionEmployee to store data
	private double commisionRate;
	private double grossSales;
	protected static int numEmployee;

	
	// parameterised constructor
	public CommissionEmployee(String first, String last, String sin, double rate, double sales) {
		super(first, last, sin);
		this.commisionRate = rate;
		this.grossSales = sales;
		numEmployee++;
	}
   //Copy constructor and with increment to count the employees
	public CommissionEmployee(CommissionEmployee commissionEmployee) {
		super(commissionEmployee.firstName, commissionEmployee.lastName, commissionEmployee.sin);
		this.commisionRate = commissionEmployee.getCommisionRate();
		this.grossSales = commissionEmployee.getGrossSales();
		numEmployee++;
	}

	
	// setters and getters
	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double rate) {
		this.commisionRate = rate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double sales) {
		this.grossSales = sales;
	}

	// method to calculate earnings of a commisionEmployee
	@Override
	public double earnings() {
		return this.getCommisionRate() * this.getGrossSales();
	}

	// method to print all the data
	@Override
	public String toString() {
		return "Type: Commission\n" + "Name: " + this.getLastName() + ", " + this.getFirstName() + "\n" + "SIN: "
				+ getSin() + "\nGross Sales: $" + this.getGrossSales() + "\nCommission Rate: "
				+ this.getCommisionRate();
	}

}
