package com.trycloud.step_definitions;

import com.trycloud.pages.FileFunctionalityPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class FileFunctionalityStepDefinition {
    FileFunctionalityPage fileFunctionalityPage = new FileFunctionalityPage();

    @When("Click file module")
    public void click_file_module() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.files, 10);
        fileFunctionalityPage.files.click();
    }
    @When("Redirected to file page")
    public void redirected_to_file_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("files"));

    }
    @When("Click tree dots menu on chosen file")
    public void click_tree_dots_menu_on_chosen_file() {
    BrowserUtils.waitForClickablility(fileFunctionalityPage.threeDotsMenu, 10);
        fileFunctionalityPage.threeDotsMenu.click();
    }
    @When("Dropdown menu appeared under tree dots menu")
    public void dropdown_menu_appeared_under_tree_dots_menu() {
        BrowserUtils.waitForVisibility(fileFunctionalityPage.dropdownMenu, 10);
        fileFunctionalityPage.dropdownMenu.isDisplayed();
    }
    @When("Click on add favorites")
    public void click_on_add_favorites() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.addFavoriteOption, 10);
        fileFunctionalityPage.addFavoriteOption.click();
    }
    @When("file was selected")
    public void file_was_selected() {
        BrowserUtils.waitForVisibility(fileFunctionalityPage.fileSelectedAsFavorite, 10);
        fileFunctionalityPage.fileSelectedAsFavorite.isSelected();

    }
    @When("Click favorite button")
    public void click_favorite_button() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.favoritesButton, 10);
        fileFunctionalityPage.favoritesButton.click();

    }
    @When("Redirected to favorite page")
    public void redirected_to_favorite_page() {
    Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("favorites"));
    }
    @Then("Chosen file is selected")
    public void chosen_file_is_selected() {

        Assert.assertTrue(fileFunctionalityPage.favoriteFileOnNewPage.isDisplayed());
    }
    @When("Click tree dots menu in favorites")
    public void click_tree_dots_menu_in_favorites() {
       BrowserUtils.waitForClickablility(fileFunctionalityPage.threeDotsMenuInFavorites,10);
        fileFunctionalityPage.threeDotsMenuInFavorites.click();
    }
    @When("Click remover from favorites")
    public void click_remover_from_favorites() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.removeFromFavorites, 10);
        fileFunctionalityPage.removeFromFavorites.click();
    }

    @When("Click rename")
    public void click_rename() {
        BrowserUtils.waitForVisibility(fileFunctionalityPage.renameOptionOnTheMenu, 10);
        fileFunctionalityPage.renameOptionOnTheMenu.click();

    }
    @When("Input box for file name appeared")
    public void input_box_for_file_name_appeared() {
        BrowserUtils.waitForVisibility(fileFunctionalityPage.fileNameInputBox, 10);
        fileFunctionalityPage.fileNameInputBox.isDisplayed();


    }
    JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
    @When("Type in new file name and click enter")
    public void type_in_new_file_name_and_click_enter() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.fileNameInputBox,10);
        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].textContent = 'New Name';", fileFunctionalityPage.fileNameInputBox);

    }
    @When("File renamed")
    public void file_renamed() {
        BrowserUtils.waitForVisibility(fileFunctionalityPage.renamedFile, 10);

        Assert.assertTrue(fileFunctionalityPage.renamedFile.isDisplayed());
    }

    @When("Click details")
    public void click_details() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.detailsOptionOnTheMenu, 10);
        fileFunctionalityPage.detailsOptionOnTheMenu.click();

    }
    @When("File details appeared on the left site of the screen with details")
    public void file_details_appeared_on_the_left_site_of_the_screen_with_details() {

        BrowserUtils.waitForVisibility(fileFunctionalityPage.detailsOptionOfTheFileOnTheLeft, 10);

        Assert.assertTrue(fileFunctionalityPage.detailsOptionOfTheFileOnTheLeft.isDisplayed());
    }

    @When("Click on the angle sign")
    public void click_on_the_angle_sign() {
    BrowserUtils.waitForClickablility(fileFunctionalityPage.angleSing, 10);
        fileFunctionalityPage.angleSing.click();
    }
    @When("File information displayed on the left site of the screen")
    public void file_information_displayed_on_the_left_site_of_the_screen() {
        BrowserUtils.waitForVisibility(fileFunctionalityPage.detailsOptionOfTheFileOnTheLeft, 10);
        fileFunctionalityPage.detailsOptionOfTheFileOnTheLeft.isDisplayed();

    }
    @When("Click comments button")
    public void click_comments_button() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.commentsButton, 10);
        fileFunctionalityPage.commentsButton.click();

    }
    @When("Input box for comment appeared")
    public void input_box_for_comment_appeared() {
        BrowserUtils.waitForVisibility(fileFunctionalityPage.inputBoxForComments, 10);
        fileFunctionalityPage.inputBoxForComments.isDisplayed();

    }
    @When("Type in comment")
    public void type_in_comment() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.inputBoxForComments, 10);
        fileFunctionalityPage.inputBoxForComments.sendKeys("Nica");
    }
    @When("Click on arrow button")
    public void click_on_arrow_button() {
        BrowserUtils.waitForClickablility(fileFunctionalityPage.arrowButton, 10);
        fileFunctionalityPage.arrowButton.click();

    }
    @Then("Comment appeared under the comment input box")
    public void comment_appeared_under_the_comment_input_box() {
    BrowserUtils.waitForVisibility(fileFunctionalityPage.commentDisplayed, 10);

        Assert.assertTrue(fileFunctionalityPage.commentDisplayed.isDisplayed());
    }

}
