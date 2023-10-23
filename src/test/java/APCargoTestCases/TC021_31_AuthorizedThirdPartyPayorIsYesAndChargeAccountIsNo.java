package APCargoTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.APCargoEnvironment.LoginPage;
import pages.APCargoEnvironment.AddCustomer;
import pages.APCargoEnvironment.CustomerInformation_fields;
import pages.APCargoEnvironment.CustomerInformation_verifications;
// import pages.APCargoEnvironment.CustomerInformation_ChargeAccountFields;

public class TC021_31_AuthorizedThirdPartyPayorIsYesAndChargeAccountIsNo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		authorizedThirdPartyPayorIsYesAndChargeAccountIsNo();
		
	}
	
	public static void authorizedThirdPartyPayorIsYesAndChargeAccountIsNo() {
		driver = new ChromeDriver();
		
		LoginPage login = new LoginPage();
		AddCustomer addCustomer = new AddCustomer();
		CustomerInformation_fields customerInfoFields = new CustomerInformation_fields();
		CustomerInformation_verifications customerInfoVerify = new CustomerInformation_verifications();
	//	CustomerInformation_ChargeAccountFields customerInfoChargeAcc = new CustomerInformation_ChargeAccountFields();
		
		System.out.println("TC021.31_[CustMgmt] [Customer Record_Create Customer Record] - Input Validations on the "
				+ "fields - Personal customer");
		System.out.println("- Authorized Third Party Payor is 'Yes' and Charge Account is 'No'");
		
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
		customerInfoFields.enterLastName(driver, "Domingo");
		customerInfoFields.enterFirstName(driver, "Ara");
		
		// 3. Select Yes in Authorized Third Party Payor
		customerInfoFields.clickToggleAuthorizedThirdPartyPayor(driver);
		
		// 4. Select No in With Charge Account
		// customerInfoFields.clickToggleWithChargeAccount(driver);
		
		// 5. Click Next button
		customerInfoFields.clickNext(driver);
		
		// Verifying Contact Information will display when all required field is filled up
		customerInfoVerify.nextPageContactInfo(driver);
		
		// Closing the browser and Test Completed
//		login.closeBrowserAndTestComplete(driver);
		
	}

}
