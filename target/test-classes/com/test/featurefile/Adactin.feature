Feature: Hotel Booking in Adactin Application
@Smoketest
Scenario Outline: login page

Given User launch the application
When User enter  the "<username>"
And User enter the "<password>"
Then User click on login and it navigate to the select hotel page  

Examples:
|username|password|
|aer|1234|
|qwer|1298|
|ramkumarchinna|Ram@1998|

@Sanitytest
Scenario: Search Hotel

When User enter location
And  User enter hotel
And  User enter room type
And  User enter no of rooms
And  User enter check in date
And  User enter check out date
And  User enter adult per room
And  User enter children per room
Then User click the search and it navigate to select hotel page 

@Sanitytest
Scenario: select hotel

When User tick the check box
Then user click contiue and it navigate to book hotel page
@Saniytest
Scenario: Book hotel

When User enter the first name
And User enter the last name
And User enter the billing address
And User enter credit card number
And User enter credit card type
And User enter ex month
And User enter ex year
And User enter ex cvv number
Then User click book now and it navigate to booking conformation page
@Regertiontest
Scenario: Booking conformation

Then User click the my itinerary and it navigate to Booked itinerary
@regerationtest
Scenario: Booked itinerary

Then User click logout the application