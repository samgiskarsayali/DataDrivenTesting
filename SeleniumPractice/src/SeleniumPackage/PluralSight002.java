package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PluralSight002 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.pluralsight.com/id/signin");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/id/signin/sso?redirectTo=']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Alias']")).sendKeys("abc.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
		driver.quit();
		
		
		

	}

}
