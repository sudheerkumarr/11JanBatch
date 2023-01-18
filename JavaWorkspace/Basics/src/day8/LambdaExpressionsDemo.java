package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import day7.Employee;
import day7.Student;

/*
 * Functional Interface
 *  - we can add only one abstract method inside functional interface
 *  - functional interface can have static and default methods.
 */
@FunctionalInterface
interface Intf1 {
	boolean isEven(int x);
}

@FunctionalInterface
interface Intf2 {
	void greet();
}

@FunctionalInterface
interface Intf3 {
	int square(int x);
}

//int add(int x, int y) {
//	return x+y;
//}

@FunctionalInterface
interface Intf4 {
	int add(int x, int y);
}

//double getRandom() {
//	return Math.random();
//}
@FunctionalInterface
interface Intf5 {
	int getRandom();
}

public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		// lambda expression
		Intf1 intf1 = x -> {

			if (x % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println(intf1.isEven(10)); // true
		System.out.println(intf1.isEven(5)); // false

		Intf2 intf2 = () -> System.out.println("Hello World!");
		intf2.greet(); // Hello World!

		Intf3 intf3 = x -> x * x;
		System.out.println(intf3.square(10));// 100

		Intf4 intf4 = (x, y) -> x + y;
		System.out.println(intf4.add(10, 20)); // 30

		Intf5 intf5 = () -> (int) (Math.random() * 10000000); // double
		System.out.println(intf5.getRandom()); // 0.36743626776885174

		// ########################################
		float f = 10.50f;
		System.out.println(f); // 10.50
		double d = f; // convert float to double
		System.out.println(d); // 10.50
		int x1 = (int) f; // convert float to int
		System.out.println(x1); // 10

		List<Object> objList = new ArrayList<>();
		objList.add("Hello");
		objList.add(new Employee(1001, "Ram"));
		objList.add(new Student(2001, "Sam", 15));

		System.out.println();
		Iterator itr = objList.iterator();
		System.out.println("############################");
		while (itr.hasNext()) {
			Object obj = itr.next();
			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.length());
			} else if (obj instanceof Employee) {
				Employee emp = (Employee) obj;
				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpName());
			} else {
				Student std = (Student) obj;
				System.out.println(std.getRollNo());
				System.out.println(std.getName());
				System.out.println(std.getAge());
			}
		}

		System.out.println("############################");
		System.out.println();
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee());

		// #####################################################

		// Predefined Functional interfaces in java
		// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

		// 1. Predicate
		// boolean test(T t)

		// Ex
		Predicate<Integer> ageGreaterThan = age -> (age > 18);
		System.out.println(ageGreaterThan.test(10)); // false
		System.out.println(ageGreaterThan.test(20)); // true

		// 2. Supplier - wont take any input but it will return ouput.
		// syntax:
		// T get()

		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get()); // 0.7680451704158036

		// 3. Consumer

		// syntax:
		// void accept(T t)

		Consumer<String> display = name -> System.out.println("Hello " + name);
		display.accept("Raj");

		// 4. Function
		// syntax:
		// R apply(T t)
		
			  Function<Integer, Integer> cube = a -> a * a * a;
			  System.out.println(cube.apply(10)); // 1000

	}

//	boolean isEven(int x) {
//		
//		if(x%2==0) {
//			return true;
//		} else {
//			return false;
//		}
//	}

//	void greet() {
//		System.out.println("Hello World!");
//	}

//	int square(int x) {
//		return x*x;
//	}
//	
//	int add(int x, int y) {
//		return x+y;
//	}

	// Generate random number - java.util.Math - random()
	// - java.util.Random - nextInt()

//	double getRandom() {
//		return Math.random();
//	}
//	getRandom();
}
