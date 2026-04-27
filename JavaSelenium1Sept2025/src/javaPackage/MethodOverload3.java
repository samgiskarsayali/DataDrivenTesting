package javaPackage;

public class MethodOverload3 {

	// user defined static paramaterized method
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	//instead of void if are using int, we have to give return statement instead of sysout statement.
	public static int add(int a, int b, int c) {
		return a + b + c;
	}

}
