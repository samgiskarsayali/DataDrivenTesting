package javaPackage;

public class IfElse3 {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 40;
		
		if(a>b) {
			System.out.println("a>b");
		}
		else if(b>a) {
			System.out.println("Inside Condition 2 block");
			System.out.println("b>a");
		}
		else if(a == b) {
			System.out.println("Inside Condition 3 block");
			System.out.println("a == b");
		}
		else {
			System.out.println("Both are different values");
		}

	}

}
