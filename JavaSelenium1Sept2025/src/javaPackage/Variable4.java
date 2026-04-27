package javaPackage;

public class Variable4 {
	
	//to create main method -- type man then ctrl space
	public static void main(String[] args) {
		
		int a = 5; // Local Variable
		System.out.println(a);
		
		int c = 100; //Local Variable
		System.out.println(c);
		
		c = 200; // Overriding(Overwriting) the value of local variable
		System.out.println(c);
		
		char d = 'a'; // In char data type we pass only single character in single quotes
		System.out.println(d);
		
		boolean b = true;
		System.out.println(b); //true
		b = false; // overriding
		System.out.println(b); //false
		
		System.out.println(3>10); //false
		System.out.println(500<1000); //true
		
		int f = 100;
		int g = 200;
		
		boolean h = f>g;
		System.out.println(h);

	}

}
