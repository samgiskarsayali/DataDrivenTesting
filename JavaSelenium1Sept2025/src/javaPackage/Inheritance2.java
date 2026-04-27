package javaPackage;

public class Inheritance2 extends Inheritance1 {
			//child class			//Parent class
	int z= 100;

	public static void main(String[] args) {
		
		Inheritance2 i2 = new Inheritance2();
		System.out.println(i2.z); //From Inheritance2
		System.out.println(i2.d); //From Inheritance1 
		
		
		

	}

}
