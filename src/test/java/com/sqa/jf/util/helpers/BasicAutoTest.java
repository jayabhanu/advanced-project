package com.sqa.jf.util.helpers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicAutoTest {
	static String baseURL;

	static Properties devproperties;
	static String devpropertieslocation = "src/main/resources/dev.properties";
	static WebDriver driver;

	@BeforeClass(enabled = false, groups = "chrome")
	public static void setupChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	@BeforeClass(enabled = true, groups = "firefox")
	public static void setupFirefox(String baseURL) throws InterruptedException {
		driver = new FirefoxDriver();
		// driver.get(devproperties.getProperty("baseURL"));
		driver.get(baseURL);
		Thread.sleep(1000);
	}

	@BeforeClass(enabled = false, groups = "chrome")
	public static void setupOpera() throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");
		driver = new OperaDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	@BeforeClass(enabled = false, groups = "safari")
	public static void setupSafari() throws InterruptedException {
		driver = new SafariDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	// @BeforeClass(priority = 1)
	public void loadPropertiestest() {
		// this.sharedMapUI =
		// ConProperties.loadProperties(this.devPropsLocation);
		devproperties = ConProperties.loadProperties(devpropertieslocation);
	}
	//
	// @DataProvider(name = "UserAccountInfo")
	// public static Object[][] getData() {
	// Object[][] data = { { "sqasolution2015@gmail.com", "sqaadmin2015" },
	// { "sqasolution2015@gmail.com", "sqaadmin2015" }, {
	// "sqasolution2015@gmail.com", "sqaadmin2015" } };
	// return data;
	// }

	@Test(dataProvider = "UserAccountInfo")
	public void test(String username, String password) {
		System.out.println("Basic Test: U-" + username + "/P-" + password);

	}

}
