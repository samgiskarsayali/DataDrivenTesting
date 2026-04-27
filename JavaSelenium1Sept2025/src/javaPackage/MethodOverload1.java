package javaPackage;

public class MethodOverload1 {

	// user -defined non static parameterized method
	// here we have 2 parameters
	public void sum(int a, int b) {
		System.out.println("Out put from method having 2 parameter " + a + b);
	}

	// Method name is same , but the type of parameters or number of parameter
	// should be different
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);

	}

}
