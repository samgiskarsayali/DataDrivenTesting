//To Verify Logical operator don't check second condition if 1st condition is false
//To Verify Bitwise operator check both the condition if 1st condition is true or false
package javaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		//Logical operator
		System.out.println(a < b  &&  ++a < c); //false
		System.out.println(a); //10
		
		
		
		//Bitwise Operator
		System.out.println(a < b  &  ++a < c); //false
		System.out.println(a); //11

 

	}

}
