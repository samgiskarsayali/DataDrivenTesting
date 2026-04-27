import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class OpenURL {

	public static void main(String[] args) {
		
		String ChromeTitle = URL("https://capgemini.udemy.com/");
		System.out.println("Chrome Title is " + ChromeTitle);
		

	}
	
	
	public static String URL(String url) {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String title = driver.getTitle();
		driver.quit();
		return title;
		
	}
	
	

}
