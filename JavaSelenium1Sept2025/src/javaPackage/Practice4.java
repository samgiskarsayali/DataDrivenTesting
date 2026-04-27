//Arithmatic and unary operator
package javaPackage;

public class Practice4 {
	
	int a = 1;
	static int b = 2;
	

	public static void main(String[] args) {
		
		System.out.println("Arithmatic operators");
		Practice4 p = new Practice4();
		System.out.println(p.a  +  b); //3
		System.out.println(b  -  p.a); //1
		System.out.println(p.a  *  b); //2
		System.out.println(b  /  p.a); //2
		
		System.out.println("  ");
		
		Unary();
		
		
	}
	
	public static void Unary() {
		
		System.out.println("Unary Operators");
		Practice4 p1 = new Practice4();
		System.out.println(++p1.a); //2 2  ==> Final Output - 2
		System.out.println(b--); //2 1  ==> Final Output - 2
		System.out.println(b--); //1 0  ==> Final Output - 1
		System.out.println(b); //0  ==> Final Output - 0
		System.out.println(++b); //1 1  ==> Final Output - 1
		System.out.println(++b); // 2 2  ==> Final Output - 2
		
		System.out.println(++p1.a  +  b);
		                //(3  3  +  2) ==> 3+2= 5
		System.out.println(--p1.a -  --b);
						//(2  2  -   1 1) ==> 2-1 = 1
	}

}
