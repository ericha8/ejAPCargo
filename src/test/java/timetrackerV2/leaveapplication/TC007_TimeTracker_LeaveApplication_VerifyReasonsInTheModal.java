package timetrackerV2.leaveapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.leaveapplication.LeaveApplication;
import pages.timetrackerV2.leaveapplication.LeaveApplication_LeaveType;
import pages.timetrackerV2.leaveapplication.LeaveApplication_Reasons;

public class TC007_TimeTracker_LeaveApplication_VerifyReasonsInTheModal {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		leaveApplicationVerifyReasonsInTheModal();
		
	}
	
	public static void leaveApplicationVerifyReasonsInTheModal() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		LeaveApplication leaveApplication = new LeaveApplication();
		LeaveApplication_Reasons leaveApplicationReasons = new LeaveApplication_Reasons();
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("|| TC007_TimeTracker_LeaveApplication_VerifyReasonsInTheModal ||");
		System.out.println("----------------------------------------------------------------");

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
		
		// Click Reason dropdown
		leaveApplicationReasons.clickReasonDropdown(driver);
		
		// Select 'Emergency Leave' from Reason dropdown
		leaveApplicationReasons.selectReason(driver, "Emergency Leave");

		// Select 'Sick Leave' from Reason dropdown
		leaveApplicationReasons.selectReason(driver, "Sick Leave");		

		// Select 'Vacation Leave' from Reason dropdown
		leaveApplicationReasons.selectReason(driver, "Vacation Leave");		

		// Select 'Others' from Reason dropdown
		leaveApplicationReasons.selectReason(driver, "Others");
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
