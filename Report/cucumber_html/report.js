$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/My Pc/eclipse-workspace/cucumberpro/src/test/java/org/ash/cucumberpro/running.feature");
formatter.feature({
  "name": "To validate the login function of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate with valid login username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_url_of_fb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid username \"ashvanth\" in emnail field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_username_in_emnail_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid password \"0987678\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Samplecucumber.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate with valid login username and password with multiple inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.step({
  "name": "To pass valid\"\u003cusername\u003e\" in emnail field",
  "keyword": "And "
});
formatter.step({
  "name": "To pass valid\"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ash@123.com",
        "234567"
      ]
    },
    {
      "cells": [
        "ash@1232.com",
        "23t734567"
      ]
    },
    {
      "cells": [
        "ash@1223.com",
        "234gngb567"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate with valid login username and password with multiple inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_url_of_fb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid\"ash@123.com\" in emnail field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_in_emnail_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid\"234567\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Samplecucumber.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate with valid login username and password with multiple inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_url_of_fb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid\"ash@1232.com\" in emnail field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_in_emnail_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid\"23t734567\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Samplecucumber.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate with valid login username and password with multiple inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.match({
  "location": "Samplecucumber.to_launch_the_url_of_fb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid\"ash@1223.com\" in emnail field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_in_emnail_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid\"234gngb567\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_pass_valid_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Samplecucumber.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Samplecucumber.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});