package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup Chrome Driver
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    //Navigate URL
		driver.get("http://leafground.com/pages/Image.html");
		//Maximize Window
		driver.manage().window().maximize();
		//click on this image
		driver.findElementByXPath("//img[@src='../images/home.png']").click();
		//click image logo
		driver.findElementByXPath("(//a[@class='wp-categories-link maxheight'])[4]").click();
		//Am I Broken Image?
		String isbroken = driver.findElementByXPath("//img[@src='../images/abcd.jpg']").getAttribute("src");
		driver.get(isbroken);
		String title = driver.getTitle();
		boolean error = title.contains("404");
		
		if (error) {
		System.out.println("Yes Broken");
		}
		else {
		System.out.println("Not Broken");
		}
		driver.get("http://leafground.com/pages/Image.html");
		Thread.sleep(2000);
		////Click me using Keyboard or Mouse
		driver.findElementByXPath("//img[@src='../images/keyboard.png']").click();
		//Close browser
		driver.close();


	}

}
