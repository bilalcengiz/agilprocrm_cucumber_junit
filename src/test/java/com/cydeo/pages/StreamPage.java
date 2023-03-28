package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StreamPage {

    public StreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css="span[class='menu-favorites-more-text']")
    public WebElement moreButton;


    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/div[1]/ul/li[14]/ul/li[3]/a/span")
    public WebElement applicationsButton;







}
