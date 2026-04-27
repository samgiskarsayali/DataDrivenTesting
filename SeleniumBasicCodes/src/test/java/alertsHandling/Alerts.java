package alertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeMethod
	public void OpenURL() {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void HandleAlert() {
		
		
		WebElement JSAlert = driver.findElement(By.xpath("//button[text() = \"Click for JS Alert\"]"));
		JSAlert.click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());  //I am a JS ALert.
		alert1.accept(); //OK
		
		
		driver.findElement(By.xpath("//button[text() = \"Click for JS Confirm\"]")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss(); //Cancel
		
		WebElement JSPrompt = driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]"));
		JSPrompt.click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("ASHH");
		alert3.accept();
		
		WebElement Result = driver.findElement(By.xpath("//p[@id=\"result\"]"));
		System.out.println(Result.getText());
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
