package JavaBasicCode;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is even or odd");
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println(x + " is Even number");
		} else {
			System.out.println(x + " is odd number");
		}
		
	}

}
