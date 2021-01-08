package testNGprog;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	@Test

	public void delLead() throws InterruptedException {
		
		
		
		//Setup Chrome Driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver deletelead = new ChromeDriver();
		//Naiviagate to URL
		deletelead.get("http://leaftaps.com/opentaps/control/main");
		//Maximize window
		deletelead.manage().window().maximize();
		//Enter the Username
		deletelead.findElementById("username").sendKeys("demosalesmanager");
		Thread.sleep(2000);
		//Enter the password
		deletelead.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(2000);
		//Click on login button
		deletelead.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		//Click crm/sfa link
		deletelead.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		//Click Leads link
		deletelead.findElementByXPath("(//div[@class='x-panel-header'])[2]/a").click();	
	    //Click Find leads
		deletelead.findElementByLinkText("Find Leads").click();
		//Click on Phone
		deletelead.findElementByLinkText("Phone").click();
		Thread.sleep(2000);
		//Enter phone number 99
		deletelead.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		Thread.sleep(2000);
		//Click find leads button
		deletelead.findElementByXPath("(//td[@class='x-btn-center']//button)[7]").click();
		Thread.sleep(5000);
		//Capture lead ID of First Resulting lead
		String captureleadid = deletelead.findElementByXPath("//table[@class='x-grid3-row-table']//a").getText();
		System.out.println("Printing "+captureleadid);
		Thread.sleep(5000);
		//Click First Resulting lead
		deletelead.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();
		//Click Delete
		deletelead.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(2000);
		//Click find lead
		deletelead.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		//Enter captured lead ID
		deletelead.findElementByXPath("//input[@class=' x-form-text x-form-field'and @name='id']").sendKeys(captureleadid);
		//Click find leads button
		deletelead.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String verifyrecord = deletelead.findElementByXPath("//div[@class='x-paging-info']").getText();
		boolean verification = verifyrecord.contains("No records to display");
		if (verification) {
		System.out.println("Lead deleted successfully");
		}
		else {
		System.out.println("Lead was not deleted");
		Thread.sleep(2000);
		//Close the browser (Do not log out)
		deletelead.close();
		
}
	}		
}