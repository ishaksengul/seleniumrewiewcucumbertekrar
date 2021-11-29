@facebooklogin
Feature: Login feature

  Scenario: facebook login
    Given user is on the facebook login page
    And user enters valid username "user@phptravels.com"
    And user enters valid password "demouser"
    Then verify login is successfull

