#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login into PHP Travels
  I want to use this template for login into feature file

  @tag1
  Scenario: Validation of Login Page 
    Given To open a browser
    And To open Url of application
    When I enter username into the usernamefield of application
    And I enter password into the passwordfield of application
    And I click on ok button
    Then I validates the dashboard is openened
    