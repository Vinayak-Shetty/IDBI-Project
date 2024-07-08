package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Coachguide;
import Snapwork.PageObjects.Dashboard;
import Snapwork.PageObjects.OpenFD;
import Snapwork.TestComponents.BaseTest;

public class OpenFDTest extends BaseTest{

	@Test
	public void openFD() throws InterruptedException{
		System.out.println("Testcase 1 : To open FD");
		Coachguide coachguide = loginScreenP.loginApplication("510284", "Idbi@123");
		Dashboard dashboard = coachguide.skipCoachGuide();
		OpenFD openFD = InvestmentOpenFD();
		openFD.createFD();
		System.out.println("To test open FD....");
		System.out.println("To test open FD....");
		
	}
}
