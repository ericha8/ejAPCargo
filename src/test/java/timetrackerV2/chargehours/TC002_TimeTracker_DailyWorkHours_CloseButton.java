package timetrackerV2.chargehours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.chargehours.ChargeHours;

public class TC002_TimeTracker_DailyWorkHours_CloseButton {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		dailyWorkHoursCloseButton ();
		
	}
	
	public static void dailyWorkHoursCloseButton() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		ChargeHours chargeHours = new ChargeHours();
		
		System.out.println("-----------------------------------------------------");
		System.out.println("|| TC002_TimeTracker_Daily Work Hours_Close button ||");
		System.out.println("-----------------------------------------------------");

		// Open the browser and navigate to URL
		genLogin.openBrowserAndNavigateURL(driver);
		
		// Accessing Timetracker V2
		genLogin.accessTimetrackerV2(driver);
		
		// Log in to Timetracker with valid credentials
		genLogin.enterUsername(driver);
		genLogin.enterPassword(driver);
		genLogin.clickLoginButton(driver);
		
		// Precondition: Input Whiz Hours (Charge Hours) pop-up should already clicked and displayed
		chargeHours.clickChargeHours(driver);
		
		// Click Close button (x) in 'Daily Work Hours' pop-up
		chargeHours.clickCloseButton(driver);
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
