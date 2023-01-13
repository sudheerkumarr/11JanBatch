package day5;
/*
 * class - class - extends
 * interface - interface - extends
 * class - interface1, interface2  - implements
 * interface - class - invalid condition
 * 
 */
public class AbstractDemo {

	public static void main(String[] args) {
		
		//A a = new A();
		
		B b = new B(); // tight coupling
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		
		System.out.println();
		//Intf1 intf = new C();
		Intf1 intf = new D(); // loose coupling
		intf.m6();
		intf.m7();
		intf.m8();
		
		System.out.println(intf.m);
		System.out.println(Intf1.m);
		//Intf1.m= 10000;
		
		// intf.m10();
		
		// tight coupling example
		// D d = new D();
		C d = new C();
		d.m6();
		d.m7();
		d.m8();
		d.m9();
		
		
		
		
	}

}
