package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Coachguide;
import Snapwork.PageObjects.Dashboard;
import Snapwork.PageObjects.SelfAccountTransfer;
import Snapwork.TestComponents.BaseTest;

public class SelfAccountTransferTest extends BaseTest{

	@Test
	public void selfTransferVerify() throws InterruptedException {
		Coachguide coachguide = loginScreenP.loginApplication("510284", "Idbi@123");
		Dashboard dashboard = coachguide.skipCoachGuide();
		SelfAccountTransfer selfAccTransfer = PaymentSelfAccTransfer();
		System.out.println("Account Dropdown Clicked");
	}
}
