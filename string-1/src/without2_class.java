/*
 * 6 may 2022
 * 
 * @author meghsu
 * 
 * Given a string, if a length 2 substring appears at both its beginning and
 * end, return a string without the substring at the beginning, so "HelloHe" 
 * yields "lloHe". The substring may overlap with itself, so "Hi" yields "". 
 * Otherwise, return the original string unchanged.
 * 
 * without2("HelloHe") → "lloHe"
 * without2("HelloHi") → "HelloHi"
 * without2("Hi") → ""
 */

public class without2_class {
	public String without2(String str) {
		String beginningsubstr = "";
		String endsubstr = "";
		String returnsubstr = "";
		
		if (str.length() < 2) {
			return str;
		}
		
		for (int i = 0; i <= 1; i++) {
			beginningsubstr = beginningsubstr + str.charAt(i);
		}
		for (int i = ((str.length()) - 2); i <= str.length() - 1; i++) {
			endsubstr = endsubstr + str.charAt(i);
		}

		if (beginningsubstr.equals(endsubstr)) {
			if (str.length() == 2) {
				return "\"\"";
			}
			for (int i = 2; i < str.length(); i++) {
				returnsubstr = returnsubstr + str.charAt(i);
			}
			return returnsubstr;
		} else {
			return str;
		}
	}

	public static void main(String[] args) {
		without2_class without2_class_instance = new without2_class();
		
		System.out.print("Expected Output: \nlloHe \nHelloHi \n\"\"\n\n");

		System.out.print("Actual Output:\n");
		System.out.print(without2_class_instance.without2("HelloHe") + "\n");
		System.out.print(without2_class_instance.without2("HelloHi") + "\n");
		System.out.print(without2_class_instance.without2("Hi") + "\n");
	}

}
