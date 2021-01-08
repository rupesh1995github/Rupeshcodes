package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver editlead = new ChromeDriver();
		//Navigate to URL
		editlead.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the window
		editlead.manage().window().maximize();
		//Enter the username
		editlead.findElementById("username").sendKeys("demosalesmanager");
	    //Enter the password
		editlead.findElementById("password").sendKeys("crmsfa");
	    //Click Login
		editlead.findElementByClassName("decorativeSubmit").click();
	    //Click crm/sfa link
		editlead.findElementByLinkText("CRM/SFA").click();
	    //Click Leads link
		editlead.findElementByXPath("//a[text()='Leads']").click();
	    //Click Find leads
		editlead.findElementByXPath("//a[contains(text(),'Find')]").click();
	    //Enter first name
		editlead.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("rupesh");
        //Click Find leads button
		editlead.findElementByXPath("//button[text()='Find Leads']").click();	
		Thread.sleep(2000);
		//Click on first resulting lead
		editlead.findElementByXPath("//a[text()='Rupesh']").click();
		//Verify title of the page
		String title=editlead.getTitle();
		System.out.println(title);
		if(editlead.getTitle().contains("View Lead | opentaps CRM")) {
        	System.out.println("Tile is correct");
        }else {
        	System.out.println("Tile is not correct");
        }
        //Click Edit
		editlead.findElementByXPath("//a[text()='Duplicate Lead']").click();
	    //Change the company name
		editlead.findElementById("createLeadForm_companyName").sendKeys("UpdaterServicesPVtLTD");
	    //Click Update
		editlead.findElementByName("submitButton").click();
	    //Confirm the changed name appears
		editlead.findElementById("viewLead_companyName_sp").getText();
	    //Close the browser (Do not log out)
		editlead.close();
		}
}
