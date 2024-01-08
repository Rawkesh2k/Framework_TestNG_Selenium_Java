package pageEvents;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import pageObjects.ForgotPasswordPage;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class ForgotPasswordPageEvents {
	ElementFetch ele = new ElementFetch();

	public void forgotPassword() {
		String successMsg = "Thank you. You will receive an email with a password reset link if this account is registered.";
		ele.getWebElement("XPATH", ForgotPasswordPage.emailField).sendKeys("temp@gmailgol.com");
		ele.getWebElement("XPATH", ForgotPasswordPage.resetPwdButton).click();
		String resetSuccessMsg = ele.getWebElement("XPATH", ForgotPasswordPage.verifyResetPwdMsg).getText();
		Assert.assertEquals(resetSuccessMsg, successMsg);
		
	}
}
