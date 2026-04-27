package javaPackage;

public class Static7 {

	String a; //Declaring a global variable
	int b; //Declaring a global variable
	static int c; //Declaring a static variable
	
	
	public static void main(String[] args) {
		
		Static7 s7 = new Static7();
		s7.a = "Selenium";
		s7.b = 1;
		c = 2;
		
		System.out.println(s7.a+" \n"+s7.b+"\n"+c);
		System.out.println(s7.a+" "+s7.b+" "+c);
		
		a();
		
	}
	
	public static void a() {
		System.out.println("Hello static method");
	}

}
