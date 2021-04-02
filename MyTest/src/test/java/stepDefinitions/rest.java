package stepDefinitions;


import org.junit.Assert;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@RunWith(Cucumber.class)
public class rest {

    @Given("^click on the given link$")
    public void click_on_the_given_link() throws Throwable {
    
           String BASE_URL = "https://jsonplaceholder.typicode.com/posts";
           
            RestAssured.baseURI = BASE_URL;
    		//RequestSpecification request = RestAssured.given();
    		//Response response = request.get(BASE_URL);
    }

    @Then("^verify the posts response$")
    public void verify_the_posts_response() throws Throwable {
    	String BASE_URL = "https://jsonplaceholder.typicode.com/posts";
        
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
    	Response response = request.get(BASE_URL);
    	Assert.assertEquals(200, response.getStatusCode());
    	System.out.println("Rest Test");
    }

}