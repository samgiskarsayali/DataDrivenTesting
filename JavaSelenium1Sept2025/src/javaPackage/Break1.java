package javaPackage;

public class Break1 {

	public static void main(String[] args) {

		//Print 0 -9 using for loop , when i becomes 5, stop execution
		
		for(int i = 0 ; i<=9 ; i++) {
			
			//if statement , to be used to break flow.
			
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

}
