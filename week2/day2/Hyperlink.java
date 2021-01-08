package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup Chrome Driver
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    //Navigate URL
		driver.get("http://leafground.com/pages/Link.html");
		//Maximize Window
		driver.manage().window().maximize();
		//Go to home page
		driver.findElementByXPath("//a[contains(text(),'Go to Home Page')]").click();
		Thread.sleep(2000);
		//Hyperlink
		driver.findElementByXPath("(//h5)[3]/..").click();
		Thread.sleep(2000);
		//find where will go without clicking
		WebElement gowithoutclick = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']");
		String pagelink = gowithoutclick.getAttribute("href");
		System.out.println("Navigate here without clicking - " + pagelink);
		Thread.sleep(2000);
		//Where broken
		driver.findElementByXPath("//a[contains(text(),'Verify am I broken?')]").click();
		
		String title = driver.getTitle();
		
		boolean broken = title.contains("404");
	
					
		if (broken) {
		System.out.println("Here page is broken");
		}
		else {
		System.out.println("Here page is not broken");
		
		}
		Thread.sleep(2000);
		
		//Go to home page
		driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[2]").click();
		Thread.sleep(2000);
		//How many link available
		driver.findElementByXPath("(//div[@class='example'])[4]//a").click();
		Thread.sleep(2000);
	    //close browser
		driver.close();
		
		
	}

}
