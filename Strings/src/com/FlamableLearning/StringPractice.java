package com.FlamableLearning;

public class StringPractice {
	/*
	 * Given a string of unknown length return the first 3 
	 * characters of the string combines with the last 2 characters.
	 * If the string does not contain enough characters, return original 
	 * string 
	 * Mystery("Bobblehead") --> "bobad"
	 */
	
	public String mystery(String string) {
		String ret ="";
		if(string.length()>=3) {
			ret += string.substring(0, 2) + string.substring(string.length()-3); 
		}
		
		return ret;
	}
	
	public String mystery1(String str) {
		String ret = "";
		for(int i = 0; i<str.length();i+=2) {
			ret+=str.charAt(i);
		}
		return ret;
		
	}
	
	/*Given a String of unknown length & a pattern of unknown length
	 * replace the pattern with the string "123". The pattern will appear 
	 * at most once
	 * 
	 * */
	public String mystery2(String str, String p) {
		String ret ="";
		ret += str.substring(0,str.indexOf(p)) +"123"+ str.substring(str.indexOf(p) + p.length());
		return ret;
	}
	
	public String mystery3(String str) {
		String ret = "";
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i) == '1') {
				ret+= "one";
			}
			else if(str.charAt(i) == '5') {
				ret+= "five";
			}
			else {
				ret += str.charAt(i);
			}
		}
		return ret;
	}

}
