package SeleniumPackage;

import org.testng.annotations.Test;

//We can consider it as a TestNG framework as it has multiple test cases
public class TestNG1 {

	// 1st Test Case
	@Test
	public void FB1_Login() {
		System.out.println("Hello Login Page");
	}

	// 2nd Test Case
	@Test
	public void FB2_Dashboard() {
		System.out.println("Hello facebook dashboard");
	}

	// 3rd Test Case
	@Test
	public void FB3_CreateAccount() {
		System.out.println("Create new account");
	}

	// 4th Test Case
	@Test
	public void FB4_ForgetPassword() {
		System.out.println("Change the password");
	}

}
