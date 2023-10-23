package pages.APCargoEnvironment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerInformation_fields {

// XPATH //
	
@FindBy(xpath="//input[@placeholder='Input Last Name']")
private static WebElement txtLastName;

@FindBy(xpath="//input[@placeholder='Input First Name']")
private static WebElement txtFirstName;

@FindBy(xpath="//input[@placeholder='Input Middle Name']")
private static WebElement txtMiddleName;

@FindBy(xpath="//input[@placeholder='Input Suffix']")
private static WebElement txtSuffix;

@FindBy(xpath="(//div[contains(@class,'css-view-175oi2r r-cursor-1loqt21 r-touchAction-1otgn73')])[5]")
private static WebElement toggleWithChargeAccount;

@FindBy(xpath="//input[@placeholder='Input TIN']")
private static WebElement txtTIN;

@FindBy(xpath="(//div[contains(@class,'css-view-175oi2r r-cursor-1loqt21 r-touchAction-1otgn73')])[6]")
private static WebElement toggleAuthorizedThirdPartyPayor;

@FindBy(xpath="(//div[@class='css-view-175oi2r r-pointerEvents-105ug2t'])[10]")
private static WebElement btnCustInfoNext;


	// For Last Name field
	public WebElement enterLastName(WebDriver driver,  String lastName) {
		
		txtLastName.sendKeys(lastName);
		System.out.println(" - Last Name field");
		return txtLastName;
	
	}
	
	// For First Name field
	public WebElement enterFirstName(WebDriver driver,  String firstName) {

		txtFirstName.sendKeys(firstName);
		System.out.println(" - First Name field");
		return txtFirstName;
	
	}
	
	// For Middle Name field
	public WebElement enterMiddleName(WebDriver driver,  String middleName) {

		txtMiddleName.sendKeys(middleName);
		System.out.println(" - Middle Name field");
		return txtMiddleName;
	
	}
	
	// For Suffix field
	public WebElement enterSuffix(WebDriver driver,  String suffix) {

		txtSuffix.sendKeys(suffix);
		System.out.println(" - Suffix Name field");
		return txtMiddleName;
	
	}
	
	// For toggle 'With Charge Account'
	public WebElement clickToggleWithChargeAccount(WebDriver driver) {
		
		System.out.println("For toggle 'With Charge Account'");
		toggleWithChargeAccount.click();
		System.out.println(" - Charge Account toggle button was located and was clicked");
		
		return toggleWithChargeAccount;
	
	}
	
	// For TIN field field
	public WebElement enterTIN(WebDriver driver,  String tin) {

		txtTIN.sendKeys(tin);
		System.out.println(" - TIN field");
		return txtTIN;
	
	}
	
	// For toggle 'Authorized Third Party Payor'
	public WebElement clickToggleAuthorizedThirdPartyPayor(WebDriver driver) {
		
		System.out.println("For toggle 'Authorized Third Party Payor'");
		toggleAuthorizedThirdPartyPayor.click();
		System.out.println(" - Authorized Third Party Payor toggle button was located and was clicked");
		
		return toggleAuthorizedThirdPartyPayor;
	
	}
	
	// For Next button
	public WebElement clickNext(WebDriver driver) {
		
		System.out.println("For Next button");
		btnCustInfoNext.click();
		System.out.println(" - Next button was located and was clicked");
		
		return btnCustInfoNext;
	
	}
	
}
