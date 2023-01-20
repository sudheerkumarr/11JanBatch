package day10;

import java.util.ArrayList;
import java.util.List;

public class Utils {

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

	// Palindrome - 121 - 121 
	boolean isPalindrome(String str) {
		String reverse = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		if (str.equals(reverse))
			return true;
		else
			return false;
	}

	// isPrime
	boolean isPrimeNumber(int num) throws InvalidNumberException {
		boolean flag = true;

		if (num == 0 || num == 1) {
			//System.out.println(num + " is not prime number.");
			throw new InvalidNumberException("input value should be greater than 1");
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

	// isEven
	boolean isEven(int x) {

		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// greet
	void greet() {
		System.out.println("Hello World!");
	}

	// Generate random value
	double getRandom() {
		return Math.random();
	}

	// Find square
	int sq(int x) {
		return x * x;
	}

	// Method to square values present in arrayList
	List<Integer> square(List<Integer> intArrList) {
		/*
		 * step 1: read one element at a time from the list - for/iterator step 2:
		 * square value - 100 step 3: create and add result to newArrayList. step 4:
		 * print values
		 */
		List<Integer> newArrList = new ArrayList<>();
		for (Integer el : intArrList) {

			// square & add result to new array list
			newArrList.add(el * el);
		}
		return newArrList;
	}
}
