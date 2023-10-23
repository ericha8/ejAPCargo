package pages.APCargoEnvironment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomer {

private static WebElement btnAddCustomer = null;
private static WebElement rdBtnPersonalCust = null;
private static WebElement btnContinue = null;

	// 1. Create a customer record
	public WebElement clickAddCustomer(WebDriver driver) {
		
		System.out.println("1. Create a customer record");
		btnAddCustomer = driver.findElement(By.xpath("//div[contains(text(),'Add Customer')]"));
		btnAddCustomer.click();
		System.out.println(" - Add Customer button was located and was clicked");
		
		return btnAddCustomer;
	
	}
	
	// 2. Select Personal customer
	public WebElement selectPersonalCustomer(WebDriver driver) {
		
		System.out.println("2. Select Personal customer");
		rdBtnPersonalCust = driver.findElement(By.xpath("(//div[@role='radio'])[1]"));
		rdBtnPersonalCust.click();
		System.out.println(" - Personal Customer radio button was located and was clicked");
		
		return rdBtnPersonalCust;
	
	}
	
	// Other step - Click Continue button
	public WebElement clickContinue(WebDriver driver) {
		
		System.out.println("Other step - Click Continue button");
		btnContinue = driver.findElement(By.xpath("//div[contains(text(),'Continue')]"));
		btnContinue.click();
		System.out.println(" - Continue was clicked");
		
		return btnContinue;
	
	}
	
}
