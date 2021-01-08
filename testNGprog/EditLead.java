package testNGprog;

import org.testng.annotations.Test;

public class EditLead extends BeforeAfter {
	
	@Test

	public void driverEditLead() throws InterruptedException {
	
		
		driver.findElementByXPath("//a[text()='Leads']").click();
	    //Click Find leads
		driver.findElementByXPath("//a[contains(text(),'Find')]").click();
	    //Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("rupesh");
        //Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();	
		Thread.sleep(2000);
		//Click on first resulting lead
		driver.findElementByXPath("//a[text()='Rupesh']").click();
		//Verify title of the page
		String title=driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().contains("View Lead | opentaps CRM")) {
        	System.out.println("Tile is correct");
        }else {
        	System.out.println("Tile is not correct");
        }
        //Click Edit
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	    //Change the company name
		driver.findElementById("createLeadForm_companyName").sendKeys("UpdaterServicesPVtLTD");
	    //Click Update
		driver.findElementByName("submitButton").click();
	    //Confirm the changed name appears
		driver.findElementById("viewLead_companyName_sp").getText();
	    //Close the browser (Do not log out)
		
		}
}
