package day6;
/*
 * Wrapper classes - convert primitive to object type
 *  primitive data type - 8 types
 *  int, long , short , byte, boolean, char, float double
 *  
 * int  - java.lang.Integer
 * long - java.lang.Long
 * double - java.lang.Double
 * short - java.lang.Short
 * byte - java.lang.Byte
 * boolean -java.lang.Boolean
 * char - java.lang.Character
 * float - java.lang.Float
 * 
 * convert primitive to Object
 *   - valueOf() - method 
 *   - Autoboxing - 1.5v
 *   
 * convert Object to primitive
 *   - xxxValue()
 *   - Autounboxing - 1.5v
 *   
 *  Convert Wrapper Obj to String
 *  - toString()
 *  
 *  Convert String to Wrapper Obj
 *   - valueOf()
 *  
 *  Primitive to String 
 *	 - valueOf()
 *	
 *	String to primitive data types
 *	 -  parseInt(), parseDouble()
 */

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//x1 primitive data type
		int x1 = 100;
				
		// convert primitive to object
		Integer i1 = Integer.valueOf(x1);
		System.out.println(i1.getClass().getName()); //java.lang.Integer
		
		double d1 = 100.01;
		Double dObj1 = Double.valueOf(d1);
		
		System.out.println(dObj1.getClass().getName());//java.lang.Double
		
		// Convert primitive to Object - Autoboxing
		Float fObj1 = 10.01f;
		System.out.println(fObj1.getClass().getName()); //java.lang.Float
		
		
		
		// Convert Wrapper Object to Primitive type
		// using xxxValue() method
		int x2 = i1.intValue();
		double d2 = dObj1.doubleValue();
		float f2 = fObj1.floatValue();
		
		// using AutoUnboxing
		double d3 = dObj1;
		float f3 = fObj1;
		int i3 = i1;
		
		
		// Convert Wrapper Object to String - toString()
		// Convert Integer wrapper obj to String
		String str1 = i1.toString();
		System.out.println(str1.getClass().getName()); //java.lang.String
		
		
		// Convert Double wrapper obj to String
		System.out.println(dObj1.getClass().getName()); //java.lang.Double
		String str2 = dObj1.toString();
		System.out.println(str2.getClass().getName()); //java.lang.String
		
		
		// Convert String to Wrapper Obj - use valueOf() method
		Integer i4 = Integer.valueOf(str1);
		Double d4 = Double.valueOf(str2);
		
		System.out.println(i4.getClass().getName()); //java.lang.Integer
		System.out.println(d4.getClass().getName()); //java.lang.Double
		
		// Primitive to String - valueOf()
		String str3 = String.valueOf(x1);
		String str4 = String.valueOf(10.98);
		String str5 = String.valueOf(50.12f);
		
		// String to primitive data types - parseXXX()
		int i5 = Integer.parseInt("10"); 
		double d5 = Double.parseDouble("40.23");
		
		// System.out.println(Integer.parseInt("axdf"));// invalid, NumberFormatException

	}

}
