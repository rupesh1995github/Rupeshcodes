package qumu;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

//import io.cucumber.datatable.DataTable;

import cucumber.api.DataTable;

public class Products extends BasePage {
	
	public static void addProducts(DataTable data) throws InterruptedException {
		
		//I add the following items to the basket
		
		List<List<String>> dataValue = data.raw();
		for (int i = 0; i < dataValue.size() ; i++) {
			driver.findElement(By.xpath("//div[text()='"+ dataValue.get(i).get(0) +"']/following::button[text()='ADD TO CART']")).click();
		
		}
	}
	
	//I  should see 4 items added to the shopping cart
	
	public static void verifyCartItems(String cartItems) throws InterruptedException {
	String Actual = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link fa-layers')]//span[1]")).getText();
	Assert.assertEquals(Actual,cartItems);
	Thread.sleep(1000);
	
	}
	
	//I click on the shopping cart
	
	public static void clickCart() {
	driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link fa-layers')]//span[1]")).click();
	
	}
	
}




