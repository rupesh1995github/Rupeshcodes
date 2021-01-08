package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
	

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementByName("USERNAME").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
	    driver.findElementById("accountName").sendKeys("abcde");
	    driver.findElementByName("description").sendKeys("Selenium Automation Tester");
	    driver.findElementById("groupNameLocal").sendKeys("Localname");
        driver.findElementById("officeSiteName").sendKeys("Localname OMR Road");
        driver.findElementById("annualRevenue").sendKeys("300000");
		WebElement industry = driver.findElementByName("industryEnumId");
		Select industryitem = new Select(industry);
		industryitem.selectByIndex(3);
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select ownershipitem = new Select(ownership);
		ownershipitem.selectByVisibleText("S-Corporation");
        WebElement source = driver.findElementById("dataSourceId");
		Select sourceitem = new Select(source);
		sourceitem.selectByValue("LEAD_EMPLOYEE");
        WebElement marketing = driver.findElementById("marketingCampaignId");
		Select marketingitem = new Select(marketing);
		marketingitem.selectByIndex(6);
	    WebElement state = driver.findElementById("generalStateProvinceGeoId");
		Select stateitem=new Select(state);
		stateitem.selectByValue("TX");
	    driver.findElementByClassName("smallSubmit").click();
		driver.close();
				
	}

}
