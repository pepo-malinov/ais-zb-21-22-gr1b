
Feature: Регистрация на нов потребител

  Scenario: Регистрация с валидни входни данни
    Given Поптребителя отваря формата за регистарция
    When Въведежда потребителско име
    And въвежда парола
    And натиска бутона за регистрация
    Then Вижда съобщение за успех
    
  Scenario: Регистрация без парола
    Given Поптребителя отваря формата за регистарция
    When Въведежда потребителско име
    And натиска бутона за регистрация
    Then Вижда съобщение за липса на парола
    
  Scenario: Регистрация без име
    Given Поптребителя отваря формата за регистарция
    When въвежда парола
    And натиска бутона за регистрация
    Then Вижда съобщение за липса на име


