/*
 * 6 may 2022
 * 
 * author @meghsu
 * 
 * Given an int array, return true if the array contains 2 twice, or 3 twice. 
 * The array will be length 0, 1, or 2.
 * 
 * double23([2, 2]) → true
 * double23([3, 3]) → true
 * double23([2, 3]) → false
 * 
 */

public class double23_class {
	public boolean double23(int[] nums) {
		int arraylength = nums.length;
		if (arraylength < 2) {
			return false;
		} else {
			if (nums[0] == 2 && nums[1] == 2) {
				return true;
			} else if (nums[0] == 3 && nums[1] == 3) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		double23_class double23_instance = new double23_class();

		int[] array1 = { 2, 2 };
		int[] array2 = { 3, 3 };
		int[] array3 = { 2, 3 };

		System.out.println("Expected Output:");
		System.out.println("true");
		System.out.println("true");
		System.out.println("false");

		System.out.print("\nActual Output:\n");
		System.out.println(double23_instance.double23(array1));
		System.out.println(double23_instance.double23(array2));
		System.out.println(double23_instance.double23(array3));

	}

}
