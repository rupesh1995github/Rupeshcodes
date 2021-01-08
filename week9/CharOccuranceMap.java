//1) Go to https://www.airbnb.co.in/
//2) Type Baga in location and select Baga Beach, Baga
//3) Under Select check-in date, choose check in date after 10 days from now 
 // and checkout date as 5 days  after
//4) Select 3 days in My dates are flexible
//5) Select 2 Adults, one kid in Guest field and  click search
//6) Select Hotel Room as type of place and Price as minimum 1000 , maximum as 10000
//7) Click More filters add bed as 2, bedroom as one and click show stays
//8) Click the first result and go to the new window
//9) Capture the Price for one night
//10) Check your chosen date is selected above reserve button
//11) Calculate the one night price x 5 days which is displayed in the page is match
//12)  Close the browser.

package week9;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CharOccuranceMap {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.airbnb.co.in/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElementByClassName("_1qnlffd6").click();
			Thread.sleep(1000);
			driver.findElementByClassName("_1xq16jy").click();
			Thread.sleep(1000);
			driver.findElementByClassName("_1xq16jy").sendKeys("Baga Beach,Baga", Keys.ENTER);
			Thread.sleep(1000);
			driver.findElementByXPath("(//div[contains(text(), '21')])[2]").click();
			Thread.sleep(1000);
			driver.findElementByXPath("(//div[contains(text(), '26')])[2]").click();
			Thread.sleep(3000);
			//driver.findElementByClassName("_167krry").click();
			Thread.sleep(2000);
			//driver.findElementByXPath("//select[@id = 'flexible-dates-menu']/option[@value='1']").click();
			Thread.sleep(1000);
			//driver.findElementByXPath("(//div[@class='_seuyf'])[3]").click();
	}

}
