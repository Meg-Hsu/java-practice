/*
 * 5 may 2022
 * 
 * @author meghsu
 *
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 * Given 2 int values, return true if one or the other is teen, but not both.
 *
 * loneTeen(13, 99) --> true
 * loneTeen(21, 19) --> true
 * loneTeen(13, 13) --> false
 */

public class loneTeen_class {
	public boolean loneTeen(int a, int b) {
		if (a <= 19 && a >= 13) {
			if (b <= 19 && b >= 13) {
				return false;
			} else {
				return true;
			}
		} else if (b <= 19 && b >= 13) {
			if (a <= 19 && a >= 13) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		loneTeen_class loneteen = new loneTeen_class();
		
		System.out.print("Expected Output: \ntrue \ntrue \nfalse \n");

		System.out.print("\nActual Output:\n");
		System.out.print(loneteen.loneTeen(13, 99) + "\n");
		System.out.print(loneteen.loneTeen(21, 19) + "\n");
		System.out.print(loneteen.loneTeen(13, 13) + "\n");
	}
}
