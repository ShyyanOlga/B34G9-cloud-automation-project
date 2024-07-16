package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardModificationPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardModificationStepDefinition {
    DashboardModificationPage dashboardModificationPage = new DashboardModificationPage();

    @Then("Can see all {int} modules on the page displayed")
    public void can_see_all_modules_on_the_page_displayed(Integer int1) {
      dashboardModificationPage.waitForVisibilityOfAllModules(dashboardModificationPage.tenModulesDashboard,10);
      int expectedModules = 9; //12
      int actualModules = dashboardModificationPage.tenModulesDashboard.size();
        System.out.println("expectedModules = " + expectedModules);
        System.out.println("actualModules = " + actualModules);

      //  for (WebElement each : dashboardModificationPage.tenModulesDashboard) {
     //       System.out.println("each.getText() = " + each.getAttribute("data-id"));
     //   }
        dashboardModificationPage.getDataIdValue("data-id");

        Assert.assertEquals(expectedModules,actualModules);
    }

    @When("Click user icon")
    public void click_user_icon() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.userIcon, 10);
        dashboardModificationPage.userIcon.click();
    }
    @When("Dropdown menu appeared")
    public void dropdown_menu_appeared() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.dropdownMenu,10);
        dashboardModificationPage.dropdownMenu.isDisplayed();

    }
    @Then("See user name displayed")
    public void see_user_name_displayed() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.userNameDisplayed,10);
        Assert.assertTrue(dashboardModificationPage.userNameDisplayed.isDisplayed());
    }

    @When("Click customize module")
    public void click_customize_module() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.customizeModule,10);
        dashboardModificationPage.customizeModule.click();

    }
    @When("Popup window is displayed")
    public void popup_window_is_displayed() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.popupWindowIsDisplayedWidgets,10);
        BrowserUtils.verifyElementDisplayed(dashboardModificationPage.popupWindowIsDisplayedWidgets);


    }
    @When("See {int} widgets displayed")
    public void see_widgets_displayed(Integer int1) {

       dashboardModificationPage.waitForVisibilityOfWidgetsDisplayed(dashboardModificationPage.allWidgetsDisplayed, 10);

        int expectedWidgets = 7;
        int actualWidgets = dashboardModificationPage.allWidgetsDisplayed.size();
        Assert.assertEquals(expectedWidgets, actualWidgets);

    }
    @When("Click on widgets")
    public void click_on_widgets() {
        dashboardModificationPage.waitForVisibilityOfAllWidgetsSelected(dashboardModificationPage.allWidgetsDisplayed,10);

        for (WebElement each : dashboardModificationPage.allWidgetsDisplayed) {
            each.click();
        }




    }
    @When("Widgets are selected")
    public void widgets_are_selected() {
dashboardModificationPage.waitForVisibilityOfAllWidgetsSelected(dashboardModificationPage.allWidgetsDisplayed,10);
        for (WebElement each : dashboardModificationPage.allWidgetsDisplayed) {
           Assert.assertTrue(each.isEnabled());
        }
     //   dashboardModificationPage.testWidgetsSelected(dashboardModificationPage.allWidgetsSelected);
    }

    @When("Click X button")
    public void click_x_button() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.xButton, 10);
      //  BrowserUtils.sleep(2);
        dashboardModificationPage.xButton.click();
    }


    @When("Selected all Widgets are appeared on the screen")
    public void selected_all_widgets_are_appeared_on_the_screen() {
      dashboardModificationPage.waitForVisibilityOfAllWidgetsSelected(dashboardModificationPage.allWidgetsSelected,10);
      BrowserUtils.sleep(10);


      //trying
      int expectedWidgetsSelected = 0;

        for (WebElement widget : dashboardModificationPage.allWidgetsSelected) {
            if(widget.isSelected()){
                expectedWidgetsSelected++;
            }
        }



      int actualWidgetsSelected = 0;

        for (WebElement widget : dashboardModificationPage.allWidgetsSelected) {
            if (widget.isSelected()){
                actualWidgetsSelected++;
            }
        }
              //dashboardModificationPage.allWidgetsSelected.size();
     Assert.assertEquals(expectedWidgetsSelected, actualWidgetsSelected);
    }

    @When("Click on the online status")
    public void click_on_the_online_status() {
    BrowserUtils.waitForClickablility(dashboardModificationPage.onlineStatusSelection,10);
        dashboardModificationPage.onlineStatusSelection.click();
    }
    @When("Click Away")
    public void click_away() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.awayCardStatus,10);
        dashboardModificationPage.awayCardStatus.click();
    }
    @When("Away is selected")
    public void away_is_selected() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.awayCardStatus,10);
        dashboardModificationPage.awayCardStatus.isSelected();


    }

    @Then("Away status is selected")
    public void away_status_is_selected() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.awayStatusPicture,10);

        Assert.assertTrue(dashboardModificationPage.awayStatusPicture.isDisplayed());
    }



    @When("Click Do not disturb")
    public void click_do_not_disturb() {
      BrowserUtils.waitForClickablility(dashboardModificationPage.doNotDisturbCard,10);
        dashboardModificationPage.doNotDisturbCard.click();
    }
    @When("Do not disturb status is selected")
    public void do_not_disturb_status_is_selected() {
     BrowserUtils.waitForVisibility(dashboardModificationPage.doNotDisturbSelectedPicture,20);
     Assert.assertTrue(dashboardModificationPage.doNotDisturbSelectedPicture.isDisplayed());
    }

    @When("Click Invisible")
    public void click_invisible() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.invisibleCard,10);
        dashboardModificationPage.invisibleCard.click();
    }
    @When("Invisible status is selected")
    public void invisible_status_is_selected() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.invisibleSelectedPicture,20);
        Assert.assertTrue(dashboardModificationPage.invisibleSelectedPicture.isDisplayed());
    }

    @When("Click In a meeting")
    public void click_in_a_meeting() {
    BrowserUtils.waitForClickablility(dashboardModificationPage.inTheMeeting,10);
        dashboardModificationPage.inTheMeeting.click();
    }
    @When("Click Set status message")
    public void click_set_status_message() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.setStatusButton, 10);
        dashboardModificationPage.setStatusButton.click();

    }
    @Then("In a meeting status is selected")
    public void in_a_meeting_status_is_selected() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.inTheMeetingStatusSelected, 10);

        Assert.assertTrue(dashboardModificationPage.inTheMeetingStatusSelected.isDisplayed());
    }

    @When("Click Commuting")
    public void click_commuting() {
    BrowserUtils.waitForClickablility(dashboardModificationPage.commuting,10);
        dashboardModificationPage.commuting.click();
    }
    @Then("Commuting status is selected")
    public void commuting_status_is_selected() {
    BrowserUtils.waitForClickablility(dashboardModificationPage.commutingStatusIsSelected, 10);

    Assert.assertTrue(dashboardModificationPage.commutingStatusIsSelected.isDisplayed());
    }

    @When("Click Working remotely")
    public void click_working_remotely() {
    BrowserUtils.waitForClickablility(dashboardModificationPage.workingRemotely, 10);
        dashboardModificationPage.workingRemotely.click();
    }
    @Then("Working remotely status is selected")
    public void working_remotely_status_is_selected() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.workingRemotelyStatusIsSelected,10);

        Assert.assertTrue(dashboardModificationPage.workingRemotelyStatusIsSelected.isDisplayed());

    }

    @When("Click Out sick")
    public void click_out_sick() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.outSick, 10);
        dashboardModificationPage.outSick.click();
    }
    @Then("Out sick status is selected")
    public void out_sick_status_is_selected() {
    BrowserUtils.waitForClickablility(dashboardModificationPage.outSickStatusIsSelected, 10);
    Assert.assertTrue(dashboardModificationPage.outSickStatusIsSelected.isDisplayed());
    }

    @When("Click Online")
    public void click_online() {

      //  dashboardModificationPage.helperToDeselectStatus();
        BrowserUtils.waitForClickablility(dashboardModificationPage.onlineCard, 10);
        dashboardModificationPage.onlineCard.click();
    }
    @When("Online status is selected")
   public void online_status_is_selected() {
        BrowserUtils.waitForVisibility
               (dashboardModificationPage.onlineCard, 10);
        BrowserUtils.sleep(5);
        dashboardModificationPage.onlineCard.isSelected();
   }


    @Then("Online status is displayed")
    public void onlineStatusIsDisplayed() {
        BrowserUtils.waitForClickablility(dashboardModificationPage.onlineStatusPicture, 10);

        Assert.assertTrue(dashboardModificationPage.onlineStatusPicture.isDisplayed());
    }

    @When("Click Vacationing")
    public void click_vacationing() {
    BrowserUtils.waitForClickablility(dashboardModificationPage.vacationing, 10);
        dashboardModificationPage.vacationing.click();
    }
    @Then("Vacationing status is selected")
    public void vacationing_status_is_selected() {
        BrowserUtils.waitForVisibility(dashboardModificationPage.vacationingStatusIsSelected, 10);
        Assert.assertTrue(dashboardModificationPage.vacationingStatusIsSelected.isDisplayed());

    }

/*
    @Then("Unselect all Widgets if selected")
    public void unselectAllWidgetsIfSelected() {
        System.out.println("start");

        BrowserUtils.waitForClickablility(dashboardModificationPage.customizeModule,10);

        dashboardModificationPage.customizeModule.click();
        BrowserUtils.sleep(2);
        dashboardModificationPage.waitForVisibilityOfAllWidgetsSelected(dashboardModificationPage.allWidgetsSelected,10);
        BrowserUtils.sleep(2);

        for (WebElement each : dashboardModificationPage.allWidgetsSelected) {
            each.click();
        }
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(dashboardModificationPage.xButton, 10);
        dashboardModificationPage.xButton.click();
        System.out.println("finished");
}

 */
}
