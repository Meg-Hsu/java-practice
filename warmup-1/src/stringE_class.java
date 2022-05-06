/*
 * 5 may 2022
 * 
 * @author meghsu
 *
 * Return true if the given string contains between 1 and 3 'e' chars.
 * 
 * stringE("Hello") --> true 
 * stringE("Heelle") --> true
 * stringE("Heelele") --> false
 * 
 */

public class stringE_class {
	public boolean stringE(String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				counter = counter + 1;
			}
		}
		if (counter <= 3 && counter >= 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		stringE_class stringE_instance = new stringE_class();
		
		System.out.print("Expected Output: \ntrue \ntrue \nfalse \n");

		System.out.print("\nActual Output:\n");
		System.out.print(stringE_instance.stringE("Hello") + "\n");
		System.out.print(stringE_instance.stringE("Heelle") + "\n");
		System.out.print(stringE_instance.stringE("Heelele") + "\n");

	}
}
