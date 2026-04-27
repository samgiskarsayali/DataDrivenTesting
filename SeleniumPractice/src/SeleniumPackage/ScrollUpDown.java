package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name = \"search_query\"]")).sendKeys("afsos");
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//1. Scroll to the bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		

	}

}
