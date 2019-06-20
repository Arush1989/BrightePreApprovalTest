package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EligibilityPage {

	public WebElement getEligibleAmount(final WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/p[1]/strong"));
	}

	public WebElement getMaximumRepaymentAmount(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"pre-approval-apply-form\"]/div[4]/div[1]/span[1]"));
	}

}
