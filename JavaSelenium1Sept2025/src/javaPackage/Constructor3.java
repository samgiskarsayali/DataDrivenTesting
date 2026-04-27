package javaPackage;

public class Constructor3 {

	Constructor3() {
		System.out.println("No argument constructor");
	}

	Constructor3(int a) {
		System.out.println("Int argument constructor");
	}

	Constructor3(String b) {
		System.out.println("String argument constructor");
	}

	Constructor3(int a, int b) {

		// a = 1;
		// b = 10;
		System.out.println("Inside the parameterized constructor having for loop in it.");
		for (int x = a; x <= b; x++) {
			System.out.println(x);
		}
		
	}

	// Main method
	public static void main(String[] args) {

		Constructor3 c3 = new Constructor3(); // Default Constructor
		Constructor3 c4 = new Constructor3(4); // Parameterized constructor with int argument
		Constructor3 c5 = new Constructor3("heyy"); // Parameterized constructor with string argument

		Constructor3 c6 = new Constructor3(10, 15); // parametrized constructor having for loop inside.

	}

}
