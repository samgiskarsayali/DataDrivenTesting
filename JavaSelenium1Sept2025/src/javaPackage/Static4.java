package javaPackage;

public class Static4 {
	
	int roll; //Declaring a Global variable
	String name; //Declaring a Global variable
	static String college = "IIT Delhi"; //Defining a static variable

	// Creating Constructor
	Static4(int r , String n){  //did not pass college here, because it is already defined and it is static
		roll = r;
		name = n;		
	}
	
	
	//user-defined non static method
	public void getResult() {
		System.out.println(roll + " " + name + " " + college );
	}
	
	
	public static void main(String[] args) {
		
	//Constructor is invoked or called when the object of the class is created. 
	//So when the object is created , constructor being having same name as class, 
	//we need to pass the values that is defined in constructor created 
		
		Static4 s4 = new Static4(1,"John");
		Static4 s5 = new Static4(2,"Belly");
		Static4 s6 = new Static4(3,"Tay");
		
		s4.getResult();
		s5.getResult();
	}

}
