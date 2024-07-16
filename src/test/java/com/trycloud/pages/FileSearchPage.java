package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileSearchPage extends BasePage {

    public FileSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement fileNameSearchInputBox;

    @FindBy(xpath = "//span[@class='unified-search__result-content']//strong[.='us_06.png']")
    public WebElement searchedFileDisplayed; ////h3[@title='us_06.png']
    ////span[@class='unified-search__result-content']//strong[.='us_06.png']
    ////div[@role='img']->the one i used

    public void locationOfTheElement(){

        Point location = searchedFileDisplayed.getLocation();
        int xCoordinate = location.getX();
        int yCoordinate = location.getY();
       // Actions actions = new Actions(Driver.getDriver());
       // actions.moveByOffset(xCoordinate, yCoordinate).click().build().perform();
    }

    //Locator for element no fount //h2[@class='empty-content__title']
    // another locator for not fount element  //h2[@class='empty-content__title']

    @FindBy(xpath = "//h2[@class='empty-content__title']")
    public WebElement elementNotFount;  // When searchedFileDisplayed; is not found


    //public WebElement files; from BasePage file

    @FindBy(xpath = "//div[@class='app-sidebar-header__info']")
    public WebElement fileInformationDisplayedOnTheLeft;

    @FindBy(xpath = "//tr[@data-id='15133']")
    public WebElement fileDisplayedOnTheCenterOfTheMonitor;////tr[@data-id='15133']

    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement trycloudLogoIcon;

    @FindBy(xpath = "//a[.='Customize']")
    public WebElement customizeModule;
}
