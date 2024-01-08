package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele = new ElementFetch();

	public void verifyIfLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size() > 0, "Element Not Found");
	}

	public void enterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("temp@gmailo.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("jkbhjgf^%67thbhb3w");
	}
}
