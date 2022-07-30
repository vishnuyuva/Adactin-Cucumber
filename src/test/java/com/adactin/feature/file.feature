Feature: Hotel Booking In Adactin Application
@login
Scenario Outline: User Login In Web Application
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then click The Login Button And It Navigates To Search Hotel Page
Examples:
|Username|Password|
|Sss|123|
|Ddd|456|
|goldheart|gold@123|
@search
Scenario: User Search The Hotel
When user Select The Location
And user Select The Hotel Name 
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Number Of Adults
And user Select The Number Of Children
Then click The Submit Button And It Navigates To Select Hotel Page
@select
Scenario: User Select The Hotel
When user Click The Checkbox
Then Click Ok And It Navigates To Book Hotel Page
@booking
Scenario: User Booking The Hotel
When user Enter The Firstname
When user Enter The Lastname
When user Enter The Address
When user Enter The Credit Card Number
When user Select The Card Type
When user Select The Month
When user Select The year
When user Enter Cvv
Then click Submit And Hotel successfully Booked 
@logout
Scenario: Log Out From Adactin Application
Then Click THe Logout button
