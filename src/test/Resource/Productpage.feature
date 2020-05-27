Feature:
  Background:
    Given user is on home page of aldo
    When user brings mouse cursor onto men and clicks on sub element - loafers
    Then user should be able to see result page

    Given user is on result page of loafers
    When user clicks on Price(high to low)
    Then user should be able to see all products by the order of price(high to low)

    Scenario:
      Given user is on result page of loafers with price(high to low) order
      When user clicks on the product - Drorelian
      And user clicks on size 9
      And user clicks on add to bag
      Then user should be able to see product - Drorelian 'add to bag' page