package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileFunctionalityPage extends BasePage{

    public FileFunctionalityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Click file WebElement from BasePage class

    //@data-file -> value has name of the file
    @FindBy(xpath = "//tr[@data-file='try3.png']//span[@class='icon icon-more']")
    public WebElement threeDotsMenu;
    // all threeDotsMenu locator //span[@class='icon icon-more']
    // With index (//tr[@data-file='try3.png']//span[@class='icon icon-more'])[1]


    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addFavoriteOption;


    // @data-file='try3.png' -> name of the file
    @FindBy(xpath = "//tr[@data-file='try3.png']//div[@class='favorite-mark permanent']")
    public WebElement fileSelectedAsFavorite;

    @FindBy(xpath = "//li[@data-id='favorites']")
    public WebElement favoritesButton;

    @FindBy(xpath = "(//tr[@data-file='try3.png']//div[@class='favorite-mark permanent'])[2]")
    public WebElement favoriteFileOnNewPage;

    @FindBy(xpath = "(//tr[@data-file='try3.png']//span[@class='icon icon-more'])[2]")
    public WebElement threeDotsMenuInFavorites;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFavorites;

    // threeDotsMenu //span[.='Units_5__6_Assessments_Study_Guide (1)']/following-sibling::span

    @FindBy(xpath = "//span[.='Rename']")
    public WebElement renameOptionOnTheMenu;

    @FindBy(xpath = "//tr/td//span[.='Units_5__6_Assessments_Study_Guide (1)']")
    public WebElement fileNameInputBox;

    // name before renaming Units_5__6_Assessments_Study_Guide (1)

    @FindBy(xpath = "//tr/td//span[.='New Name']")
    public WebElement renamedFile;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsOptionOnTheMenu;

    @FindBy(xpath = "//div[@class='app-sidebar-header__info']")
    public WebElement detailsOptionOfTheFileOnTheLeft;


    @FindBy(xpath = "(//span[@class='icon icon-shared'])[9]")
    public WebElement angleSing;

    //detailsOptionOfTheFileOnTheLeft;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement inputBoxForComments;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement arrowButton;

    @FindBy(xpath = "//div[.='Nica']")
    public WebElement commentDisplayed;
}
