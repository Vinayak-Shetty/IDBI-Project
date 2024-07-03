package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Dashboard;
import Snapwork.PageObjects.SelfAccountTransfer;
import Snapwork.TestComponents.BaseTest;

public class SelfAccountTransferTest extends BaseTest{

	@Test
	public void selfTransferVerify() throws InterruptedException {
		Dashboard dashboard = loginScreenP.loginApplication("510284", "Idbi@123");
		SelfAccountTransfer selfAccountTransfer = dashboard.completeCoachGuide();
		selfAccountTransfer.clickFromAccountDropdown();
		System.out.println("Account Dropdown Clicked");
	}
}
