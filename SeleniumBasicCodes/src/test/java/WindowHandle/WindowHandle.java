package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	
	WebDriver driver;

	@Test
	public void handleMultipleWindows() {
		
		//Launch Browser
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//Stores the current window ID
		String parentWindow = driver.getWindowHandle();
		
		// Click on button to open a new window
		driver.findElement(By.xpath("//*[normalize-space(text())='click']"));
		
		//Get all window handles ID
		//We use Set , bcz set stores all unique ID.
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		 // Loop through windows
		for(String window : allWindowHandles)
		{
			if(!window.equals(parentWindow)) 
			{
				// Switch to child window
				driver.switchTo().window(window);
				
				System.out.println("Child Window Title: " + driver.getTitle());
				
				//Perform some action on child window.
				WebElement searchBox = driver.findElement(By.xpath("//span[text() = 'Search']"));
				searchBox.click();
				
				//Close the child window
				driver.close();
			}
		}
		
		//Switch to parent window.
		driver.switchTo().window(parentWindow);
		
		System.out.println("Parent window Title: "+driver.getTitle());
		
		// Continue test in parent window
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		driver.quit();
		
		
	}

}
