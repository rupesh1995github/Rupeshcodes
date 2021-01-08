package qumu;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Shipment extends BasePage {

	public static void itemTotal() {
		
		WebElement totalPrice=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
		double actualTotal=Double.parseDouble(totalPrice.getText().replaceAll("[^0-9.]", ""));
		double total =0;
		List<WebElement> itemPrices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		for (WebElement ele : itemPrices) 
		{
            String prices = ele.getText();
            total = total+ Double.parseDouble(prices.replaceAll("[^0-9.]", ""));
            System.out.println("Price after adding: "+total);
		} 
		Assert.assertEquals(actualTotal,total);
	 }
		
		
	public static void verifyTax() {
		
		WebElement taxAmount=driver.findElement(By.xpath("//div[@class='summary_tax_label']"));
		String tax=taxAmount.getText();
	       Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(tax);
	       while (m.find())
	       {
	           double d = Double.parseDouble(m.group(1));	        
	           int taxPercentage=(int)d;
	          Assert.assertEquals(taxPercentage,4 );
	    
	       
	       }
	  }
 }
