package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Coachguide;
import Snapwork.TestComponents.BaseTest;

public class CoachGuideTest extends BaseTest{

	@Test
	public void verifyCoachGuideIsWorking() throws InterruptedException{
		System.out.println("Verify coachguide is working correctly");
		Coachguide coachguide = loginScreenP.loginApplication("510284", "Idbi@123");
		coachguide.completeCoachGuide();
	}
	
}
