package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(2000);
		

		driver.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");

		driver.findElement(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"]")).click();
		Thread.sleep(2000);
		
		//Home checbox Will tick all the checkbox -- xpath taken from selectors hub
		driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']")).click();
		Thread.sleep(2000);
		
		//Home checbox Will untick all the checkbox  -- xpath taken from selectors hub
		driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']//*[name()='path' and contains(@d,'M19 3H5c-1')]")).click();
		Thread.sleep(2000);
		
		//selecting checkbox of desktop
		driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']")).click();
		Thread.sleep(2000);
		
		//selecting checkbox of desktop
		driver.findElement(By.xpath("//label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg']")).click();
		Thread.sleep(2000);
		
		//we cannot select the download checkbox as it seems disabled. So this won't work
		driver.findElement(By.xpath("//body/div[@id='fixedban']/div/div[1]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		System.out.println("Test case executed successfully");
		
	}

}
