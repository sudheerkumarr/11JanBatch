package day7;
/*
 * 1.0v
 * methods are synchronized
 * thread safety.
 * 
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		StringBuffer sb3 = new StringBuffer("World");
		StringBuffer sb4 = sb1;
		StringBuffer sb5 = new StringBuffer();
		
				
		System.out.println(sb1==sb2); // ref comparison - false
		System.out.println(sb1.equals(sb2)); // ref comparison - false
		                                     // Object class equals() method will be called
		
		// mutable
		sb1.append(" World!");
		System.out.println(sb1); // Hello World!
		
		// default capacity - 16
		// incremental capacity - (oldcapacity*2)+2 - 32+2 = 34
		System.out.println(sb1.capacity()); //21
		System.out.println(sb5.capacity()); // 16
		
		
		System.out.println(sb1.capacity()); // 21
		sb1.append("abcdefkjjsdf");
		System.out.println(sb1.capacity()); // 44 (21*2+2)
		
		// reverse stringbuffer
		System.out.println(sb1);
		System.out.println();
		System.out.println(sb1.reverse());
		
		System.out.println();
		
		// convert String to StringBuffer
		String str = "Hello World";
		StringBuffer sb6 = new StringBuffer(str);
		System.out.println(sb6.reverse()); //dlroW olleH
		
		// convert StringBuffer to String
		String str2 = new String(sb6);
		System.out.println(str2); // dlroW olleH

	}

}
