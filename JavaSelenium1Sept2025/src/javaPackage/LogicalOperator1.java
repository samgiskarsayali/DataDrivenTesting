package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		//Logical Operator
		
		System.out.println(a < b  &&  a < c); //False
						//(10<5  &&  10<20) --> As 10<5 is false, logical operator won't check next condition
		
		//Bitwise Operator
		
		System.out.println(a < b  &&  a < c);  //false
						//(10<5  &&  10<20) --> As 10<5 is false, bitwise operator still checks next condition
	}

}
