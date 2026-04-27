package tests;

public class Calculator {
	
	public static void main(String[] args) {
		//As both the methods are non static , we are creating a object of class to call method.
		Calculator c1 = new Calculator();
		
		int add = c1.add(10, 20);
		System.out.println(add);
		
		int difference = c1.subtract(20, 10);
		System.out.println(difference);

	}
	
	public int add(int num1 , int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}


}
