package oopsPackage;

public class Pen {

	String color;
	String type;

	public void write() {
		System.out.println("writing");
	}

	public void displayPenDetails() {
		System.out.println("The color is the pen is " + color + " and the type of the pen is " + type);
	}
	
	public void printColor() {
		System.out.println(this.color); //this keyword in the method helps you to return the color using object called.
	}

}
