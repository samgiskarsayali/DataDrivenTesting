package javaPackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		double b = 5.2;  //local
		System.out.println(b); //5.2
		
		
		//double to int
		
		int a = (int)b;
		float x = (float)b;
		
		System.out.println(a); //5
		System.out.println(x); //5.2
		
		//String to integer
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		
		//Integer to string
		
		int q  = 20;
		String p = String.valueOf(q);
		System.out.println(p);

	}

}

