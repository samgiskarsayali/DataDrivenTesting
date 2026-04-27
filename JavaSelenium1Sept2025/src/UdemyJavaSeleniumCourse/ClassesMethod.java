package UdemyJavaSeleniumCourse;

public class ClassesMethod {

	public static void main(String[] args) {
		
		System.out.println("Hello from ClassesMethod which has main menthod");
		
		//Creating the instance of the other class .
		ClassesMethod1 C1 = new ClassesMethod1();
		C1.Hello();
	     
		//Creating the instance of the other class .
	     Messenger m1 = new Messenger();
	     m1.sendMessage();
		

	}

}
