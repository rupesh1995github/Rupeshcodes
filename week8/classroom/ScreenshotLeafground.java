package week8.classroom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotLeafground {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/Window.html");
        Thread.sleep(2000);
        driver.findElementByXPath("//button[text()='Open Home Page']").click();
        driver.manage().window().maximize();
        File source = driver.getScreenshotAs(OutputType.FILE);
        File target = new File("./screenshot/leafground.png");
        FileUtils.copyFile(source, target);

	}

}
