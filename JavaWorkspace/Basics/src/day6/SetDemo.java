package day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set(I)
 *         - duplicates are not allowed
 *         - insertion order not maintained
 *         - methods are not synchronized
 *         - null values allowed 
 *         - Underlying data structure HashTable
 *         
 *      HashSet(C)
 *      LinkedHashSet(C)
 *      SortedSet(I)
 *         NavigableSet(I)
 *      	   TreeSet(C)
 */
public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(30);
		hs.add(40);
		hs.add(null);
		
//		for(int i=0;i<hs.size(); i++) {
//			System.out.println(hs.get);
//		}
		for(Integer el :hs) {
			System.out.println(el);
		}

		System.out.println();
		System.out.println(hs.contains(40)); //true
		System.out.println(hs.isEmpty()); // false
		System.out.println("before remove element: "+hs);
		System.out.println(hs.remove(30));
		System.out.println("after remove element: " + hs);
		
		Set<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(200);
		hs2.add(300);
		hs2.add(400);
		
		hs.addAll(hs2);
		System.out.println("after add hashset: "+ hs);
		hs.removeAll(hs2);
		System.out.println("after remove hashset: "+ hs);
		
		
		System.out.println();
		// LinkedHashSet
		Set<Integer> lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(30);
		lhs.add(40);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		
		// TreeSet
		Set<Integer> ts = new TreeSet<>();
		ts.add(15);
		ts.add(10);
		ts.add(35);
		ts.add(20);
		ts.add(35);
		ts.add(5);
//		ts.add(null); // null values not allowed
//		ts.add(null); // invalid
		
		
		System.out.println(ts);
		
		Employee emp1 = new Employee(1001, "Ram"); // heap memory - address will be different
		Employee emp2 = new Employee(1002, "Sam"); // 
		Employee emp3 = new Employee(1001, "Ram"); // 
		Employee emp4 = emp1;
		
		System.out.println(emp1); //1001, "Ram"
		                          // pkg.ClassName@Hashcode
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		
		System.out.println(empSet); // - 3 obj
		
		// Without overriding hashcode() and equals() method
		System.out.println();
//		System.out.println(emp1.hashCode()); // 366712642
//		System.out.println(emp2.hashCode()); // 1829164700
//		System.out.println(emp3.hashCode()); // 2018699554
//		System.out.println(emp4.hashCode()); // 366712642
//		[Employee [empId=1001, empName=Ram], Employee [empId=1001, empName=Ram], Employee [empId=1002, empName=Sam]]
				
		System.out.println(emp1.hashCode()); // 113910
		System.out.println(emp2.hashCode()); // 114902
		System.out.println(emp3.hashCode()); // 113910
		System.out.println(emp4.hashCode()); // 113910
		
		System.out.println(empSet); // 2 objects
// [Employee [empId=1001, empName=Ram], Employee [empId=1002, empName=Sam]]
		
		
		
	}

}
