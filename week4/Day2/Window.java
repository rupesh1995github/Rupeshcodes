package week4.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Set the system property and Launch the URL
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		driver.findElementByXPath("//div[@class='col-xs-12 text-center']//label").click();
		
		//Click Ok in the alert (sweet)
		driver.findElementByXPath("//div[@class='text-center col-xs-12']/button").click();
	    
		//Click on Flights link
		driver.findElementByXPath("//a[text() =' FLIGHTS '] ").click();
		
		//	go to the Fights window and print the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Air Ticket Booking | Book Flight Tickets | Cheap Air Fare - IRCTC Air ")) {
			System.out.println("Correct");
			
		}else
			System.out.println("Not Correct");
		//	Close the First window

	}

}
