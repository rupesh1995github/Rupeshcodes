package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		Thread.sleep(2000);
		//Are you enjoying the class
		driver.findElementByXPath("//label[@for='yes']/input").click();
		Thread.sleep(2000);
		
		boolean selected1 = driver.findElementByXPath("//label[contains(text(),'Find default')]/following::input[1]").isSelected();
		if (selected1) {
		System.out.println("Radio button Unchecked is selected");
		}
		boolean selected2 = driver.findElementByXPath("//label[contains(text(),'Find default')]/following::input[2]").isSelected();
		if (selected2) {
			System.out.println("Radio button Checked is selected");
		}
		
		boolean age1 = driver.findElementByXPath("//input[@name='age'][1]").isSelected();
	    boolean age2 = driver.findElementByXPath("//input[@name='age'][2]").isSelected();
		boolean age3 = driver.findElementByXPath("//input[@name='age'][3]").isSelected();
	    if (age1 == false) {
		if (age3 == false) {
		if (age2 == false) {
		driver.findElementByXPath("//input[@name='age'][3]").click();
				}
			}
		}
		
		System.out.println("Age is already selected");
		Thread.sleep(2000);	
		driver.close();

	}

}
