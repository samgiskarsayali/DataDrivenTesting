package javaPackage;

public class Static2 {
	
	int roll; //Declaring a Global variable
	String name; //Declaring a Global variable
	static String college; //Declaring a static variable

	public static void main(String[] args) {
		
		Static2 s2 = new Static2();
		
		System.out.println(s2.roll); //0  --- If no value is defined , then default value will be Zero
		System.out.println(s2.name); //null --- If no value is defined , then default value will be null
		System.out.println(s2.college); //null --- If no value is defined , then default value will be null
		
		System.out.println(college); //static member can be called directly
		System.out.println(Static2.college); //static member can be called using class name also
		System.out.println(s2.college); //static member can be called using object reference

	}

}
