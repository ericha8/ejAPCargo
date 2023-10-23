package timetrackerV2.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.LoginPageV2;

public class TC001_LoginV2_ValidUsernameAndPassword {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		validUsernameAndPassword();
		
	}
	
	public static void validUsernameAndPassword() {
		driver = new ChromeDriver();
		
		LoginPageV2 login = new LoginPageV2();
		
		System.out.println("---------------------------------------------------------");
		System.out.println("|| Testing of TC001_TimeTracker_Login_ValidCredentials ||");
		System.out.println("---------------------------------------------------------");
		
		// Open the browser and navigate to URL
		login.openBrowserAndNavigateURL(driver);
		
		// Accessing Timetracker V2
		login.accessTimetrackerV2(driver);
		
		// Enter Valid Username
		login.enterUsername(driver, "ericha.ancheta");
		
		// Enter Valid Password
		login.enterPassword(driver, "zOKdMi6t");
		
		// Click Login button
		login.clickLoginButton(driver);
		
		// Verify My Time Logs page is displayed.
		login.verifyForValidUsernameAndPassword(driver);
		
		// Click Logout button
		login.clickLogoutButton(driver);
				
		// Closing the browser and Test Completed
		login.closeBrowserAndTestComplete(driver);
		
	}

}
