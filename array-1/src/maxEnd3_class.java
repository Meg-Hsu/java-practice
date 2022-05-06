/*
 * 6 may 2022
 * 
 * author @meghsu
 * 
 * Given an array of ints length 3, figure out which is larger, 
 * the first or last element in the array, and set all the other elements 
 * to be that value. Return the changed array.
 * 
 * maxEnd3([1, 2, 3]) → [3, 3, 3]
 * maxEnd3([11, 5, 9]) → [11, 11, 11]
 * maxEnd3([2, 11, 3]) → [3, 3, 3]
 * 
 */

public class maxEnd3_class {
	public int[] maxEnd3(int[] nums) {
		int num = 0;
		if (nums[0] > nums[2]) {
			num = nums[0];
			for (int i = 0; i < 3; i++) {
				nums[i] = num;
			}
		} else if (nums[2] >= nums[0]) {
			num = nums[2];
			for (int i = 0; i < 3; i++) {
				nums[i] = num;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 11, 5, 9 };
		int[] array3 = { 2, 11, 3 };

		maxEnd3_class maxEnd3_instance = new maxEnd3_class();
		
		// no output formatting? 
		System.out.print("Expected Output: \n[3, 3, 3] \n[11, 11, 11] \n[3, 3, 3]\n\n");

		System.out.print("Actual Output:\n");
		int[] result1 = maxEnd3_instance.maxEnd3(array1);
		int[] result2 = maxEnd3_instance.maxEnd3(array2);
		int[] result3 = maxEnd3_instance.maxEnd3(array3);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(result1[i] + " ");
		} 
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.print(result2[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.print(result3[i] + " ");
		}

	}
}
