package Snapwork.TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import Snapwork.PageObjects.LoginScreen;

public class BaseTest {

	
	public WebDriver driver;
	public LoginScreen loginScreenP;
	
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/vinay/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public LoginScreen launchApplication() throws IOException {

		WebDriver driver = initializeDriver();
		driver.manage().window().maximize();
		loginScreenP = new LoginScreen(driver);
		loginScreenP.goTo();
		return loginScreenP;
	}
}
