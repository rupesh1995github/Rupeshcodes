package week6Classroom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeAfter {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	
	public void beforeMethod() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://leaftaps.com/opentaps/control/login");
    driver.findElementById("username").sendKeys("demosalesmanager");
    driver.findElementById("password").sendKeys("crmsfa");
    driver.findElementByClassName("decorativeSubmit").click();
    driver.findElementByLinkText("CRM/SFA").click();
    

}

	
	@AfterMethod
	public void afterMethod() {
        driver.close();   
        
	}
} 

        
        
