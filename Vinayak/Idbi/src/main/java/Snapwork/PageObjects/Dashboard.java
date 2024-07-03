package Snapwork.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver driver;
	
	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath = "//input[@value='Close']")
	WebElement closeBtn;
	
	@FindBy(xpath = "//input[@value='Skip']")
	WebElement skipBtn;
	
	
	public OpenFD completeCoachGuide() throws InterruptedException {
		Thread.sleep(10000);
		nextBtn.click();
		nextBtn.click();
		nextBtn.click();
		nextBtn.click();
		nextBtn.click();
		nextBtn.click();
		nextBtn.click();
		nextBtn.click();
		closeBtn.click();
		OpenFD openFD = new OpenFD(driver);
		return openFD;
		
	}
	
	public OpenFD skipCoachGuide() throws InterruptedException {
		Thread.sleep(10000);
		skipBtn.click();
		OpenFD openFD = new OpenFD(driver);
		return openFD;
	}
	
	public OpenSSP openSSPScreen() throws InterruptedException {
		Thread.sleep(10000);
		skipBtn.click();
		OpenSSP openSSP = new OpenSSP(driver);
		return openSSP;
	}
}
