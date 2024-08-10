package org.lib;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch() {
		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxWin() {
		driver.manage().window().maximize();

	}

	public static void fill(WebElement webRef, String value) {

		webRef.sendKeys(value);
	}

	public static void btnClick(WebElement cli) {

		cli.click();
	}
	public static void prtTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void prtUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	public static void ScreenCatch() throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Srikeerthana\\eclipse-workspace\\CucumberBatch\\Screen\\addtocard.png");
		FileUtils.copyFile(screenshotAs, f);
		

	}
	public static void browserClose() {
		driver.quit();

	}

	public static void mouseHoverAction(WebElement act) {
		Actions a = new Actions(driver);
		a.moveToElement(act).perform();
	}
	
	
}
