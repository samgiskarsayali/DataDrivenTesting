package UdemyJavaSeleniumCourse;

public class ReturnMethod {

	public static void main(String[] args) {
		String greeting = getGreeting();
		System.out.println(greeting);
					//OR
		System.out.println(getGreeting());
		
		int add = addNum(5,5);
		System.out.println(add);
		
	}
	
	
	public static String getGreeting() {
		return "Hello from Method , returning message";
	}
	
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}

}
