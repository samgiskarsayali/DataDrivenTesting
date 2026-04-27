package javaPackage;

public class Practice2 {
	
	   static int AB = NewMethod2();  //Creating a static variable and calling the static method.
	
		int a = 3; //Global Variable
		static int b = 6; //Static variable
		

	public static void main(String[] args) {
		
		int x = 5; //Local Variable
		int y = 2; //Local Variable
		
		System.out.println(b); //Calling static variable
		System.out.println(b + y);  //calling static and local variable
		
		Practice2 p = new Practice2(); //Creating object
		System.out.println(p.a);  //Calling Global variable
		
		NewMethod(); //Calling a static Method
		
		p.NewMethod1(); //Calling a Non- static Method
		
		
	}
	
	public static void NewMethod() {
		
		System.out.println("Inside a new Method");
	}
	
	public void NewMethod1() {
		System.out.println("Inside a Non static method");
		
	}
	
	public static int NewMethod2() {
		System.out.println("Static methods and variables get called at the start of execution");
		return 10;
	}

}
