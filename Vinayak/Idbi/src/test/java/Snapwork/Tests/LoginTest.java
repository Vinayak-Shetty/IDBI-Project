package Snapwork.Tests;

import org.testng.annotations.Test;

import Snapwork.PageObjects.Dashboard;
import Snapwork.TestComponents.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void correctvalues() throws InterruptedException {
		System.out.println("Enter correct values and login");
		loginScreenP.loginApplication("510284", "Idbi@123");
	}
	
//	@Test
//	public void incorrectPassword() throws InterruptedException {
//		System.out.println("Enter incorrect password");
//		loginScreenP.loginApplication("79752286", "idbi@123");
//	}
	
	

}
