package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Student std1 = new Student(2001, "Ram", 12);
		Student std2 = new Student(2004, "Sam", 14);
		Student std3 = new Student(2002, "Jhon", 13);
		Student std4 = new Student(2003, "Abraham", 11);
		
		List<Student> stdList = new ArrayList<>();
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		stdList.add(std4);
		
		
		System.out.println(stdList); //[Student [rollNo=2001, name=Ram, age=12], Student [rollNo=2004, name=Sam, age=14], Student [rollNo=2002, name=Jhon, age=13], Student [rollNo=2003, name=Abraham, age=11]]
		
		// Sort By RollNo
		Comparator sortByRollNo = new SortByRollNo();
		
		Collections.sort(stdList, sortByRollNo);
		
		System.out.println(stdList); // [Student [rollNo=2001, name=Ram, age=12], Student [rollNo=2002, name=Jhon, age=13], Student [rollNo=2003, name=Abraham, age=11], Student [rollNo=2004, name=Sam, age=14]]

		
		// Sort By age in descending order
		Comparator sortByAge = new SortByAge();
		Collections.sort(stdList, sortByAge);
		System.out.println(stdList);
		
		// Sort By name in asc order
		Comparator sortByName = new SortByName();
		Collections.sort(stdList, sortByName);
		System.out.println(stdList);
		
		
	}

}
