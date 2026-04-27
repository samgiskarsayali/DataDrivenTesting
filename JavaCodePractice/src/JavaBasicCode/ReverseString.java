package JavaBasicCode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//String name = "Automation";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string that need to be reversed:");
		String word = sc.nextLine();
		String reverse = "";
		
		for(int i=word.length()-1; i>=0; i--) {
			reverse = reverse + word.charAt(i);
		}
		System.out.println(reverse);
		
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println("Entered String is a Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
