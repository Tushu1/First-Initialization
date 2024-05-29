
@tag
Feature: Purchase the order from EcommerceWebsite
  I want to use this template for my feature file

	Background:
	Given I landed on Ecommerce Website
	
	
  @tag2
  Scenario Outline: Positive test of submitting the order
    Given Logged in with username <name> and password <password>
    When I add the product <productname> from Cart
    And Checkout <productname> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on the ConfirmationPage.

    Examples: 
      | name  													| password 	|	productName	|
      | agarwal.tush65@gmail.com 				| Tushu@123 |	ZARA COAT 3	|
