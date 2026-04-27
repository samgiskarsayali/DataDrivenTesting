package UdemyJavaSeleniumCourse;

public class Variables {
	
	//This static variable can be called inside an any method.
	static String classLevelVariable = "Hello from class level variable";

	public static void main(String[] args) {
		
		String name = "Tom";
		int number = 10;
		boolean isJavaFun = true;
		
		System.out.println(name);
		System.out.println(number);
		System.out.println(isJavaFun);
		
		//As the method is static , no need to create the object
		displayMessage();    //This is a local variable inside methode
							//Hello from class level variable 
		//class level static variable
		System.out.println(classLevelVariable);
	}
	
	public static void displayMessage() {
		String localvariable = "This is a local variable inside methode";
		System.out.println(localvariable);
		
		//class level static variable
		System.out.println(classLevelVariable);
	}

}
