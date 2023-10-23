package timetrackerV2.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.LoginPageV2;

public class TC005_LoginV2_NullUsernameAndPassword {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		nullUsernameAndPassword();
		
	}
	
	public static void nullUsernameAndPassword() {
		driver = new ChromeDriver();
		
		LoginPageV2 login = new LoginPageV2();
		
		System.out.println("---------------------------------------------");
		System.out.println("|| TC005_TimeTracker_Login_NullCredentials ||");
		System.out.println("---------------------------------------------");

		// Open the browser and navigate to URL
		login.openBrowserAndNavigateURL(driver);

		// Accessing Timetracker V2
		login.accessTimetrackerV2(driver);
		
		// Username is null
		login.enterUsername(driver, "");
		
		// Password is null
		login.enterPassword(driver, "");
		
		// Click Login button
		login.clickLoginButton(driver);
		
		// Red asterisks is displayed beside username field
		login.verifyNullUsername(driver);
		
		// Red asterisks is displayed beside username field
		login.verifyNullPassword(driver);
		
		// Closing the browser and Test Completed
		login.closeBrowserAndTestComplete(driver);
		
	}

}
