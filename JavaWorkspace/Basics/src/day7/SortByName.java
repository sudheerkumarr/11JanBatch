package day7;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		
		//sort by name in asc order
		return std1.getName().compareTo(std2.getName());
	}

}
