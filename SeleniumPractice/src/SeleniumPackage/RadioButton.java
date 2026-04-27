package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		
		driver.findElement(By.xpath("//label[@for = 'yesRadio']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		Thread.sleep(2000);
		
		//No radio button is disabled on the page , so we can't see it getting selected.
		driver.findElement(By.xpath("//label[@for='noRadio']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		System.out.println("Test case executed successfully");
		

	}

}
