package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class MarketPlacePage {

    public MarketPlacePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "pagetitle")
    public WebElement Allaplicationstext;

    @FindBy(xpath = "//div[@class='ui-btn ui-btn-xs ui-btn-light-border ui-btn-round']")
    public List<WebElement> viewApplicationButtons;

    @FindBy (xpath = "//iframe[@class='side-panel-iframe']")
    public WebElement openingIframe;

    @FindBy (xpath = "//a[@class='ui-btn ui-btn-md ui-btn-primary ui-btn-round js-employee-install-button']")
    public WebElement installButton;

    @FindBy (xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement sendButton;

    @FindBy(id = "popup-window-content-mp-detail-block")
    public WebElement sentMessage;

    @FindBy (xpath = "//div[@for='mp-detail-content-wrapper-desc']")
    public WebElement descriptionButton;


    @FindBy (xpath = "//div[@id='mp-detail-content-wrapper-desc']")
    public WebElement descriptionMessage;

    @FindBy(xpath = "//div[@for='mp-detail-content-wrapper-versions']")
    public WebElement versionsButton;

    @FindBy(xpath = "//div[@id='mp-detail-content-wrapper-versions']")
    public WebElement versionsMessage;

    @FindBy(xpath = "//div[@for='mp-detail-content-wrapper-support']")
    public WebElement supportButton;

    @FindBy(xpath = "//div[@id='mp-detail-content-wrapper-support']")
    public WebElement supportMessage;

    @FindBy(xpath = "//div[@for='mp-detail-content-wrapper-install']")
    public WebElement installDefinitionButton;

    @FindBy(xpath = "//*[@id='mp-detail-content-wrapper-install']")
    public WebElement installationMessage;




    // -------------------Methods related to page------------------------------------

    public void randomlyClickViewButton(){
        Random random= new Random();
        int randomNumber = random.nextInt(viewApplicationButtons.size()-1);
        viewApplicationButtons.get(randomNumber).click();

    }

    public void handleApplicationIframe(){
        Driver.getDriver().switchTo().frame(openingIframe);
        Utils.sleep(5);

    }


}
