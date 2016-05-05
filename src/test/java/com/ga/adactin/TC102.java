/**
 *   File Name: TC102.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 2, 2016
 *
 */

package com.ga.adactin;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * TC102 //ADDD (description of class)
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
public class TC102 {
	private static String baseURL = "http://adactin.com/HotelAppBuild2";
	private static WebDriver driver;

	@DataProvider
	public static Object[][] tc102data() {

		return new Object[][] {
				{ "jayabhanu", "gajula", "Sydney", "Hotel Creek", "Standard", "1", "02/06/2016", "4", "2", true },
				{ "SQABCMar21", "sqaadmin2016", "Paris", "Hotel Creek", "Deluxe", "2", "01/06/2016", "4", "2", true },
				{ "SQABCMar21", "sqaadmin2016", "Paris", "Hotel Creek", "Deluxe", "2", "01/06/2014", "4", "2",
						false } };
	}

	public SearchPage searchPage;

	@BeforeClass
	public void setUp() {
		this.driver = new FirefoxDriver();
		this.driver.get(this.baseURL);
	}

	@Test(dataProvider = "tc102data")
	public void testCheckInOut(String username, String password, String location, String hotel, String roomType,
			String numRooms, String checkIn, String adultsInRoom, String childrenInRoom, boolean expectedResults)
			throws ParseException {
		boolean actualResults;
		System.out.println("Tc-102");
		// Eval CheckOut Date:
		String checkOut = DefaultPage.changeDate(checkIn, 7);
		System.out.println("check-in:" + checkIn + "check-out:" + checkOut);
		// Login:
		if (this.searchPage == null) {
			this.searchPage = new LoginPage(driver).enterUsername(username).enterPassword(password).login();
		} else {
			this.searchPage.getDriver().get(DefaultPage.getBaseURL() + "/SearchHotel.php");
		}

		System.out.println("Enter Information: ");
		// Enter Information
		this.searchPage.chooseLocation(location).chooseHotel(hotel).chooseRoomType(roomType).chooseNumOfRooms(numRooms)
				.chooseCheckInDate(checkIn).chooseCheckOutDate(checkOut).chooseNumAdultsInRoom(adultsInRoom)
				.chooseNumChildrenInRoom(childrenInRoom)
				// submit
				.submit();
		// checkOut if actual is same as expected results
		actualResults = !this.searchPage.hasCheckInErrorMessage();
		Assert.assertEquals(actualResults, expectedResults);

	}
}
