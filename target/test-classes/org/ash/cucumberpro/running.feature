Feature: To validate the login function of facebook
Background:
Given To launch the chromebrowser
@sanity
Scenario: To validate with valid login username and password
When To launch the url of fb
And To pass valid username "ashvanth" in emnail field
And To pass valid password "0987678" in password field
And To click the login button
Then To close the browser
@smoke
Scenario Outline: To validate with valid login username and password with multiple inputs
When To launch the url of fb
And To pass valid"<username>" in emnail field
And To pass valid"<password>" in password field
And To click the login button
Then To close the browser
Examples:
|username|password|
|ash@123.com   |234567|
|ash@1232.com  |23t734567|
|ash@1223.com  |234gngb567|
