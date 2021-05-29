Feature: Jdi site testing

  Scenario: Different Elements Page test
    Given I open main Jdi page
    And I login as user 'Roman Iovlev'
    When I open Different Elements page from header menu Service
    And I select checkboxes 'Water', 'Wind'
    And I select radio 'Selen'
    And I select 'Yellow' in dropdown menu
    Then Logs are displayed and are corresponding to selected items