package com.trycloud.step_definitions;

import com.trycloud.pages.GoogleSearchPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinition {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("googleURL"));
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

       Assert.assertTrue("Google", Driver.getDriver().getTitle().contains("Google"));
    }


}
