package week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	@Test

	public void duplicateLead() throws InterruptedException {
	
		        //Setup Chrome Driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				//Naiviagate to URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maximize window
				driver.manage().window().maximize();
				//Enter the Username
				driver.findElementById("username").sendKeys("demosalesmanager");
				//Enter the password
				driver.findElementById("password").sendKeys("crmsfa");
				Thread.sleep(2000);
				//Click on login button
				driver.findElementByClassName("decorativeSubmit").click();
				//Click crm/sfa link
				driver.findElementByLinkText("CRM/SFA").click();
				//Click Leads link
				driver.findElementByXPath("(//div[@class='x-panel-header'])[2]/a").click();	
			    //Click Find leads
				driver.findElementByLinkText("Find Leads").click();
				Thread.sleep(2000);
				//Click on Email
				driver.findElementByXPath("//span[contains(text(),'Email')]").click();
				Thread.sleep(2000);
				//Enter Email
				driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("rupesh.k@gmail.com");
				Thread.sleep(2000);
				//Click find leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(2000);
				//Capture name of First Resulting lead
				String firstlead = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
				System.out.println("Printing "+firstlead);
				Thread.sleep(2000);
				//Click First Resulting lead
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
				Thread.sleep(2000);
				//Click Duplicate Lead
				driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
				//Verify the title as 'Duplicate Lead'
				String title = driver.getTitle();
				System.out.println(title);
				if (driver.getTitle().contains("Duplicate Lead | opentaps CRM")) {
					System.out.println("Title is correct");
				}
				else {
		        	System.out.println("Title is incorrect");
		        }
				//Click Create Lead
				driver.findElementByXPath("//input[@class='smallSubmit']").click();
				//Confirm the duplicated lead name is same as captured name
				String originallead = driver.findElementByXPath("//a[contains(text(),'rupesh@test.com')]").getText();
				System.out.println("Original lead mail id is:" +originallead);
				String duplicatelead = driver.findElementByXPath("//a[contains(text(),'rupesh@test.com')]").getText();
				System.out.println("Duplicate lead mail id is "+duplicatelead);
				if (originallead==duplicatelead) {
					System.out.println("Duplicate lead created successfully");
					}
					else  {
					System.out.println("Duplicate lead not created  successfully");
				}
				//Close the browser (Do not log out)
				driver.close();

	}

}
