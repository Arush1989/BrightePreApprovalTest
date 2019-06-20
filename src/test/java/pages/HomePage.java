/**
 * 
 */
package test.java.pages;

import org.openqa.selenium.WebDriver;

/**
 * @author Arush_Pushkarna
 *
 */

public class HomePage {

	/* Method to load the home page */
	public void loadHomePage(WebDriver driver) throws Error {
		String baseUrl = "https://portal.staging.brightelabs.com.au/pre-approvals/how-much-can-i-borrow";
		driver.get(baseUrl);
	}

}
