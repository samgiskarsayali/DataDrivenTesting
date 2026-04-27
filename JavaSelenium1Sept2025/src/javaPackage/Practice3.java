// Constructor practice program

package javaPackage;

public class Practice3 {
	String name;
	int Mob;
	String city =  "Dombivli";
	
	String company;
	String location;
	
	//Constructor is created outside method with two parameters passed
	Practice3(String s , int a){
		name = s;
		Mob = a;
		
	}
	
	//Created Constructor
	Practice3(String x, String y){
		company =  x;
		location = y;
		
	}
	
	
	
	public void getResult() { 
		System.out.println(name+","+Mob+","+city);
		
	}
	
	public void getResult1() {
		System.out.println(company+" "+location);
	}
	
	

	public static void main(String[] args) {
		Practice3 p = new Practice3("Belly" , 12345);
		Practice3 p1 = new Practice3("Conrad" , 67890);
		
		Practice3 p2 = new Practice3("Capgemini","Airoli");
		
		p1.getResult(); //Conrad,67890,Dombivli
		p.getResult();  //Belly,12345,Dombivli
		p2.getResult1(); //Capgemini Airoli
		
		
		
	}
	
	


}
