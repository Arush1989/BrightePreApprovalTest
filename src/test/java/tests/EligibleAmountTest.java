/**
 * 
 */
package test.java.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import test.java.pages.EligibilityPage;
import test.java.pages.HomePage;
import test.java.pages.HouseholdDetailsPage;
import test.java.pages.PersonalDetailsPage;

/**
 * @author Arush_Pushkarna
 *
 */
public class EligibleAmountTest {

	WebDriver driver;

	HomePage homePage = new HomePage();
	PersonalDetailsPage personalDetails = new PersonalDetailsPage();
	HouseholdDetailsPage householdDetails = new HouseholdDetailsPage();
	EligibilityPage eligibilityDetails = new EligibilityPage();

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void startBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Temp\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		homePage.loadHomePage(this.driver);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void EligibleAndRepaymentAmountTest() throws InterruptedException {

		/* Entering personal details */
		personalDetails.getName(driver).sendKeys("Brock Lesner");
		personalDetails.getMobileNumber(driver).sendKeys("044444444");
		personalDetails.getEmailAddress(driver).sendKeys("brock.lesner@wwe.com");
		personalDetails.getContinueButton(driver).click(); // Clicking on Continue button to move to Expense Details
															// page

		/* Waiting for Expense details page to load */
		Wait wait = new WebDriverWait(this.driver, 3000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/p[1]")));

		/* Entering household details */
		householdDetails.getMaritalStatusDropdown(driver).click();
		householdDetails.selectMaritalStatusFromDropdown(driver, "Married");
		Thread.sleep(1000);
		householdDetails.getDependantsDropdown(driver).click();
		householdDetails.selectDependantsFromDropdown(driver, "2");
		Thread.sleep(1000);

		/* Entering Income details */
		householdDetails.getBaseNetIncomeFrequencyDropdown(driver).click();
		householdDetails.selectFrequencyForBaseNetIncome(driver, "Fortnightly");
		householdDetails.getBaseNetIncome(driver).sendKeys("3000");
		Thread.sleep(1000);
		householdDetails.getPartnersBaseNetIncomeFrequencyDropdown(driver).click();
		householdDetails.selectFrequencyForPartnersBaseNetIncome(driver, "Fortnightly");
		householdDetails.getPartnersBaseNetIncome(driver).sendKeys("2500");
		Thread.sleep(1000);
		householdDetails.getOtherHouseholdNetIncomeFrequencyDropdown(driver).click();
		householdDetails.selectFrequencyForOtherHouseholdNetIncome(driver, "Fortnightly");
		householdDetails.getOtherHouseholdNetIncome(driver).sendKeys("500");
		Thread.sleep(1000);

		/* Entering Expense details */
		householdDetails.getHomeMortgageRepaymentFrequencyDropdown(driver).click();
		householdDetails.selectFrequencyForHomeMortgageRepayment(driver, "Fortnightly");
		householdDetails.getHomeMortgageRepayment(driver).sendKeys("300");
		Thread.sleep(1000);
		householdDetails.getOtherLoadCommitmentsFrequencyDropdown(driver).click();
		householdDetails.selectFrequencyForOtherLoanCommitments(driver, "Fortnightly");
		householdDetails.getOtherLoanCommitments(driver).sendKeys("250");
		Thread.sleep(1000);
		householdDetails.getHouseholdCreditCardLimit(driver).sendKeys("15000");
		householdDetails.getHouseholdLivingCostsFrequencyDropdown(driver).click();
		householdDetails.selectFrequencyForHouseholdLivingCosts(driver, "Fortnightly");
		householdDetails.getHouseholdLivingCosts(driver).sendKeys("1000");
		Thread.sleep(1000);

		/* Clicking Calculate Limit button */
		householdDetails.getCalculateLimitButton(driver).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/h4")));

		/* Asserting the Eligible Amount */
		String eligibleAmount = eligibilityDetails.getEligibleAmount(driver).getText();
		Assert.assertEquals(eligibleAmount, "$15,000.00*");

		/* Asserting the maximum re-payment amount */
		String maximumRepaymentAmount = eligibilityDetails.getMaximumRepaymentAmount(driver).getText();
		Assert.assertEquals(maximumRepaymentAmount, "578.93");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}

}
