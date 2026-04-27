package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/SSAMGISK/Desktop/loan.html"); 
        Thread.sleep(5000);
        
	}
	
	@AfterMethod
	public void tearDown() {

        driver.quit();
    }
	

}
