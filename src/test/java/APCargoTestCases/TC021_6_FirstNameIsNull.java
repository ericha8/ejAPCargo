package APCargoTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.APCargoEnvironment.LoginPage;
import pages.APCargoEnvironment.AddCustomer;
import pages.APCargoEnvironment.CustomerInformation_fields;
import pages.APCargoEnvironment.CustomerInformation_verifications;

public class TC021_6_FirstNameIsNull {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		firstNameIsNull();
		
	}
	
	public static void firstNameIsNull() {
		driver = new ChromeDriver();
		
		LoginPage login = new LoginPage();
		AddCustomer addCustomer = new AddCustomer();
		CustomerInformation_fields customerInfoFields = new CustomerInformation_fields();
		CustomerInformation_verifications customerInfoVerify = new CustomerInformation_verifications();
		
		System.out.println("TC021.6_[CustMgmt] [Customer Record_Create Customer Record] - Input Validations on the "
				+ "fields - Personal customer");
		System.out.println("- First Name is Null");
		
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
		
		// 2. Select Personal customer and Click Continue button
		addCustomer.selectPersonalCustomer(driver);
		addCustomer.clickContinue(driver);
		
		// 3. Left the First Name field as null/blanked
		customerInfoFields.enterFirstName(driver, "");
		
		// 4. Click Next button
		customerInfoFields.clickNext(driver);
		
		// Verifying First Name field will display an error message when Null
		customerInfoVerify.firstNameErrorMessage(driver);
		
		// Closing the browser and Test Completed
//		login.closeBrowserAndTestComplete(driver);
		
	}

}
