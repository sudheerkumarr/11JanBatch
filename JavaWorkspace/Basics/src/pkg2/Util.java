package day13;

/*
 * :: - double colon operator/method reference operator
 *   calling method with the help of its class.
 *   
 *   - static method reference
 *   syntax: static method
 *   <ClassName>::<methodName>
 *   
 *   ex:
 *   System.out.println()
 *   System.out::println
 *   
 *   Syntax: non static method
 *   <instanceName>::<methodName>
 *   
 *   - Constructor reference
 *   Syntax:
 *   <ClassName>::new
 *   
 * 
 *   
 * Predefined functional interfaces
 *  
 * 1. Predicate(I)
 *    syntax:
 *    boolean test(T t)
 *    
 * 2. Supplier(I) - wont take any input but it will return ouput.
 *	  syntax:
 * 	  T get()
 *	
 * 3. Consumer(I)
 * 	  syntax:
 *    void accept(T t)
 *  
 * 4. Function(I)
 *	  syntax:
 * 	  R apply(T t)
 * 
 * 
 */
@FunctionalInterface
interface Intf {
	boolean search(int[] arr, int n);
}

public class Util {
	
	// Verify given number is present in array
		boolean contains(int[] arr, int n) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == n) {
					flag = true;
					break;
				}
			}
			return flag;
		}

		// Function(I)
		// Find square method
		int sq(int x) {
			return x * x;
		}

		// Supplier(I)
		// Generate random number method
		double getRandom() {
			return Math.random();
	    }
		
		// Consumer(I)
		// Greet method
		void greet(String name) {
			System.out.println(name);
		}
		
		// Predicate(I)
		// Is Prime method
		static boolean isPrimeNumber(int num) {
			boolean flag = true;

			if (num == 0 || num == 1) {
				System.out.println(num + " is not prime number.");
			} else {
				// check number is divisible by other numbers
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						flag = false;
					}
				}
			}

			if (flag)
				return true;
			else
				return false;
		}

}
