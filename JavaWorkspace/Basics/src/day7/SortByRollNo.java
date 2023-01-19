package day7;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		// sort based on rollNo in asc order.
		// return std1.getRollNo()<std2.getRollNo()?-100: std1.getRollNo()>std2.getRollNo()?1:0;
		
		// sort based on rollNo in desc order.
		return std1.getRollNo()<std2.getRollNo()?100: std1.getRollNo()>std2.getRollNo()?-100:0;
				
	}

}
