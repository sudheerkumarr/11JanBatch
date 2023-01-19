package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(23);
		intList.add(34);
		intList.add(13);
		intList.add(87);
		intList.add(33);
		intList.add(27);
		intList.add(87);
		intList.add(17);

		System.out.println(intList); //[23, 34, 13, 87, 33, 27, 87, 17]
		
		// Collection(I)
		// Collections(C) - provides methods to work on Collection object
		
		// Arrays(C)
		// Sort collection in asc order
		Collections.sort(intList); // asc
		System.out.println(intList); //[13, 17, 23, 27, 33, 34, 87, 87]
		
		// sort in desc order - reverse()
		Collections.reverse(intList);
		System.out.println(intList); // [87, 87, 34, 33, 27, 23, 17, 13]
		
		List<String> strList= Arrays.asList("aa", "bb", "dd", "rr", "cc", "ee");
		
		// Sort in asc order
		Collections.sort(strList); //
		System.out.println(strList);//[aa, bb, cc, dd, ee, rr]
		
		// Sort in desc order
		Collections.reverse(strList);
		System.out.println(strList); // [rr, ee, dd, cc, bb, aa]
		
		
		System.out.println(Collections.max(intList));//87
		System.out.println(Collections.min(intList));//13
		
		// Comparable & Comparator
		// asc, empId
		Employee emp1 = new Employee(1002, "Ram");
		Employee emp2 = new Employee(1004, "Sam");
		Employee emp3 = new Employee(1001, "Ravi");
		Employee emp4 = new Employee(1001, "Ravi");
		Employee emp5 = new Employee(1003, "Don");
		
		//List<Employee> empList= new ArrayList<>();
		//empList.add(emp1);
		//empList.add(emp2);
		//empList.add(emp3);
		//empList.add(emp4);
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
		
		
		// Sort by empId in asc order
		Collections.sort(empList);
		
		//System.out.println(empList); //[Employee [empId=1001, empName=Ravi], Employee [empId=1001, empName=Ravi], Employee [empId=1002, empName=Ram], Employee [empId=1003, empName=Don], Employee [empId=1004, empName=Sam]]
		// System.out.println(empList); // [Employee [empId=1003, empName=Don], Employee [empId=1002, empName=Ram], Employee [empId=1001, empName=Ravi], Employee [empId=1001, empName=Ravi], Employee [empId=1004, empName=Sam]]
		System.out.println(empList); // [Employee [empId=1004, empName=Sam], Employee [empId=1001, empName=Ravi], Employee [empId=1001, empName=Ravi], Employee [empId=1002, empName=Ram], Employee [empId=1003, empName=Don]]

	}

}
