package timetrackerV2.leaveapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.leaveapplication.LeaveApplication;

public class TC002_TimeTracker_FileALeavePopUp_CloseButton {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		fileALeavePopUpCloseButton();
		
	}
	
	public static void fileALeavePopUpCloseButton() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		LeaveApplication leaveApplication = new LeaveApplication();
		
		System.out.println("---------------------------------------------------");
		System.out.println("|| TC002_TimeTracker_FileALeavePopUp_CloseButton ||");
		System.out.println("---------------------------------------------------");

		// Open the browser and navigate to URL
		genLogin.openBrowserAndNavigateURL(driver);
		
		// Accessing Timetracker V2
		genLogin.accessTimetrackerV2(driver);
		
		// Log in to Timetracker with valid credentials
		genLogin.enterUsername(driver);
		genLogin.enterPassword(driver);
		genLogin.clickLoginButton(driver);
		
		// Precondition: 'File a Leave' pop up should already been clicked and displayed
		leaveApplication.clickFileALeave(driver);
		
		// Click Close button (x) in 'File a Leave' pop-up
		leaveApplication.clickCloseButton(driver);
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
