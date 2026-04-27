package BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.automation.TestNGworld.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class BaseTest {
	
	public WebDriver driver; //it is a class member so can be used in any method and 
							//also public, so that it can be used in any package.
	
	protected ScreenshotUtility screenshotUtility; //Screenshot utility object 
	
	@BeforeMethod
	public void openBrowser() throws IOException 
	{
		//We are taking the value from the config.properties file.
		
		/*
		 * Utility.fetchProperty("browserName") = Reading the data from the property file
		 * .toString() = Converting the data to the strong format bcz it was object only.
		 * .equalsIgnoreCase("chrome") = Comparing with chromee.
		 */
		
		if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver(); // creating the obj of chrome driver
		}
		else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver(); // creating the obj of gecko driver
		} 
		else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", "./Driver/internetexplorerdriver.exe");
			driver = new InternetExplorerDriver(); // creating the obj of IE driver
		} 
		else { //if no browser is mentioned, open chromebrowser.
			driver = new ChromeDriver(); 
		}
		
		driver.get(Utility.fetchProperty("applicationURL").toString());
		
		// Set implicit wait of 15 seconds for all elements
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Wait for page to load - set page load timeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		// Initialize ScreenshotUtility after driver is ready
		screenshotUtility = new ScreenshotUtility(driver);
		
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult result) throws IOException {
		
		// Check if the test failed
		if (result.getStatus() == ITestResult.FAILURE) {
			// Capture screenshot with test name
			screenshotUtility.captureScreenshot(result.getName());
			System.out.println("Test Failed: " + result.getName() + " - Screenshot captured!");
		}
		
		driver.quit();
		
	}

}
