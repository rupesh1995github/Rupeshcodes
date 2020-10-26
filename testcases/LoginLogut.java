package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginLogut extends BaseClass {
	
	@Test
	public void loginLogout() {
    	
		new LoginPage().enterMyUsername().enterPassword().clickLoginButton().crmSfa()
		.leads().createlead().firstName().lastName().submitButton(); 			
    }
}