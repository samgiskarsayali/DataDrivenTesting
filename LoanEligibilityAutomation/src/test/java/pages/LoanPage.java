package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoanPage {

	WebDriver driver;

    public LoanPage(WebDriver driver) {
        this.driver = driver;
	        
	        /*
	         * this.driver → class variable

			   driver → constructor parameter

			   So this line means:

     		   “Take the driver coming from test class and store it inside this page class.”
	         */
	    }

	    // Locators
	    //By nameField = By.id("name");
	    By ageField = By.id("age");
	    By incomeField = By.id("income");
	    By employmentDropdown = By.id("employment");
	    By emiField = By.id("emi");
	    By creditScoreField = By.id("credit");
	    By checkButton = By.id("checkBtn");
	    By resultText = By.id("result");
	    
	    

	    // Actions
//	    public void enterName(String name) {
//	        driver.findElement(nameField).sendKeys(name);
//	    }

	    public void enterAge(String age) {
	        driver.findElement(ageField).sendKeys(age);
	    }

	    public void enterIncome(String income) {
	        driver.findElement(incomeField).sendKeys(income);
	    }
	    
	    public void enterEmi(String emi) {
	        driver.findElement(emiField).sendKeys(emi);
	    }

	    public void enterCreditScore(String creditScore) {
	        driver.findElement(creditScoreField).sendKeys(creditScore);
	    }

	    public void clickCheckEligibility() {
	        driver.findElement(checkButton).click();
	    }

	    public String getResult() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(resultText));

	        return driver.findElement(resultText).getText();
	       
	    }

}
