package javaPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {
		int s = 23;
		int d = 17;
		
		System.out.println(++d); //18  18
		
		System.out.println(d++); // 18  19
		
		System.out.println(s - d++); // 23 23 - 19 20
						//(23 - 19 = 4)
		
		System.out.println(--s  +  s--); //22 22 + 22 21
						//(22  +  22 = 44)
		
		System.out.println(++s); //22
		
		System.out.println(++d); //21
		
		System.out.println(s + d);

	}

}
