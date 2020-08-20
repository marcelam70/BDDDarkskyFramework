$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky.feature");
formatter.feature({
  "line": 2,
  "name": "DarkSky Home Page Feature",
  "description": "",
  "id": "darksky-home-page-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3696680090,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on DarkSky Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.verifyHomePageTitle()"
});
formatter.result({
  "duration": 374490870,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify weather on DarkSky page",
  "description": "",
  "id": "darksky-home-page-feature;verify-weather-on-darksky-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@homepage"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click on search button to verify my city",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I find the highest and lowest temperatures",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify if temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.verifyTodayOnDarkSkyPage()"
});
formatter.result({
  "duration": 36171211,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyHighestAndLowestTemps()"
});
formatter.result({
  "duration": 1097088007,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyIfTempIsDisplayedCorrectly()"
});
formatter.result({
  "duration": 87792129,
  "status": "passed"
});
formatter.after({
  "duration": 115978594,
  "status": "passed"
});
formatter.uri("LoginPage.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Dark Sky Login Page",
  "description": "",
  "id": "dark-sky-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1836939406,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "I am on darksky login page",
  "description": "",
  "id": "dark-sky-login-page;i-am-on-darksky-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@loginpage"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Given I am on the darksky Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter marcela@gmail.com into email text fields on login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter password1 into password text fields on login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify error message “Username and password do not match”",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSD.iAmOnLoginPage()"
});
formatter.result({
  "duration": 221072138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "marcela@gmail.com",
      "offset": 8
    },
    {
      "val": "email",
      "offset": 31
    }
  ],
  "location": "LoginPageSD.enterDataUserAndPAss(String,String)"
});
formatter.result({
  "duration": 6215321910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password1",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 23
    }
  ],
  "location": "LoginPageSD.enterDataUserAndPAss(String,String)"
});
formatter.result({
  "duration": 75220477,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSD.verifyLogin()"
});
formatter.result({
  "duration": 115386316,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSD.verifyErrorMessage()"
});
formatter.result({
  "duration": 32542236,
  "status": "passed"
});
formatter.after({
  "duration": 100049461,
  "status": "passed"
});
});