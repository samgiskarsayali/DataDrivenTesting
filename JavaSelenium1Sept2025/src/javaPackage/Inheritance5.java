package javaPackage;

public class Inheritance5 extends Inheritance4 {

	public static void main(String[] args) {
		
		Inheritance5 i5 = new Inheritance5();
		
		//you can directly pass value inside the bracket or you can define the values and then run.
		
		// one - way
		System.out.print("One way to print value by directly passing values in bracket ");
		i5.add(10, 20);
		
		
		
		//other way
		System.out.println("other way to print value by defining the values first and then calling the method ");
		int x = 10;
		int y = 20;
		
		i5.add(x, y);
		i5.sub(x, y);
		
		//Because the method is static, we are using class name to call the method
		Inheritance4.multiply(x, y);  
		Inheritance5.multiply(x, y); 
		
		//You can call directly using method name
		multiply(x,y);
		
		//You can call using object ref name also
		i5.multiply(x, y);
	 	
		
		
		
		

	}

}
