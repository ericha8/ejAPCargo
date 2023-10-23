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

public class CustomerInformation_ChargeAccountFields {

// XPATH //
	
@FindBy(xpath="//input[@placeholder='Input Address']")
private static WebElement txtChargeAccAddress;

@FindBy(xpath="//input[@placeholder='Input Zip Code']")
private static WebElement txtChargeAccZipCode;

@FindBy(xpath="(//div[@class='css-view-175oi2r r-flexBasis-1mlwlqe r-overflow-1udh08x r-zIndex-417010'])[5]")
private static WebElement drpdownAPCargoBillingAndCollectionRep;

@FindBy(xpath="//div[@class='css-view-175oi2r r-flexGrow-16y2uox']")
private static WebElement selectAPCargoBillingAndCollectionRep;

@FindBy(xpath="(//div[@class='css-view-175oi2r r-flexBasis-1mlwlqe r-overflow-1udh08x r-zIndex-417010'])[6]")
private static WebElement drpdownAPCargoAccountReceivableRep;

@FindBy(xpath="//div[@class='css-view-175oi2r r-flexGrow-16y2uox']")
private static WebElement selectAPCargoAccountReceivableRep;

@FindBy(xpath="(//div[@class='css-view-175oi2r r-flexBasis-1mlwlqe r-overflow-1udh08x r-zIndex-417010'])[7]")
private static WebElement drpdownAPCargoAccountExecutiveRep;

@FindBy(xpath="//div[@class='css-view-175oi2r r-flexGrow-16y2uox']")
private static WebElement selectAPCargoAccountExecutiveRep;

@FindBy(xpath="(//input[@class='css-textinput-11aywtz r-placeholderTextColor-6taxm2 r-margin-crgep1 r-zIndex-184en5c'])[9]")
private static WebElement txtCustomerBillingAndCollectionRep;

@FindBy(xpath="(//input[@class='css-textinput-11aywtz r-placeholderTextColor-6taxm2 r-margin-crgep1 r-zIndex-184en5c'])[10]")
private static WebElement txtCustomersProcessor;

@FindBy(xpath="(//div[@class='css-view-175oi2r r-flexBasis-1mlwlqe r-overflow-1udh08x r-zIndex-417010'])[8]")
private static WebElement drpdownBillingCycle;

@FindBy(xpath="//div[@class='css-view-175oi2r r-flexGrow-16y2uox']")
private static WebElement selectBillingCycle;

@FindBy(xpath="(//div[@class='css-view-175oi2r r-flexBasis-1mlwlqe r-overflow-1udh08x r-zIndex-417010'])[9]")
private static WebElement drpdownCreditTerm;

@FindBy(xpath="//div[@class='css-view-175oi2r r-flexGrow-16y2uox']")
private static WebElement selectCreditTerm;

@FindBy(xpath="//input[@placeholder='Input Credit Limit']")
private static WebElement txtCreditLimit;

@FindBy(xpath="//input[@placeholder='Input Credit Limit Threshold']")
private static WebElement txtCreditLimitThreshold;

	// For Billing Address - Input Address field
	public WebElement enterAddress(WebDriver driver,  String address) {
		
		txtChargeAccAddress.sendKeys(address);
		System.out.println(" - Address field");
		return txtChargeAccAddress;
	
	}
	
	// For Billing Address - Input Zip Code field
	public WebElement enterZipCode(WebDriver driver,  String zipCode) {

		txtChargeAccZipCode.sendKeys(zipCode);
		System.out.println(" - Zip Code field");
		return txtChargeAccZipCode;
	
	}

	// Selecting from 'AP Cargo Billing and Collection Representative' dropdown
	public WebElement selectAPCargoBillingAndCollectionRep(WebDriver driver,  String apCargoBillingAndCollectionRep) {
		
		System.out.println("Selecting from 'AP Cargo Billing and Collection Representative' dropdown");
		
		// Clicking 'AP Cargo Billing and Collection Representative' dropdown
		drpdownAPCargoBillingAndCollectionRep.click();
		
		Select objSelectAPCargoBillingAndCollectionRep = new Select(selectAPCargoBillingAndCollectionRep);
		objSelectAPCargoBillingAndCollectionRep.selectByVisibleText(apCargoBillingAndCollectionRep);
		System.out.println(" - " + objSelectAPCargoBillingAndCollectionRep + " was selected from 'AP Cargo Billing and Collection Representative' dropdown");
		return selectAPCargoBillingAndCollectionRep;
		
	}
	
