package javaPackage;

public class IfElse2 {

	public static void main(String[] args) {
		
		int a = 10;
		
		if(a/2 == 5) {
			System.out.println("Executing IF block");
			System.out.println("a is equal to 5");
		} else {
			System.out.println("a is not equal to 5");
		}
		
		int b = 20;
		
		if(b/2 == 5) {
			System.out.println("b is not equal to 5");
		}else {
			System.out.println("");
			System.out.println("Executing else block");
			System.out.println("b is equal to 5 ");
		}

	}

}
