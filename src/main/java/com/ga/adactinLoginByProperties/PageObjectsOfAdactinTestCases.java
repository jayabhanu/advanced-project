/**
 *   File Name: PageObjectsOfAdactinTestCases.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.ga.adactinLoginByProperties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * PageObjectsOfAdactinTestCases //ADDD (description of class)
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
public class PageObjectsOfAdactinTestCases {

	@FindBy(xpath = "html/body/table[2]/tbody/tr/td[1]/p[1]")
	// css .content_left>p:nth-child(1)
	// xpath .//*[@id='content_left']/p[1]
	public WebElement textToCheckOnWebpage;

}
