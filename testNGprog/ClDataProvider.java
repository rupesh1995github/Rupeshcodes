package testNGprog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClDataProvider extends BeforeAfter {
	

	
	
	    @DataProvider (name = "Lead")
	    public String [][] getData(){
	    	String [][] data = new String [2][3];    	
	    	data[0][0] = "Testleaf";
	    	data[0][1] = "emp1";
	    	data[0][2] = "lastname1";
	    	
	    	data[1][0] = "Testleaf";
	    	data[1][1] = "emp2";
	    	data[1][2] = "lastname2";
	    	
			return data;
	    	
	    }
		
		
		@Test(dataProvider = "Lead")
		public void runCreateLead(String cName,String fName, String lName) {
			
			
	        driver.findElementByLinkText("Leads").click();
	        driver.findElementByLinkText("Create Lead").click();
	        driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	        driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	        driver.findElementById("createLeadForm_lastName").sendKeys(lName);
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


