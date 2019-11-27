
public class StringExercises1 {

	/**
	 * Returns the first letter of the string if it is the same as the last letter
	 * other wise returns the middle letter. You may assume that the String has a
	 * length of at least 1.
	 */
	public char firstLastSame(String str) {
		char firstLetter = str.charAt(0);
		char lastLetter = str.charAt(str.length() - 1);

		if (firstLetter == lastLetter) {
			return firstLetter;
		} else {
			return str.charAt(str.length() / 2);
		}
	}

	/**
	 * Splits the String into two parts at the middle and reverses So for example:
	 * "abcd" -> "cdab" "xyz" -> "yzx" You may assume the length of the string is at
	 * least 2
	 */
	public String swapBeginEnd(String str) {
		String ret = "";

		ret += str.substring(str.length() / 2);
		ret += str.substring(0, str.length() / 2);

		// System.out.println(ret);

		return ret;
	}

	/**
	 * Returns a new String made of only the first and last characters If the String
	 * is only 1 character return the original String If the String is empty, return
	 * the word "empty"
	 */
	public String firstLast(String str) {
		if (str.length() == 0) {
			return "empty";
		} else if (str.length() == 1) {
			return str;
		} else {
			return str.charAt(0) + "" + str.charAt(str.length() - 1);
		}

		// return "";
	}

	/**
	 * returns true if the first part of the String matches the pattern given
	 * otherwise return false if the length of the String is less than the length of
	 * the pattern return false
	 */

	public boolean startsWith(String str, String pattern) {
		if (str.length() < pattern.length()) {
			return false;
		} else if (str.indexOf(pattern) == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * returns true is the pattern exists at all in the String
	 */
	public boolean contains(String str, String pattern) {
		if(str.indexOf(pattern)==-1) {
			return false;
		}
		else {
			return true;
		}
		//return str.contains(pattern);
	}

	/**
	 * If the String's beginning and end match the pattern, returns the portion of
	 * the String between the patterns. If they do not return the original String
	 * i.e. middlePart("xyz1234xyz", "xyz") -> "1234" middlePart("xyz1234xy", "xyz")
	 * -> "xyz1234xy" middlePart("","xyz") -> ""
	 */
	public String middlePart(String str, String pattern) {
		String ret = "";
		
		if(str.indexOf(pattern)!=-1) {
			//System.out.println(str.lastIndexOf(pattern));
			if(str.indexOf(pattern)==str.lastIndexOf(pattern)) {
				ret+= str.substring(str.indexOf(pattern));
				return ret;
			}
			ret+= str.substring(str.indexOf(pattern)+pattern.length(),str.lastIndexOf(pattern));
			//System.out.println(ret);
			return ret;
		}
		else if(pattern.length()==0) {
			return str;
		}
		else {
			return str;
		}
		
		//return "";
	}

	/**
	 * Given a String and a pattern, if the pattern exists in the String, return
	 * everything after the pattern in the String. Unless the pattern exists a
	 * second time, in which case you will return the Contents of the String between
	 * the two instances of the pattern. You may assume the pattern exists at most
	 * 2xs in the String. If the pattern doesn't exist at all return the empty
	 * String. i.e. betweenPattern("abcxyzbobxyzye", "xyz") -> "bob"
	 * betweenPattern("abcxyzbobzye", "xyz") -> "bobzye"
	 * betweenPattern("abcdefg","xyz") -> ""
	 */
	public String betweenPattern(String str, String pattern) {
		if (str.indexOf(pattern) == -1) {
			return "";
		}
		// System.out.println(str + " " + pattern);
		int start = str.indexOf(pattern);
		int stop = str.lastIndexOf(pattern);
		// System.out.println(start + " " + stop);

		// System.out.println(str.substring(start + pattern.length(), stop));
		if (start == stop) {
			return str.substring(start + pattern.length());
		} else {
			return str.substring(start + pattern.length(), stop);

		}
	}

}