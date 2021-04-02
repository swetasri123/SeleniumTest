package stepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.duckDuckGoHomePage;
import pages.googleHomePage;
import pages.searchResultsPage;
import tests.base;

@RunWith(io.cucumber.junit.Cucumber.class)
public class MyStepDefinitions extends base{
	
    @When("^User is on Google page$")
    public void user_is_on_google_page() throws Throwable {
        System.out.println("Open the Google Page");
        driver = initializeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(5000);
    }

    @Then("^search forr Duck$")
    public void search_forr_duck() throws Throwable {
    	  System.out.println("Search google for Duck");
    	  googleHomePage googleHomePage = new googleHomePage(driver);
    	  googleHomePage.setSearchTextandEnter("duck");
    	  
    }

    @Then("^Click on the Search Results$")
    public void click_on_the_search_results() throws Throwable {
    	  System.out.println("Click on the DuckDuckGo Link");
    	  searchResultsPage searchResultsPage = new searchResultsPage(driver);
    	  searchResultsPage.clickDuckDcuckGoLink();

    }

    @And("^Verify Duck Image$")
    public void verify_duck_image() throws Throwable {
    	 System.out.println("Verify the Duck Image on the DuckDuckGo home page");
    	 duckDuckGoHomePage duckDuckGoHomePage = new duckDuckGoHomePage(driver);
    	 duckDuckGoHomePage.verifyDuckDuckGoImage();
    }
    @And("^Close the Browser$")
    public void close_the_browser() throws Throwable {
        driver.quit();
    }
}