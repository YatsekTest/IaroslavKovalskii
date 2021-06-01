Feature: Jdi site testing

  Scenario: Different Elements Page test
    Given I open JDI GitHub site
    And I login as user 'Roman Iovlev'
    When I open Different Elements page from header menu Service
    And I select checkboxes 'Water', 'Wind'
    And I select radio 'Selen'
    And I select 'Yellow' in dropdown menu
    Then Logs corresponding to the selected items are displayed