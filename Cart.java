package qumu;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Cart extends BasePage {
	
	public static void cart() {
		
		//I verify that the QTY count for each item should be 1
		
		String Actual1 = driver.findElement(By.xpath("(//div[@class='cart_quantity'])[1]")).getText();
		Assert.assertEquals(Integer.parseInt(Actual1),1);
		
		String Actual2 = driver.findElement(By.xpath("(//div[@class='cart_quantity'])[2]")).getText();
		Assert.assertEquals(Integer.parseInt(Actual2),1);
				
		String Actual3 = driver.findElement(By.xpath("(//div[@class='cart_quantity'])[3]")).getText();
		Assert.assertEquals(Integer.parseInt(Actual3),1);
						
    	String Actual4 = driver.findElement(By.xpath("(//div[@class='cart_quantity'])[4]")).getText();
        Assert.assertEquals(Integer.parseInt(Actual4),1);
	    
	}
		
		
	    public static void removeItem() {
		
	    	//I remove the following item:
		
	    	driver.findElement(By.xpath("//div[text()='49.99']/following-sibling::button")).click();
	
	}
		
		
	    public static void verifyAddedItems() {
		
	    	//I  should see 3 items added to the shopping cart
		
	        String Actual5 = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link fa-layers')]//span[1]")).getText();
		    Assert.assertEquals(Integer.parseInt(Actual5),3);
		
	}
		
		
		public static void clickCheckout() {
		   
			//I click on the CHECKOUT button
		
			driver.findElement(By.xpath("(//div[@class='cart_footer']//a)[2]")).click();
		
		
	}
	
}


