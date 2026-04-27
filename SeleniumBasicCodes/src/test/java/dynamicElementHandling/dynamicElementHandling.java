package dynamicElementHandling;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dynamicElementHandling {
	WebDriver driver;	
	WebDriverWait wait;
	JavascriptExecutor js;
	
	
	@BeforeMethod
	public void OpenBrowser() 
	{
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
				
	}
	
	
	
	@Test
	public void HandleDynamicElement() { //This test will run thrid , bcz method name starts with H
				
		js.executeScript("window.scrollBy(0,600)");
		
		By locator = By.xpath("(//a[contains(text(),'Sanghvi Brands')])");
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		WebElement firstWebElement = driver.findElement(locator);
		firstWebElement.click();
		
	}
	
	@Test
	public void DynamicElementWithStartsWith(){  //This test will run Second , bcz method name starts with D
		
		js.executeScript("window.scrollBy(0,600)");
		By startsWithLocator = By.xpath("//a[starts-with(text(),'Amba')]");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(startsWithLocator)); 
		WebElement SomeWebElement = driver.findElement(startsWithLocator);
		SomeWebElement.click();
	
	}
	
	@Test
	public void ContainDynamicElement() {  //This test will run first , bcz method name starts with C
		js.executeScript("window.scrollBy(0,1000)");
		By locator = By.xpath("//a[contains(@Href,'HLV-Ltd/16560006')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement HLV = driver.findElement(locator);
		HLV.click();
		
		//Using Simple Text()
		//By locator = By.xpath("//a[text()='HLV']");
		
		//Using starts-with() on text
		//By locator = By.xpath("//a[starts-with(text(),'HLV')]");
		
		//Combine both text & href for stronger matching
		//By locator = By.xpath("//a[text()='HLV' and contains(@href,'HLV-Ltd')]");
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
