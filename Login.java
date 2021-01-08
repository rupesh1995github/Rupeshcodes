package qumu;

import java.util.List;

import org.openqa.selenium.By;

//import io.cucumber.datatable.DataTable;

import cucumber.api.DataTable;

public class Login extends BasePage {
	

	public static void clickLogin(DataTable data) {
		// TODO Auto-generated method stub
		List<List<String>> dataValue = data.raw();
		driver.findElement(By.id("user-name")).sendKeys(dataValue.get(1).get(0));
		driver.findElement(By.id("password")).sendKeys(dataValue.get(1).get(1));
		driver.findElement(By.id("login-button")).click();
	}
	}


