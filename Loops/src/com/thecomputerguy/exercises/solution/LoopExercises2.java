package com.thecomputerguy.exercises.solution;

public class LoopExercises2 {

	/**
	 * returns the number reversed. Do not convert to a String! remember that n*10
	 * move the decimal place to the right 1 so 87*10 = 870 reverseNum(12345) -->
	 * 54321 reverseNum(1) --> 1 reverseNum(0) --> 0 reverseNum(-10) --> -1
	 */

	public static int reverseNum(int num) {
		int revNum = 0; 
		for(int i = num; i > 0; i/= 10) {
			revNum += i%10;
			revNum *= 10;
		}
		//System.out.println(revNum);
		return revNum/10;
	}

	/**
	 * returns the length of the number entered this method will be used by
	 * countNumbers length(10) --> 2 length(0) --> 1 length(161) --> 3
	 */
	public static int length(int num) {
		int length = 0;
		if(num == 0) {
			return 1;
		}
		for(int i = num ; i>0; i /=10) {
			length +=1;
		}
		return length;
	}

	/**
	 * countNumbers returns how many time a given number appears within another
	 * number. Do not convert to a String. You will need to use the length method
	 * defined above. countNumbers(12234, 2) --> 2 countNumbers(3343032, 3) --> 4
	 * countNumbers(3456342234, 34) --> 3 countNumbers(12345, 12345) --> 1
	 */
	public static int countNumbers(int num, int pattern) {
		int lenNum = length(num);
		int lenPattern = length(pattern);
		//System.out.println(lenPattern);
		int divNum = 1;
		for(int i = 0; i<lenPattern; i++) {
			divNum *= 10;
		}
		//System.out.println(divNum);
		
		int count = 0; 
		for(int i =0; i < lenNum; i++) {
			if(num % divNum == pattern) {
				count += 1; 
			}
			num /= 10;
		}
		//System.out.println(count);
		return count;
	}

	/**
	 * returns the number of words in the String given. Please note that words are
	 * separated by a space. However, if someone typos and adds more than 1 space,
	 * this must be considered. countWords("I love CS") --> 3 countWords(" I love
	 * CS") --> 3 countWords("IloveCS") --> 1 countWords("") --> 0
	 */
	public static int countWords(String phrase) {
		int noWords = 0;
		for(int i =0; i < phrase.length()-1;i++) {
			if(!Character.isSpaceChar(phrase.charAt(i)) && Character.isSpaceChar(phrase.charAt(i+1)) || (i == phrase.length()-2 && !Character.isSpaceChar(phrase.charAt(i))) ) {
				noWords += 1;
			}
		}
		return noWords;
	}
}
