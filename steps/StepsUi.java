package steps;

//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qumu.Cart;
import qumu.CheckoutPage;
//import qumu.Cart;
//import qumu.CheckoutPage;
//import qumu.HomePage;
//import qumu.Login;
//import qumu.Products;
//import qumu.Shipment;
import qumu.HomePage;
import qumu.Login;
import qumu.Products;
import qumu.Shipment;

public class StepsUi{

  
    
    @Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		HomePage.homePage();
	}

	@Given("^I login in with the following details$.*")
	public void i_login_in_with_the_following_details(DataTable data) throws Throwable {
		Login.clickLogin(data);
	}

	@Given("^I add the following items to the basket$")
	public void i_add_the_following_items_to_the_basket(DataTable data) throws Throwable {
		Products.addProducts(data);
	}

	@Given("^I  should see \"([^\"]*)\" items added to the shopping cart$")
	public void i_should_see_items_added_to_the_shopping_cart(String arg1) throws Throwable {
		Products.verifyCartItems(arg1);
	}

	@Given("^I click on the shopping cart$")
	public void i_click_on_the_shopping_cart() throws Throwable {
		Products.clickCart();
    }

	@Given("^I verify that the QTY count for each item should be (\\d+)$")
	public void i_verify_that_the_QTY_count_for_each_item_should_be(int arg1) throws Throwable {
		Cart.cart();
	}

	@Given("^I remove the following item:$")
	public void i_remove_the_following_item(DataTable arg1) throws Throwable {
		Cart.removeItem();
	}
	
	@Given ("^I  should see 3 items added to the shopping cart$")
	public void i_should_see_3_items_added_to_the_shopping_cart(int arg1) throws Throwable{
		Cart.verifyAddedItems();
	}

	@Given("^I click on the CHECKOUT button$")
	public void i_click_on_the_CHECKOUT_button() throws Throwable {
		Cart.clickCheckout();

	}

	@Given("^I type \"([^\"]*)\" for First Name$")
	public void i_type_for_First_Name(String arg1) throws Throwable {
		CheckoutPage.firstName();

	}

	@Given("^I type \"([^\"]*)\" for Last Name$")
	public void i_type_for_Last_Name(String arg1) throws Throwable {
		CheckoutPage.lastName();

	}

	@Given("^I type \"([^\"]*)\" for ZIP/Postal Code$")
	public void i_type_for_ZIP_Postal_Code(String arg1) throws Throwable {
		CheckoutPage.postalCode();

	}

	@When("^I click on the CONTINUE button$")
	public void i_click_on_the_CONTINUE_button() throws Throwable {
		CheckoutPage.clickSubmit();

	}

	@Then("^Item total will be equal to the total of items on the list$")
	public void item_total_will_be_equal_to_the_total_of_items_on_the_list() throws Throwable {
	   Shipment.itemTotal();
	}

	@Then("^a Tax rate of (\\d+) % is applied to the total$")
	public void a_Tax_rate_of_is_applied_to_the_total(int arg1) throws Throwable {
       Shipment.verifyTax();
	}
	

  
}
 
  

