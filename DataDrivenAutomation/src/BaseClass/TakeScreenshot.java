package BaseClass;

import java.io.IOException;

/**
 * TakeScreenshot Interface
 * This interface defines the contract for taking screenshots in test automation
 * It provides a method to capture and store screenshots when test cases fail
 */
public interface TakeScreenshot {
	
	/**
	 * Captures a screenshot and saves it to the specified location
	 * 
	 * @param testName - The name of the test case
	 * @throws IOException - In case of any IO exceptions
	 */
	public void captureScreenshot(String testName) throws IOException;
	
}
