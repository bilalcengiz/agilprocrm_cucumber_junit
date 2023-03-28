package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "input[name='USER_LOGIN']")
    public WebElement inputUsername;

    @FindBy(css = "input[name='USER_PASSWORD']")
    public WebElement inputUserPassword;

    @FindBy(css = "input[class='login-btn']")
    public WebElement inputloginButton;


    // -------------------Methods related to page------------------------------------

    public void login(String username, String password){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        inputUsername.sendKeys(username);
        inputUserPassword.sendKeys(password);
        inputloginButton.click();

    }
    



}
