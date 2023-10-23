package timetrackerV2.chargehours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.chargehours.ChargeHours;

public class TC007_TimeTracker_DailyWorkHoursPopUp_GeneralTasksTab {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		dailyWorkHoursPopUpAllTasksTabTasks();
		
	}
	
	public static void dailyWorkHoursPopUpAllTasksTabTasks() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		ChargeHours chargeHours = new ChargeHours();
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|| TC007_TimeTracker_Daily Work Hours pop up_General Tasks tab ||");
		System.out.println("-----------------------------------------------------------------");
		
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
		
		// Click General Tasks tab
		chargeHours.clickGeneralTasksTab(driver);		
		
		// Click OK button in My Task Log pop up
		chargeHours.clickOKbuttonInPopUp(driver);	
		
		// Selecting Project from dropdown to proceed to General Tasks tab
		chargeHours.selectProjectsForGeneralTasks(driver, "Grand Zeno");
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
