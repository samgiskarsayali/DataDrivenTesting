package javaPackage;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int i = 5;
		System.out.println(i++); //It will print 5 and 6 will be stored in RAM
		System.out.println(i);
		
		int a = 1;
		System.out.println(a++); //Printed --> 1 , Stored in RAM -->2
		System.out.println(a); //Printed --> 2 , Stored in RAM -->2 
		System.out.println(a++); //Printed -->2 , Stored in RAM -->3
		System.out.println(++a); // Printed -->4, Stored in RAM -->4

		
	}

}
