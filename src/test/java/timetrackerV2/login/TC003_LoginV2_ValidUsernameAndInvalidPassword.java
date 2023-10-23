package timetrackerV2.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.LoginPageV2;

public class TC003_LoginV2_ValidUsernameAndInvalidPassword {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		validUsernameAndInvalidPassword();
		
	}
	
	public static void validUsernameAndInvalidPassword() {
		driver = new ChromeDriver();
		
		LoginPageV2 login = new LoginPageV2();
		
		System.out.println("---------------------------------------------");
		System.out.println("|| TC003_TimeTracker_Login_InvalidPassword ||");
		System.out.println("---------------------------------------------");

		// Open the browser and navigate to URL
		login.openBrowserAndNavigateURL(driver);
		
		// Accessing Timetracker V2
		login.accessTimetrackerV2(driver);
		
		// Enter Correct username
		login.enterUsername(driver, "ericha.ancheta");
		
		// Enter Incorrect password
		login.enterPassword(driver, "Abc123456@@");
		
		// Click Login button
		login.clickLoginButton(driver);
		
		// Error message 'Your username or password is incorrect. Please try again.'.
		login.verifyInvalidCredentials(driver);
				
		// Closing the browser and Test Completed
		login.closeBrowserAndTestComplete(driver);
		
	}

}
