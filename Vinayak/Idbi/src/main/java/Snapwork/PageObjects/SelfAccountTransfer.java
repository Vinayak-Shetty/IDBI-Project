package Snapwork.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Snapwork.AbstractComponents.AbstractComponent;

public class SelfAccountTransfer extends AbstractComponent{
	
	WebDriver driver;

	public SelfAccountTransfer(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="[class*='one']")
	WebElement fromAccountDropdown;
	
	public void clickFromAccountDropdown() throws InterruptedException {
		sleep(5);
		fromAccountDropdown.click();
	}
	
	
}
