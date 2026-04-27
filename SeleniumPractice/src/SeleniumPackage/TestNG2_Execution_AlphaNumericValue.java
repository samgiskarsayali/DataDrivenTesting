package SeleniumPackage;

import org.testng.annotations.Test;

public class TestNG2_Execution_AlphaNumericValue {
	
	//In TestNG , execution occurs in alphanumeric order depending on method name,
	//that is - a,a1,a2..,b,b1,b2,...
	
	@Test
	public void a() {
		System.out.println("a");
	}
	
	@Test
	public void b() {
		System.out.println("b");
	}
	
	@Test
	public void a1() {
		System.out.println("a1");
	}
	
	@Test
	public void b4() {
		System.out.println("b4");
	}
	
	@Test
	public void z() {
		System.out.println("z");
	}
	
	@Test
	public void b2() {
		System.out.println("b2");
	}

}
