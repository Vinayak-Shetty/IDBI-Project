package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Dashboard;
import Snapwork.PageObjects.OpenFD;
import Snapwork.PageObjects.OpenSSP;
import Snapwork.TestComponents.BaseTest;

public class OpenSSPTest extends BaseTest{

	@Test
	public void openSSP() throws InterruptedException{
		System.out.println("Testcase 2 : To open SSP");
		Dashboard dashboard = loginScreenP.loginApplication("510284", "Idbi@123");
		OpenSSP openSSP = dashboard.openSSPScreen();
		openSSP.createSSP();
		
	}
}
