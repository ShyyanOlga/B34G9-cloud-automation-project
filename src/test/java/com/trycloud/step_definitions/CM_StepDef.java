package com.trycloud.step_definitions;


import com.trycloud.pages.BasePage;
import com.trycloud.pages.CM_Page;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CM_StepDef {

    BasePage basePage = new BasePage() {};
    CM_Page cmPage = new CM_Page();

    @Given("the user clicks on calender module")
    public void the_user_clicks_on_calender_module() {

        basePage.calendar.click();
    }

    @Then("the user clicks on the actions button")
    public void theUserClicksOnTheActionsButton() {

        cmPage.actionsButton.click();
    }

    @Then("the user clicks on the daily calender view")
    public void the_user_clicks_on_the_daily_calender_view() {

        cmPage.dayButton.click();

    }

    @Then("the user should see the daily calender view displayed")
    public void the_user_should_see_the_daily_calender_view_displayed() {

        cmPage.dayHeaderDate.isDisplayed();

    }


    @Then("the user clicks on the weekly calender view")
    public void theUserClicksOnTheWeeklyCalenderView() {

        cmPage.weekButton.click();

    }

    @And("the user should see the weekly calender view displayed")
    public void theUserShouldSeeTheWeeklyCalenderViewDisplayed() {


        cmPage.weekHeaderDate.isDisplayed();

    }

    @Then("the user clicks on the monthly calender view")
    public void theUserClicksOnTheMonthlyCalenderView() {

        BrowserUtils.waitForClickablility(cmPage.monthButton,10);
        cmPage.monthButton.click();

    }

    @And("the user should see the monthly calender view displayed")
    public void theUserShouldSeeTheMonthlyCalenderViewDisplayed() {

        BrowserUtils.waitForVisibility(cmPage.monthHeaderDate,10);
        cmPage.monthHeaderDate.isDisplayed();

    }

    @Given("user clicks on new event button")
    public void userClicksOnNewEventButton() {

        BrowserUtils.waitForClickablility(cmPage.newEventButton,10);
        cmPage.newEventButton.click();
    }

    @Then("user should see event detail icon pops-up having \\(Event Title,date from-to, All day check box, more&save buttons)")
    public void userShouldSeeEventDetailIconPopsUpHavingEventTitleDateFromToAllDayCheckBoxMoreSaveButtons() {
        BrowserUtils.waitForVisibility(cmPage.eventTitle,10);
        cmPage.eventTitle.isDisplayed();

    }

    @Then("user should be able to fill out the event detail and click on the save button")
    public void userShouldBeAbleToFillOutTheEventDetailAndClickOnTheSaveButton() {

        BrowserUtils.waitForClickablility(cmPage.saveButton,10);
        cmPage.saveButton.click();
    }

    @And("user should see an event created on the related day through the Monthly Calendar view")
    public void userShouldSeeAnEventCreatedOnTheRelatedDayThroughTheMonthlyCalendarView() {

        BrowserUtils.waitForVisibility(cmPage.eventTestTitle,10);
        cmPage.eventTestTitle.isDisplayed();


    }


}
