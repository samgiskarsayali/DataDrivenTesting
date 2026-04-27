package JavaBasicCode;

public class PalindromeStringBuilder {

	public static void main(String[] args) {
		System.out.println("Program started");
		String str = "MADAM";

		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();

		/*
		 *  Using StringBuilder
		 *  StringBuilder
			StringBuilder is mutable (can change/grow).
			append() writes into an internal resizable buffer.
			New objects are not created on each append (only occasional buffer growth).
			
		 * "MADAM" is stored in str. StringBuilder sb = new StringBuilder(str); →
		 * Creates a builder with the string. String reversed = sb.reverse().toString();
		 * → Reverses it and converts back to a normal string. Compare original and
		 * reversed → print result.
		 */

		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);

		if (str.equalsIgnoreCase(reversed)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is NOT a palindrome");
		}
		System.out.println("Program finished");
	}

}

/*
 * StringBuilder is fast 
 * .reverse() is already built-in 
 * .toString() gives the final reversed string 
 * Cleaner and easier to read
 */
