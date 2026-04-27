/*Note: Mixing implicit and explicit/fluent waits can lead to unpredictable wait times. 
 * It’s generally better to choose explicit (or fluent) waits and keep implicit wait 
 * at 0 or a very small value. 
 * I’m including all three here only because you asked to see them together.
 */

//Not the part of project


package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class DifferentWaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();

			// 1) IMPLICIT WAIT — applies to all findElement/findElements calls
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

			driver.get("https://example.com/login");

			// 2) EXPLICIT WAIT — wait for a specific condition on a specific element
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait for username to be VISIBLE, then type
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			username.sendKeys("sayali@example.com");

			// Wait for password to be PRESENT in DOM, then type
			WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
			password.sendKeys("SecretPwd!");

			// Wait for Login button to be CLICKABLE, then click
			WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
			loginBtn.click();

			// 3) FLUENT WAIT — custom timeout, polling interval, ignored exceptions
			FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)) // maximum
																											// wait time
					.pollingEvery(Duration.ofMillis(500)) // check every 500ms
					.ignoring(NoSuchElementException.class); // ignore while polling

			// Example: wait for a dynamic toast message to appear and be visible
			WebElement toast = fluentWait.until(new Function<WebDriver, WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					WebElement el = d.findElement(By.cssSelector(".toast-success"));
					return el.isDisplayed() ? el : null; // return null to keep waiting
				}
			});

			System.out.println("Toast text: " + toast.getText());

			// Another explicit wait example: wait until URL contains "/dashboard"
			wait.until(ExpectedConditions.urlContains("/dashboard"));

		} finally {
			driver.quit();
		}
	}

}
