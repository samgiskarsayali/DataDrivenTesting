package JavaBasicCode;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Choose (+ , -, *, /)");
		char ch = sc.next().charAt(0);
		/* sc.next()---  reads one complete word or token typed by the user.
		 * next() ---  reads it as a string.	
		 * charAt(0) means: give me the character at index 0
		 * "+".charAt(0) → '+'
			"abc".charAt(0) → 'a'
		 */
		
		switch(ch) {
		
		case '+' :
			System.out.println(a + b);
		 	break;
		 	
		case '-' :
			System.out.println(a - b);
			break;
			
		case '*' :
			System.out.println(a * b);
			break;
			
		case '/' :
			System.out.println(a / b);
			break;
			
		default:
			System.out.println("Invalid token");
		
		}

	}
}
