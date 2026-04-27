package javaPackage;

public class Practice6 {
	
	
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(++a); //11 11
		System.out.println(a++); //11 12
		System.out.println(a);
		
		System.out.println(--a); //11 11
		System.out.println(a--); //11 10
		System.out.println(a); //10
		
		System.out.println(++a + a++); //11 11 + 11 12
		System.out.println(a); //12
		
		System.out.println(--b - a++); //19 19 - 12 13
		
		
	}
	
	

}
