package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Dashboard;
import Snapwork.PageObjects.OpenFD;
import Snapwork.TestComponents.BaseTest;

public class OpenFDTest extends BaseTest{

	@Test
	public void openFD() throws InterruptedException{
		System.out.println("Testcase 1 : To open FD");
		Dashboard dashboard = loginScreenP.loginApplication("510284", "Idbi@123");
		OpenFD openFD = dashboard.skipCoachGuide();
		openFD.createFD();
		
	}
}
