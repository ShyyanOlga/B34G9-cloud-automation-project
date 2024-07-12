package com.trycloud.step_definitions;

import com.trycloud.pages.DeckPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DeckStepDefinition {

    DeckPage deckPage = new DeckPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("User click deck module")
    public void user_click_deck_module() {
        BrowserUtils.waitForClickablility(deckPage.deck, 10);
        deckPage.deck.click();

    }
    @When("User click hamburger menu")
    public void user_click_hamburger_menu() {
        BrowserUtils.waitForClickablility(deckPage.hamburgerMenu,10);
        deckPage.hamburgerMenu.click();

    }
    @When("User scroll and click on add Board button")
    public void user_scroll_and_click_on_add_board_button() {BrowserUtils.waitForClickablility(deckPage.addBoard,10);
        actions.moveToElement(deckPage.addBoard).click(deckPage.addBoard).perform();

    }
    @When("User see Board input box")
    public void user_see_board_input_box() {
        BrowserUtils.waitForClickablility(deckPage.boardNameInputBox, 10);
        Assert.assertTrue(deckPage.boardNameInputBox.isDisplayed());

    }
    @When("User type in board name input {string}")
    public void user_type_in_board_name_input(String string) {
        BrowserUtils.waitForClickablility(deckPage.boardNameInputBox, 10);
        deckPage.boardNameInputBox.sendKeys(string);


    }
    @When("User click arrow button of the created board")
    public void user_click_arrow_button_of_the_created_board() {

        BrowserUtils.waitForClickablility(deckPage.arrowSubmitButton,10);
        deckPage.arrowSubmitButton.click();

    }
    @When("{string} is displayed")
    public void is_displayed(String string) {
        BrowserUtils.waitForVisibility(deckPage.newBoardBordDisplayed,10);
        Assert.assertTrue(deckPage.newBoardBordDisplayed.isDisplayed());
    }

    @When("User click on a board name")
    public void user_click_on_a_board_name() {
        BrowserUtils.waitForClickablility(deckPage.newBoardBordDisplayed,10);
        deckPage.newBoardBordDisplayed.click();
    }
    @When("User click on the + button")
    public void user_click_on_the_button() {
     BrowserUtils.waitForClickablility(deckPage.addPlusButton,10);
     deckPage.addPlusButton.click();

    }
    @When("List name input box appaired")
    public void list_name_input_box_appaired() {
        BrowserUtils.waitForClickablility(deckPage.listNameInputBox,10);
        Assert.assertTrue(deckPage.listNameInputBox.isDisplayed());

    }
    @When("User type in to input box {string}")
    public void user_type_in_to_input_box(String string) {
        BrowserUtils.waitForClickablility(deckPage.listNameInputBox, 10);
        deckPage.listNameInputBox.sendKeys(string);
    }
    @When("User click arrow button of the list")
    public void user_click_arrow_button_of_the_list() {

        BrowserUtils.waitForClickablility(deckPage.listNameArrowSubmitButton, 10);
        deckPage.listNameArrowSubmitButton.click();

    }
    @Then("{string} appaired")
    public void appaired(String string) {

        BrowserUtils.waitForVisibility(deckPage.listDisplayed, 10);

        Assert.assertTrue(deckPage.listDisplayed.isDisplayed());
    }

    @When("User click + button to add card")
    public void user_click_button_to_add_card() {
        BrowserUtils.waitForClickablility(deckPage.plusAddCardButton, 10);
        deckPage.plusAddCardButton.click();

    }
    @When("Card name input box appaired")
    public void card_name_input_box_appaired() {

        BrowserUtils.waitForClickablility(deckPage.cardNameInputBox,10);
        Assert.assertTrue(deckPage.cardNameInputBox.isDisplayed());

    }
    @When("User type in card name input box {string}")
    public void user_type_in_card_name_input_box(String string) {
        deckPage.cardNameInputBox.sendKeys(string);
    }
    @When("User click arrow button")
    public void user_click_arrow_button() {
        BrowserUtils.waitForClickablility(deckPage.cardNameArrowSubmitButton,10);
        deckPage.cardNameArrowSubmitButton.click();

    }
    @When("{string} is displayed under the {string}")
    public void is_displayed_under_the(String string, String string2) {
       BrowserUtils.waitForVisibility(deckPage.cardDisplayed,10);

       Assert.assertTrue(deckPage.cardDisplayed.isDisplayed());
    }
    @Then("Card details are displayed  {string}")
    public void card_details_are_displayed(String string) {
        BrowserUtils.waitForVisibility(deckPage.detailsOfTheCard,10);

        Assert.assertTrue(deckPage.detailsOfTheCard.isDisplayed());
    }

    @When("User click {int} dots menu")
    public void user_click_dots_menu(Integer int1) {
      BrowserUtils.waitForClickablility(deckPage.threeDotsMenu,10);
      deckPage.threeDotsMenu.click();
    }
    @When("Dropdown menu displayed")
    public void dropdown_menu_displayed() {
        BrowserUtils.waitForClickablility(deckPage.dropdownOfgThreeDotsMenu,10);
        deckPage.dropdownOfgThreeDotsMenu.isDisplayed();

    }
    @When("User click assign to me")
    public void user_click_assign_to_me() {
        BrowserUtils.waitForClickablility(deckPage.assignToMeOption,10);
        deckPage.assignToMeOption.click();

    }
    @Then("User profile icon should be displayed near three dots icon")
    public void user_profile_icon_should_be_displayed_near_three_dots_icon() {
      BrowserUtils.waitForVisibility(deckPage.userProfileIcon,10);
      Assert.assertTrue(deckPage.userProfileIcon.isDisplayed());
    }

}
