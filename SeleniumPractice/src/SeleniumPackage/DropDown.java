package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1200);");
		
		driver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]")).click();
		Thread.sleep(2000);
		
		List<WebElement> a = driver.findElements(By.xpath("//div[@class='dropdown-menu']/a"));
		System.out.println(a.size());
		
		
		
		driver.quit();
		
	}

}
