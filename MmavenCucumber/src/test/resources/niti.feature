Feature: Validating login feild in Adactin Application
Scenario: Validating Login and password
Given user need to initiate chrome  and launch "https://adactinhotelapp.com"
Given user needs to valid username "nithinraje" and valid password "9876543210"
And  user need to click on login button
Then  user validates the successful login

Scenario: Validate login error message with invalid credentials
Given user need to intiate chrome and launch "https://adactinhotelapp.com"
Given user need to enter invalid username "sollamatan" and invalid password "sollamatan"
Then user needs to click login button
Then user validates the error message

Scenario: Validate login error message with empty feilds
Given user needs to initiate chrome and launch "https://adactinhotelapp.com"
Given user need to enter invalid username ""and invalid password ""
And user needs to click on login button
Then  user validates the warning message displayed
@reg
Scenario: Validate Select hotel page displayes when only mandotary fields entered on search hotel page
Given user needs to initiate chrome and launch "https://adactinhotelapp.com"
Given user needs to enter valid username "nithinraje" and valid password "9876543210"
Then user needs to click login button
Then user validates the select Hotel pages displayed