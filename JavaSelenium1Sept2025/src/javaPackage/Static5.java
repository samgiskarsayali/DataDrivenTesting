package javaPackage;

public class Static5 {
	static int z = 5; //Defining static variable
	int y = 1; //Global variable
	

	public static void main(String[] args) {
		
		System.out.println(z); 
		a();
		
		Static5 s = new Static5();
		s.b();

	}
	
	
	//user-defined static method
	public static void a() {
		z = 10; //modifying the value of z 
		System.out.println(z);
	}
	
	//user-defined non-static method
	public void b() {
		z = 15;
		System.out.println(z);
	}

}
