package day4;

/*
 * Types -
 *   CompileTime Polymorphism
 *     1.Operator Overloading
 *      + 
 *      10+20 = 30
 *      "Hello" + "World" = HelloWorld
 *     2. Constructor Overloading
 *     3. Method Overloading
 *       int add(int num1, int num2) {}
 *       int add(float num1, int num2) {}
 *       int add(int num1, int num2, int num3) {}
 *       int add(int num1, int num2, int num3, int num4) {}
 *     
 *   Runtime Polymorphism
 */
public class PolymorphismDemo {
	
	// non static variable
	int x=10;
	int y=100;
	
	// static variable
	static int z=1000;
	

	public static void main(String[] args) {
		
		//System.out.println(x);
		PolymorphismDemo pd1 = new PolymorphismDemo();
		
		// from static area, we can't access non static members directly
		System.out.println(z);
		System.out.println(add(23.01, 34.00));
		System.out.println(pd1.x);
		System.out.println(PolymorphismDemo.z);
		System.out.println(PolymorphismDemo.add(34.00, 15.00));
		
		
		System.out.println();
		// from static area,  accessing non-static members
	
		System.out.println(pd1.add(10, 20));
		System.out.println(pd1.add(10.00f, 20));
		System.out.println(pd1.add(10, 20, 30));
		System.out.println(pd1.add(10, 20, 30, 40));
		System.out.println(pd1.x);
		System.out.println(pd1.y);
		
		System.out.println();
		pd1.m1();

	}
	
	// Method overloading
	// non static methods
	int add(int num1, int num2) {return num1+num2;}
	float add(float num1, int num2) {return num1+num2;}
	int add(int num1, int num2, int num3) {return num1+num2+num3;}
	int add(int num1, int num2, int num3, int num4) {return num1+num2+num3+num4;}
	
	// static method
	static double add(double d1, double d2) {return d1+d2;};
	
	// access both static and non-static members from non-static area
	void m1() {
		// access non-static members 
		System.out.println(add(10, 20));
		System.out.println(add(10.00f, 20));
		System.out.println(add(10, 20, 30));
		System.out.println(add(10, 20, 30, 40));
		System.out.println(x);
		System.out.println(y);
		
		// access static members
		System.out.println(z);
		System.out.println(add(10.23, 20.34));
		
	}

}
