$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter  the \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on login and it navigate to the select hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "aer",
        "1234"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "qwer",
        "1298"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "ramkumarchinna",
        "Ram@1998"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter  the \"aer\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on login and it navigate to the select hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 4413733200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aer",
      "offset": 17
    }
  ],
  "location": "Test_stepdefinition.user_enter_the1(String)"
});
formatter.result({
  "duration": 503194300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "Test_stepdefinition.user_enter_the(String)"
});
formatter.result({
  "duration": 149653700,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_click_on_login_and_it_navigate_to_the_select_hotel_page()"
});
formatter.result({
  "duration": 606555900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter  the \"qwer\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"1298\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on login and it navigate to the select hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 442176300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qwer",
      "offset": 17
    }
  ],
  "location": "Test_stepdefinition.user_enter_the1(String)"
});
formatter.result({
  "duration": 144923200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1298",
      "offset": 16
    }
  ],
  "location": "Test_stepdefinition.user_enter_the(String)"
});
formatter.result({
  "duration": 191640600,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_click_on_login_and_it_navigate_to_the_select_hotel_page()"
});
formatter.result({
  "duration": 563164900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter  the \"ramkumarchinna\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the \"Ram@1998\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on login and it navigate to the select hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 470093300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ramkumarchinna",
      "offset": 17
    }
  ],
  "location": "Test_stepdefinition.user_enter_the1(String)"
});
formatter.result({
  "duration": 202019200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ram@1998",
      "offset": 16
    }
  ],
  "location": "Test_stepdefinition.user_enter_the(String)"
});
formatter.result({
  "duration": 135482100,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_click_on_login_and_it_navigate_to_the_select_hotel_page()"
});
formatter.result({
  "duration": 1296150500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User enter location",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enter hotel",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enter room type",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enter no of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enter check in date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User enter check out date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User enter adult per room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User enter children per room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click the search and it navigate to select hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_location()"
});
formatter.result({
  "duration": 472991200,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_hotel()"
});
formatter.result({
  "duration": 202461500,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_room_type()"
});
formatter.result({
  "duration": 208538400,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_no_of_rooms()"
});
formatter.result({
  "duration": 193961400,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_check_in_date()"
});
formatter.result({
  "duration": 149822600,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_check_out_date()"
});
formatter.result({
  "duration": 150241100,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_adult_per_room()"
});
formatter.result({
  "duration": 181478200,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_children_per_room()"
});
formatter.result({
  "duration": 199402000,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_click_the_search_and_it_navigate_to_select_hotel_page()"
});
formatter.result({
  "duration": 830658800,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "select hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User tick the check box",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user click contiue and it navigate to book hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_tick_the_check_box()"
});
formatter.result({
  "duration": 136075600,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_click_contiue_and_it_navigate_to_book_hotel_page()"
});
formatter.result({
  "duration": 870983400,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Book hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@Saniytest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User enter the first name",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User enter the last name",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enter the billing address",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enter credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enter credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User enter ex month",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User enter ex year",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User enter ex cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User click book now and it navigate to booking conformation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_the_first_name()"
});
formatter.result({
  "duration": 244341500,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_the_last_name()"
});
formatter.result({
  "duration": 140724600,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_the_billing_address()"
});
formatter.result({
  "duration": 164561000,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_credit_card_number()"
});
formatter.result({
  "duration": 184044900,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_credit_card_type()"
});
formatter.result({
  "duration": 190810600,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_ex_month()"
});
formatter.result({
  "duration": 205469700,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_ex_year()"
});
formatter.result({
  "duration": 194110100,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_enter_ex_cvv_number()"
});
formatter.result({
  "duration": 172975500,
  "status": "passed"
});
formatter.match({
  "location": "Test_stepdefinition.user_click_book_now_and_it_navigate_to_booking_conformation_page()"
});
formatter.result({
  "duration": 7112156600,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Booking conformation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-conformation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@Regertiontest"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "User click the my itinerary and it navigate to Booked itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_click_the_my_itinerary_and_it_navigate_to_Booked_itinerary()"
});
formatter.result({
  "duration": 8024003000,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Booked itinerary",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booked-itinerary",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@regerationtest"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User click logout the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_stepdefinition.user_click_logout_the_application()"
});
formatter.result({
  "duration": 8060539900,
  "status": "passed"
});
});