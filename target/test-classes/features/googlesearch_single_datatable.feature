@datatable1
Feature: Single ata table

  Scenario Outline: TC01_google search test
    Given kullanici google sayfasina gier
    And user searches "<value>"
    Then verify results has "<value>"

    Examples: Test Data
    |value|
    |Selenium|
    |Cucumber|
    |Automation Tester|
    |Istanbul         |