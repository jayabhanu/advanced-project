/**
 *   File Name: RequestInputInfo.java<br>
 *
 *   Gajula Jayabhanu<br>

 *   Created: Mar 30, 2016
 *
 */

package com.sqa.jf.util.helpers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * RequestInputInfo //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Gajula Jayabhanu
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInputInfo {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("\tBefore Test Method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("\tAfter Test Method");
	}

	@Test
	public void test1() {
		System.out.println("\t\tTest 1");
	}

	@Test
	public void test2() {
		System.out.println("\t\tTest 1");
	}

}
