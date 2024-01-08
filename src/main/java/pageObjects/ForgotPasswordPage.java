package pageObjects;

public interface ForgotPasswordPage {
	String emailField = "//input[@id='email']";
	String resetPwdButton = "//button[@name='action']";
	String verifyResetPwdMsg = "//div[@class='field']";
}
