package Snapwork.PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Snapwork.AbstractComponents.AbstractComponent;

public class OpenSSP extends AbstractComponent{
	WebDriver driver;

	public OpenSSP(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//em[@class='ico-dropdown two']")
	WebElement accountDropdownArrowIcon;
	
	@FindBy(xpath = "//li[@class='min-H70 ng-scope']")
	WebElement selectAccount;
	
	@FindBy(xpath = "//input[@placeholder='Enter Amount']")
	WebElement enterAmount;
	
	@FindBy(xpath = "//a[@class='list-block slide-link five']//em[@class='ico-dropdown']")
	WebElement selectYearDropdownIcon;
	
	@FindBy(xpath = "//div[normalize-space()='1']")
	WebElement selectYear;
	
	@FindBy(xpath = "//a[@class='list-block slide-link six']//em[@class='ico-dropdown']")
	WebElement monthDropdown;
	
	@FindBy(xpath = "(//div[@class='ng-binding'][normalize-space()='3'])[2]")
	WebElement selectMonth;
	
	@FindBy(xpath = "//label[@for='existingNominee']")
	WebElement nomineeRadioBtn;
	
	@FindBy(xpath = "//label[@for='openRdFormAgreeTnC']")
	WebElement tcCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//input[@value='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Finacle System Error Occoured')")
	WebElement finacleError;
	
//	@FindBy(xpath = "//p[contains(text(),'Sorry! We are unable to service your request at th')]")
//	WebElement unableToProcessPopup;
	
	
//	@FindBy(xpath = "//aside//em[@class='ico-dropdown']")
//	List<WebElement> DropdownArrowIcon;
	
//	WebElement AccountDropdownIcon = DropdownArrowIcon.get(0);
//	WebElement TypeOfDepositDropdown = DropdownArrowIcon.get(1);
//	WebElement InterestPayoutDropdown = DropdownArrowIcon.get(2);
//	WebElement MaturityInstructionDropdown = DropdownArrowIcon.get(3);
	
	public void createSSP() throws InterruptedException {
		sleep(5);
		accountDropdownArrowIcon.click();
		selectAccount.click();
		sleep(5);
		enterAmount.sendKeys("10000");
		scrollToView(continueBtn);
		selectYearDropdownIcon.click();
		selectYear.click();
		sleep(5);
		monthDropdown.click();
		selectMonth.click();
		sleep(5);
		
		nomineeRadioBtn.click();
		clickActionToLeftOfElement(tcCheckBox);

//		tcCheckBox.click();
        System.out.println("All the click actions performed");
		continueBtn.click();
		Thread.sleep(5000);
		scrollToView(confirmBtn);
		confirmBtn.click();
		
		String errorText = finacleError.getText();	
		String expectedText = "Finacle System Error Occoured!!! Please contact System Administrator.";
		
		 Assert.assertEquals(errorText, expectedText, "Popup text does not match expected text");
		 
		 System.out.println("Testcase 2 : Open SSP passed");
		
	}
	
	
	
}
