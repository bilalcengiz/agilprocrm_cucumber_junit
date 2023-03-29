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


    @FindBy(css = "a[title='Applications'] span[data-role='item-text']")
    public WebElement applicationsButton;







}
