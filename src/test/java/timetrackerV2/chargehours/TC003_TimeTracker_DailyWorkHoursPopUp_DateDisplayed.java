package timetrackerV2.chargehours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.chargehours.ChargeHours;

public class TC003_TimeTracker_DailyWorkHoursPopUp_DateDisplayed {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		dailyWorkHoursPopUpDateDisplayed();
		
	}
	
	public static void dailyWorkHoursPopUpDateDisplayed() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		ChargeHours chargeHours = new ChargeHours();
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("|| TC003_TimeTracker_Daily Work Hours pop up_Date displayed ||");
		System.out.println("--------------------------------------------------------------");
		
		// Open the browser and navigate to URL
		genLogin.openBrowserAndNavigateURL(driver);
		
		// Accessing Timetracker V2
		genLogin.accessTimetrackerV2(driver);
		
		// Log in to Timetracker with valid credentials
		genLogin.enterUsername(driver);
		genLogin.enterPassword(driver);
		genLogin.clickLoginButton(driver);
		
		// Locate 'Input Whiz Hours (Charge Hours)' button and Click 'Input Whiz Hours (Charge Hours)' button
		chargeHours.clickChargeHours(driver);
		
		// Observe Date displayed - Month and Year
		chargeHours.verifyDateDisplayed(driver);
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
