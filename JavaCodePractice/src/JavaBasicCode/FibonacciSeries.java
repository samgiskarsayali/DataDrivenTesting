package JavaBasicCode;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a = 0 , b = 1, n = 10;
		System.out.print("Fibonacci: " + a + " " + b);
		
		for(int i = 2; i < n ; i++ ) {
			int next = a + b;
			System.out.print(" "+ next);
			 a = b;
			 b = next;
			 
		}
	}

}
