package Snapwork.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {
	
	WebDriver driver;
	
	public LoginScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="regCustomerId")
	WebElement userCustID;
	
	@FindBy(id="password")
	WebElement userPassword;
	
	@FindBy(xpath = "//input[@type='button']")
	WebElement continueToLogin;
	
	@FindBy(id="mobcaptacha")
	WebElement userCaptcha;
	
	@FindBy(xpath = "//div/label[@for='iagree']")
	WebElement tcCheckBox;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;
	
	

	public void goTo() {
		driver.get("https://robotics.idbibank.com/idbiweb/#login");
	}
	
	public Dashboard loginApplication(String custID, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		userCustID.sendKeys(custID);
		continueToLogin.click();
		Thread.sleep(10000);
		continueToLogin.click();
		userPassword.sendKeys(password);
		tcCheckBox.click();
		loginBtn.click();
		Dashboard dashboard = new Dashboard(driver);
		return dashboard;
		
	}
	
}
