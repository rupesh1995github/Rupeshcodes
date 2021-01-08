package week4.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(50000);
		// to get into frame
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dst = driver.findElementByXPath("//div[@id='droppable']");
		Actions action=new Actions(driver);
		action.dragAndDrop(src,dst).perform();
		Thread.sleep(8000);
		driver.close();

	}

}
