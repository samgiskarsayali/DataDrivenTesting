package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {
		
		int age = 20; //local identifiers
		int weight = 55;
		
		//Outer if Block
		if(age > 18) {  //If condition is true, it will go inside another if block.
			
			//Inner if Block
			if(weight > 50) {
				System.out.println("Candidate is eligible for Indain navy"); 
			}		
		}
		else {
			//If both the condition are false or any one condition is false, else block will execute.
			System.out.println("Not eligible"); 
		}
		
		// Using operators also we can write the code.
		int a = 10;
		int b = 20;
		
		if(a < 20 & b == 20 ) {    //Using bitwise operator to check condition
			System.out.println("a < 20 && b == 20");
		}
		else {
			System.out.println("values are not matching the condition");
		}

	}

}
