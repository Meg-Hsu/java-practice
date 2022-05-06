/*
 * 6 may 2022
 * 
 * author @meghsu
 * 
 * Given a non-negative number "num", return true if num is within 2 of 
 * a multiple of 10. Note: (a % b) is the remainder of dividing a by b, 
 * so (7 % 5) is 2. 
 * 
 * nearTen(12) → true
 * nearTen(17) → false
 * nearTen(19) → true
 * 
 */

public class nearTen_class {
	public boolean nearTen(int num) {
		if (num%10 <= 2) {
			return true;
		} else if (10 - (num%10) <= 2) {
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		nearTen_class nearTen_instance = new nearTen_class();
		
		System.out.print("Expected Output: \ntrue \nfalse \ntrue\n\n");

		System.out.print("Actual Output:\n");
		System.out.print(nearTen_instance.nearTen(12) + "\n");
		System.out.print(nearTen_instance.nearTen(17) + "\n");
		System.out.print(nearTen_instance.nearTen(19) + "\n");
		
	}

}
