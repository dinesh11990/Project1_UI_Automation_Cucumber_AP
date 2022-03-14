$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Verify_CEO_Name.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is to get the CEO name from the OrangeHRM apps",
  "description": "",
  "id": "this-feature-is-to-get-the-ceo-name-from-the-orangehrm-apps",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "This test is to verify the CEO names",
  "description": "",
  "id": "this-feature-is-to-get-the-ceo-name-from-the-orangehrm-apps;this-test-is-to-verify-the-ceo-names",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "the user is logged in successfully and is on Home Pages",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user clicks on the directory option from the Menu bars",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the user selects the job title as \"Chief Executive Officer\" from the drop down \"text\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "clicks the search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should see the CEO name as \"John Smith\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "this-feature-is-to-get-the-ceo-name-from-the-orangehrm-apps;this-test-is-to-verify-the-ceo-names;",
  "rows": [
    {
      "cells": [
        "CEO_Names"
      ],
      "line": 11,
      "id": "this-feature-is-to-get-the-ceo-name-from-the-orangehrm-apps;this-test-is-to-verify-the-ceo-names;;1"
    },
    {
      "cells": [
        "John Smiths"
      ],
      "line": 12,
      "id": "this-feature-is-to-get-the-ceo-name-from-the-orangehrm-apps;this-test-is-to-verify-the-ceo-names;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6932483000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "This test is to verify the CEO names",
  "description": "",
  "id": "this-feature-is-to-get-the-ceo-name-from-the-orangehrm-apps;this-test-is-to-verify-the-ceo-names;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "the user is logged in successfully and is on Home Pages",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user clicks on the directory option from the Menu bars",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the user selects the job title as \"Chief Executive Officer\" from the drop down \"text\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "clicks the search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should see the CEO name as \"John Smith\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Verify_CEOName_Step_Def.the_user_is_logged_in_successfully_and_is_on_home_pages()"
});
formatter.result({
  "duration": 916492800,
  "status": "passed"
});
formatter.match({
  "location": "Verify_CEOName_Step_Def.the_user_clicks_on_the_directory_option_from_the_menu_bars()"
});
formatter.result({
  "duration": 3954265000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chief Executive Officer",
      "offset": 35
    },
    {
      "val": "text",
      "offset": 80
    }
  ],
  "location": "Verify_CEOName_Step_Def.the_user_selects_the_job_title_as_from_the_drop_down(String,String)"
});
formatter.result({
  "duration": 244345900,
  "status": "passed"
});
formatter.match({
  "location": "Verify_CEOName_Step_Def.clicks_the_search_button()"
});
formatter.result({
  "duration": 953068900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John Smith",
      "offset": 37
    }
  ],
  "location": "Verify_CEOName_Step_Def.the_user_should_see_the_ceo_name_as(String)"
});
formatter.result({
  "duration": 73258600,
  "status": "passed"
});
});