package timetrackerV2.leaveapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.leaveapplication.LeaveApplication;
import pages.timetrackerV2.leaveapplication.LeaveApplication_LeaveType;

public class TC004_TimeTracker_LeaveApplication_VerifyLeaveTypesInTheModal {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		leaveApplicationVerifyLeaveTypesInTheModal();
		
	}
	
	public static void leaveApplicationVerifyLeaveTypesInTheModal() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		LeaveApplication leaveApplication = new LeaveApplication();
		LeaveApplication_LeaveType leaveApplicationLeaveType = new LeaveApplication_LeaveType();
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("|| TC004_TimeTracker_LeaveApplication_VerifyLeaveTypesInTheModal ||");
		System.out.println("-------------------------------------------------------------------");

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

		// Click Leave type dropdown
		leaveApplicationLeaveType.clickLeaveDropdown(driver);
		
		// Select 'Bank General Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Banked General Leave");
		
		// Select 'Call Back Vacation Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Call Back Vacation Leave");
		
		// Select 'Excess Earned Leaves' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Excess Earned Leaves");
		
		// Select 'Excess General Leaves' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Excess General Leaves");		
		
		// Select 'General Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "General Leave");		
		
		// Select 'Leave Without Pay' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Leave Without Pay");
		
		// Select 'On-call Vacation Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "On-call Vacation Leave");		
		
		// Select 'Overtime Vacation Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Overtime Vacation Leave");		

		// Select 'Service Incentive Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Service Incentive Leave");		
		
		// Select 'Solo Parent Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Solo Parent Leave");					
		
		// Select 'Unauthorized LWOP' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Unauthorized LWOP");
		
		// Select 'Vacation Leave' from Leave Type dropdown
		leaveApplicationLeaveType.selectLeaveType(driver, "Vacation Leave");		
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
