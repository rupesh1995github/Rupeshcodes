package week4.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//get the count of number of columns and rows, get the progress value of 'learn to interact with element' and check 
//the vital task for least completed progress


public class Assignment1Table1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		
		
		int rows=driver.findElementsByXPath("//table/tbody/tr/th").size();
		int columns=driver.findElementsByXPath("//table/tbody/tr").size();

		System.out.println("Table has "+rows+" Columns");
		System.out.println("Table has "+columns+" Rows");

		System.out.println("Learn to interact with elements progress: "+driver.findElementByXPath("//table//tr[3]/td[2]").getText());
			
		driver.findElementByXPath("//table//tr[4]/td[3]/input").click();
		System.out.println("Least progress learning marked as vital task");
		
		driver.close();
		
	}

}



