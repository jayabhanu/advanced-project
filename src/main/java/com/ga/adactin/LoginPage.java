/**
 *   File Name: LoginPage1.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.ga.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sqa.jf.util.helpers.exceptions.AutoBasicsNotInitializedException;

/**
 * LoginPage1 //ADDD (description of class)
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
public class LoginPage extends DefaultPage {

	@FindBy(id = "login")
	private WebElement loginBtn;

	@FindBy(id = "password")
	private WebElement passwordFld;

	@FindBy(id = "username")
	private WebElement usernameFld;

	@FindBy(how = How.CSS, using = "td.welcome_menu")
	private WebElement welcomeElement;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public LoginPage enterPassword(String password) {
		this.passwordFld.sendKeys(password);
		return this;
	}

	public LoginPage enterUsername(String username) {
		this.usernameFld.sendKeys(username);
		return this;
	}

	public boolean hasWelcomeMsg() {
		// return AutoBasics.isElementPresent(driver,
		// By.cssSelector("td.welcome_menu"));
		try {
			// AutoBasics.isElementPresent(driver,
			// By.cssSelector("td.welcome_menu"));
			return AutoBasics.isElementPresent(By.cssSelector("td.welcome_menu"));
		} catch (AutoBasicsNotInitializedException e) {
			// TODO Auto-generated catch block
			getLogger().warn(e.getMessage());
			return false;
		}
	}

	public SearchPage login() {
		this.loginBtn.click();
		return new SearchPage(getDriver());
	}

}
