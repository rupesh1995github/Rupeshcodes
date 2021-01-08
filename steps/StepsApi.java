package steps;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matcher;

import com.test.pojo.User;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import com.test.pojo.User;

import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StepsApi {
	
	List<User> page1_users;
	List<User> page2_users;
	Response response;
	String name;
	String job;
	String userid;
	Object code;
	DataTable dataTable;
    //Scenario: Should see LIST USERS of all existing users
	
	@Given("^I get the default list of users for on (\\d+)st page$")
	public void i_get_the_default_list_of_users_for_on_st_page(int arg1) throws Throwable {
	 
	page1_users=given().baseUri("https://reqres.in/").when().get("api/users?page=1").then().contentType(ContentType.JSON)
	.extract().jsonPath().getList("data", User.class);
	
	}
	
	@When("^I get the list of all users within every page$")
		public void i_get_the_list_of_all_users_within_every_page() throws Throwable {
		
		page1_users =given().baseUri("https://reqres.in/")
				.when().get("api/users?page=1")
				.then().contentType(ContentType.JSON)
				.extract().jsonPath()
				.getList("data",User.class);
		
		page2_users =given().baseUri("https://reqres.in/")
				.when().get("api/users?page=2")
				.then().contentType(ContentType.JSON)
				.extract().jsonPath()
				.getList("data",User.class);
		
	}
	
	
	@Then("^I should see total users count equals the number of user ids$")
	public void i_should_see_total_users_count_equals_the_number_of_user_ids() throws Throwable {
		
		
		page1_users=given().baseUri("https://reqres.in/")
				.when().param("page","1").get("/api/users")
				.then().contentType(ContentType.JSON)
				.extract().jsonPath().getList("data",User.class);
		page2_users=given().baseUri("https://reqres.in/")
				.when().param("page","2").get("/api/users")
				.then().contentType(ContentType.JSON)
				.extract().jsonPath().getList("data",User.class);
	
		
    int total_users= given().baseUri("https://reqres.in/")
			.when().param("page","2").get("/api/users")
			.then().contentType(ContentType.JSON)
			.extract().jsonPath().get("total");
    
     System.out.println(total_users);
     System.out.println("page1="+page1_users.size());
     System.out.println("page2="+page2_users.size());
	 assertEquals(12,total_users );
	
    }
	
	
	
	
    @Given("^I make a search for user (\\d+)$")
    public void i_make_a_search_for_user(int arg1) throws Throwable {
	
		
		response=given().baseUri("https://reqres.in/")
		.when().basePath("api/users/"+userid).get();
	}

	@Then("^I should see the following user data$")
	public void i_should_see_the_following_user_data(DataTable arg1) throws Throwable {
		
		List<Map<String,String>> givendata=dataTable.asMaps(String.class, String.class);
		
		User user=response.jsonPath().getObject("data", User.class);
	   
	   assertEquals(givendata.get(0).get("first_name"), user.getFirst_name());
	   assertEquals(givendata.get(0).get("email"), user.getEmail());
	  
	   
	}
	
	@Then("^I receive error code (\\d+) in response$")
	public void i_receive_error_code_in_response(int arg1) throws Throwable {
		int status_code=response.getStatusCode();
		System.out.println(status_code);
		
		assertEquals(code, status_code);
		
	}

	
	@Given("I create a user with following <Name> <Job>")
	public void i_create_a_user_with_following_Peter_Manager() throws Throwable {
		String requestBody = "{\n" +
	              "\"name\": \""+name+"\",\n" +
	            "\"job\": \""+job+
	            "\"\n}";
		
		
		response=given().baseUri("https://reqres.in/").basePath("api/users").log().all()
		.body(requestBody)
		.post();
		response.then().assertThat().statusCode(equalTo(201));
		
	
	}

	private Matcher<? super Integer> equalTo(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("^response should contain the following data$")
	public void response_should_contain_the_following_data(DataTable arg1) throws Throwable {
	
		response.asString();
		System.out.println(response.asString());
	}

	
	

    @Given("^I login unsuccessfully with the following data$")
    public void i_login_unsuccessfully_with_the_following_data(DataTable arg1) throws Throwable {

	
	
   	  List<Map<String,String>> givendata=dataTable.asMaps(String.class, String.class);
	
	  String email=givendata.get(0).get("Email");
	  String password=givendata.get(0).get("Password");
	  if (password==null)
	  password="";
	  String requestBody = "{\n" +
	              "\"email\": \""+email+"\",\n" +
	            "\"password\": \""+password+
	            "\"\n}";
	  
	  System.out.println(requestBody);

	
	  response=given().baseUri("https://reqres.in/").when().contentType(ContentType.JSON).log().all().body(requestBody).post("/api/login");
	
	

}

    @Then("^I should get a response code of (\\d+)$")
    public void i_should_get_a_response_code_of(int arg1) throws Throwable {
         
	  int status_code=response.getStatusCode();
	
	  System.out.println(status_code);
	  assertEquals(code,status_code);

	
}

	
    @Then("^I should see the following response message:$")
    public void i_should_see_the_following_response_message(DataTable Data) throws Throwable {
     
	List<String> givendata=dataTable.asList();
      System.out.println(givendata.get(0));
      String error_msg=response.asString();
      System.out.println("error_msg="+error_msg);
      assertEquals(true, error_msg.contains(givendata.get(0)));
   
}

    @Given("^I wait for the user list to load$")
	public void i_wait_for_the_user_list_to_load() throws Throwable {
     response=given().baseUri("https://reqres.in/").basePath("api/users/").queryParam("delay",3)
    .when().get();
	    
   
}
    @Then("^I should see that every user has a unique id$") 
    public void i_should_see_that_every_user_has_a_unique_id() throws Throwable {

	
    List<User> user=response.jsonPath().getList("data",User.class);
	user.forEach((a)->System.out.println(a.getId()));
}
}    
