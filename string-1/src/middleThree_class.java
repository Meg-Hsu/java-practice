/*
 * 5 may 2022
 * 
 * @author meghsu
 *
 * Given a string of odd length, return the string length 3 from its middle, 
 * so "Candy" yields "and". The string length will be at least 3.
 * 
 * middleThree("Candy") → "and"
 * middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 *
 */
public class middleThree_class {
	public String middleThree(String str) {
		String midthree = "";
		int halflength = (str.length())/2;
		for (int i = (halflength - 1); i <= (halflength + 1); i++) {
			midthree = midthree + str.charAt(i);
		}
		return midthree;
	}
	
	public static void main(String[] args) {
		middleThree_class middleThree_instance = new middleThree_class();
		
		System.out.print("Expected Output: \nand \nand \nlvi\n\n");
		
		System.out.print("Actual Output:\n");
		System.out.print(middleThree_instance.middleThree("Candy") +"\n");
		System.out.print(middleThree_instance.middleThree("and") +"\n");
		System.out.print(middleThree_instance.middleThree("solving") +"\n");
	}
}
