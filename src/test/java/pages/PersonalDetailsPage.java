/**
 * 
 */
package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Arush_Pushkarna
 *
 */
public class PersonalDetailsPage {

	public WebElement getName(final WebDriver driver) {
		return driver.findElement(By.id("full-name"));
	}

	public WebElement getMobileNumber(final WebDriver driver) {
		return driver.findElement(By.id("mobile"));
	}

	public WebElement getEmailAddress(final WebDriver driver) {
		return driver.findElement(By.id("email"));
	}

	public WebElement getContinueButton(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"pre-approval-details-form\"]/button"));
	}

}
