$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User Login In Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-web-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-web-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-application;user-login-in-web-application;;1"
    },
    {
      "cells": [
        "Sss",
        "123"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;user-login-in-web-application;;2"
    },
    {
      "cells": [
        "Ddd",
        "456"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-login-in-web-application;;3"
    },
    {
      "cells": [
        "goldheart",
        "gold@123"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-in-web-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "User Login In Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-web-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Sss\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 61829278569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sss",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 181878598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 111741531,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1154872722,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Login In Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-web-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Ddd\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"456\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 705898503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ddd",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 106407993,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 101636908,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 953680900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Login In Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-web-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"goldheart\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"gold@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4073746814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "goldheart",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 190571448,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gold@123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 135270575,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 8353355951,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User Search The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user Select The Hotel Name",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number Of Adults",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Number Of Children",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click The Submit Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location()"
});
formatter.result({
  "duration": 183370427,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_Name()"
});
formatter.result({
  "duration": 157278536,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 150318201,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 113535627,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "duration": 94908532,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "duration": 102690478,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Adults()"
});
formatter.result({
  "duration": 172456511,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Children()"
});
formatter.result({
  "duration": 148651887,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.click_The_Submit_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1403619394,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@select"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user Click The Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Click Ok And It Navigates To Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Checkbox()"
});
formatter.result({
  "duration": 96089885,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.click_Ok_And_It_Navigates_To_Book_Hotel_Page()"
});
formatter.result({
  "duration": 1181890401,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "User Booking The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-booking-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@booking"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Enter The Firstname",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Lastname",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Enter The Address",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Credit Card Number",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Select The Card Type",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Select The Month",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Select The year",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user Enter Cvv",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "click Submit And Hotel successfully Booked",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Firstname()"
});
formatter.result({
  "duration": 123522218,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Lastname()"
});
formatter.result({
  "duration": 118113243,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address()"
});
formatter.result({
  "duration": 125259864,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 119774938,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Card_Type()"
});
formatter.result({
  "duration": 143553389,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month()"
});
formatter.result({
  "duration": 158929967,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_year()"
});
formatter.result({
  "duration": 141355416,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Cvv()"
});
formatter.result({
  "duration": 98317624,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.click_Submit_And_Hotel_successfully_Booked()"
});
formatter.result({
  "duration": 82060933,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Log Out From Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;log-out-from-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@logout"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "Click THe Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.click_THe_Logout_button()"
});
formatter.result({
  "duration": 1242374961,
  "status": "passed"
});
});