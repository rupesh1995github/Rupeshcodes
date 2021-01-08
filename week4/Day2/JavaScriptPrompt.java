package week4.Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPrompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set the system property and Launch the URL
				WebDriverManager.chromedriver().setup();
		        ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		        
		        Thread.sleep(3000);
		        
		        driver.switchTo().frame("iframeResult");
		        driver.findElementByXPath("//button[text()='Try it']").click();
		        
		        Alert alert = driver.switchTo().alert();
		        alert.sendKeys("Rupesh");
		        alert.accept();
		        
		        String text = driver.findElementById("demo").getText();
		        
		        if (text.contains("Rupesh")) {
					
				System.out.println("Pass");
		        }
		        else
		        	
		        	System.out.println("fail");
		        
		        

	}

}
