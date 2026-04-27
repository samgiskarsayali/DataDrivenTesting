package JavaBasicCode;

import java.util.Scanner;

public class AdditionOfTwoNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lets add two number ");
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		int addition = (num1 + num2);
		
		System.out.println("Addition of two number is " + addition);
		
	}

}
