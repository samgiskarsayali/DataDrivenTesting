package SeleniumPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Instead of importing all the annotations , we can simply put * and all the annotations will get imported.
//import org.testng.annotations.*;

public class TestNG3_OtherAnnotations {
	
	@BeforeClass
	public void FB004() {
		System.out.println("@BeforeClass Annotation");
	}
	@Test
	public void FB001() {
		System.out.println("@Test Annotation");
	}
	
	@AfterMethod
	public void FB002() {
		System.out.println("@AfterMethod Annotation");
	}
	
	@BeforeSuite
	public void FB003() {
		System.out.println("@BeforeSuite Annotation");
	}
	
	@AfterClass
	public void FB005() {
		System.out.println("@AfterClass Annotation");
	}
	
	@AfterSuite
	public void FB006() {
		System.out.println("@AfterSuite Annotation");
	}
	
	@BeforeMethod
	public void FB007() {
		System.out.println("@BeforeMethod Annotation");
	}
	
	@AfterTest
	public void FB008() {
		System.out.println("@AfterTest Annotation");
	}
	
	@BeforeTest
	public void FB009() {
		System.out.println("@BeforeTest Annotation");
	}
	
	
	

}
