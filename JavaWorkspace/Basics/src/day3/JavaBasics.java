package day3;

/*
 * Access modifiers
 *  1. public - can be accessed from anywhere
 *  2. private - within the class
 *  3. default - within the class and in the same package
 *  4. protected - within same pkg and child classes present in different pkgs
 *  
 *  Data types:
 *  Primitive data type
 *  byte - 0
 *  short - 0
 *  int - 0
 *  long - 0
 *  float - 0.0f
 *  double - 0.0
 *  char - /u000
 *  boolean - false
 *  
 *  Non-primitive data types
 *  String - Null
 *  Array - Null
 *  
 *  
 *  
 *  
 *  
 *  
 */
public class JavaBasics {
	// variables
	// constructors
	// getter/setter methods
	// blocks

	public static void main(String[] args) {
		
		// create emp objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		// default
		System.out.println(emp1.salary); //0.0
		// public
		System.out.println(emp1.empName); // null
		// private can't be accessed outside class
		// System.out.println(emp2.department);
		
		

	}

}
