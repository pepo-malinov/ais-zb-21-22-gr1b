Feature: Вход в системата


  Scenario Outline: Вход в системата с параметри
    Given Потребителя отваря екрана за вход в системата
    When Въвежда име: "<name>"
    And въвежда парола: "<password>"
    And Натиска бутовна за вход в системата
    Then визуализира се съобщение: "<message>"

    Examples: 
      | name     | password | message  |
      | ivan     |   Pass123| success  |
      | wrongName|  Pass123 | Fail     |
      |          |  Pass123 | Fail     |
      |          |          | Fail     |
      |ivan      |          | Fail     |
      |ivan      |wrongPass | Fail     |
