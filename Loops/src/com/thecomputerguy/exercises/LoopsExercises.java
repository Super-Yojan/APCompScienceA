package com.thecomputerguy.exercises;

public class LoopsExercises {

	/**
	 * return the Sum of all numbers between start and end (inclusive)
	 * 
	 * @param start, the first or starting value
	 * @param end    the last or ending value
	 * @return the sum of all numbers in the range
	 */

	public int sumBetween(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum = sum + i;
		}

		return sum;

	}

	/**
	 * Finds the sum of all the digits in a number (can be any length) i.e.
	 * sumDigits(1234) --> 10 sumDigits(87654) --> 30 sumDigits(0) --> 0
	 */
	public int sumDigits(int number) {
		int sum = 0;
		if (number < 0) {
			number *= -1;
			while (number > 0) {
				sum += number % 10;
				number /= 10;
			}
			return sum * -1;
		}
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}

		// System.out.println(sum);
		return sum;
	}

	/**
	 * returns true is the word sent is a Palindrome , i.e. the same forward and
	 * backwards palindrome("racecar") --> true palindrome("bobishere") --> false
	 * palindrome("I") --> true
	 */
	public boolean palindrome(String text) {

		return false;
	}

	/**
	 * returns the factorial of the given number 5! is the same as 5*4*3*2*1 i.e.
	 * factorial(5) --> 120 factorial(7) --> 5040 factorial(2) --> 2 factorial(0)
	 * --> 1
	 */
	public long factorial(int number) {
		if (number == 0) {
			return 1;
		}

		int ret = 0;

		for (int i = 1; i <= number; i++) {

		}

		return 1;
	}

	/**
	 * counts the number of pairs in the String. triple pairs count 2xs
	 * pairs("bobby")-->1 pairs("ralph") --> 0 pairs("aabbbc")-> 3
	 */
	public int pairs(String str) {
		int count = 0;
		;
		System.out.println(str);
		for (int i = 1; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count += 1;
				System.out.println("first if " + count);
			}
			if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i + 1)) {
				count += 3;

				System.out.println("second if " + count);
			}
		}

		System.out.println(count);
		return count;
	}

	/**
	 * returns the number of values, double values get a bonus 1 count(1878, 8) -->
	 * 2 count(1772, 7) --> 3 count(10654,0) --> 1
	 */
	public int count(int num, int value) {
		String str = Integer.toString(num);
		String  val= Integer.toString(value);
		for(int i = 0; i <str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)== val.charAt(0) ) {
				
			}
		}
		return 0;
	}

	/**
	 * returns the largest number that divides evenly into both ints a and b gcd(16,
	 * 12) --> 4 gcd(9, 27) --> 9 gcd(13,15) --> 1
	 */
	public int gcd(int a, int b) {

		return 1;
	}

	/**
	 * returns true if the number given is prime isPrime(100) --> false isPrime(37)
	 * --> true
	 */
	public boolean isPrime(int num) {
		return false;
	}

	/**
	 * returns the largest prime number less than or equal to the given integer
	 * (hint: use isPrime) prime(100) --> 97 prime(5) --> 5 prime(0) -> 0
	 */

	public int prime(int limit) {
		return 0;
	}

}