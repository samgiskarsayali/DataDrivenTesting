package javaPackage;

public class Variable9 {
	
	int b = 10; //Global variable
	String q = "Global Variable";
	char x = 's';
	static int s = 20; //Static variable

	public static void main(String[] args) {
		
		int a = 5;
		
		System.out.println(a); //5
		System.out.println(s); //20
		//System.out.println(b); //we cannot call a Global variable directly here.
		
		
		
		//Creating the object of the class to call the Global variable in the main method
		Variable9 v = new Variable9();
		
		int x = v.b;
		System.out.println(x); //10
		System.out.println(v.q); //Global Variable
		System.out.println(v.x); //s
		

	}

}
