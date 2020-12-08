$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to the App",
  "description": "",
  "id": "login-functionality;login-to-the-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "CtoK app is luanched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Clicks on SignIn button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enters username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "SignIn should be \"\u003cExpected_Result\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-functionality;login-to-the-app;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Expected_Result"
      ],
      "line": 12,
      "id": "login-functionality;login-to-the-app;;1"
    },
    {
      "cells": [
        "mzakkar@gmail.com",
        "test123",
        "successful"
      ],
      "line": 13,
      "id": "login-functionality;login-to-the-app;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login to the App",
  "description": "",
  "id": "login-functionality;login-to-the-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "CtoK app is luanched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Clicks on SignIn button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enters username \"mzakkar@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Enters password \"test123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "SignIn should be \"successful\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login.ctok_app_is_luanched()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_Clicks_on_SignIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "mzakkar@gmail.com",
      "offset": 22
    }
  ],
  "location": "Login.user_Enters_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 22
    }
  ],
  "location": "Login.user_Enters_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_Clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "successful",
      "offset": 18
    }
  ],
  "location": "Login.signin_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
});