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

public class OpenFD extends AbstractComponent{
	WebDriver driver;

	public OpenFD(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
	List<WebElement> InvestmentBtn;
	
	@FindBy(xpath = "//ul[@id='sub-menu-invest']/li/div[1]")
	WebElement OpenFDsubmenuOption;
	
	@FindBy(xpath = "//a[@class='list-block slide-link one']//em[@class='ico-dropdown']")
	WebElement accountDropdownArrowIcon;
	
	@FindBy(xpath = "//li[@ng-repeat='x in accountList']")
	WebElement selectAccount;
	
	@FindBy(xpath = "//a[@class='list-block slide-link five']//em[@class='ico-dropdown']")
	WebElement depositypeDropdownIcon;
	
	@FindBy(xpath = "//div[normalize-space()='Regular Fixed Deposit']")
	WebElement selectTypeOfDeposit;
	
	@FindBy(xpath = "//a[@class='list-block slide-link six']//em[@class='ico-dropdown']")
	WebElement interestPayoutDropdownIcon;
	
	@FindBy(xpath = "//div[normalize-space()='Less than 6 months']")
	WebElement selectPayoutOption;
	
	@FindBy(xpath = "//input[@placeholder='Enter Amount']")
	WebElement enterAmount;
	
	@FindBy(xpath = "//input[@id='tenureMonth']")
	WebElement enterMonth;
	
	@FindBy(xpath = "//input[@id='tenureDate']")
	WebElement enterDays;
	
	@FindBy(xpath = "//a[@class='list-block slide-link seven']//em[@class='ico-dropdown']")
	WebElement maturityInstructionDropdownIcon;
	
	@FindBy(xpath = "//div[normalize-space()='Renew Principal & Interest']")
	WebElement selectMaturityInstruction;
	
	@FindBy(xpath = "//label[normalize-space()='I want auto Sweep-in facility to source account']")
	WebElement sweepInFacilityCheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Please read and agree to the')]")
	WebElement tcCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//input[@value='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Sorry! We are unable to service your request at th')]")
	WebElement unableToProcessPopup;
	
	
//	@FindBy(xpath = "//aside//em[@class='ico-dropdown']")
//	List<WebElement> DropdownArrowIcon;
	
//	WebElement AccountDropdownIcon = DropdownArrowIcon.get(0);
//	WebElement TypeOfDepositDropdown = DropdownArrowIcon.get(1);
//	WebElement InterestPayoutDropdown = DropdownArrowIcon.get(2);
//	WebElement MaturityInstructionDropdown = DropdownArrowIcon.get(3);
	
	public void createFD() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		InvestmentBtn.get(2).click();
		OpenFDsubmenuOption.click();
		sleep(5);
		accountDropdownArrowIcon.click();
		selectAccount.click();
		sleep(5);
		depositypeDropdownIcon.click();
		selectTypeOfDeposit.click();
		sleep(5);
		interestPayoutDropdownIcon.click();
		selectPayoutOption.click();
		sleep(5);
		enterAmount.sendKeys("10000");
		enterMonth.sendKeys("5");
		enterDays.sendKeys("2");
		maturityInstructionDropdownIcon.click();
		selectMaturityInstruction.click();
		sleep(5);
		scrollToView(continueBtn);
		sweepInFacilityCheckBox.click();
		clickActionToLeftOfElement(tcCheckBox);

//		tcCheckBox.click();
        System.out.println("All the click actions performed");
        scrollToView(continueBtn);
		continueBtn.click();
		Thread.sleep(5000);
		scrollToView(confirmBtn);
		confirmBtn.click();
		
		String errorText = unableToProcessPopup.getText();	
		String expectedText = "Sorry! We are unable to service your request at this time. Please try again.";
		
		 Assert.assertEquals(errorText, expectedText, "Popup text does not match expected text");
		
	}
	
	
	
}
