package com.trycloud.step_definitions;

import com.trycloud.pages.ProfileSettingsPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProfileSettingsStepDefinition {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();



    @When("Click user icon")
    public void click_user_icon() {
        BrowserUtils.waitForClickablility(profileSettingsPage.userIcon, 10);
        profileSettingsPage.userIcon.click();

    }


    @When("Dropdown menu appeared")
    public void dropdown_menu_appeared() {
        BrowserUtils.waitForVisibility(profileSettingsPage.dropDownMenuUnderUserIcon, 10);
        profileSettingsPage.dropDownMenuUnderUserIcon.isDisplayed();

    }
    @When("Click on the settings")
    public void click_on_the_settings() {
    BrowserUtils.waitForClickablility(profileSettingsPage.settingsUnderUserIcon, 10);
        profileSettingsPage.settingsUnderUserIcon.click();
    }
    @When("See personal info displayed on the middle of the screen")
    public void see_personal_info_displayed_on_the_middle_of_the_screen() {

        profileSettingsPage.waitForVisibilityOfElementsPersonalInfo(profileSettingsPage.personalSettingBoxesInTheMiddleOfTheScreen, 10);
        for (WebElement each : profileSettingsPage.personalSettingBoxesInTheMiddleOfTheScreen) {
           // each.isDisplayed();
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @When("See personal info displayed in the top left corner of the screen")
    public void see_personal_info_displayed_in_the_top_left_corner_of_the_screen() {
     BrowserUtils.waitForVisibility(profileSettingsPage.personalInfoTopLeftCorner, 10);
     Assert.assertTrue(profileSettingsPage.personalInfoTopLeftCorner.isDisplayed());
    }

    @When("Username in the user input box match with the name profile dropdown menu")
    public void username_in_the_user_input_box_match_with_the_name_profile_dropdown_menu() {
       String expected = profileSettingsPage.userNameInsideTheUserInputBox.getAttribute("value");

       String actual = profileSettingsPage.userNameUnderUserIcon.getAttribute("title");

       Assert.assertEquals(expected, actual);
    }

    @When("Type in the phone number input box {string}")
    public void type_in_the_phone_number_input_box(String phoneNumber) {
     BrowserUtils.waitForClickablility(profileSettingsPage.phoneNumberInputBox, 10);

     profileSettingsPage.phoneNumberInputBox.clear();


        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(Character.isDigit(c)){
                profileSettingsPage.phoneNumberInputBox.sendKeys(String.valueOf(c));
            } else if (Character.isLetter(c)) {
                profileSettingsPage.phoneNumberInputBox.sendKeys(String.valueOf(c));
                System.out.println("IT IS NOT A NUMERIC CHARACTER!!! : " +c);
            }
        }


 /*
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (Character.isDigit(c)) {
                profileSettingsPage.phoneNumberInputBox.sendKeys(String.valueOf(c));
            } else {
                System.out.println("It is not a numeric character: " + c);
            }

        }
        */

    }
    @Then("Should accept only {string}")
    public void should_accept_only(String string) {
        Assert.assertEquals(string, profileSettingsPage.phoneNumberInputBox.getAttribute("value"));

    }
}
