package timetrackerV2.leaveapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.leaveapplication.LeaveApplication;

public class TC006_TimeTracker_LeaveApplication_VerifyHalfDayCheckboxInTheModal {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		leaveApplicationVerifyHalfDayCheckboxInTheModal();
		
	}
	
	public static void leaveApplicationVerifyHalfDayCheckboxInTheModal() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		LeaveApplication leaveApplication = new LeaveApplication();
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("|| TC006_TimeTracker_LeaveApplication_VerifyHalfDayCheckboxInTheModal ||");
		System.out.println("------------------------------------------------------------------------");

		// Open the browser and navigate to URL
		genLogin.openBrowserAndNavigateURL(driver);
		
		// Accessing Timetracker V2
		genLogin.accessTimetrackerV2(driver);
		
		// Log in to Timetracker with valid credentials
		genLogin.enterUsername(driver);
		genLogin.enterPassword(driver);
		genLogin.clickLoginButton(driver);
		
		// Locate File a Leave button and Click File a Leave button
		leaveApplication.clickFileALeave(driver);
		
		// Display should indicate that the checkbox has been checked
		leaveApplication.checkHalfDayCheckBox(driver);	
	
		// Display should indicate that the checkbox has been unchecked
		leaveApplication.uncheckHalfDayCheckBox(driver);	
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
