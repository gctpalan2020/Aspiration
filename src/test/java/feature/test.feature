
 Feature: Aspiration Page Verification Feature
 

  Scenario: Verify Aspiration webpage
    Given user is  on homepage
    When user navigates to Spend and Save Page, verify you see two products
    And user clicks Aspiration product, verify page displayed correctly
    And user clicks Aspiration Plus product, verify page displayed correctly
    Then Close the webpage
    
