/**
 *   File Name: LoginPage.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 30, 2016
 *
 */

package com.ga.finalproject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sqa.jf.util.helpers.ConProperties;

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
public class LoginPage {

	public static Properties devproperties;

	public static String devpropertieslocation = "src/main/resources/dev.properties";

	static String baseURL;

	static WebDriver driver;

	public static void main(String[] args) {
		loadPropertiestest();
		baseURL = devproperties.getProperty("baseURL");
		driver = new FirefoxDriver();
		driver.get(baseURL);

	}

	static Properties loadPropertiestest() {
		devproperties = ConProperties.loadProperties(devpropertieslocation);
		return devproperties;
	}

}
