package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 600);");
		
		List<WebElement> a = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td"));
		
	    a.get(1).click();
	    Thread.sleep(2000);
	    
	    //Using text method to create the xpath
	    
	    //driver.findElement(By.xpath("//a[text()='Ranjit Securities Lt']")).click();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    System.out.println("Total companies listed are -; " + a.size());
	    
	    
	  //To print the company name at 0th index position
	    System.out.println(a.get(0).getText()); 
	    
	    
	    //To print all the company names.
	    for(int i = 591; i <= a.size(); i++) {
	    	System.out.println(a.get(i).getText());
	    }
	
		driver.quit();
	}

}
