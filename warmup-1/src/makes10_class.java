/*
 * 5 may 2022
 * 
 * @author meghsu
 * 
 * Given 2 ints, a and b, return true if one or more of them is 10 
 * or if their sum is 10.
 * 
 * makes10(9, 10) --> true
 * makes10(9, 9) --> false
 * makes10(1, 9) --> true
 *
 */

public class makes10_class {
	public boolean makes10(int a, int b){
		if (a == 10 || b == 10) {
			return true;
		} else if (a + b == 10) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String [] args){
		makes10_class makes10_instance = new makes10_class();
		
		System.out.print("Expected Output: \ntrue \nfalse \ntrue \n");

		System.out.print("\nActual Output:\n");
		System.out.print(makes10_instance.makes10(9, 10) + "\n");
		System.out.print(makes10_instance.makes10(9, 9) + "\n");
		System.out.print(makes10_instance.makes10(1, 9) + "\n");
		
	}
}
