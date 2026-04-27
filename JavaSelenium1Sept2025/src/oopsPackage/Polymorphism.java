package oopsPackage;

public class Polymorphism {
	
	String name = "Jere";
	int age = 18;
	
	//Same name method for different purpose by passing different parameters.

	public void printInfo(String name) {
		System.out.println(name);
	}

	public void printInfo(int age) {
		System.out.println(age);
	}

	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		
		Polymorphism p1 = new Polymorphism();
		
		p1.printInfo(20);
		p1.printInfo("Conrad");
		p1.printInfo("Belly", 19); //Directly passing the value inside the parenthesis
		
		p1.printInfo(p1.name, p1.age); //using the global variable

	}

}
