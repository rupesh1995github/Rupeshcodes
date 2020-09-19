package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
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
        driver.findElementByName("submitButton").click();
        String title=driver.getTitle();
        System.out.println(title);
        if(driver.getTitle().contains("View Lead | opentaps CRM")) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
        driver.close();

	}

}
