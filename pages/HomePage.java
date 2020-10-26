package pages;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public MyHomePage crmSfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	return new MyHomePage();
	}

}
