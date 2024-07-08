package Snapwork.AbstractComponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Snapwork.PageObjects.SelfAccountTransfer;

public class AbstractComponent {

	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Scroll to brink that element in view of Screen
	public void scrollToView(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Wait for sometime
	public void sleep(int timevalue) throws InterruptedException {
		int time = timevalue*1000;
		Thread.sleep(timevalue);
	}
	
	// Click to the left side of that clickable element
	public void clickActionToLeftOfElement(WebElement element) {
		Actions actions = new Actions(driver);

        // Calculate the coordinates to click (to the left of the element)
        int xOffset = -120; // Adjust this value as per your requirement
        int yOffset = 0;   // No vertical offset

        // Move mouse to the element and click to the left of it
        actions.moveToElement(element, xOffset, yOffset).click().perform();
	}
	

}
