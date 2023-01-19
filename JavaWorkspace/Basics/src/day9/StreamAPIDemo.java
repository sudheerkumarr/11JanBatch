package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Stream API is used to process collection objects
 */
public class StreamAPIDemo {

	public static void main(String[] args) {
//		List<Integer> intArrList = new ArrayList<>();
//		intArr.add(10);
		
		List<Integer> intArr= Arrays.asList(10, 15, 20, 25, 30, 35, 40, 50, 60, 20, 35, 45, 60);
		StreamAPIDemo sd = new StreamAPIDemo();
		System.out.println(sd.square(intArr)); // [100, 400, 900, 1600, 2500]
		
		// Stream API
		// map() - to apply same function on each and every element present in Collection.
		List<Integer> intArr2 = intArr.stream().map(el->el*el).collect(Collectors.toList());
		System.out.println(intArr2); //[100, 400, 900, 1600, 2500]
		
		
		// cube
		
		List<String> strArr = Arrays.asList("aa", "bb", "cc", "dd", "bb");
		List<String> strArr2 = strArr.stream().map(el->el.toUpperCase()).collect(Collectors.toList());
		System.out.println(strArr2); //[AA, BB, CC, DD, BB]
		
		Set<String> strArr3 = strArr.stream().map(el->el.toUpperCase()).collect(Collectors.toSet());
		System.out.println(strArr3); // [AA, BB, CC, DD]
		
		
		// filter() - search
		// return values which are greater than 30
		List<Integer> intArr3= intArr.stream().filter(el->el>30).collect(Collectors.toList());
		System.out.println(intArr3);// [40, 50]
		
		// filter based on name that starts with 'R'
		List<String> nameArr = Arrays.asList("Ram", "Sam", "Sunil", "Suresh", "Raina");
		List<String> nameArr1 = nameArr.stream().filter(str->str.startsWith("R")).collect(Collectors.toList());
		System.out.println(nameArr1); // [Ram, Raina]
		
		// return even values from intArr
		// List<Integer> intArr= Arrays.asList(10, 15, 20, 25, 30, 35, 40, 50, 60);
		List<Integer> intArr4 = intArr.stream().filter(el->el%2==0).collect(Collectors.toList());
		System.out.println(intArr4); //[10, 20, 30, 40, 50, 60]
		
		// find number of elements in collection object
		long cnt= intArr.stream().count();
		System.out.println(cnt); //9
		
		// find distinct elements
		List<Integer> distinctElements = intArr.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements); // [10, 15, 20, 25, 30, 35, 40, 50, 60, 45]
		
		Set<Integer> set = intArr.stream().map(el->el).collect(Collectors.toSet());
		System.out.println(set); // [50, 35, 20, 40, 25, 10, 60, 45, 30, 15]
		
		// reduce()
		// sum up all the numbers present in collection obj
		Integer total = intArr.stream().reduce(0, (sum, el ) -> sum+el);
		System.out.println(total); // 445
		
		// min  - find min value
		Integer minVal = intArr.stream().min((el1, el2) -> el1>el2?1:-1).get();
		System.out.println(minVal); // 10
		
		// max - find max value
		Integer maxVal = intArr.stream().max((el1, el2) -> el1>el2?1:-1).get();
		System.out.println(maxVal);// 60
		
		// sort  - in asc order
		System.out.println();
		System.out.println("Ascending Order: ");
		List<Integer> sortedList = intArr.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList); //[10, 15, 20, 20, 25, 30, 35, 35, 40, 45, 50, 60, 60]
		
		// sort - in desc order
		System.out.println();
		System.out.println("Descending Order: ");
		List<Integer> intArrDesc= intArr.stream().sorted((x,y) -> x>y?-1:1).collect(Collectors.toList());
		System.out.println(intArrDesc);
		
		
		// sort - Comparable interface
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee(1002, "Sam");
		Employee emp2 = new Employee(1001, "Ram");
		Employee emp3 = new Employee(1003, "Kavitha");
		Employee emp4 = new Employee(1004, "Jhon");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		System.out.println(empList); //[Employee [empId=1002, empName=Sam], Employee [empId=1001, empName=Ram], Employee [empId=1003, empName=Kavitha], Employee [empId=1004, empName=Jhon]]
		List<Employee> sortedEmps = empList.stream().sorted().collect(Collectors.toList());
		
		System.out.println();
		System.out.println("After sorting using Comparable interface");
		System.out.println(sortedEmps);
		
		// sort - Comparator interface
		List<Student> stdList = new ArrayList<>();
		Student std1 = new Student(1002, "Sam", 15);
		Student std2 = new Student(1001, "Ram", 14);
		Student std3 = new Student(1003, "Kavitha", 16);
		Student std4 = new Student(1004, "Jhon", 14);
		
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		stdList.add(std4);
		
		System.out.println();
		System.out.println("====================");
		// sorting based on rollNo in asc order
		List<Student> sortedList1 = stdList.stream().sorted((s1, s2)->s1.getRollNo()>s2.getRollNo()?1:-1).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		
		// sorting based on name in asc order
		System.out.println();
		System.out.println("====================");
		System.out.println("Sort by name in asc order: ");
		List<Student> sortedList2 = stdList.stream().sorted((s1, s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
		System.out.println(sortedList2);
		
		
		
		// find sum of all odd values defined in intArr
		// hint: use filter() & reduce() or filter() & sum()
		// stream obj to IntStream obj- mapToInt()
		int oddSum = intArr.stream().mapToInt(el->el).filter(el->el%2!=0).sum();
		System.out.println(oddSum); // 155
		 
		// avg - find average
		intArr.stream().mapToInt(el->el).average().getAsDouble();
		
		// anyMatch, allMatch, noneMatch
		List<Integer> intArr6 = Arrays.asList(10, 20, 30, 40);
		boolean match = intArr6.stream().noneMatch(el-> el==50);
		System.out.println(match);  // true
		
		boolean match1 = intArr6.stream().anyMatch(el-> el==20);
		System.out.println(match1); // true
		
		boolean match2 = intArr6.stream().allMatch(el-> el==20);
		System.out.println(match2); //false
		
		System.out.println();
		// forEach()
		// print all elements present in arrayList
		intArr6.stream().forEach(el->System.out.print(el+" "));
		
		
	}
	
	// Method to square values present in arrayList
	List<Integer> square(List<Integer> intArrList) {
		/* step 1: read one element at a time from the list - for/iterator
		 * step 2: square value - 100
		 * step 3: create and add result to  newArrayList.
		 * step 4:  print values 
		 */
		List<Integer> newArrList = new ArrayList<>();
		for(Integer el :intArrList) {
			
			// square & add result to new array list
			newArrList.add(el * el);

		}
		
		return newArrList;
	}
	
	
//	int sq(int x) {
//		return x*x;
//	}
//	
//	x -> x*x;
//boolean isEven(int x) {
//	if( x%2==0) {
//		return true;
//	}
// }	
// 
	
	
	
	
	
	
	
	

}
