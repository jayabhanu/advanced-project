package com.ga.adactinLoginByProperties;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sqa.jf.util.helpers.ConProperties;

public class LoginPageTest {

	public static String baseURL;
	public static Properties devproperties;
	public static String devpropertieslocation = "src/main/resources/dev.properties";
	public static WebDriver driver;

	// private static Properties devProps;
	//
	// private static String devPropsLocation =
	// "src/main/resources/dev.properties";
	//
	// private static WebDriver driver;
	//
	// private static Properties sharedMapUI;
	//
	// private static String sharedMapUILocation =
	// "src/main/resources/shared-map-ui.properties";
	//
	// @DataProvider(name = "UserAccountInfo")
	// public static Object[][] getLoginData() {
	// // Create a 2D Object with only one level (for one test)
	// Object[][] data = new Object[1][];
	// // Create a test with 2 elements for username and password
	// Object[] test = { devProps.get("username"), devProps.get("password") };
	// // Set the array of parameters to be the first element (and only) for
	// // the data
	// data[0] = test;
	// return data;
	// }

	@BeforeClass
	public static String loadPropertiestest() {
		devproperties = ConProperties.loadProperties(devpropertieslocation);
		baseURL = devproperties.getProperty("baseURL");
		System.out.println(baseURL);
		return baseURL;
	}

	@Test
	public void logintest() {
		String curTitle = driver.getTitle();
		LoginPage login = new LoginPage();
		login.login(baseURL);
		// WebElement loginButton =
		// driver.FindElement(By.cssSelector("#login"));
		String newTitle = driver.getTitle();
		Assert.assertFalse(curTitle.equals(newTitle), "Hurry you hv opened your Hotel management website ");

	}
}

// @BeforeClass
// public void openLinkInDiffBrowser() {
// sharedMapUI = ConProperties.loadProperties(sharedMapUILocation);
//
// }

// @Test(dataProvider = "UserAccountInfo")
// public void testLogin(String username, String password) throws
// InterruptedException {
// String expectedString = "Hi Jean-francois!";
// clickSignin();
// enterCredentialsAndLogin(username, password);
// String actualSignInText = retrieveWelcomeMessage();
// Assert.assertEquals(expectedString, actualSignInText);
// }
//
// private String retrieveWelcomeMessage() {
// WebElement signInLink = driver.findElement(By.id("gh-ug"));
// String actualSignInText = signInLink.getText();
// return actualSignInText;
// }
//
// private void clickSignin() {
// WebElement signInBtn;
// signInBtn =
// driver.findElement(By.xpath(sharedMapUI.getProperty("signInBtn")));
// signInBtn.click();
// }
//
// private void enterCredentialsAndLogin(String username, String password) {
// WebElement usernameFld;
// WebElement passwordFld;
// usernameFld =
// driver.findElement(By.xpath(sharedMapUI.getProperty("usernameFld")));
// passwordFld =
// driver.findElement(By.xpath(sharedMapUI.getProperty("passwordFld")));
// usernameFld.sendKeys(username);
// passwordFld.sendKeys(password);
// passwordFld.submit();
// }
//
// private boolean isElementPresent(By by) {
// try {
// this.driver.findElement(by);
// return true;
// } catch (NoSuchElementException e) {
// return false;
// }
// }
// }
