$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/niti.feature");
formatter.feature({
  "name": "Validating login feild in Adactin Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating Login and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user need to initiate chrome  and launch \"https://adactinhotelapp.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_need_to_initiate_and_launch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user needs to valid username \"nithinraje\" and valid password \"9876543210\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_needs_to_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_need_to_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_validates_the_successful_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login error message with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user need to intiate chrome and launch \"https://adactinhotelapp.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_need_to_intiate_and_launch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to enter invalid username \"sollamatan\" and invalid password \"sollamatan\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_need_to_enter_invalid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user needs to click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_needs_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_validates_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login error message with empty feilds",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user needs to initiate chrome and launch \"https://adactinhotelapp.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_needs_to_initiate_and_launch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to enter invalid username \"\"and invalid password \"\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user needs to click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_needs_to_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validates the warning message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_validates_the_warning_message_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate Select hotel page displayes when only mandotary fields entered on search hotel page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user needs to initiate chrome and launch \"https://adactinhotelapp.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_needs_to_initiate_and_launch(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user needs to enter valid username \"nithinraje\" and valid password \"9876543210\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_needs_to_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user needs to click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_needs_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the select Hotel pages displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_validates_the_select_Hotel_pages_displayed()"
});
formatter.result({
  "status": "passed"
});
});