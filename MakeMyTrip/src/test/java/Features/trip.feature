Feature:Book Ticket on cheapPrice In MakeMYTrip


  Scenario Outline:open makemytrip and book Two Tickets
    Given launch browser and enter url
    Then click buses on  "<Pickuppoint>" and "<Destination>"
    Then click date search buses

    Examples:
      | Destination        | Pickuppoint          |
      | Chennai, Tamil Nadu | Bangalore, Karnataka |


  Scenario: Selecting the bus seat and pick up drop location
    When select  the filter options
    And select pickup drop location
    Then select the bus and seat


  Scenario Outline: Traveller details on booking page
    When  Enter the traveller personal details "<Name>" "<Age>" "<Emailid>" and "<MobileNo>"

    And click the state to save the billing details
    And click to countinue the payment page
    Examples:
      | Name          | Age | Emailid              | MobileNo   |
      | RadhaKrishnan | 25  | rkrisn3040@gmail.com | 7200819887 |


Scenario: In payment page check the page
  When Finally the payment page reached
