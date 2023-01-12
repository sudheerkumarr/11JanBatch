package day3;

public class Employee {
	
	public int empId; //
	public String empName;
	double salary;
	private String department;
	
	// Constructor
	// Default constructor
	Employee() {}
	// Parameterized constructor
	Employee(int id){
		this.empId = id; 
	}
	Employee(int id, String name) {
		this.empId=id;
		this.empName=name;
	}
	public Employee(int empId, String empName, double salary, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	
	
	
	
	// 
	//Employee(){}

}
