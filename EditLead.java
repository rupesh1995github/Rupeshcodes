package week2.day2;

import org.checkerframework.common.reflection.qual.GetMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver editlead = new ChromeDriver();
		editlead.get("http://leaftaps.com/opentaps/control/main");
		editlead.manage().window().maximize();
		
		editlead.findElementById("username").sendKeys("demosalesmanager");
	
		editlead.findElementById("password").sendKeys("crmsfa");
		
		editlead.findElementByClassName("decorativeSubmit").click();
	
		editlead.findElementByTagName("a").click();
	
		editlead.findElementByXPath("//a[text()='Leads']").click();
	
		editlead.findElementByXPath("//a[contains(text(),'Find')]").click();
	
		editlead.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("rupesh");

		editlead.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();	
		Thread.sleep(2000);
		

		editlead.findElementByXPath("//a[text()='Rupesh']").click();
		
	
		String title=editlead.getTitle();
		System.out.println(title);
		if(editlead.getTitle().contains("View Lead | opentaps CRM")) {
        	System.out.println("Tile is correct");
        }else {
        	System.out.println("Tile is not correct");
        }

		editlead.findElementByXPath("//a[text()='Duplicate Lead']").click();
	
		editlead.findElementById("createLeadForm_companyName").sendKeys("UpdaterServicesPVtLTD");
	
		editlead.findElementByName("submitButton").click();
	
		editlead.findElementById("viewLead_companyName_sp").getText();
	
		editlead.close();
		}
}
