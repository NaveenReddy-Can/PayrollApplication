package part_1;

public abstract class Employee {
   
	//Variables to store the data in this class
	protected String firstName;
	protected String lastName;
	protected String sin;
	protected Employee managedBy;
	protected static int numEmployee;

	// three parameter constructor
	public Employee(String first, String last, String sin) {
		this.firstName = first;
		this.lastName = last;
		this.sin = sin;
	}

	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first) {
		this.firstName = first;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		this.lastName = last;
	}

	public String getSin() {
		return sin;
	}

	public void setSin(String sin) {
		this.sin = sin;
	}

	public Employee getManager() {
		return managedBy;
	}

	public void setManager(Employee mgr) {
		this.managedBy = mgr;
	}
	
// equals method to check emp is equal to another
	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return employee.sin == this.sin;
	}
// method to return number of employees
	public static int count() {
		return numEmployee;
	}

	// abstract earning method to call in other class which extends thi class by inheritence
	public abstract double earnings();

	// To string method to print the data
	@Override
	public String toString() {
		return "Name: " + getLastName() + ", " + getFirstName() + "\n" + "SIN: " + getSin();
	}
	
}
