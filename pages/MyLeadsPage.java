package pages;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	
	public CreateLeadPage createlead() {
		driver.findElementByLinkText("Create Lead").click();
	return new CreateLeadPage();	
	
	}



	
}
