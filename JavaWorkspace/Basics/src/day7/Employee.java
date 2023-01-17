package day7;

// POJO/Bean - plain Old Java Object
public class Employee implements Comparable<Employee>{

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
	public int compareTo(Employee o) {
		// sort based on empId in asc
		// -ve - 1st empId smaller than 2nd empId
		// +ve - 1st empId > 2nd empId
		// 0 - both empId's are same
		
		// Sort By empId
		//===============
		// Option 1- using if-else
//		if(this.empId<o.empId) {
//			return -1;
//		} else if(this.empId>o.empId) {
//			return 1;
//		} else {
//			return 0;
//		}
		
		
		// Option 2- using ternary operator
		// sort using empId - Asc order
		// return this.empId<o.empId?-1:this.empId>o.empId?1:0;
		
		// sort using empId -  Desc order
		//return this.empId<o.empId?1:this.empId>o.empId?-1:0;
		
		// Sort by empName - asc order
		// ==============
		// String comparison '==' & equals()
		// '==' -  ref comparison
		// equals() - content comparison
		
		
		// String.compareTo() - returns '-1'/'1'/'0' - 
		// String.equals()    - returns  true / false

		// sortByname - asc order
		// return this.empName.compareTo(o.empName);
		
		// sortByName - desc order
		return o.empName.compareTo(this.empName);	
	
	}
	
		
}
