/**
 * 
 */
package test.java.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Arush_Pushkarna
 *
 */
public class HouseholdDetailsPage {



	public void scrollDown(final WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	
	/* Household details web elements and actions */
	public WebElement getMaritalStatusDropdown(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[2]/div/input"));
	}

	public void selectMaritalStatusFromDropdown(final WebDriver driver, String maritalStatus) {
		WebElement dropdownUl = driver
				.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[2]/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String status = maritalStatus;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(status)) {
				dropDownOption.click();
				break;
			}
		}
	}

	public WebElement getDependantsDropdown(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[3]/div/input"));
	}

	public void selectDependantsFromDropdown(final WebDriver driver, String numberOfDependants) {
		WebElement dropdownUl = driver
				.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[3]/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String dependants = numberOfDependants;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(dependants)) {
				dropDownOption.click();
				break;
			}
		}
	}

	/* Income details web elements and actions */
	public WebElement getBaseNetIncome(final WebDriver driver) {
		return driver.findElement(By.id("base-net-income-amount"));
	}

	public WebElement getBaseNetIncomeFrequencyDropdown(final WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[4]/div/span/div/input"));
	}

	public void selectFrequencyForBaseNetIncome(final WebDriver driver, String frequencyOfBaseNetIncome) {
		WebElement dropdownUl = driver
				.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[4]/div/span/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String frequency = frequencyOfBaseNetIncome;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(frequency)) {
				dropDownOption.click();
				break;
			}
		}
	}

	public WebElement getPartnersBaseNetIncome(final WebDriver driver) {
		return driver.findElement(By.id("partners-base-net-income-amount"));
	}

	public WebElement getPartnersBaseNetIncomeFrequencyDropdown(final WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[5]/div/div/span/div/input"));
	}

	public void selectFrequencyForPartnersBaseNetIncome(final WebDriver driver,
			String frequencyOfPartnersBaseNetIncome) {
		WebElement dropdownUl = driver.findElement(
				By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[5]/div/div/span/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String frequency = frequencyOfPartnersBaseNetIncome;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(frequency)) {
				dropDownOption.click();
				break;
			}
		}
	}

	public WebElement getOtherHouseholdNetIncome(final WebDriver driver) {
		return driver.findElement(By.cssSelector("#other-taxable-net-income-amount"));
	}

	public WebElement getOtherHouseholdNetIncomeFrequencyDropdown(final WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[6]/div/span/div/input"));
	}

	public void selectFrequencyForOtherHouseholdNetIncome(final WebDriver driver,
			String frequencyOfOtherHouseholdNetIncome) {
		WebElement dropdownUl = driver
				.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[6]/div/span/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String frequency = frequencyOfOtherHouseholdNetIncome;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(frequency)) {
				dropDownOption.click();
				break;
			}
		}
	}
	
	/* Expense details web elements and actions */
	public WebElement getHomeMortgageRepayment(final WebDriver driver) {
		return driver.findElement(By.id("mortgage-repayment-amount"));
	}

	public WebElement getHomeMortgageRepaymentFrequencyDropdown(final WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[7]/div/span/div/input"));
	}

	public void selectFrequencyForHomeMortgageRepayment(final WebDriver driver,
			String frequencyOfHomeMortgageRepayment) {
		WebElement dropdownUl = driver
				.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[7]/div/span/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String frequency = frequencyOfHomeMortgageRepayment;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(frequency)) {
				dropDownOption.click();
				break;
			}
		}
	}
	
	public WebElement getOtherLoanCommitments(final WebDriver driver) {
		return driver.findElement(By.id("other-loan-commitments-amount"));
	}

	public WebElement getOtherLoadCommitmentsFrequencyDropdown(final WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[8]/div/span/div/input"));
	}

	public void selectFrequencyForOtherLoanCommitments(final WebDriver driver,
			String frequencyOfOtherLoanCommitments) {
		WebElement dropdownUl = driver
				.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[8]/div/span/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String frequency = frequencyOfOtherLoanCommitments;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(frequency)) {
				dropDownOption.click();
				break;
			}
		}
	}
	
	public WebElement getHouseholdCreditCardLimit(final WebDriver driver) {
		return driver.findElement(By.id("household-credit-card-limit-amount"));
	}
	
	public WebElement getHouseholdLivingCosts(final WebDriver driver) {
		return driver.findElement(By.id("household-living-costs-amount"));
	}

	public WebElement getHouseholdLivingCostsFrequencyDropdown(final WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[10]/div/span/div/input"));
	}

	public void selectFrequencyForHouseholdLivingCosts(final WebDriver driver,
			String frequencyOfHouseholdLivingCosts) {
		WebElement dropdownUl = driver
				.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[10]/div/span/div/ul"));
		List<WebElement> options = dropdownUl.findElements(By.tagName("li"));
		String frequency = frequencyOfHouseholdLivingCosts;
		for (WebElement dropDownOption : options) {
			if (dropDownOption.getText().equals(frequency)) {
				dropDownOption.click();
				break;
			}
		}
	}
	
	/* Calculate Limit button */
	public WebElement getCalculateLimitButton(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"pre-approval-how-much-can-i-borrow-form\"]/button"));
	}

}
