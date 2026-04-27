package javaPackage;

public class Static6 {
	
	int x = 10;
	static int y = 5;
	

	public static void main(String[] args) {
		
		Static6 s6 = new Static6();
		s6.a();
		
		System.out.println(b); //Correct way to call static variable
		System.out.println(s6.b); //Not recommended to use
		System.out.println(Static6.b); //Not recommended to use
		
	}
	
	
	public void a() {
		int z = 10; //local variable
		System.out.println(z);
	}
	
	static int b = 100;  //static variable

}
