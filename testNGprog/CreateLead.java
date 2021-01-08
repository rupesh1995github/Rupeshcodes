package testNGprog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class CreateLead extends BeforeAfter {
	
	
	
	@Test
	public void runCreateLead() {
		
		
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
        driver.findElementById("createLeadForm_firstName").sendKeys("Rupesh");
        driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
        WebElement source = driver.findElementById("createLeadForm_dataSourceId");
        Select sourcefield = new Select(source);
        sourcefield.selectByVisibleText("Conference");
        WebElement Marketing = driver.findElementById("createLeadForm_marketingCampaignId");
        Select Marketingitem = new Select(Marketing);
        Marketingitem.selectByValue("9001");
        WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
        Select Industryfield = new Select(Industry);
        Industryfield.selectByIndex(15);
        WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
        Select ownersipfield=new Select(ownership);
        ownersipfield.selectByIndex(5);
        WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
        Select Countryname =new Select(Country);
        Countryname.selectByVisibleText("India");
        driver.findElementByXPath("//span[contains(text(),'Phone Number')]/following::input").sendKeys("9999988888");
        driver.findElementByXPath("//span[contains(text(),'E-Mail Address')]/following::input").sendKeys("rupesh.k@gmail.com");
        driver.findElementByName("submitButton").click();
        String title=driver.getTitle();
        System.out.println(title);
        if(driver.getTitle().contains("View Lead | opentaps CRM")) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
       


	}

}
