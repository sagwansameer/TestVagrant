package com.build.rcb.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class RoyalchallengersBangalore {

	Logger logger = LogManager.getLogger(RoyalchallengersBangalore.class);

	/*
	 * @author Sameer Sagwan: This testcase validates that the team has only 4
	 * foreign players
	 */

	@Test(testName = "test1_ForeignPlayers", description = "This testcase validates that the team has only 4 foreign players")

	public void test1_ForeignPlayers() {
		System.out.println("This is passed");

	}

	/*
	 * @author Sameer Sagwan: This testcase validates that there is at least one
	 * wicket keeper
	 * 
	 */
	public void test2_WicketKeeper() {

	}
}
