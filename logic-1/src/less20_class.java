/*
 * 6 may 2022
 * 
 * author @meghsu
 * 
 * Return true if the given non-negative number is 1 or 2 less than 
 * a multiple of 20. So for example 38 and 39 return true, but 40 
 * returns false.
 * 
 * less20(18) → true
 * less20(19) → true
 * less20(20) → false
 * 
 */

public class less20_class {
	public boolean less20(int n) {
		if (20 - (n % 20) <= 2 && (n % 20) != 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		less20_class less20_instance = new less20_class();

		System.out.print("Expected Output: \ntrue \ntrue \nfalse\n\n");

		System.out.print("Actual Output:\n");
		System.out.print(less20_instance.less20(18) + "\n");
		System.out.print(less20_instance.less20(19) + "\n");
		System.out.print(less20_instance.less20(20) + "\n");
	}

}
