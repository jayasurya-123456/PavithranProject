$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/ibps.feature");
formatter.feature({
  "name": "To Validate the branch verification ",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "  To validate the Maker and Checker queue functionalities",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter the username in username field",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_enter_the_username_in_username_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USer have to enter the password in password field",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_enter_the_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button ",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_click_the_login_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027oaloginform:contloginbtn\u0027]\"}\n  (Session info: chrome\u003d110.0.5481.178)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LPT2881\u0027, ip: \u0027192.168.24.83\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.178, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Program Files (x86)\\scop...}, goog:chromeOptions: {debuggerAddress: localhost:64672}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f4e0e500b769f0b997196f2b38dda611\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027oaloginform:contloginbtn\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.stepdefinition.StepdefinitionClass.user_should_click_the_login_button(StepdefinitionClass.java:64)\r\n\tat ✽.User should click the login button (file:src/test/resources/Feature/ibps.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to click Data entry maker",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_click_Data_entry_maker()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter the workitem number in search field",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_enter_the_workitem_number_in_search_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to select the workitem",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_select_the_workitem()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to verify the customer personal details ",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_verify_the_customer_personal_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to check the customer residence details",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_check_the_customer_residence_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to check the customer nominee details",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_check_the_customer_nominee_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to click the gold details",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_click_the_gold_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to add gold details",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.use_have_to_add_gold_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to check the gold details",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_check_the_gold_details()"
});
formatter.result({
  "status": "skipped"
});
});