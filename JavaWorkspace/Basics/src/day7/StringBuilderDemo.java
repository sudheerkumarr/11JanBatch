package day7;
/*
 * 1.5v
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = new StringBuilder("World");
		StringBuilder sb4 = sb1;
		StringBuilder sb5 = new StringBuilder();
		
				
		System.out.println(sb1==sb2); // ref comparison - false
		System.out.println(sb1.equals(sb2)); // ref comparison - false
		
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
		
		// reverse stringbuilder
		System.out.println(sb1);
		System.out.println();
		System.out.println(sb1.reverse());
		
		System.out.println();
		
		// convert String to StringBuilder
		String str = "Hello World";
		StringBuilder sb6 = new StringBuilder(str);
		System.out.println(sb6.reverse()); //dlroW olleH
		
		// convert StringBuffer to String
		String str2 = new String(sb6);
		System.out.println(str2); // dlroW olleH
		
		
		
	}

}
