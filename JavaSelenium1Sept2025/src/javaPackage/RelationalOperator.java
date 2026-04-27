package javaPackage;

public class RelationalOperator {

	public static void main(String[] args) {
		 int a = 200;
		 int b = 100;
		 
		 if(a != b) {
			 System.out.println("a is not equals to b");
		 }
		 else {
			 System.out.println("a is equals to b");
		 }
		 
		 String p = "HELLO";
		 String q = "hello";
		 
		 //== is used to compare numbers not strings
		 //Not recommended way to compare strings
		 if(p == q) {
			 System.out.println("p and q are equal strings");
		 }
		 else {
			 System.out.println("p and q are not equal strings");
		 }
		 
		 //Correct way to compare strings
		 if(p.equalsIgnoreCase(q)) {
			 System.out.println("p and q are same");
		 }
		 else {
			 System.out.println("p and q are not same");
		 }
		 

	}

}
