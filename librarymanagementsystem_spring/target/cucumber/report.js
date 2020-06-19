$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adminlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Login",
  "description": "",
  "id": "admin-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Admin login with given details",
  "description": "",
  "id": "admin-login;admin-login-with-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \u003cemail\u003e,\u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "admin-login;admin-login-with-given-details;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 10,
      "id": "admin-login;admin-login-with-given-details;;1"
    },
    {
      "cells": [
        "\"ammulu@gmail.com\"",
        "\"Ammulu@123\""
      ],
      "line": 11,
      "id": "admin-login;admin-login-with-given-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Admin login with given details",
  "description": "",
  "id": "admin-login;admin-login-with-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 161126400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 18469200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 4783108900,
  "status": "passed"
});
formatter.uri("adminoperations.feature");
formatter.feature({
  "line": 1,
  "name": "Admin can add,delete,update,issue books and able to view books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Admin should be able to add books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Admin is on adding book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Admin enters \u003cbookName\u003e,\u003cauthorName\u003e,\u003cpublisherName\u003e,\u003cbookCategory\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books;",
  "rows": [
    {
      "cells": [
        "bookName",
        "authorName",
        "publisherName",
        "bookCategory",
        "status"
      ],
      "line": 15,
      "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books;;1"
    },
    {
      "cells": [
        "\"History\"",
        "\"Lorens\"",
        "\"Md publications\"",
        "\"social\"",
        "\"Added Successfully\""
      ],
      "line": 16,
      "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books;;2"
    },
    {
      "cells": [
        "\"Biology\"",
        "\"Ratnakar\"",
        "\"Sm publications\"",
        "\"science\"",
        "\"Added Successfully\""
      ],
      "line": 17,
      "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 36500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 95500,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 307864300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Admin should be able to add books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Admin is on adding book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Admin enters \"History\",\"Lorens\",\"Md publications\",\"social\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book \"Added Successfully\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_adding_book_page()"
});
formatter.result({
  "duration": 65400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "History",
      "offset": 14
    },
    {
      "val": "Lorens",
      "offset": 24
    },
    {
      "val": "Md publications",
      "offset": 33
    },
    {
      "val": "social",
      "offset": 51
    }
  ],
  "location": "AdminSteps.admin_enters(String,String,String,String)"
});
formatter.result({
  "duration": 542371400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Added Successfully",
      "offset": 6
    }
  ],
  "location": "AdminSteps.book(String)"
});
formatter.result({
  "duration": 871500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 115000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 90400,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 237862100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Admin should be able to add books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Admin is on adding book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Admin enters \"Biology\",\"Ratnakar\",\"Sm publications\",\"science\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book \"Added Successfully\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_adding_book_page()"
});
formatter.result({
  "duration": 44400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Biology",
      "offset": 14
    },
    {
      "val": "Ratnakar",
      "offset": 24
    },
    {
      "val": "Sm publications",
      "offset": 35
    },
    {
      "val": "science",
      "offset": 53
    }
  ],
  "location": "AdminSteps.admin_enters(String,String,String,String)"
});
formatter.result({
  "duration": 353185000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Added Successfully",
      "offset": 6
    }
  ],
  "location": "AdminSteps.book(String)"
});
formatter.result({
  "duration": 168000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 66600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 106300,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 619540300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Admin should be able to remove books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-remove-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Admin is on removing book page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Admin enters 13402",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Book deleted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_removing_book_page()"
});
formatter.result({
  "duration": 112600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13402",
      "offset": 13
    }
  ],
  "location": "AdminSteps.admin_enters(int)"
});
formatter.result({
  "duration": 1169011800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_deleted_successfully()"
});
formatter.result({
  "duration": 3988700,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystem_spring.stepdefinitions.AdminSteps.book_deleted_successfully(AdminSteps.java:128)\r\n\tat ✽.Then Book deleted successfully(adminoperations.feature:22)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 71200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 173600,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 631325200,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Admin should be able to view books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-view-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Admin is on  viewing books page based on names",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Admin enters \"History\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "show books based on name",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_viewing_books_page_based_on_names()"
});
formatter.result({
  "duration": 36400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "History",
      "offset": 14
    }
  ],
  "location": "AdminSteps.admin_enters(String)"
});
formatter.result({
  "duration": 69500,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.show_books_based_on_name()"
});
formatter.result({
  "duration": 330807400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 70200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 7452400,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 299341100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Admin should be able to view books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-view-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "Admin is on  viewing books page based on author Name",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Admin enters author name \"Lorens\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "show books based on  author name",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_viewing_books_page_based_on_author_Name()"
});
formatter.result({
  "duration": 36000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lorens",
      "offset": 26
    }
  ],
  "location": "AdminSteps.admin_enters_author_name(String)"
});
formatter.result({
  "duration": 84200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.show_books_based_on_author_name()"
});
formatter.result({
  "duration": 215440700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 49900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 1830900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 260652500,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Admin should be able to view books based on id",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-view-books-based-on-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "Admin is on  viewing books page based on book id",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Admin enters book id 13302",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "show books based on  book id",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_viewing_books_page_based_on_book_id()"
});
formatter.result({
  "duration": 121200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13302",
      "offset": 21
    }
  ],
  "location": "AdminSteps.admin_enters_book_id(int)"
});
formatter.result({
  "duration": 182600,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.show_books_based_on_book_id()"
});
formatter.result({
  "duration": 136807900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters \"ammulu@gmail.com\",\"Ammulu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 23700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammulu@gmail.com",
      "offset": 14
    },
    {
      "val": "Ammulu@123",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 58800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 206032500,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Admin should be able to issue books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-issue-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "Admin is on issuing book page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "Admin enters 110102,16302",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "Book issued successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_issuing_book_page()"
});
formatter.result({
  "duration": 111100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "110102",
      "offset": 13
    },
    {
      "val": "16302",
      "offset": 20
    }
  ],
  "location": "AdminSteps.admin_enters(int,int)"
});
formatter.result({
  "duration": 203266900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_issued_successfully()"
});
formatter.result({
  "duration": 290200,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystem_spring.stepdefinitions.AdminSteps.book_issued_successfully(AdminSteps.java:205)\r\n\tat ✽.Then Book issued successfully(adminoperations.feature:42)\r\n",
  "status": "failed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \u003cfirstName\u003e,\u003clastName\u003e,\u003cemail\u003e,\u003cpassword\u003e,\u003cmobile\u003e,\u003crole\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password",
        "mobile",
        "role",
        "status"
      ],
      "line": 10,
      "id": "user-registration;user-registration-with-given-details;;1"
    },
    {
      "cells": [
        "\"krish\"",
        "\"potlapalli\"",
        "\"krish@gmail.com\"",
        "\"Krish@123\"",
        "8096041817",
        "\"admin\"",
        "\"registered successfully\""
      ],
      "line": 11,
      "id": "user-registration;user-registration-with-given-details;;2"
    },
    {
      "cells": [
        "\"raghava\"",
        "\"pillarsetty\"",
        "\"raghava@gmail.com\"",
        "\"Raghava@123\"",
        "9640705726",
        "\"user\"",
        "\"registered successfully\""
      ],
      "line": 12,
      "id": "user-registration;user-registration-with-given-details;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"krish\",\"potlapalli\",\"krish@gmail.com\",\"Krish@123\",8096041817,\"admin\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be \"registered successfully\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.user_is_on_registration_page()"
});
formatter.result({
  "duration": 56400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krish",
      "offset": 13
    },
    {
      "val": "potlapalli",
      "offset": 21
    },
    {
      "val": "krish@gmail.com",
      "offset": 34
    },
    {
      "val": "Krish@123",
      "offset": 52
    },
    {
      "val": "8096041817",
      "offset": 63
    },
    {
      "val": "admin",
      "offset": 75
    }
  ],
  "location": "AdminSteps.user_enters(String,String,String,String,int,String)"
});
formatter.result({
  "duration": 284100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "registered successfully",
      "offset": 16
    }
  ],
  "location": "AdminSteps.user_should_be(String)"
});
formatter.result({
  "duration": 307705500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"raghava\",\"pillarsetty\",\"raghava@gmail.com\",\"Raghava@123\",9640705726,\"user\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be \"registered successfully\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.user_is_on_registration_page()"
});
formatter.result({
  "duration": 56200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "raghava",
      "offset": 13
    },
    {
      "val": "pillarsetty",
      "offset": 23
    },
    {
      "val": "raghava@gmail.com",
      "offset": 37
    },
    {
      "val": "Raghava@123",
      "offset": 57
    },
    {
      "val": "9640705726",
      "offset": 70
    },
    {
      "val": "user",
      "offset": 82
    }
  ],
  "location": "AdminSteps.user_enters(String,String,String,String,int,String)"
});
formatter.result({
  "duration": 369900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "registered successfully",
      "offset": 16
    }
  ],
  "location": "AdminSteps.user_should_be(String)"
});
formatter.result({
  "duration": 359635800,
  "status": "passed"
});
formatter.uri("userlogin.feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User login with given details",
  "description": "",
  "id": "user-login;user-login-with-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \u003cemail\u003e,\u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-login;user-login-with-given-details;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 10,
      "id": "user-login;user-login-with-given-details;;1"
    },
    {
      "cells": [
        "\"madhu@gmail.com\"",
        "\"Madhu@123\""
      ],
      "line": 11,
      "id": "user-login;user-login-with-given-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "User login with given details",
  "description": "",
  "id": "user-login;user-login-with-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"madhu@gmail.com\",\"Madhu@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_Login_page()"
});
formatter.result({
  "duration": 3124100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhu@gmail.com",
      "offset": 13
    },
    {
      "val": "Madhu@123",
      "offset": 31
    }
  ],
  "location": "UserSteps.user_enters(String,String)"
});
formatter.result({
  "duration": 164800,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.user_should_be_logged_in()"
});
formatter.result({
  "duration": 222714600,
  "status": "passed"
});
formatter.uri("useroperations.feature");
formatter.feature({
  "line": 1,
  "name": "User can request,return and able to view books",
  "description": "",
  "id": "user-can-request,return-and-able-to-view-books",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"madhu@gmail.com\",\"Madhu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_Login_page()"
});
formatter.result({
  "duration": 37300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhu@gmail.com",
      "offset": 13
    },
    {
      "val": "Madhu@123",
      "offset": 31
    }
  ],
  "location": "UserSteps.user_enters(String,String)"
});
formatter.result({
  "duration": 91800,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.user_should_be_logged_in()"
});
formatter.result({
  "duration": 121272100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should be able to request books",
  "description": "",
  "id": "user-can-request,return-and-able-to-view-books;user-should-be-able-to-request-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on request book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "BookId  and UserId are given 16402,105902",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book Requested Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_request_book_page()"
});
formatter.result({
  "duration": 43400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16402",
      "offset": 29
    },
    {
      "val": "105902",
      "offset": 35
    }
  ],
  "location": "UserSteps.bookid_and_UserId_are_given(int,int)"
});
formatter.result({
  "duration": 175834400,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.book_Requested_Successfully()"
});
formatter.result({
  "duration": 458000,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystem_spring.stepdefinitions.UserSteps.book_Requested_Successfully(UserSteps.java:74)\r\n\tat ✽.Then Book Requested Successfully(useroperations.feature:12)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"madhu@gmail.com\",\"Madhu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_Login_page()"
});
formatter.result({
  "duration": 53700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhu@gmail.com",
      "offset": 13
    },
    {
      "val": "Madhu@123",
      "offset": 31
    }
  ],
  "location": "UserSteps.user_enters(String,String)"
});
formatter.result({
  "duration": 88700,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.user_should_be_logged_in()"
});
formatter.result({
  "duration": 174828600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should be able to return books",
  "description": "",
  "id": "user-can-request,return-and-able-to-view-books;user-should-be-able-to-return-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User is on returning book page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "BookId  and UserId are given 16302,110102",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Book Returned Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_returning_book_page()"
});
formatter.result({
  "duration": 60200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16302",
      "offset": 29
    },
    {
      "val": "110102",
      "offset": 35
    }
  ],
  "location": "UserSteps.bookid_and_UserId_are_given(int,int)"
});
formatter.result({
  "duration": 172099300,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.book_Returned_Successfully()"
});
formatter.result({
  "duration": 361700,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystem_spring.stepdefinitions.UserSteps.book_Returned_Successfully(UserSteps.java:96)\r\n\tat ✽.Then Book Returned Successfully(useroperations.feature:17)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"madhu@gmail.com\",\"Madhu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_Login_page()"
});
formatter.result({
  "duration": 32500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhu@gmail.com",
      "offset": 13
    },
    {
      "val": "Madhu@123",
      "offset": 31
    }
  ],
  "location": "UserSteps.user_enters(String,String)"
});
formatter.result({
  "duration": 67200,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.user_should_be_logged_in()"
});
formatter.result({
  "duration": 160682800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User should be able to view books based on names",
  "description": "",
  "id": "user-can-request,return-and-able-to-view-books;user-should-be-able-to-view-books-based-on-names",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "User is on  viewing books page based on names",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User enters \"History\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "show books based on bookname",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_viewing_books_page_based_on_names()"
});
formatter.result({
  "duration": 40800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "History",
      "offset": 13
    }
  ],
  "location": "UserSteps.user_enters(String)"
});
formatter.result({
  "duration": 95100,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.show_books_based_on_bookname()"
});
formatter.result({
  "duration": 447613700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"madhu@gmail.com\",\"Madhu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_Login_page()"
});
formatter.result({
  "duration": 45100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhu@gmail.com",
      "offset": 13
    },
    {
      "val": "Madhu@123",
      "offset": 31
    }
  ],
  "location": "UserSteps.user_enters(String,String)"
});
formatter.result({
  "duration": 113900,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.user_should_be_logged_in()"
});
formatter.result({
  "duration": 587666200,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User should be able to view books based on author name",
  "description": "",
  "id": "user-can-request,return-and-able-to-view-books;user-should-be-able-to-view-books-based-on-author-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is on  viewing books page based on author Name",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enters author name \"Lorens\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "show books based on  authorname",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSteps.user_is_on_viewing_books_page_based_on_author_Name()"
});
formatter.result({
  "duration": 45800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lorens",
      "offset": 25
    }
  ],
  "location": "UserSteps.user_enters_author_name(String)"
});
formatter.result({
  "duration": 97800,
  "status": "passed"
});
formatter.match({
  "location": "UserSteps.show_books_based_on_authorname()"
});
formatter.result({
  "duration": 241869400,
  "status": "passed"
});
});