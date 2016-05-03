package com.ga.auto;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicAutoTest {
	static WebDriver driver;

	static Logger logger = Logger.getLogger(BasicAutoTest.class);

	@DataProvider(name = "UserAccountInfo")
	public static Object[][] getData() {
		Object[][] data = { { "sqasolution2015@gmail.com", "sqaadmin2015" },
				{ "sqasolution2015@gmail.com", "sqaadmin2015" }, { "sqasolution2015@gmail.com", "sqaadmin2015" } };
		return data;
	}

	@BeforeClass(enabled = false, groups = "chrome")
	public static void setupChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	@BeforeClass(enabled = true, groups = "firefox")
	public static void setupFirefox() throws InterruptedException {
		// driver = new FirefoxDriver();
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

	@Test(dataProvider = "UserAccountInfo")
	public void test(String username, String password) {
		System.out.println("Basic Test: U-" + username + "/P-" + password);
		logger.info("My Information..");
		for (int i = 0; i < 1000; i++) {
			logger.info("Info Message " + i);
			if (i % 5 == 0) {
				logger.fatal("Fatal Message " + i);
			}
			logger.debug("Message Info " + i);
		}
	}

}
