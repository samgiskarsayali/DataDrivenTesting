package oopsPackage;

public class Student1 extends Student {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.age = 20;
		s1.name = "Conrad";
		
		s1.PrintName();
		s1.printAge();
		s1.printInfo();
		
		Student s2 = new Student();
		
		s2.age = 19;
		s2.name = "Belly";
		
		s2.PrintName();
		s2.printAge();
		s2.printInfo();
		

	}

}
