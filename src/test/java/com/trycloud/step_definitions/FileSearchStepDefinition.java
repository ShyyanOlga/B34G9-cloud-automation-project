package com.trycloud.step_definitions;

import com.trycloud.pages.FileSearchPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class FileSearchStepDefinition {

    FileSearchPage fileSearchPage = new FileSearchPage();


    @Given("Click Contacts page module")
    public void click_contacts_page_module() {
        BrowserUtils.waitForClickablility(fileSearchPage.deck,10);
      fileSearchPage.deck.click();

    }
    @When("Click contact icon")
    public void click_contact_icon() {
        BrowserUtils.waitForVisibility(fileSearchPage.searchIcon,10);
        fileSearchPage.searchIcon.click();

    }
    @When("File search input box appeared")
    public void file_search_input_box_appeared() {
        BrowserUtils.waitForVisibility(fileSearchPage.fileNameSearchInputBox,10);
        fileSearchPage.fileNameSearchInputBox.click();

    }
    @When("Type in {string} file name")
    public void type_in_file_name(String string) {
    BrowserUtils.waitForClickablility(fileSearchPage.fileNameSearchInputBox,10);
    fileSearchPage.fileNameSearchInputBox.sendKeys(string);
    }
    @When("File appeared under the search input box")
    public void file_appeared_under_the_search_input_box() {
        BrowserUtils.sleep(10);
    BrowserUtils.waitForVisibility(fileSearchPage.searchedFileDisplayed, 10);

    fileSearchPage.searchedFileDisplayed.isDisplayed();
    }
    @When("Click on matching file")
    public void click_on_matching_file() {


        BrowserUtils.waitForClickablility(fileSearchPage.searchedFileDisplayed,10);
        fileSearchPage.searchedFileDisplayed.click();
    }
    @Then("Redirected to files module")
    public void redirected_to_files_module() {
        BrowserUtils.waitForVisibility(fileSearchPage.files,10);
        fileSearchPage.files.isEnabled();


    }
    @Then("File appeared in the list of files")
    public void file_appeared_in_the_list_of_files() {
    BrowserUtils.waitForVisibility(fileSearchPage.fileDisplayedOnTheCenterOfTheMonitor,10);
        fileSearchPage.fileDisplayedOnTheCenterOfTheMonitor.isDisplayed();
    }
    @Then("File is displayed on the left")
    public void file_is_displayed_on_the_left() {
    BrowserUtils.waitForVisibility(fileSearchPage.fileInformationDisplayedOnTheLeft,10);

        Assert.assertTrue(fileSearchPage.fileInformationDisplayedOnTheLeft.isDisplayed());
    }

    @Given("Click Calendar page module")
    public void click_calendar_page_module() {

        BrowserUtils.waitForClickablility(fileSearchPage.calendar,10);
        fileSearchPage.calendar.click();
    }

    @Given("Click Photos page module")
    public void click_photos_page_module() {
        BrowserUtils.waitForClickablility(fileSearchPage.photos,10);
        fileSearchPage.photos.click();
    }

    @Given("Click Activity page module")
    public void click_activity_page_module() {
        BrowserUtils.waitForClickablility(fileSearchPage.activity,10);
        fileSearchPage.activity.click();
    }

    @Given("Click Files page module")
    public void click_files_page_module() {
       BrowserUtils.waitForClickablility(fileSearchPage.files,10);
        fileSearchPage.files.click();
    }
    @Given("Click Circles page module")
    public void click_circles_page_module() {
        BrowserUtils.waitForClickablility(fileSearchPage.circles,10);
        fileSearchPage.circles.click();
    }

    @Given("Click Deck page module")
    public void click_deck_page_module() {
        BrowserUtils.waitForClickablility(fileSearchPage.deck,10);
        fileSearchPage.deck.click();
    }

    @Given("Click Talk page module")
    public void click_talk_page_module() {
       BrowserUtils.waitForClickablility(fileSearchPage.talk,10);
        fileSearchPage.talk.click();
    }

    @Then("Click trycloud icon")
    public void click_trycloud_icon() {
        BrowserUtils.waitForClickablility(fileSearchPage.trycloudLogoIcon,10);
        fileSearchPage.trycloudLogoIcon.click();

    }
    @Then("Redirected to the Dashboard")
    public void redirected_to_the_dashboard() {
        BrowserUtils.waitForVisibility(fileSearchPage.customizeModule,10);

        BrowserUtils.verifyURLContains("dashboard");


    }

}
