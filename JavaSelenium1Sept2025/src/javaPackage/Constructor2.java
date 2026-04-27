package javaPackage;

public class Constructor2 {
	
	//Default Constructor
	Constructor2(){
		System.out.println("Default constructor");
	}
	
	String name;
	String Address;
	
	//Parametrized Constructor
	Constructor2(String a, String b ){
		name  = a;
		Address = b;
		
		System.out.println("Result from parameterized constructors => " + name + " " + Address);
		
	}
	

	public static void main(String[] args) {
		
		Constructor2 c2 = new Constructor2();  //Default Constructors
		Constructor2 c3 = new Constructor2("Selenium","Zoho"); //Parameterized Constructors.
		

	}

}
