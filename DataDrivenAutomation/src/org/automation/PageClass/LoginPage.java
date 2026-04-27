package org.automation.PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;  //class level object of webdriver -- Global object
	WebDriverWait wait; //Explicit wait object
	
	public LoginPage(WebDriver driver)  //Constructor with local object of webdriver passed
	{
		this.driver = driver; //driver initialization....assigning local webdriver driver object to the gloabl object.
								//So that it can be used in all methods.
		this.wait = new WebDriverWait(driver, 20); //Initialize WebDriverWait with 20 seconds timeout for reliable element detection
	}
	
	//Locators
	
	//Use By locators, not WebElement at class level
	//Do not use this method--- 
	//WebElement loginPage_password_id = driver.findElement(By.id("password"));
	/*Important Notes
	 * This runs before the constructor sets this.driver, meaning:
		driver is null at class loading time
		so driver.findElement() throws NullPointerException
	 */
	
	private By username = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.xpath("//button[@id='submit']");
	
	
	//Actions for the locators
	
	public void enterUsername(String name) 
	{
		//Wait until username field is visible before entering text
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		driver.findElement(username).sendKeys(name);
	}
	
	public void enterPassword(String pass) 
	{
		//Wait until password field is visible before entering text
		wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() 
	{
		//Wait until login button is visible and clickable before clicking
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		driver.findElement(loginButton).click();
	}

}
