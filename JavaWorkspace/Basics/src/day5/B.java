package day5;

public class B extends A{
	
	int z = 1000;

	void m1() {
		System.out.println("Class B - m1 method");
	}
	
	@Override
	void m4() {
		System.out.println("Class B - m4 implementation");
	}
	void m5() {
		System.out.println("Class B - m5 method");
	}

}
