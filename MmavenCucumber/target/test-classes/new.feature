Feature: validating Login field facebook application
Scenario Outline: validating login and password
Given User need to launch the browser
When user enters "<username>" and "<passwords>"
Then click on the login button

Examples:
|username|passwords|
|Ragul| Gul@123|

