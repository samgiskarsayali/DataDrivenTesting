package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG_Practice2 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSAMGISK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

	}

}
