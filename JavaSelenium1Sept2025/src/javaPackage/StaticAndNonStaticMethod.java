package javaPackage;

public class StaticAndNonStaticMethod {
	
	//the static methods and variables are executed first, followed by the main method 
	// First output will be of Method3(), then main method will get executed.
	
	static int x = Method3(); 
	public static void main(String[] args) {
		
		System.out.println("This is a Main method");
		
		Method1();     //Calling User - defined static method
		
		
		//creating object to call non-static method in main class
		StaticAndNonStaticMethod t = new StaticAndNonStaticMethod(); 
		t.Method2();   //Calling user- defined non static method
		
	}
	
	public static void Method1() {
		String s = "This is a user defined Static Method";
		System.out.println(s);
	}
	
	public void Method2() {
		String a = "This is a user-defined non-static Method ";
		System.out.println(a);
	}
	
	public static int Method3() {
		System.out.println("Executing the static variable from class body");
		return 20;
	}

}
