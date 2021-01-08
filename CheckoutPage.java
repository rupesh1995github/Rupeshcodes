package qumu;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {
	
	public static void firstName() {
		
	//I type "FirstName" for First Name
	driver.findElement(By.id("first-name")).sendKeys("FirstName");
	}
	
	public static void lastName() {
	//I type "LastName" for Last Name
	driver.findElement(By.id("last-name")).sendKeys("LastName");
	}
	
	public static void postalCode() {
	//I type "EC1A 9JU" for ZIP/Postal Code
	driver.findElement(By.id("postal-code")).sendKeys("EC1A 9JU");
	}
	
	public static void clickSubmit() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}

