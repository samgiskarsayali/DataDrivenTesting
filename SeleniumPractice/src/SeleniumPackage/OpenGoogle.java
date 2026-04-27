package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@role=\"combobox\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@aria-label=\"Search for Images \"]")).click();

	}

}
