$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Hotelapp.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel using app",
  "description": "",
  "id": "booking-hotel-using-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login page",
  "description": "",
  "id": "booking-hotel-using-app;login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "url has to launch",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter username as \"venkatesh92\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter password as \"senthil\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.url_has_to_launch()"
});
formatter.result({
  "duration": 122736900,
  "error_message": "java.io.FileNotFoundException: F:\\seleniumworkspace7am\\MavenDepend\\src\\main\\java\\Properties\\hotelapp.properties (The system cannot find the path specified)\r\n\tat java.io.FileInputStream.open0(Native Method)\r\n\tat java.io.FileInputStream.open(Unknown Source)\r\n\tat java.io.FileInputStream.\u003cinit\u003e(Unknown Source)\r\n\tat Properties.Config_Reader.\u003cinit\u003e(Config_Reader.java:14)\r\n\tat Properties.File_Reader_Manager.getcr(File_Reader_Manager.java:17)\r\n\tat com.stepdefinition.Stepdefinition.url_has_to_launch(Stepdefinition.java:18)\r\n\tat ✽.Given url has to launch(src/test/java/com/feature/Hotelapp.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "venkatesh92",
      "offset": 19
    }
  ],
  "location": "Stepdefinition.enter_username_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "senthil",
      "offset": 19
    }
  ],
  "location": "Stepdefinition.enter_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 8,
  "name": "Enter the Hotel details and location",
  "description": "",
  "id": "booking-hotel-using-app;enter-the-hotel-details-and-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "enter the \"Sydney\" as hotel location",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter the \"Hotel Sunshine\" as hotel type",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter the room type as \"Double\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter the adult per room as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter the children per room as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 11
    }
  ],
  "location": "Stepdefinition.enter_the_as_hotel_location(String)"
});
formatter.result({
  "duration": 89716500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"location\"]\"}\n  (Session info: chrome\u003d106.0.5249.62)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6J3JH59\u0027, ip: \u0027192.168.173.118\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.62, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3394a391835fbaed11cf7bbbdedbbda4\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"location\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat com.MavenDepend.Baseclass.usrselects(Baseclass.java:65)\r\n\tat com.stepdefinition.Stepdefinition.enter_the_as_hotel_location(Stepdefinition.java:42)\r\n\tat ✽.When enter the \"Sydney\" as hotel location(src/test/java/com/feature/Hotelapp.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 11
    }
  ],
  "location": "Stepdefinition.enter_the_as_hotel_type(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Double",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_the_room_type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "Stepdefinition.enter_the_adult_per_room_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    }
  ],
  "location": "Stepdefinition.enter_the_children_per_room_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.click_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Check the cost of the selected hotel",
  "description": "",
  "id": "booking-hotel-using-app;check-the-cost-of-the-selected-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "select the radio button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.select_the_radio_button()"
});
formatter.result({
  "duration": 24162100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"radiobutton_0\"]\"}\n  (Session info: chrome\u003d106.0.5249.62)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6J3JH59\u0027, ip: \u0027192.168.173.118\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.62, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3394a391835fbaed11cf7bbbdedbbda4\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"radiobutton_0\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.MavenDepend.Baseclass.usrclick(Baseclass.java:56)\r\n\tat com.stepdefinition.Stepdefinition.select_the_radio_button(Stepdefinition.java:72)\r\n\tat ✽.When select the radio button(src/test/java/com/feature/Hotelapp.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.click_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Enter your perosnal details",
  "description": "",
  "id": "booking-hotel-using-app;enter-your-perosnal-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "enter your first name as \"Venkateshwaran\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "enter your last name as \"M\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "enter your billing address as \"No.6 Vivekanadar Theru, Dubai\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "enter your credit card no as \"1236547890741258\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "enter your credit card type as \"VISA\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "enter your expiry date as \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "enter your expiry year as \"2022\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "enter your cvv number as \"784698\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click the book now button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Venkateshwaran",
      "offset": 26
    }
  ],
  "location": "Stepdefinition.enter_your_first_name_as(String)"
});
formatter.result({
  "duration": 48150600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"first_name\"]\"}\n  (Session info: chrome\u003d106.0.5249.62)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6J3JH59\u0027, ip: \u0027192.168.173.118\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.62, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3394a391835fbaed11cf7bbbdedbbda4\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"first_name\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat com.MavenDepend.Baseclass.usrinput(Baseclass.java:48)\r\n\tat com.stepdefinition.Stepdefinition.enter_your_first_name_as(Stepdefinition.java:83)\r\n\tat ✽.When enter your first name as \"Venkateshwaran\"(src/test/java/com/feature/Hotelapp.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_your_last_name_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "No.6 Vivekanadar Theru, Dubai",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.enter_your_billing_address_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1236547890741258",
      "offset": 30
    }
  ],
  "location": "Stepdefinition.enter_your_credit_card_no_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 32
    }
  ],
  "location": "Stepdefinition.enter_your_credit_card_type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 27
    }
  ],
  "location": "Stepdefinition.enter_your_expiry_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 27
    }
  ],
  "location": "Stepdefinition.enter_your_expiry_year_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "784698",
      "offset": 26
    }
  ],
  "location": "Stepdefinition.enter_your_cvv_number_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.click_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "Check the booked details and logout",
  "description": "",
  "id": "booking-hotel-using-app;check-the-booked-details-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.logout()"
});
formatter.result({
  "duration": 27997000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/table[2]/tbody/tr[1]/td[2]/a[4]\"}\n  (Session info: chrome\u003d106.0.5249.62)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6J3JH59\u0027, ip: \u0027192.168.173.118\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.62, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3394a391835fbaed11cf7bbbdedbbda4\n*** Element info: {Using\u003dxpath, value\u003d/html/body/table[2]/tbody/tr[1]/td[2]/a[4]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.MavenDepend.Baseclass.usrclick(Baseclass.java:56)\r\n\tat com.stepdefinition.Stepdefinition.logout(Stepdefinition.java:130)\r\n\tat ✽.Then logout(src/test/java/com/feature/Hotelapp.feature:32)\r\n",
  "status": "failed"
});
});