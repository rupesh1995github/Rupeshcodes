package myCodes;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskman {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://taskmanadmin.uds.in");
		Thread.sleep(15);
		//Enter username
		driver.findElementById("(//label[@class='control-label']/following-sibling::input)[1]").sendKeys("admin");
		//Enter password
		driver.findElementByXPath("(//label[@class='control-label']/following-sibling::input)[2]").sendKeys("Task@2020!");
		//click remember me checkbox
		driver.findElementByXPath("//span[@class = 'check']").click();
		//click on submit button
		driver.findElementByXPath("//div[@class = 'footer text-center']/button").click();

	}

}
