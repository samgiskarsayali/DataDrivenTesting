package oopsPackage;

public class Constructor1 {

	// Non-parameterized constructor
	Constructor1() {
		System.out.println("Non-parameterized constructor is called");
	}

	
	//Parameterized constructor
	
	String name;
	int age;

	Constructor1(String a, int x) {
		name = a;
		this.age = x;

		System.out.println("Paramterized constructor ==> "+ a + "  " + x);
		

	}

	public static void main(String[] args) {

		// Creating the object means calling the constructor
		Constructor1 c1 = new Constructor1(); //Non-parameterized constructor
		Constructor1 c2 = new Constructor1("Conrad", 20); //Parameterized constructor

	}

}
