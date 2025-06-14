Feature: Hotel rating check
  As a user
  I want to check the rating of a hotel
  So that I can make an informed decision about my stay

  Scenario: First hotel on the list has rating 5 out of 5
    Given I open the Booking search page
    When I search hotels in "Париж" from 3 to 7 days ahead for 3 adults and 2 rooms
    And I filter by 5-star hotels and sort by stars ascending
    Then the first hotel rating should be "5 из 5"