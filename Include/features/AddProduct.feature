@AddProductFeature
Feature: Add Product
  As a seller, I can add product

  Background: 
    Given the user is logged in as a seller
    And the seller is on Add Product Page

  @TC.Add.001 @PositiveTest
  Scenario Outline: Seller adds a product successfully
    When the seller inputs "<product_name>", "<product_price>", "<category>", "<location>", and "<description>"
    And the seller uploads a photo from camera
    And the seller taps publish button
    Then the product is added to my listings

    Examples: 
      | product_name | product_price | category         | location | description         |
      | Book         |        100000 | Hobi dan Koleksi | Jakarta  | New book, 100 pages |
