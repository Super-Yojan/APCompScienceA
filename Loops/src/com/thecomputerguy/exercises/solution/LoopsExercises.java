package com.thecomputerguy.exercises.solution;

public class LoopsExercises {

	/**
	 * return the Sum of all numbers between start and end (inclusive)
	 * 
	 * @param start, the first or starting value
	 * @param end    the last or ending value
	 * @return the sum of all numbers in the range
	 */

	public int sumBetween(int begin, int end) {
		int retNumber = 0;

		for (int i = begin; i <= end; i++) {
			retNumber += i;
		}

		return retNumber;

	}

	/**
	 * Finds the sum of all the digits in a number (can be any length) i.e.
	 * sumDigits(1234) --> 10 sumDigits(87654) --> 30 sumDigits(0) --> 0
	 */
	public int sumDigits(int number) {
		int sum = 0;
		if (number < 0) {
			number*=-1;
			while (number > 0) {
				sum += number % 10;
				number = number / 10;

			}
			return sum * -1;
		}

		while (number > 0) {
			sum += number % 10;
			number = number / 10;

		}
		return sum;
	}

	/**
	 * returns true is the word sent is a Palindrome , i.e. the same forward and
	 * backwards palindrome("racecar") --> true palindrome("bobishere") --> false
	 * palindrome("I") --> true
	 */
	public boolean palindrome(String text) {
		String reversed ="";
		for(int i = text.length()-1 ; i >= 0; i--) {
			reversed += text.charAt(i);
		}
		//System.out.println(reversed);
		
		if(reversed.equals(text)) {
			return true;
		}
		return false;
	}

	/**
	 * returns the factorial of the given number 5! is the same as 5*4*3*2*1 i.e.
	 * factorial(5) --> 120 factorial(7) --> 5040 factorial(2) --> 2 factorial(0)
	 * --> 1
	 */
	public long factorial(int number) {
		long retNumber = 1; 
		for(int i = number; i>1;i--) {
			retNumber*= i;
		}
		return retNumber;
	}

	/**
	 * counts the number of pairs in the String. triple pairs count 2xs
	 * pairs("bobby")-->1 pairs("ralph") --> 0 pairs("aabbbc")-> 3
	 */
	public int pairs(String str) {
		int retNumber= 0; 
		for(int i = 1; i < str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				retNumber+=1;
			}
			if(str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1)) {
				retNumber +=2;
			}
		}
		//System.out.println(retNumber);
		return retNumber;
	}

	/**
	 * returns the number of values, double values get a bonus 1 count(1878, 8) -->
	 * 2 count(1772, 7) --> 3 count(10654,0) --> 1
	 */
	public int count(int num, int value) {
		int retNumber =0;
		int temp = 0; 
		int archive= 0;
		if(num<0) {
			num*=-1;
			while(num>0) {
				temp = num%10;
				if(temp == value ) {
					retNumber+=	1;
					
				}
				if(temp == value && value == archive) {
					retNumber +=1;
				}
				archive = temp;
				num /= 10;
			}
			return retNumber;
		}
		while(num>0) {
			temp = num%10;
			if(temp == value ) {
				retNumber+=	1;
				
			}
			if(temp == value && value == archive) {
				retNumber +=1;
			}
			archive = temp;
			num /= 10;
		}
		
		/*
		 * for(int i = num; i >=0; i/=10 ) { temp = i%10; if(temp == value) {
		 * retNumber+=1; } }
		 */
		//System.out.println(retNumber);
		return retNumber;
	}

	/**
	 * returns the largest number that divides evenly into both ints a and b gcd(16,
	 * 12) --> 4 gcd(9, 27) --> 9 gcd(13,15) --> 1
	 */
	public int gcd(int a, int b) {
		int min = Math.min(a, b);
		for(int i = min; i>=1; i--) {
			if(a%i == 0 && b%i == 0) {
				return i; 
			}
		}
		return 1;
	}

	/**
	 * returns true if the number given is prime isPrime(100) --> false isPrime(37)
	 * --> true
	 */
	public boolean isPrime(int num) {
		//System.out.println(num);
	
		if((num % 2 == 0 && num !=2) || (num != 3 && num % 3 == 0)) {
			System.out.println("false");
			return false;
			
		}
		else {
			//System.out.println("ture");
			return true;
		}
		//return false;
	}

	/**
	 * returns the largest prime number less than or equal to the given integer
	 * (hint: use isPrime) prime(100) --> 97 prime(5) --> 5 prime(0) -> 0
	 */

	public int prime(int limit) {
		for(int i = limit; i>=0; i --) {
			if(isPrime(i)) {
				return i;
			}
		}
		return 0;
	}

}