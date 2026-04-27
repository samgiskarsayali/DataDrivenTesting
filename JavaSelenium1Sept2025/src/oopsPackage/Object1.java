package oopsPackage;

public class Object1 extends Pen {

	public static void main(String[] args) {
		
		Pen p1 = new Pen(); //Creating the object
		p1.write(); //Calling the non - static method from the Pen class
		
		p1.color = "Blue"; //Assigning the value to the global variable
		p1.type = "gel"; //Assigning the value to the global variable
		p1.displayPenDetails(); //Calling the non - static method from the Pen class
		
		Pen p2 = new Pen();
		p2.color = "Black";
		p1.printColor(); 
		p2.printColor();
		

	}

}
