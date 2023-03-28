package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.MarketPlacePage;
import com.cydeo.pages.StreamPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InstallingAndManagingApplications_StepDefinitions {

    LoginPage loginPage= new LoginPage();
    StreamPage streamPage=new StreamPage();
    MarketPlacePage marketPlacePage=new MarketPlacePage();


    /**Displaying application page @01.01
     */
    @Given("User is on the Activity_Stream page of the agileprocrm.com")
    public void user_is_on_the_activity_stream_page_of_the_agileprocrm_com() {
        loginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }

    @When("User clicks More... button")
    public void user_clicks_more_button() {
        streamPage.moreButton.click();
    }

    @And("User clicks Applications button")
    public void user_clicks_applications_button() {
        streamPage.applicationsButton.click();
    }

    @Then("User display All applications text on the page")
    public void user_display_all_applications_text_ont_he_page() {
        Assert.assertEquals("All applications", marketPlacePage.Allaplicationstext.getText() );
    }
    //--------------------------------------------------------------------------------------------


    /**Sending a request for installing if there is no permission for installing @01.02
     */

    @And("User clicks one of the view button of the applications on the screen randomly")
    public void user_clicks_one_of_the_view_button_of_the_applications_on_the_screen_randomly() {
        marketPlacePage.randomlyClickViewButton();
        Utils.sleep(5);
    }
    
    @And("User clicks INSTALL button")
    public void user_clicks_install_button() {
        marketPlacePage.handleApplicationIframe();
        marketPlacePage.installButton.click();
    }
    
    @And("User clicks SEND button on the popup window")
    public void user_clicks_send_button_on_the_popup_window() {
        marketPlacePage.sendButton.click();
    }

    @Then("User displays sent message")
    public void user_displays_sent_message(){
        System.out.println(marketPlacePage.sentMessage.getText());
        Assert.assertTrue(marketPlacePage.sentMessage.getText().contains("Your request to install the app has been sent "));
    }

    //--------------------------------------------------------------------------------------------


    /**Displaying the application's description, versions, support and installation @01.03
     */

    @And("User clicks Description button")
    public void user_clicks_description_button(){
        marketPlacePage.handleApplicationIframe();
        marketPlacePage.descriptionButton.click();
        Utils.sleep(3);
    }

    @And("User displays Description message")
    public void user_displays_description_message(){
        marketPlacePage.descriptionMessage.isDisplayed();
    }

    @And("User clicks Versions button")
    public void user_clicks_versions_button() {
        marketPlacePage.versionsButton.click();
        Utils.sleep(3);
    }
    
    @And("User displays Versions message")
    public void user_displays_versions_message() {
        marketPlacePage.versionsMessage.isDisplayed();
    }

    @And("User clicks Support button")
    public void user_clicks_support_button() {
        marketPlacePage.supportButton.click();
        Utils.sleep(3);
    }

    @And("User displays Support message")
    public void user_displays_support_message() {
        marketPlacePage.supportMessage.isDisplayed();
    }

    @And("User clicks install definition button")
    public void user_clicks_instal_definition_button() {
        marketPlacePage.installDefinitionButton.click();
        Utils.sleep(3);
    }

    @Then("User displays installation message")
    public void user_displays_installation_message() {
        marketPlacePage.installationMessage.isDisplayed();
    }


}
