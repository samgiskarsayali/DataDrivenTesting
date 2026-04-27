package javaPackage;

public class MethoOverload4 extends MethodOverload3 {

	public static void main(String[] args) {

		// Using sysout statement so that the values get printed on console bcz in that
		// method we have returned the value and not printed the value
		System.out.println(MethodOverload3.add(1, 2, 3));
		
		//Not using sysout statement, bcz the sysout statement is already present for this method
		MethodOverload3.add(2, 3);

	}

}
