package javaPackage;

public class Inheritance4 {

	int z; // Global variable

	// user defined non static method with passing parameter in bracket
	public void add(int x, int y) {

		z = x + y; // establishing a relation

		System.out.println(z);

	}

	// user defined non static method with passing parameter in bracket
	public void sub(int x, int y) {

		z = x - y; // establishing a relation

		System.out.println(z);

	}

	// user defined static method with passing parameter in bracket
	public static void multiply(int x, int y) {

		int a = x * y; // establishing a relation
		
		//We cannot use global variable inside static method, so we are creating local variable.
		//If we want to use global variable, then the method should be non-static.

		System.out.println(a);

	}

}
