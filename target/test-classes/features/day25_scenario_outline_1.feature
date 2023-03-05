@scenario_outline
Feature: search_feature

  Background: opening_google_page
    Given user is on the google page

  Scenario Outline: search_scenario

    When user search for "<search_item>" on google
    Then verify the page title contains "<search_item>"
    #Then close the application

#    shift+\  = |
    Examples: test_data
      | search_item |
      | mercedes    |
      | tesla       |
      | lexus       |
      | bmw         |
      | nio         |
      | acura       |
