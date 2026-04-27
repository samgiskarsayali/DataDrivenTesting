package javaPackage;

public class Static3 {
	
	static String s = "Hello";
	static int XY = NewMethod(); // This will print first

	public static void main(String[] args) {

		int a = 5;
		System.out.println(a);
		System.out.println(s);

	}
	public static int NewMethod() {
		System.out.println("Execution starts from Static Method");
		return 10;
	}

}
