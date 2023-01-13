package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * * Exception Handling
 * Abnormal condition that distrubs normal flow of execution
 * 
 * ArrayIndexOutOfBoundsException
 * StringIndexOutOfBoundsException
 * FileNotFoundException
 * IOException
 * NumberFormatException
 * IllegalExpressionException
 * NullPointerException
 * ArithmeticException
 * 
 * Throwable(C)  - Exception(C)
 * 				   CompiletimeException
 *                 - SQLException
 *                 - IOException
 *                 - ClassNotFoundException
 *                 - RuntimeException(C)
 *                    - ArithmeticException
 *                    - IndexOutofBoundsException
 *                         - ArrayIndexOutofBoundsException
 *                         - StringIndexOutofBoundsException
 *        
 *            - Error(C)
 *               - OutOfMemoryError
 *               - StackOverflowError
 *               - VirtualMachineError
 *               
 *    try {
 *    	// risk code
 *    } catch {
 *    
 *    }
 *    
 *    try, catch, finally, throw, throws, custom exceptions
 */
import java.util.Scanner;

public class ExceptionHandlingDemo {
	static String str; // null

	public static void main(String[] args) throws IOException {
		
		/* 
		// java.io pkg
		// stream - series of data 
		Stream
		 ByteStream -  8 bits 
		 	FileInputStream - read 8bits
			FileOutputStream - write 8 bits 
		 	BufferInputStream - read line by line
			BufferOutputStream - write line by line 
		 CharecterStream - 16 bit
			FileReader - read 16 bit 
			FileWriter - write 16 bit
			BufferedReader - read line by line 
			BufferedWriter - write line by line
	

		*/
		FileReader fr = new FileReader("D:\\source.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("D:\\target.txt"); 
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		int i1;
		while((i1=br.read())!=-1) {
			// convert ascii values to char
			// print output in console
			// System.out.println((char)i1);
			
			// write content of source.txt to target.txt file
			bw.write(i1);
		}
		br.close();
		fr.close();
		
		bw.close();
		fw.close();
		
		
		
		
		
		/*
		
		
		ExceptionHandlingDemo ed = new ExceptionHandlingDemo();
		ed.m1();
//		try {
//			ed.m1();
//		} catch (ArithmeticException ex) {
//			ex.printStackTrace();
//		}

		// declaration & initialization
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first number: ");
			int num1 = sc.nextInt();
			System.out.println("Enter second number: "); // 0, ArithmeticException
			int num2 = sc.nextInt();
			System.out.println(num1 / num2); // ArithmeticException
			int[] intArr = { 10, 20, 30 };
			for (int i = 0; i <= intArr.length; i++) {
				System.out.println(intArr[i]); // ArrayIndexOutOfBoundsException
			}
			System.out.println(str.charAt(0));// NullPointerException
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// System.out.println(str.length()); // NullPointerExceptions

		// NumberFormatException
		// String to int
		try {
			System.out.println("Enter number: ");
			String str1 = sc.next();
			int x = Integer.parseInt(str1);
			System.out.println(x);
			String str2 = "Hello";
			System.out.println(str2.charAt(4)); // StringIndexOutOfBoundsException
		} catch (NumberFormatException | StringIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age < 18) {
			throw new InvalidAgeException("Invalid age");
		} else {
			System.out.println("Valid age");
		}
		
		System.out.println("Enter customer id");
		int id = sc.nextInt();
		if(id != 100) {
			try {
				throw new CustomerNotFoundException("Customer not found exception with id: " + id );
			} catch (CustomerNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Customer found with id: "+id);
		}
		
		*/

	} // main

	void m1() throws ArithmeticException {
		try {
			m2();
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
	}

	void m2() throws ArithmeticException {
		m3();
	}

	void m3() throws ArithmeticException {
		System.out.println(10 / 0); // ArithmeticException
	}
	

}