	// Selecting from 'AP Cargo Account Receivable Representative' dropdown
	public WebElement selectAPCargoAccountReceivableRep(WebDriver driver,  String apCargoAccountReceivableRep) {
		
		System.out.println("Selecting from 'AP Cargo Account Receivable Representative' dropdown");
		
		// Clicking 'AP Cargo Account Receivable Representative' dropdown
		drpdownAPCargoAccountReceivableRep.click();
				
		Select objSelectAPCargoAccountReceivableRep = new Select(selectAPCargoAccountReceivableRep);
		objSelectAPCargoAccountReceivableRep.selectByVisibleText(apCargoAccountReceivableRep);
		System.out.println(" - " + objSelectAPCargoAccountReceivableRep + " was selected from 'AP Cargo Account Receivable Representative' dropdown");
		return selectAPCargoAccountReceivableRep;
		
	}

	// Selecting from 'AP Cargo Account Executive Representative' dropdown
	public WebElement selectAPCargoAccountExecutiveRep(WebDriver driver,  String apCargoAccountExecutiveRep) {
		
		System.out.println("Selecting from 'AP Cargo Account Executive Representative' dropdown");
		
		// Clicking 'AP Cargo Account Executive Representative' dropdown
		drpdownAPCargoAccountExecutiveRep.click();
		
		Select objSelectAPCargoAccountExecutiveRep = new Select(selectAPCargoAccountExecutiveRep);
		objSelectAPCargoAccountExecutiveRep.selectByVisibleText(apCargoAccountExecutiveRep);
		System.out.println(" - " + objSelectAPCargoAccountExecutiveRep + " was selected from 'AP Cargo Account Executive Representative' dropdown");
		return selectAPCargoAccountExecutiveRep;
		
	}
	
	// For Customer's Billing and Collection Representative field
	public WebElement enterCustomerBillingAndCollectionRep(WebDriver driver,  String customerBillingAndCollectionRep) {

		txtCustomerBillingAndCollectionRep.sendKeys(customerBillingAndCollectionRep);
		System.out.println(" - Customer's Billing and Collection Representative field");
		return txtCustomerBillingAndCollectionRep;
	
	}
	
	// For Customer's Processor field
	public WebElement enterCustomersProcessor(WebDriver driver,  String customersProcessor) {

		txtCustomersProcessor.sendKeys(customersProcessor);
		System.out.println(" - Customer's Processor field");
		return txtCustomersProcessor;
	
	}

	// Selecting from 'Billing Cycle' dropdown
	public WebElement selectBillingCycle(WebDriver driver,  String billingCycle) {
		
		System.out.println("Selecting from 'Billing Cycle' dropdown");
		
		// Clicking 'Billing Cycle' dropdown
		drpdownBillingCycle.click();
				
		Select objSelectBillingCycle = new Select(selectBillingCycle);
		objSelectBillingCycle.selectByVisibleText(billingCycle);
		System.out.println(" - " + objSelectBillingCycle + " was selected from 'Billing Cycle' dropdown");
		return selectBillingCycle;
		
	}
	
	// Selecting from 'Credit Term' dropdown
	public WebElement selectCreditTerm(WebDriver driver,  String creditTerm) {
		
		System.out.println("Selecting from 'Credit Term' dropdown");
		
		// Clicking 'Credit Term' dropdown
		drpdownCreditTerm.click();
		
		Select objSelectCreditTerm = new Select(selectCreditTerm);
		objSelectCreditTerm.selectByVisibleText(creditTerm);
		System.out.println(" - " + objSelectCreditTerm + " was selected from 'Credit Term' dropdown");
		return selectCreditTerm;
		
	}

	// For Credit Limit field
	public WebElement enterCreditLimit(WebDriver driver,  String creditLimit) {

		txtCreditLimit.sendKeys(creditLimit);
		System.out.println(" - Credit Limit field");
		return txtCreditLimit;
	
	}	
	
	// For Credit Limit Threshold field
	public WebElement enterCreditLimitThreshold(WebDriver driver,  String creditLimitThreshold) {

		txtCreditLimitThreshold.sendKeys(creditLimitThreshold);
		System.out.println(" - Credit Limit Threshold field");
		return txtCreditLimitThreshold;
	
	}
	
}
