package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoanPage;

public class LoanTest extends BaseTest {
	
	@Test
	
	public void testEligibleUser() {
		LoanPage loanpage = new LoanPage(driver);
		
		//loanpage.enterName("John");
        loanpage.enterAge("25");
        loanpage.enterIncome("40000");
        loanpage.enterEmi("10000");
        loanpage.enterCreditScore("750");
        loanpage.clickCheckEligibility();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        String actualResult = loanpage.getResult();
        System.out.println("Actual Result is: " + actualResult);
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Assert.assertEquals(actualResult, "Eligible");
    }
	
	@Test
    public void testNotEligibleUser() {

        LoanPage loanPage = new LoanPage(driver);

        //loanPage.enterName("Tom");
        loanPage.enterAge("18");
        loanPage.enterIncome("15000");
        loanPage.enterEmi("15000");
        loanPage.enterCreditScore("500");
        loanPage.clickCheckEligibility();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        String actualResult = loanPage.getResult();
        System.out.println("Actual Result is: " + actualResult);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Assert.assertEquals(actualResult, "Not Eligible");
    }

}
