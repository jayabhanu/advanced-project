/**
 *   File Name: TC105.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.ga.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * TC105 //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TC101 {
	private static String baseURL = "http://adactin.com/HotelAppBuild2";
	private static WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(this.baseURL);
	}

	@Test
	public void testLogin() {
		Assert.assertTrue(new LoginPage(this.driver).enterUsername("SQABCMar21").enterPassword("sqaadmin2016").login()
				.hasWelcomeMsg());
	}
}
