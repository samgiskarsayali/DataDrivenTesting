package javaPackage;

public class ArithmaticOperator {
	
	

	public static void main(String[] args) {
		
		int a = 10; //local variable
		int b = 5; //local variable
		
		//Arithmatic operator
		System.out.println(a + b );
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		
		ArithmaticOperator AO = new ArithmaticOperator();
		AO.AR();

	}
	
	public void AR() {
		
		int x = 20;
		int y = 50;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}

}
