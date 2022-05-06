/*
 * 6 may 2022
 * 
 * author @meghsu
 * 
 * 
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each 
 * array. Return the array which has the largest sum. In event of a tie, return a.
 * 
 * biggerTwo([1, 2], [3, 4]) → [3, 4]
 * biggerTwo([3, 4], [1, 2]) → [3, 4]
 * biggerTwo([1, 1], [1, 2]) → [1, 2]
 * 
 */

public class biggerTwo_class {
	public int[] biggerTwo(int[] a, int[] b) {
		if ((a[0]+a[1]) >= (b[0]+b[1])){
			return a;
		}
		return b;
	}
	
	public static void main(String[] args) {
		int[] array1a = { 1, 2 };
		int[] array1b = { 3, 4 };
		int[] array3a = { 1, 1};
		

		biggerTwo_class biggerTwo_instance = new biggerTwo_class();
		
		// no output formatting lmao
		System.out.println("Expected Output:");
		System.out.println("3 4");
		System.out.println("3 4");
		System.out.println("1 2");
		

		System.out.print("\nActual Output:\n");
		int[] result1 = biggerTwo_instance.biggerTwo(array1a, array1b);
		int[] result2 = biggerTwo_instance.biggerTwo(array1b, array1a);
		int[] result3 = biggerTwo_instance.biggerTwo(array3a, array1a);
//		int[] result2 = maxEnd3_instance.maxEnd3(array2);
//		int[] result3 = maxEnd3_instance.maxEnd3(array3);
		
		for (int i = 0; i < 2; i++) {
			System.out.print(result1[i] + " ");
		} 
		System.out.println("");
		for (int i = 0; i < 2; i++) {
			System.out.print(result2[i] + " ");
		} 
		System.out.println("");
		for (int i = 0; i < 2; i++) {
			System.out.print(result3[i] + " ");
		} 
	}
}
