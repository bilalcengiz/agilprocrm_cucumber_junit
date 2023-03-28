@01 @AGL-392
Feature:  Installing or managing the applications.

  Background: For the scenarios in the feature file, user is expected to be on Activity_Stream page
    Given User is on the Activity_Stream page of the agileprocrm.com

  @01.01  @AGL-382
  Scenario: Displaying application page
    When User clicks More... button
    And User clicks Applications button
    Then User display All applications text on the page

  @01.02  @AGL-390
  Scenario: Sending a request for installing if there is no permission for installing
    When User clicks More... button
    And User clicks Applications button
    And User clicks one of the view button of the applications on the screen randomly
    And User clicks INSTALL button
    And User clicks SEND button on the popup window
    Then User displays sent message

  @01.03  @AGL-391
  Scenario: Displaying the application's description, versions, support and installation
    When User clicks More... button
    And User clicks Applications button
    And User clicks one of the view button of the applications on the screen randomly
    And User clicks Description button
    And User displays Description message
    And User clicks Versions button
    And User displays Versions message
    And User clicks Support button
    And User displays Support message
    And User clicks install definition button
    Then User displays installation message

