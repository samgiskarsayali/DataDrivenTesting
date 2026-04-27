package JavaBasicCode;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number to find Greater number from two?");
				
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		
		int largest = ((a > b) ? a : b);
		
		System.out.println("The largest number is " + largest);
		
		
		
		System.out.println("Enter three number to find Greater number from two?");
		System.out.println("Enter 1st number");
		int x = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int y = sc.nextInt();
		
		System.out.println("Enter 3rd number");
		int z = sc.nextInt();
		
		int greaterNum = (x > y && x > z)? x : (y > z ? y : z); //ternary operator
	
		System.out.println("The greater number is " + greaterNum);
		
	}
}
