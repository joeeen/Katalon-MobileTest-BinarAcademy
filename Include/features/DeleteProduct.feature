@DeletProduct
Feature: Delete Product
As a seller, I can delete my product

  @TC.Del.001 @PositiveTest
  Scenario: Seller can delete their own product
    #Given the user is logged in as a seller
    #And the seller adds a new product
    When the seller deletes the product
    Then the product is deleted