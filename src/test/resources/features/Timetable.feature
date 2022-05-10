Feature: Search Connection

  @wip
  Scenario Outline: Search connection
    Given the user on the search timetable page
    When the user enters the stations "WARSZAWA-" "CZĘSTOCHOWA-"
    And the user enters "<day>" "<month>" "<year>"
    Then the user clicks on SEARCH CONNECTION

    Examples:
      | day | month    | year |
      | 12  | December | 2020 |