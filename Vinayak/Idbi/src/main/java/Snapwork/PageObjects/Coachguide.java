package Snapwork.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coachguide {
	WebDriver driver;
	
	public Coachguide(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath = "//input[@value='Close']")
	WebElement closeBtn;
	
	@FindBy(xpath = "//input[@value='Skip']")
	WebElement skipBtn;
	
	
	public Dashboard completeCoachGuide() throws InterruptedException {
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
		Dashboard dashboard = new Dashboard(driver);
		return dashboard;
		
	}
	
	public Dashboard skipCoachGuide() throws InterruptedException {
		Thread.sleep(10000);
		skipBtn.click();
		Dashboard dashboard = new Dashboard(driver);
		return dashboard;
	}
	
	public OpenSSP openSSPScreen() throws InterruptedException {
		Thread.sleep(10000);
		skipBtn.click();
		OpenSSP openSSP = new OpenSSP(driver);
		return openSSP;
	}
}
