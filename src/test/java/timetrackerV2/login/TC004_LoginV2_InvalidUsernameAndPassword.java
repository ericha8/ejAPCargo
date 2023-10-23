package timetrackerV2.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.LoginPageV2;

public class TC004_LoginV2_InvalidUsernameAndPassword {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		invalidUsernameAndPassword();
		
	}
	
	public static void invalidUsernameAndPassword() {
		driver = new ChromeDriver();
		
		LoginPageV2 login = new LoginPageV2();
		
		System.out.println("------------------------------------------------");
		System.out.println("|| TC004_TimeTracker_Login_InvalidCredentials ||");
		System.out.println("------------------------------------------------");

		// Open the browser and navigate to URL
		login.openBrowserAndNavigateURL(driver);

		// Accessing Timetracker V2
		login.accessTimetrackerV2(driver);
		
		// Enter Incorrect username
		login.enterUsername(driver, "erichA.jjANE1");
		
		// Enter Incorrect password
		login.enterPassword(driver, "Abc12345@@@");
		
		// Click Login button
		login.clickLoginButton(driver);
		
		// Error message 'Your username or password is incorrect. Please try again.'.
		login.verifyInvalidCredentials(driver);
				
		// Closing the browser and Test Completed
		login.closeBrowserAndTestComplete(driver);
		
	}

}
