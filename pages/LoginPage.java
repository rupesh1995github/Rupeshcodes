package pages;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage enterMyUsername() {
		driver.findElementById("username").sendKeys("demosalesmanager");
	return this;
		
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("username").sendKeys("crmsfa");
	return this;
	}
	
	
	public HomePage clickLoginButton() {
		 driver.findElementByClassName("decorativeSubmit").click();
	return new HomePage();
	}
	

}
