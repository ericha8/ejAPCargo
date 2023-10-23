package APCargoTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.APCargoEnvironment.LoginPage;

public class APCargo_LoginPage {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		APCargoLogin();
		
	}
	
	public static void APCargoLogin() {
		driver = new ChromeDriver();
		
		LoginPage login = new LoginPage();
		
		System.out.println("----------------------------");
		System.out.println("|| Logging In in AP Cargo ||");
		System.out.println("----------------------------");
		
		// Open the browser and navigate to URL
		login.openBrowserAndNavigateURL(driver);
		
		// Enter Valid Username
		login.enterEmail(driver);
		
		// Enter Valid Password
		login.enterPassword(driver);
		
		// Click Login button
		login.clickSignInButton(driver);
		
		// Verify AP Cargo
//		login.verifyForValidUsernameAndPassword(driver);
		
		// Click Logout button
//		login.clickLogoutButton(driver);
				
		// Closing the browser and Test Completed
//		login.closeBrowserAndTestComplete(driver);
		
	}

}
