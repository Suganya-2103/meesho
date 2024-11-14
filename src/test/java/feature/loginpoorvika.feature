Feature: Meesho Login and Add to Cart

  Scenario: Login and add a product to the cart
    Given I am on the login page
    When I enter my username "<username>" and password "<password>"
    And I search for the product "OnePlus Nord CE 4 Lite 5G"
    And I select the product "OnePlus Nord CE 4 Lite 5G ( Mega Blue, 8GB-256GB )"
    Then I add the product to the cart
    And I click on the Go to cart
    And I click on continue
    And I proceed to the summary screen

  Examples:
    | username   | password |
    | 9025661542 | 123456   |
