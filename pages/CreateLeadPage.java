package pages;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	
	
	public CreateLeadPage firstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Rupesh");
	return this;

		
	}
	
	public CreateLeadPage lastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
	return this;

		
	}
	
	public ViewLeadPage submitButton() {
		driver.findElementByName("submitButton").click();
	return new ViewLeadPage();

		
	}
	
	
	
    
    
    


}
