package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DashboardModificationPage extends BasePage {

    public DashboardModificationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@tabindex='-1']") // 1 out of 9
    public List<WebElement>tenModulesDashboard;////ul[@id='appmenu'] -> all together

    // "data-id"  -> for getting the value of data-id attribute

    public void getDataIdValue(String attribute){
        for (WebElement each : tenModulesDashboard) {
            System.out.println("each.getText() = " + each.getAttribute(attribute));
        }
    }
    public List<WebElement>waitForVisibilityOfAllModules(List<WebElement> tenModulesDashboard, int time){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));

    return wait.until(ExpectedConditions.visibilityOfAllElements(tenModulesDashboard));
    }

    //userIcon from BasePage

    @FindBy(xpath = "//nav[@id='expanddiv']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement userNameDisplayed;

    @FindBy(xpath = "//a[.='Customize']")
    public WebElement customizeModule;

    @FindBy(xpath = "//div[@class='modal-container']")
    public WebElement popupWindowIsDisplayedWidgets;

    @FindBy(xpath = "//li/label")
    public List<WebElement> allWidgetsDisplayed;

    public List<WebElement>waitForVisibilityOfWidgetsDisplayed(List<WebElement> allWidgetsDisplayed, int time){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));

        return wait.until(ExpectedConditions.visibilityOfAllElements(allWidgetsDisplayed));
    }


    @FindBy(xpath = "//div[@class='modal-wrapper modal-wrapper--normal']")
    public WebElement screenSpace;


    @FindBy(xpath = "//div[@class='panel']")
    public List<WebElement>allWidgetsSelected;

    public List<WebElement>waitForVisibilityOfAllWidgetsSelected(List<WebElement> allWidgetsSelected, int time){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));

        return wait.until(ExpectedConditions.visibilityOfAllElements(allWidgetsSelected));
    }

    public void testWidgetsSelected(List<WebElement>allWidgetsSelected){
        allWidgetsSelected.forEach(widgetsSelected-> Assert.assertTrue(widgetsSelected.isSelected()));
    }

    @FindBy(xpath = "//button[@rel='noreferrer noopener']")
    public WebElement xButton;
//---------------------------

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement onlineStatusSelection;

    @FindBy(xpath = "//label[@for='user-status-online-status-online']")////label[@for='user-status-online-status-online']
    ////label[@class='user-status-online-select__label icon-user-status-online']
    public WebElement onlineCard;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement awayCardStatus;

    @FindBy(xpath = "//span[@class='user-status-menu-item__toggle-icon icon-user-status-away']")
    public WebElement awayStatusPicture;

    @FindBy(xpath = "(//em[@class='user-status-online-select__subline'])[3]")
    public WebElement doNotDisturbCard;

    @FindBy(xpath = "(//em[@class='user-status-online-select__subline'])[4]")
    public WebElement invisibleCard;

    @FindBy(xpath = "//a[normalize-space()='Do not disturb']")
    public WebElement doNotDisturbSelected;

    @FindBy(xpath = "//div[@class='user-status-menu-item']/a/span")
    ////span[@class='user-status-menu-item__toggle-icon icon-user-status-dnd']
    public WebElement doNotDisturbSelectedPicture;

    @FindBy(xpath = "//a[normalize-space()='Online']")
    public WebElement onlineSelected;

    @FindBy(xpath = "//span[@class='user-status-menu-item__toggle-icon icon-user-status-online']")
    public WebElement onlineStatusPicture;

    @FindBy(xpath = "//a[normalize-space()='Away']")
    public WebElement awaySelected;
    @FindBy(xpath = "//a[normalize-space()='Invisible']")
    public WebElement invisibleSelected;

    @FindBy(xpath = "//div[@class='user-status-menu-item']/a/span")
    ////span[@class='user-status-menu-item__toggle-icon icon-user-status-invisible']
    public WebElement invisibleSelectedPicture;

    @FindBy(xpath = "//span[normalize-space()='In a meeting']")
    public WebElement inTheMeeting;

    @FindBy(xpath = "//button[normalize-space()='Set status message']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//a[normalize-space()='\uD83D\uDCC5 In a meeting']")
    public WebElement inTheMeetingStatusSelected;

    @FindBy(xpath = "//span[normalize-space()='Commuting']")
    public WebElement commuting;

    @FindBy(xpath = "//a[normalize-space()='\uD83D\uDE8C Commuting']")
    public WebElement commutingStatusIsSelected;

    @FindBy(xpath = "//span[normalize-space()='Working remotely']")
    public WebElement workingRemotely;

    @FindBy(xpath = "//a[normalize-space()='\uD83C\uDFE1 Working remotely']")
    public WebElement workingRemotelyStatusIsSelected;

    @FindBy(xpath = "//span[normalize-space()='Out sick']")
    public WebElement outSick;

    @FindBy(xpath = "//a[normalize-space()='\uD83E\uDD12 Out sick']")
    public WebElement outSickStatusIsSelected;

    @FindBy(xpath = "//button[normalize-space()='Clear status message']")
    public WebElement clearStatusButton;

    public void helperToDeselectStatus(){
        BrowserUtils.waitForClickablility(userIcon, 10);
        userIcon.click();
        BrowserUtils.waitForClickablility(outSick, 10);
        outSick.click();
        BrowserUtils.waitForClickablility(clearStatusButton, 10);
        clearStatusButton.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Vacationing']")
    public WebElement vacationing;
    @FindBy(xpath = "//a[normalize-space()='\uD83C\uDF34 Vacationing']")
    public WebElement vacationingStatusIsSelected;

    public void deselectWidgets(){
        List<WebElement> allWidgetsSelected = Driver.getDriver().findElements(By.xpath("//div[@class='panel']"));




    }
}
