Feature: Working with Background keyword



  @SmokeTest
  Scenario: Shotlisting the items
    Given user searches an Item
    When the user click on shorlist
    Then the item should be in shorlisted


   Scenario: Payment and Checkout
     Given user is logged in
     When the user goes to cart and clicks payment and checkout
     Then the user must redirect to payments page
