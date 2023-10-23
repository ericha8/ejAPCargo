package APCargoTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.APCargoEnvironment.LoginPage;
import pages.APCargoEnvironment.AddCustomer;
import pages.APCargoEnvironment.CustomerInformation_fields;
import pages.APCargoEnvironment.CustomerInformation_verifications;

public class TC021_24_ChargeAccountisYesAndTINIsNull {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		chargeAccountisYesAndTINIsNull();
		
	}
	
	public static void chargeAccountisYesAndTINIsNull() {
		driver = new ChromeDriver();
		
		LoginPage login = new LoginPage();
		AddCustomer addCustomer = new AddCustomer();
		CustomerInformation_fields customerInfoFields = new CustomerInformation_fields();
		CustomerInformation_verifications customerInfoVerify = new CustomerInformation_verifications();
		
		System.out.println("TC021.24_[CustMgmt] [Customer Record_Create Customer Record] - Input Validations on the "
				+ "fields - Personal customer");
		System.out.println("- Charge Account is 'Yes' and TIN is Null");
		
		// Open the browser and navigate to URL
		login.openBrowserAndNavigateURL(driver);
		
		// Enter Valid Username
		login.enterEmail(driver);
		
		// Enter Valid Password
		login.enterPassword(driver);
		
		// Click Login button
		login.clickSignInButton(driver);
		
		// 1. Create a customer record
		addCustomer.clickAddCustomer(driver);
		
		// 2. Select Personal customer, Click Continue button, and Fill up required fields
		addCustomer.selectPersonalCustomer(driver);
		addCustomer.clickContinue(driver);
		customerInfoFields.enterLastName(driver, "Gomez");
		customerInfoFields.enterFirstName(driver, "John");
		
		// 3. Select Yes in With Charge Account
		customerInfoFields.clickToggleWithChargeAccount(driver);
		
		// 4. Left the TIN field as null/blanked
		customerInfoFields.enterTIN(driver, "");
		
		// 5. Click Next button
		customerInfoFields.clickNext(driver);
		
		// Verifying Error message displayed when Charge Account is YES and TIN field is null/blanked
		customerInfoVerify.chargeAccountYesAndTINisNullErrorMessage(driver);
		
		// Closing the browser and Test Completed
//		login.closeBrowserAndTestComplete(driver);
		
	}

}
