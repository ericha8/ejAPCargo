package timetrackerV2.leaveapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.leaveapplication.LeaveApplication;

public class TC005_TimeTracker_LeaveApplication_VerifyFromAndToInTheModal {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		leaveApplicationVerifyFromAndToInTheModal();
		
	}
	
	public static void leaveApplicationVerifyFromAndToInTheModal() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		LeaveApplication leaveApplication = new LeaveApplication();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("|| TC005_TimeTracker_LeaveApplication_VerifyFromAndToInTheModal ||");
		System.out.println("------------------------------------------------------------------");

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
		
		// Observe 'From' date displayed
		leaveApplication.verifyFromDate(driver);	
	
		// Observe 'To' date displayed
		leaveApplication.verifyToDate(driver);	
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
