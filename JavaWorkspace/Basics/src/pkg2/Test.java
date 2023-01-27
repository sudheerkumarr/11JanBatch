package pkg2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Intf1 {
	void test();
}
interface Intf2 {
	void test(int id);
}
interface Intf3 {
	void test(String name);
}
interface Intf4 {
	void test(int id, String name);
}

public class Test {

	public static void main(String[] args) {
		Util util = new Util();
		util.getRandom();
		util.greet("Ram");
		util.sq(10);
		util.isPrimeNumber(188);
		
		// double colon operator - ::
		// access static methods
		// <ClassName>::<staticMethodName>
		Predicate<Integer> p = Util::isPrimeNumber;
		System.out.println(p.test(100)); // false
		
		// access non-static methods
		// <instanceName>::<nonStaticMethodName>
		Consumer<String> c= util::greet;
		c.accept("Sam"); // Sam
		
		Function<Integer, Integer> f= util::sq;
		System.out.println("10 square: "+ f.apply(10)); // 100
		
		// Supplier
		Supplier s= util::getRandom;
		System.out.println(s.get());
		
		// Array initialization
		// Case 1
		int[] intArr = {10, 20, 30, 40};
		
		// Case 2
		int[] intArr1 = new int[5];
		intArr1[0] = 10;
		intArr1[1] = 20;
		
		// case 3
		int[] intArr2 = new int[] {10, 20, 30, 40};
		
		
		// intf.search(new int[] {10, 20, 30, 40, 50}, 35);
		
		Intf intf = util::contains;
		System.out.println(intf.search(intArr2, 45)); // false
		
		
		
		// Constructor reference using double colon operator
		// <ClassName>::new
		
		// refer no-arg constructor
		Intf1 intf1 = Employee::new;
		intf1.test();
		
		Intf3 intf3 = Employee::new;
		intf3.test("Bob");
		
		Intf4 intf4 = Employee::new;
		intf4.test(1000, "Jhon");
		

	}

}
