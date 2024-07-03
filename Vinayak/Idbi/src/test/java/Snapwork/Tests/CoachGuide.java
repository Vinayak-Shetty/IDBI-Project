package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Dashboard;
import Snapwork.TestComponents.BaseTest;

public class CoachGuide extends BaseTest{

	@Test
	public void verifyCoachGuideNextBtn() throws InterruptedException{
		System.out.println("Verify coachguide is working correctly");
		Dashboard dashboard = loginScreenP.loginApplication("510284", "Idbi@123");
		dashboard.completeCoachGuide();
	}
	
}
