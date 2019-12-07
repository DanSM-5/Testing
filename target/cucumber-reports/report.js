$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SeleniumEasy.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Select value of dropBox and message",
  "description": "",
  "id": "validate-select-value-of-dropbox-and-message",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10258035900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate selected value of the dropBox",
  "description": "",
  "id": "validate-select-value-of-dropbox-and-message;validate-selected-value-of-the-dropbox",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SeleniumEasy"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launched SeleniumEasy web page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select Monday from dropDox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I get the value Monday and the message Monday",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumEasy.launchSeleniumEasyPage()"
});
formatter.result({
  "duration": 2232447000,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasy.selectMonday()"
});
formatter.result({
  "duration": 147511400,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasy.validateSelectedValue()"
});
formatter.result({
  "duration": 56437300,
  "status": "passed"
});
formatter.after({
  "duration": 21600,
  "status": "passed"
});
});