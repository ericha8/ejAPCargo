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

public class CustomerInformation_verifications {

// XPATH //
@FindBy(xpath="//div[contains(text(),'Last Name is required. Please enter a valid value.')]")
private static WebElement errMsgLastName;

@FindBy(xpath="//div[contains(text(),'First Name is required. Please enter a valid value.')]")
private static WebElement errMsgFirstName;

@FindBy(xpath="//div[contains(text(),'Contact Information')]")
private static WebElement lblContactInformation;

@FindBy(xpath="//div[contains(text(),'Invalid TIN format. Please follow the format: must be at least 9 characters long.')]")
private static WebElement errMsgNoBelowTIN;

@FindBy(xpath="//div[contains(text(),'Invalid TIN format. Please follow the format: must not exceed 12 characters long.')]")
private static WebElement errMsgNoAboveTIN;

@FindBy(xpath="//div[contains(text(),'TIN is required. Please enter a valid value.')]")
private static WebElement errMsgYesBlankTIN;

@FindBy(xpath="//div[contains(text(),'Invalid TIN format. Please follow the format: must be at least 9 characters long.')]")
private static WebElement errMsgYesBelowTIN;

@FindBy(xpath="//div[contains(text(),'Invalid TIN format. Please follow the format: must not exceed 12 characters long.')]")
private static WebElement errMsgYesAboveTIN;

// Expected Results //
private static String expectedLastNameErrorMessage = "Last Name is required. Please enter a valid value.";
private static String expectedFirstNameErrorMessage = "First Name is required. Please enter a valid value.";
private static String expectedNextPageLabel = "Contact Information";
private static String expectedTINBelowNineToTwelveErrorMessage = "Invalid TIN format. Please follow the format: must be at least 9 characters long.";
private static String expectedTINAboveTwelveErrorMessage = "Invalid TIN format. Please follow the format: must not exceed 12 characters long.";
private static String expectedChargeAccountYesAndTINisNullErrorMessage = "Invalid TIN format. Please follow the format: must not exceed 12 characters long.";
	
	// Verifying Last Name field will display an error message when Null
	public WebElement lastNameErrorMessage(WebDriver driver) {
		
		System.out.println("Verifying Last Name field will display an error message when Null");
				
		String expectedText = expectedLastNameErrorMessage;
		if(expectedText.equals(errMsgLastName.getText())) {
			System.out.println(" - Error message '" + (errMsgLastName.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - Error message: " + expectedText + " was not displayed");
		}
		
		return errMsgLastName;
	}
	
	// Verifying First Name field will display an error message when Null
	public WebElement firstNameErrorMessage(WebDriver driver) {
		
		System.out.println("Verifying First Name field will display an error message when Null");
				
		String expectedText = expectedFirstNameErrorMessage;
		if(expectedText.equals(errMsgFirstName.getText())) {
			System.out.println(" - Error message '" + (errMsgFirstName.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - Error message: " + expectedText + " was not displayed");
		}
		
		return errMsgFirstName;
	}
	
	// Verifying Contact Information will display when all required field is filled up
	public WebElement nextPageContactInfo(WebDriver driver) {
		
		System.out.println("Verifying Contact Information will display when all required field is filled up");
		
		String expectedText = expectedNextPageLabel;
		if(expectedText.equals(lblContactInformation.getText())) {
			System.out.println(" - Next Page Label '" + (lblContactInformation.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - Next Page Label: " + expectedText + " was not displayed");
		}
		
		return lblContactInformation;
	}
		
	// Verifying Error message displayed when Charge Account is NO but TIN is below 9 to 12 digits
	public WebElement chargeAccNOtinBelowNineToTwelveErrorMessage(WebDriver driver) {
		
		System.out.println("Verifying Error message displayed when Charge Account is NO but TIN is below 9 to 12 digits");
				
		String expectedText = expectedTINBelowNineToTwelveErrorMessage;
		if(expectedText.equals(errMsgNoBelowTIN.getText())) {
			System.out.println(" - TIN is below 9 to 12 digits error message: '" + (errMsgNoBelowTIN.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - TIN is below 9 to 12 digits error message: " + expectedText + " was not displayed");
		}
		
		return errMsgNoBelowTIN;
	}
	
	// Verifying Error message displayed when Charge Account is NO but TIN value is above 12 digits
	public WebElement chargeAccNOtinAboveTwelveErrorMessage(WebDriver driver) {
		
		System.out.println("Verifying Error message displayed when Charge Account is NO but TIN value is above 12 digits");
		
		String expectedText = expectedTINAboveTwelveErrorMessage;
		if(expectedText.equals(errMsgNoAboveTIN.getText())) {
			System.out.println(" - TIN value is above 12 digits error message: '" + (errMsgNoAboveTIN.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - TIN value is above 12 digits error message: " + expectedText + " was not displayed");
		}
		
		return errMsgNoAboveTIN;
	}
	
	// Verifying Error message displayed when Charge Account is YES and TIN field is null/blanked
	public WebElement chargeAccountYesAndTINisNullErrorMessage(WebDriver driver) {
		
		System.out.println("Verifying Error message displayed when Charge Account is YES and TIN field is null/blanked");
				
		String expectedText = expectedChargeAccountYesAndTINisNullErrorMessage;
		if(expectedText.equals(errMsgYesBlankTIN.getText())) {
			System.out.println(" - TIN field is null/blanked error message: '" + (errMsgYesBlankTIN.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - TIN field is null/blanked error message: " + expectedText + " was not displayed");
		}
		
		return errMsgYesBlankTIN;
	}
	
	// Verifying Error message displayed when Charge Account is Yes and TIN is below 9 to 12 digits
	public WebElement chargeAccYesTinBelowNineToTwelveErrorMessage(WebDriver driver) {
		
		System.out.println("Verifying Error message displayed when Charge Account is Yes and TIN is below 9 to 12 digits");
				
		String expectedText = expectedTINBelowNineToTwelveErrorMessage;
		if(expectedText.equals(errMsgYesBelowTIN.getText())) {
			System.out.println(" - TIN is below 9 to 12 digits error message: '" + (errMsgYesBelowTIN.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - TIN is below 9 to 12 digits error message: " + expectedText + " was not displayed");
		}
		
		return errMsgYesBelowTIN;
	}
	
	// Verifying Error message displayed when Charge Account is Yes and TIN value is above 12 digits
	public WebElement chargeAccYesTinAboveTwelveErrorMessage(WebDriver driver) {
		
		System.out.println("Verifying Error message displayed when Charge Account is Yes and TIN value is above 12 digits");
				
		String expectedText = expectedTINAboveTwelveErrorMessage;
		if(expectedText.equals(errMsgYesAboveTIN.getText())) {
			System.out.println(" - TIN value is above 12 digits error message: '" + (errMsgYesAboveTIN.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - TIN value is above 12 digits error message: " + expectedText + " was not displayed");
		}
		
		return errMsgYesAboveTIN;
	}
}
