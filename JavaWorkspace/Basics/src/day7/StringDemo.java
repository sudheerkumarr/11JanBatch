package day7;

public class StringDemo {
	public static void main(String[] args) {
		// Ways to create String objects.
		
		//1. Using string literal - SCP (String Constant Pool)
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = str1;

		str1.concat(" World!");
		System.out.println(str1); // Hello
		// str1 - Hello
		// str2 - Hello
		System.out.println(str1 == str2); // ref - true
		System.out.println(str1.equals(str2)); // content com - true

		str1 = str1.concat(" World!");
		System.out.println(str1); // Hello World!

		// str1 - Hello World!
		// str2 - Hello
		System.out.println(str1 == str2); // ref - false
		System.out.println(str1.equals(str2)); // content com - false

		// 2. Using new keyword - Heap memory
		String str5 = new String("Hello");
		String str6 = new String("Hello");
		String str7 = str5;

		// == - ref comparision& equals() - content comparision
		System.out.println(str5 == str6); // ref comparision - false
		System.out.println(str5.equals(str6)); // content com - true

		System.out.println(str5 == str7); // true

	}
}
