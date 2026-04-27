package JavaBasicCode;

import java.util.Scanner;

public class InputFromUser {
	
	public static void main(String[] args) {
		
		String name;  //sc.nextLine();
		int age;     //sc.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		name = sc.nextLine();
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
		System.out.println("Your name is : " + name);
		System.out.println("Your age is : " + age);
		
		
	
	}

}
