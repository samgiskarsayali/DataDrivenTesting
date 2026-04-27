package javaPackage;

public class LogicalOperator3 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 4;
		int z = 6;
		
		//Bitwise Operator
		System.out.println(++x > y  &  x < ++y); //false (false  &  True  = false)
		System.out.println(x); //3
		System.out.println(y); //5
		
		//Logical Operator
		System.out.println(x < y  &&  x > y );  //(true && false = false  )
		
		

	}

}
