package day9;

// POJO/Bean - plain Old Java Object
public class Employee implements Comparable<Employee> {

	// Fields
	private long empId;  // 0
	private String empName; // null
	
	// Constructor
	public Employee() {
		super();
	}

	public Employee(long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	// Getters && Setters
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		
		// desc - 1st value > 2nd value - -ve
		//      - 1st value < 2nd value - +ve
		return this.empId>emp.empId?-1:1;
	}

	
		
}
