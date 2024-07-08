package Snapwork.TestComponents;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import Snapwork.PageObjects.LoginScreen;
import Snapwork.PageObjects.OpenFD;
import Snapwork.PageObjects.OpenSSP;
import Snapwork.PageObjects.SelfAccountTransfer;

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
	
	@FindBy(xpath = "//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
	List<WebElement> InvestmentBtn;
	
	@FindBy(xpath = "//ul[@id='sub-menu-invest']/li/div[1]")
	WebElement OpenFDsubmenuOption;
	
	@FindBy(xpath = "//div[contains(text(),'Open SSP/SSP Plus')]")
	WebElement OpenSSPsubmenuOption;
	
	@FindBy(xpath = "//p[@translate='SELF_ACCOUNT_TRANSFER']")
	WebElement selfAccountTransferBtn;
	
	//Open Investment menu 'Open FD' page
	public OpenFD InvestmentOpenFD() throws InterruptedException {
		InvestmentBtn.get(2).click();
		OpenFDsubmenuOption.click();
		OpenFD openFD = new OpenFD(driver);
		return openFD;
	}
	
	//Open 'Open SSP' page
	public OpenSSP InvestmentOpenSSP() throws InterruptedException {
		InvestmentBtn.get(2).click();
		OpenSSPsubmenuOption.click();
		OpenSSP openSSP = new OpenSSP(driver);
		return openSSP;
	}
	
	// Open Payments : 'Self Transfer' page
	public SelfAccountTransfer PaymentSelfAccTransfer() throws InterruptedException {
		Thread.sleep(1000);
		selfAccountTransferBtn.click();
		SelfAccountTransfer selfAccTransfer = new SelfAccountTransfer(driver);
		return selfAccTransfer;
	}
	
}
