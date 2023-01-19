package day7;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		// sort by age in desc order
		return std1.getAge()>std2.getAge()?-1:std1.getAge()<std2.getAge()?1:0;
	}

}
