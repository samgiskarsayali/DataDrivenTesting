package tests;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	@Test
	public void addnumber() {
		
		Calculator c1 = new Calculator();
		int result = c1.add(15, 20);
		
		assertEquals(35, result);
		System.out.println("Expected is 35 and Actual Result is " + result +  " - Test passed ");
		
	}
	
	@Disabled("reason")
	public void subtractnum() {
		
		Calculator c1 = new Calculator();
		int result = c1.subtract(50, 5);
		assertEquals(45, result);
		System.out.println("Expected is 45 and Actual Result is " + result +  " - Test passed ");
		
	}

}
