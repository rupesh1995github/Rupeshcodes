package testNGprog;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadDepAlways{
	
	@Test(dependsOnMethods = "testNGprog.CreateLeadDepAlways.runCreateLead" , alwaysRun = true )

	public void driverEditLead() throws InterruptedException {
	
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
		    //driver.manage().window().maximize();
		    driver.get("http://leaftaps.com/opentaps/control/login");
		    driver.findElementById("username").sendKeys("demosalesmanager");
		    driver.findElementById("password").sendKeys("crmsfa");
		    driver.findElementByClassName("decorativeSubmit").click();
		    driver.findElementByLinkText("CRM/SFA").click();
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
		 driver.close();   
		}
}
