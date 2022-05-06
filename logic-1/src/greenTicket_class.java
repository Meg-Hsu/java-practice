/*
 * 6 may 2022
 * 
 * author @meghsu
 * 
 * You have a green lottery ticket, with ints a, b, and c on it. 
 * If the numbers are all different from each other, the result is 0. 
 * If all of the numbers are the same, the result is 20. If two of the 
 * numbers are the same, the result is 10.
 * 
 * greenTicket(1, 2, 3) → 0
 * greenTicket(2, 2, 2) → 20
 * greenTicket(1, 1, 2) → 10
 * 
 */

public class greenTicket_class {
	public int greenTicket(int a, int b, int c) {
		int result = 0;
		if (a != b && b != c && c != a) {
			return result;
		} else if (a == b && b == c && c == a) {
			result = 20;
		} else if (a == b && b != c) {
			result = 10;
		} else if (a != b && b == c) {
			result = 10;
		} else if (b != c && c == a) {
			result = 10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		greenTicket_class greenTicket_instance = new greenTicket_class();

		System.out.print("Expected Output: \n0 \n20 \n10\n\n");

		System.out.print("Actual Output:\n");
		System.out.print(greenTicket_instance.greenTicket(1, 2, 3) + "\n");
		System.out.print(greenTicket_instance.greenTicket(2, 2, 2) + "\n");
		System.out.print(greenTicket_instance.greenTicket(1, 1, 2) + "\n");

	}

}
