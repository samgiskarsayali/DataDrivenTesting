package javaPackage;

public class Static1 {
	
	int k = 5; //Global Variable
	String s = "Java"; //Defining a Global variable
	
	//static main method
	public static void main(String[] args) {
		
		String b = "Selenium"; //Local Variable
		System.out.println(b);
		
		Static1 s1 = new Static1();
		System.out.println(s1.k); //Calling the Global variable
		System.out.println(s1.s); //Calling the Global variable
		
		//Calling the non - static methods variable.
		s1.method1();
		
	}
	
	//non static method
	public void method1(){  // This is a non-static method as 'static' keyword is not present.
		int i = 10; //local Variable -- This is local variable as it is under method
		System.out.println(i);
	}

}
