package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
	      
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		WebElement username = driver.findElementById("email");
		
		username.sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		System.out.println("The Title is:"+driver.getTitle());
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
	    driver.findElementByLinkText("Log Out").click();
		
		driver.close();

	}

}
