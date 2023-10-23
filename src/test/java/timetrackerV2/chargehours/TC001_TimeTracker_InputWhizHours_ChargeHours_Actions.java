package timetrackerV2.chargehours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.chargehours.ChargeHours;

public class TC001_TimeTracker_InputWhizHours_ChargeHours_Actions {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		inputWhizHoursChargeHoursActions();
		
	}
	
	public static void inputWhizHoursChargeHoursActions() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		ChargeHours chargeHours = new ChargeHours();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("|| TC001_TimeTracker_Input Whiz Hours (Charge Hours)_Actions ||");
		System.out.println("---------------------------------------------------------------");

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
		
		// Input Whiz Hours (Charge Hours) pop-up should display
		chargeHours.verifyInputWhizHoursModal(driver);
				
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
