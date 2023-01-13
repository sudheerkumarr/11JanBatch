package day5;

public abstract class A {
	int x =10;
	int y = 100;
	
	// concrete method
	void m1() {
		System.out.println("Class A - m1 method");
	}
	void m2() {
		System.out.println("Class A - m2 method");
	}
	void m3() {
		System.out.println("Class A - m3 method");
	}
	
	// abstract method
	abstract void m4();

}
