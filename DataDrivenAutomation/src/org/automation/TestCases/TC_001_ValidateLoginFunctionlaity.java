package org.automation.TestCases;

import org.automation.PageClass.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseTest;

public class TC_001_ValidateLoginFunctionlaity extends BaseTest {

	LoginPage lp;

	@BeforeMethod
	public void setUpPageObjects() {
		lp = new LoginPage(driver);
	}

	// Valid Credential tc
	@Test
	public void tc_002_validateLoginFunctionality() {
		// Called the constructor from LoginPage to use driver and the web element and
		// actions .

		//lp = new LoginPage(driver);

		lp.enterUsername("student");
		lp.enterPassword("Password123");
		lp.clickLogin();
	}

	// Making use on Data from DataProvider here
	@Test(dataProvider = "Static")
	public void tc_001_LoginFunctionalityWithInValidCredential(String uname, String pass) {
		lp.enterUsername(uname);
		lp.enterPassword(pass);
		lp.clickLogin();

	}

	// Data that is going to use in testcase.
	@DataProvider(name = "Static")
	public Object[][] testData() {

		Object[][] data = { { "Sam", "SamPassword" }, { "Tom", "TomPassword" }, { "Belly", "BellyPassword" } };
		return data; // whenever we are returing some data, the method should be not void
						// but the type of data it is returning.

	}

}
