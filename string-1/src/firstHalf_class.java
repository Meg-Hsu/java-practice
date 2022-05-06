/*
 * 5 may 2022
 * 
 * @author meghsu
 * 
 * Given a string of even length, return the first half. 
 * So the string "WooHoo" yields "Woo".
 *
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 *
 */

public class firstHalf_class {
	public String firstHalf(String str) {
		String half = "";
		int halfstringlength = (str.length()) / 2;
		for (int i = 0; i <= halfstringlength-1; i++) {
			half = half + str.charAt(i);
		}
		return half;
	}

	public static void main(String[] args) {
		firstHalf_class firstHalf_instance = new firstHalf_class();
		
		System.out.print("Expected output: \nWoo \nHello \nabc\n");
		
		System.out.print("\nActual Output:\n");
		System.out.print(firstHalf_instance.firstHalf("WooHoo") + "\n");
		System.out.print(firstHalf_instance.firstHalf("HelloThere") + "\n");
		System.out.print(firstHalf_instance.firstHalf("abcdef") + "\n");

	}

}
