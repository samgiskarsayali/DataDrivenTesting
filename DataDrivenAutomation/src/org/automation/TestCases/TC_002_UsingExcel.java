package org.automation.TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.PageClass.LoginPage;
import org.datagenerators.DataGenerator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseTest;

public class TC_002_UsingExcel extends BaseTest {
	
	LoginPage lp;
	
	@BeforeMethod
	public void SetupPage() {
		lp = new LoginPage(driver);
	}
	
	@Test(dataProvider = "Excel", dataProviderClass = DataGenerator.class)
	public void tc_002_WithExcel(String username, String password) {
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLogin();
		
	}
	


}
