@date_tables
Feature: data_tables

  Scenario Outline: TC_Create_And verify the test data creation
# Creating a reusable step that accept url and goes to that url
    Given user is on the "https://editor.datatables.net/" page
    And  user click on the new button
    And user enter the first name "<firstname>"
    And user enter the last name"<lastname>"
    And user enter the position "<position>"
    And user enter the office "<office>"
    And user enter the extension "<extension>"
    And user enter the start date "<startdate>"
    And user enter the salary "<salary>"
    And click on create button
    And search for the first name "<firstname>"
    Then verify the name field contains the first name "<firstname>"
    Then close the application


    Examples: test_data
      | firstname | lastname | position    | office | extension | startdate  | salary   |
      | john      | smith    | tester      | NYC    | 2134      | 2023-01-23 | 80000    |
      | sam       | walten   | businessman | LA     | 5262      | 2023-01-24 | 20000000 |
      | nancy     | brown    | developer   | Dallas | 2346      | 2023-01-25 | 85000    |
      | george    | bush     | politician  | Dallas | 9931      | 2023-01-26 | 98500    |
