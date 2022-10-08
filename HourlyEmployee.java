package part_1;

public class HourlyEmployee extends Employee {
    // variables to store all the required data 
	private double hours;
	private double hourlyRate;
	protected static int numEmployee;

	// five variable constructor with numberof employees count
	public HourlyEmployee(String first, String last, String sin, double hours, double rate) {
		super(first, last, sin);
		this.hourlyRate = rate;
		this.hours = hours;
		numEmployee++;
	}
	// getters and setters

	public double getHours() {
		return hours;
	}

	public void setHours(double h) {
		this.hours = h;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	// earning method to calculate earning of an employee
	@Override
	public double earnings() {
		return hours <= 40 ? hours * hourlyRate : (40 * hourlyRate + (1.5 * (hours - 40) * hourlyRate));
	}

	// to string method to print all the data
	@Override
	public String toString() {
		return "Type: Hourly\n" + "Name: " + this.getLastName() + ", " + this.getFirstName() + "\n" + "SIN: " + getSin()
				+ "\nHourly Rate: $" + this.getHourlyRate() + "\nHours Worked: " + this.getHours();
	}

}
