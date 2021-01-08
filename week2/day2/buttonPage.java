package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonPage {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup Chrome Driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("http://leafground.com/pages/Button.html");
		//Click go to home page
		driver.findElementByXPath("//button[@id='home']").click();
		Thread.sleep(2000);
		//Click button
		driver.findElementByXPath("//a[@href='pages/Button.html']").click();
		Thread.sleep(2000);
		//get position of x & Y
		Point location = (Point) driver.findElementByXPath("//label[text()='Find position of button (x,y)']/following-sibling::button").getLocation();
		int x = ((org.openqa.selenium.Point) location).getX();
		int y = ((org.openqa.selenium.Point) location).getY();
		
		System.out.println("Location of X " +x+ " and Location of Y " + y);
		//find button color
		String buttonColor = driver.findElementByXPath("//button[@id='color']").getCssValue("color");
		System.out.println("Button color: " + buttonColor);
		//find height and width
		org.openqa.selenium.Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		int itsheight = size.getHeight();
		int itswidth = size.getWidth();
		System.out.println("Its Height is" + itsheight + " Its Width is " + itswidth);		
		driver.close();
		
	}

}