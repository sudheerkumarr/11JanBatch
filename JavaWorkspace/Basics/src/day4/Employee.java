package day4;

public class Employee extends Person {

	public int empId; //
	//public String empName;
	double salary;
	// int age;
	String department;

	// Constructors
	// Default constructor
	Employee() {
	}

	public Employee(int empId, String name, int age, double salary, String department) {
		super(name, age);
		this.empId=empId;
	}
	// Parameterized constructor
	Employee(int id) {
		this.empId = id;
	}

	
//	Employee(int id, String name) {
//		this.empId = id;
//		this.name = name;
//	}
	
//	Employee(String name, int id) {
//		this.empId=id;
//		this.name=name;
//	}
	
//	public Employee(int empId, String empName, double salary, String department) {
//		super();
//		this.empId = empId;
//		this.name = empName;
//		this.salary = salary;
//		this.department = department;
//	}

	
	// ctrl+/ - comment
	// ctrl+\ - uncomment
	// Call one constructor from another constructor
//	public Employee(int id, String name, double salary) {
//		//this.empId = empId;
//		//this.empName = empName;
//		this(id, name);
//		this.salary = salary;
//	}

	//
	// Employee(){}
	
	// Getters & Setters
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", department=" + department + "]";
	}

}
