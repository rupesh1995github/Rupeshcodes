package week2.day1;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class launchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
      
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		

}
}