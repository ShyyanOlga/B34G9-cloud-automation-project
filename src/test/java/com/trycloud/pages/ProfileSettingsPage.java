package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProfileSettingsPage extends BasePage{

    public ProfileSettingsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // userIcon

    @FindBy(xpath = "//nav[@aria-label='Settings menu']")
    public WebElement dropDownMenuUnderUserIcon;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settingsUnderUserIcon;

    @FindBy(xpath = "//div[@class='personal-settings-setting-box']")
    public List<WebElement>personalSettingBoxesInTheMiddleOfTheScreen;
    public List<WebElement>waitForVisibilityOfElementsPersonalInfo(List<WebElement>personalSettingBoxesInTheMiddleOfTheScreen, int time){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfAllElements(personalSettingBoxesInTheMiddleOfTheScreen));
    }

    @FindBy(xpath = "//li[@class='active']//span")
    public WebElement personalInfoTopLeftCorner;

    @FindBy(xpath = "//input[@value='@###$']")
    public WebElement userNameInsideTheUserInputBox; ////input[@name='displayname']

    @FindBy(xpath = "//span[@title='@###$']")
    public WebElement userNameUnderUserIcon; ////span[normalize-space()='@###$']

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumberInputBox;
    // get value of attribute value to compare inputBox value
}
