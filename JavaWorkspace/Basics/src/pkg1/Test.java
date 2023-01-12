package pkg1;

import day3.Employee;

public class Test extends Employee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		System.out.println(emp1.empId);  //0
		System.out.println(emp1.empName); // null
		//System.out.println(emp1.salary);
		//System.out.println(emp1.department);
	}

}
