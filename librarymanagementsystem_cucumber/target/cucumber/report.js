$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("admin.feature");
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
  "name": "Book should be added",
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
        "\"ports\"",
        "\"veenus\"",
        "\"js publications\"",
        "\"nets\"",
        "\"Added Successfully\""
      ],
      "line": 16,
      "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 54348799100,
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
  "name": "Admin enters \"madhavi@gmail.com\",\"Madhavi@123\"",
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
  "duration": 770102400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhavi@gmail.com",
      "offset": 14
    },
    {
      "val": "Madhavi@123",
      "offset": 34
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 3043901200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 7109900,
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
  "name": "Admin enters \"ports\",\"veenus\",\"js publications\",\"nets\"",
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
  "name": "Book should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_adding_book_page()"
});
formatter.result({
  "duration": 5294763600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Admin\u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027LAPTOP-JD3BRSIA\u0027, ip: \u0027192.168.100.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\potla\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64998}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: a3b7f7932eb60a6b00d054a6577d10a3\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Admin\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat com.capgemini.librarymanagementsystem_cucumber.stepdefinitions.AdminSteps.admin_is_on_adding_book_page(AdminSteps.java:67)\r\n\tat ✽.Given Admin is on adding book page(admin.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "ports",
      "offset": 14
    },
    {
      "val": "veenus",
      "offset": 22
    },
    {
      "val": "js publications",
      "offset": 31
    },
    {
      "val": "nets",
      "offset": 49
    }
  ],
  "location": "AdminSteps.admin_enters(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.book_should_be_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("adminLogin.feature");
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
        "\"madhavi@gmail.com\"",
        "\"Madhavi@123\""
      ],
      "line": 11,
      "id": "admin-login;admin-login-with-given-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 24326659600,
  "status": "passed"
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
  "name": "Admin enters \"madhavi@gmail.com\",\"Madhavi@123\"",
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
  "duration": 8421800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhavi@gmail.com",
      "offset": 14
    },
    {
      "val": "Madhavi@123",
      "offset": 34
    }
  ],
  "location": "AdminSteps.admin_enters(String,String)"
});
formatter.result({
  "duration": 1026186400,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 9461200,
  "status": "passed"
});
});