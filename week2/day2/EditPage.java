package week2.day2;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup Chrome Driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Navigate URL
		driver.get("http://leafground.com/pages/Edit.html");
		//Maximize Window
		driver.manage().window().maximize();
		//Enter your email address
		driver.findElementByXPath("//input[@id='email']").sendKeys("test@gmail.com");
		Thread.sleep(2000);
		//Append a text and press keyboard tab
		driver.findElementByXPath("//input[contains(@value,'Append')]").sendKeys("Appending text and pressing TAB key");
		Thread.sleep(2000);
		//Get default text entered
		driver.findElementByXPath("//input[contains(@value,'TestLeaf')]").sendKeys("TestLeaf");
		Thread.sleep(2000);
		//Clear the text
		driver.findElementByXPath("//input[contains(@value,'Clear me!!')]").clear();
		Thread.sleep(2000);
		//Confirm that edit field is disabled
		boolean edit = driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input").isEnabled();
		if (edit = true) {
			System.out.println("Field is disabled");
		}	
			else {
				System.out.println("Field is not disabled");
			}
		driver.close();
	}

}
