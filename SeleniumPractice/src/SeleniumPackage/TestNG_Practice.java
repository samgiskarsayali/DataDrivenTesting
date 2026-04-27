package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Practice {
	
	protected static WebDriver driver;
	
	
	@BeforeSuite
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.pluralsight.com/id");
	}
	
	@Test
	public void Signup() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space(text())= 'Sign in with company or school']")).click();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void FillInformation() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("capgemini.com");
		Thread.sleep(2000);	
	}
	
	
	@Test
	public void SignInButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	@Test
	public static void DashBoard() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@AfterSuite
	public void CloseWindow() {
		driver.quit();

	}

}
