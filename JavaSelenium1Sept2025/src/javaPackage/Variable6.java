package javaPackage;

public class Variable6 {

	//pre defined main method
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6}; //int type array
		String s[] = {"Java", "Selenium", "Hello"}; //String type array
		
		//Object can hold all types of data type inside an arrray
		Object b[] = {0,1,2,'c','e',"Hello", 3>10 };
		
		System.out.println(b[4]); //e
		System.out.println(b[5]); //Hello
		System.out.println(b[0]); //0
		System.out.println(b[6]); //false
		
		java(); //Calling java method inside the main method

	}
	
	//user defined method
	public static void java() {
		String z = "Value from user defined method"; //Local Variable
		System.out.println(z); 
		//If the user defined java method is not called inside the main method,it will never get executed 
		
	
	}

}
