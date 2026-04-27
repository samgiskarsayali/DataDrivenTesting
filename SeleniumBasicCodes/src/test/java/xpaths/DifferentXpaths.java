package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentXpaths {

	/*
	 * This is the ultimate XPath cheat sheet, covering: 
	 * ✅ Basic XPath 
	 * ✅Attribute-based XPath
	 * ✅ Text-based XPath 
	 * ✅ Logical operators 
	 * ✅ Functions (starts-with, contains, ends-with, normalize-space, etc.)
	 * ✅ XPath axes (parent, following, preceding, sibling, etc.)
	 * ✅ Indexing 
	 * ✅ Multiple attribute matching 
	 * ✅ Dynamic XPath patterns
	 * ✅ Custom scenarios
	 */

	
	WebDriver driver;
	
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	public void absXpath() {
		//Not Recommended
		By AbsXpathlocator = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/input[1]");
	}
	
	public void relXpath() {
		By RelativeXpathType = By.xpath("//input[@type=\"text\"]"); 
		By RelativeXpathName = By.xpath("//input[@name=\"username\"]");
		By RelativeXpathID = By.xpath("//input[@id=\"username\"]");
	}
	
	public void MultipleAttribute() {
		//Multiple attribute using AND
		By And = By.xpath("//input[@type = 'text' and @name='username']");
		
		//Multiple attribute using OR
		By OR = By.xpath("//input[@type = 'text' or @id = 'username']");
	}
	
	public void UsingContains() {
		By UsingContains = By.xpath("//input[contains(@id,'password')]");
		By usingcontains = By.xpath("//button[contains(@id,'submit')]");
	}
	
	public void UsingStartsWith() {
		By usingStartsWith = By.xpath("//button[starts-with(@class,'btn')]");
		By usingStartsWith2 = By.xpath("//button[starts-with(@class,'btn') and contains(@id,'submit')]");
	}
	
	public void wildCard() {
		By wildCard = By.xpath("//*[id=\'username\']");
	}
	
	public void normalizeSpace() {
		By normalizeSpace = By.xpath("//button[normalize-space(text())='Submit']");
	}
	
	public void allXpathsForButtonDOM() {
		By id = By.xpath("//button[@id='submit']");
		By Usingclass = By.xpath("//button[@class='btn']");
		By BothAttribute = By.xpath("//button[@id='submit' and @class='btn']");
		By WildCard = By.xpath("//*[@id='submit']");
		
		By ExactTextMatch = By.xpath("//button[text()='Submit']");
		By containsOnText = By.xpath("//button[contains(text(),'Submit')]");
		By startsWithOnText = By.xpath("//button[starts-with(text(),'Sub')]");
		By normalizeSpace = By.xpath("//button[normalize-space(text())='Submit']");
		By DotForText = By.xpath("//button[.='Submit']");
		By UsingIndex = By.xpath("//button[1]"); // NOT a good or reliable XPath for selecting the Submit button in your DOM.
	}
	
	
}
