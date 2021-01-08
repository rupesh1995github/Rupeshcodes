package week2.day2;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		Thread.sleep(3000);
		//select training program using index
		driver.findElementByXPath("//select[@id='dropdown1']/option[2]").click();
		Thread.sleep(2000);
		//select training program using name
		driver.findElementByXPath("(//select[@name='dropdown2'])/option[text()='Appium']").click();
		Thread.sleep(1000);
		//select training program using value
		driver.findElementByXPath("(//select[@name='dropdown3'])/option[@value='3']").click();
		Thread.sleep(1000);
		//get the number of drop down option
		WebElement dropdown = driver.findElementByXPath("//select[@class='dropdown']");
		Select dn = new Select(dropdown);
		java.util.List<WebElement> options = dn.getOptions();
		int count = 0;
		System.out.println("Dropdown Options Count = " + (count-1));
		Thread.sleep(2000);
		//you can also use send key to select
		driver.findElementByXPath("//div[@class='example'][5]/select").sendKeys("L" + Keys.TAB);
		Thread.sleep(2000);
		//select your program
		WebElement lastBox = driver.findElementByXPath("//div[@class='example'][6]/select");
		Select selenium = new Select(lastBox);
		selenium.selectByValue("1");
		selenium.selectByValue("2");
		Thread.sleep(2000);
		//close browser
		driver.close();

	}

}
