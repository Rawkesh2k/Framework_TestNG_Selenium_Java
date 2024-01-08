package pageObjects;

public interface HomePageElements {

	String signInButtonText = "//span[contains(text(), \"Log In\")]";
	String signUpButtontext = "//a[contains(text(),'Sign Up')]";
	String signUpOnLoginPageText = "//a[normalize-space()='Sign Up']";
	String forgotPwd = "//a[normalize-space()='Forgot your password?']";
	
}
