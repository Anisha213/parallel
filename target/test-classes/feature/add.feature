Feature: One description of the requriment

  Scenario Outline: One description of the functionality
    Given User in the fg login page
    When The user to enter the valid "<username>" and "<password>"
    Then The user navigation to the next page

    Examples: 
      | username | password |
      | Anisha   |     1123 |
      | Rizwaan  |   786322 |
