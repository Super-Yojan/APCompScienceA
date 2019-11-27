
public class StringWithLoops {

	/**
	 * Given a String str, returns the number of times pattern appears in str. i.e.
	 * countPattern("bbobb","b") would return 4 countPattern("abcxyzabc","abc")
	 * would return 2 countPattern("abcxyzmnp","mon") would return 0
	 * countPattern("adfargaer","") would return 0; countPattern("","adf") would
	 * return 0;
	 */
	public int countPattern(String str, String pattern) {
		if (str.length() == 0 || pattern.length() == 0) {
			return 0;
		}

		int firstIndex = str.indexOf(pattern);

		if (firstIndex == -1) {
			return 0;
		} else {
			int count = 0;

			for (int i = firstIndex + pattern.length(); i < str.length(); i += pattern.length()) {
				count++;
			}
			return count;

		}

	}

	/**
	 * Returns a String which is the reverse of the given String str i.e.
	 * reverseString("farmer") would return "remraf"
	 */
	public String reverseString(String str) {
		String ret = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			ret += "" + str.charAt(i);
		}
		return ret;
	}

	/**
	 * Returns a String with each character of the given string separated by a *
	 * i.e. starring("Farmer") would return "F*a*r*m*e*r"
	 */
	public String starring(String str) {

		if (str.length() == 0) {
			return "";
		}
		String ret = "";

		for (int i = 0; i < str.length() - 1; i++) {
			ret += str.charAt(i) + "*";

		}
		// System.out.println(ret+str.charAt(str.length()-1));
		return ret + str.charAt(str.length() - 1);
	}

	/**
	 * Without using "replace" or "replaceAll" make a new String that has replaced
	 * all the s's with $'s i.e. moneySs("mississippi") would return "mi$$i$$ippi"
	 */
	public String moneySs(String str) {
		String ret = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 's') {
				ret += '$';
			} else {
				ret += str.charAt(i);
			}
		}
		return ret;
	}

	/**
	 * Returns a string where every two characters are switched. i.e.
	 * swappy("abcdef") would return "badcfe" swappy("abcde") would return "badce"
	 */
	public String swappy(String str) {
		String ret = "";
		if(str.length() == 0) {
			return "";
		}
		
		for (int i = 0; i < str.length()-1; i += 2) {
			ret += "" + str.charAt(i + 1) + str.charAt(i);
			//System.out.println(ret);
		}
		//System.out.println(ret);
		if(str.length()%2!=0) {
			//System.out.println(ret+str.charAt(str.length()-1));
			return ret+str.charAt(str.length()-1);
		}
		return ret;
	}
}