package javaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		 
		int a = 10;
		int b = 10;
		
		System.out.println(a++  +  ++a);  //10 11 + 12 12 
						//(10  +  12 = 22)
		
		System.out.println(12);  // a = 12
		
		System.out.println(++a  +  ++a); //13 13 + 14 14
						//(13  +  14 = 27)
		
		System.out.println(a);  //a = 14
		
		System.out.println(a + b);  //14 + 10 = 24
		
		
				
				
	}

}
