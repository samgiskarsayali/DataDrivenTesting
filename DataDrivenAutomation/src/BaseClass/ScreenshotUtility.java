package BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * ScreenshotUtility Class
 * This class implements the TakeScreenshot interface
 * It provides functionality to capture and save screenshots of failed tests
 */
public class ScreenshotUtility implements TakeScreenshot {
	
	private WebDriver driver;
	private String screenshotPath = "./screenshots/TestFailed/";
	
	/**
	 * Constructor to initialize the ScreenshotUtility with WebDriver
	 * 
	 * @param driver - WebDriver instance
	 */
	public ScreenshotUtility(WebDriver driver) {
		this.driver = driver;
		createScreenshotDirectory();
	}
	
	/**
	 * Creates the screenshot directory if it doesn't exist
	 */
	private void createScreenshotDirectory() {
		File directory = new File(screenshotPath);
		if (!directory.exists()) {
			directory.mkdirs();
			System.out.println("Screenshot directory created at: " + screenshotPath);
		}
	}
	
	/**
	 * Captures a screenshot and saves it with the test name and timestamp
	 * 
	 * @param testName - The name of the test case
	 * @throws IOException - In case of any IO exceptions
	 */
	@Override
	public void captureScreenshot(String testName) throws IOException {
		try {
			// Generate timestamp for unique filename
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss-SSS");
			String timestamp = now.format(formatter);
			
			// Create screenshot filename
			String screenshotName = testName + "_" + timestamp + ".png";
			String fullPath = screenshotPath + screenshotName;
			
			// Cast WebDriver to TakesScreenshot and capture screenshot
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			// Copy screenshot to destination
			File destFile = new File(fullPath);
			org.openqa.selenium.io.FileHandler.copy(srcFile, destFile);
			
			System.out.println("Screenshot captured successfully: " + fullPath);
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
