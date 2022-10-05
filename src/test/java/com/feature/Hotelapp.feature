Feature: Booking Hotel using app
Scenario: Login page
Given url has to launch
When enter username as "venkatesh92"
And enter password as "senthil"
Then click the login button

Scenario: Enter the Hotel details and location
When enter the "Sydney" as hotel location
And enter the "Hotel Sunshine" as hotel type
And enter the room type as "Double" 
And enter the adult per room as "2"
And enter the children per room as "2" 
Then click the submit button

Scenario: Check the cost of the selected hotel
When select the radio button
Then click the continue button

Scenario: Enter your perosnal details
When enter your first name as "Venkateshwaran"
And enter your last name as "M"
And enter your billing address as "No.6 Vivekanadar Theru, Dubai"
And enter your credit card no as "1236547890741258"
And enter your credit card type as "VISA"
And enter your expiry date as "1"
And enter your expiry year as "2022"
And enter your cvv number as "784698"
Then click the book now button

Scenario: Check the booked details and logout
Then logout