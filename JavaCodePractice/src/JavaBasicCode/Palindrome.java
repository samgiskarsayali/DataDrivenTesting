package JavaBasicCode;

public class Palindrome {

	public static void main(String[] args) {

		String str = "MADAM";
		String reversed = "";
		
		
		
		// Reverse using +=
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i); // adding each character to reversed
			
			//Using += (String concatenation)
			/*+= with String
			Strings in Java are immutable (cannot change once created).
			Every reversed += ch makes a new String, copies old characters, then adds the new one.
			In a loop, that means lots of repeated copying.*/
		}

		// Check palindrome
		if (str.equalsIgnoreCase(reversed)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is NOT a palindrome");
		}
	}
}
