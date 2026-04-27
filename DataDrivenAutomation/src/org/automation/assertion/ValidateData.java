package org.automation.assertion;

import org.openqa.selenium.WebDriver;

public class ValidateData {

	public static boolean validatePageURL(WebDriver driver, String expectedURL) {

		boolean flag = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL)) {
			flag = true;
		}

		return flag;
	}
	
	
	//Another way to use assertion
	public static boolean validatePageTitle(WebDriver driver, String expectedTitle) {

		return (driver.getCurrentUrl().equalsIgnoreCase(expectedTitle));	
		
	}

}
