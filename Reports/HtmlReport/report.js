$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/01fb.feature");
formatter.feature({
  "name": "To order hair products in netlify application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To get the order id in netlify application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open Amazon Link",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonDefine.open_Amazon_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Very Successful Login",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonDefine.very_Successful_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Mobile Accessories",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonDefine.select_the_Mobile_Accessories()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027nav-search-field \u0027]//input[@type\u003d\u0027text\u0027]\"}\n  (Session info: chrome\u003d127.0.6533.100)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.20\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [b5b24675cf11cd28b54af7d662ee2b5a, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027nav-search-field \u0027]//input[@type\u003d\u0027text\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 127.0.6533.100, chrome: {chromedriverVersion: 127.0.6533.99 (f31af5097d90..., userDataDir: C:\\Users\\SRIKEE~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:59399}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:59399/devtoo..., se:cdpVersion: 127.0.6533.100, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: b5b24675cf11cd28b54af7d662ee2b5a\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat org.lib.BaseClass.fill(BaseClass.java:37)\r\n\tat org.step.AmazonDefine.select_the_Mobile_Accessories(AmazonDefine.java:40)\r\n\tat ✽.Select the Mobile Accessories(file:src/test/resources/FeatureFile/01fb.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select the Screen Guard",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefine.select_the_Screen_Guard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the second product in the website and add them to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefine.select_the_second_product_in_the_website_and_add_them_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Take the screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefine.take_the_screenshot()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Publ;ish the result as a report",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDefine.publ_ish_the_result_as_a_report()"
});
formatter.result({
  "status": "skipped"
});
});