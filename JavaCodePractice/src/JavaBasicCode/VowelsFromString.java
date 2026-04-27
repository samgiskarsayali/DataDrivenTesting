package JavaBasicCode;

import java.util.Scanner;

public class VowelsFromString {

	public static void main(String[] args) {
		//String word = "Automation";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			char ch = Character.toLowerCase(word.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch);
				count ++;
			
			}
			
		}
		System.out.println("\nThe number of vowels are : "+count);
		

	}

}
