package timetrackerV2.leaveapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.leaveapplication.LeaveApplication;

public class TC008_TimeTracker_FileALeavePopUp_Comment {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		leaveApplicationFileALeavePopUpComment();
		
	}
	
	public static void leaveApplicationFileALeavePopUpComment() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		LeaveApplication leaveApplication = new LeaveApplication();
		
		System.out.println("----------------------------------------------------------");
		System.out.println("|| TC008_TimeTracker_File a Leave pop up_Comment Remark ||");
		System.out.println("----------------------------------------------------------");

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
		
		// Enter remarks regarding the Leave to be filed in Comments/Remarks text field
		leaveApplication.enterLeaveReason(driver);	
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
