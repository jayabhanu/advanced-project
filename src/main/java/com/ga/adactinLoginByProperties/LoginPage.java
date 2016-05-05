/**
 *   File Name: LoginPage.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 30, 2016
 *
 */

package com.ga.adactinLoginByProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * LoginPage //ADDD (description of class)
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

// login using propertis
public class LoginPage {

	// public static Properties devproperties;
	//
	// public static String devpropertieslocation =
	// "src/main/resources/dev.properties";
	//
	// static String baseURL;
	//
	static WebDriver driver;

	// public static Properties loadPropertiestest() {
	// devproperties = ConProperties.loadProperties(devpropertieslocation);
	// return devproperties;
	// }

	public static String login(String baseURL) {

		driver = new FirefoxDriver();
		String curTitle = driver.getTitle();
		System.out.println(curTitle);
		driver.get(baseURL);
		String newTitle = driver.getTitle();
		System.out.println(newTitle);
		if (curTitle.equals(newTitle)) {
			boolean title = true;
		}
		return null;

	}

}
