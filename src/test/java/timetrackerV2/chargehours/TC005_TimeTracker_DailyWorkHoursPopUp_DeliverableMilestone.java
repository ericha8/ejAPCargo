package timetrackerV2.chargehours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.timetrackerV2.Login.GeneralLoginPageV2;
import pages.timetrackerV2.chargehours.ChargeHours;

public class TC005_TimeTracker_DailyWorkHoursPopUp_DeliverableMilestone {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		dailyWorkHoursPopUpDeliverableMilestone();
		
	}
	
	public static void dailyWorkHoursPopUpDeliverableMilestone() {
		driver = new ChromeDriver();
		
		GeneralLoginPageV2 genLogin = new GeneralLoginPageV2();
		ChargeHours chargeHours = new ChargeHours();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("|| TC005_TimeTracker_Daily Work Hours pop up_Deliverable/Milestone ||");
		System.out.println("---------------------------------------------------------------------");
		
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
		
		// Click available Project from Projects dropdown - Grand Zeno
		chargeHours.selectAvailableProject(driver, "Grand Zeno");		
		
		// Click Deliverable/Milestone dropdown
		chargeHours.clickDeliverableMilestoneDropdown(driver);		

		// Click available Deliverable/Milestone from Deliverable/Milestone dropdown - KENZEN Software Testing 2021
		chargeHours.selectDeliverableMilestone(driver, "KENZEN Software Testing 2021");
		
		// Click available Deliverable/Milestone from Deliverable/Milestone dropdown - KENZEN Software Testing 2020
		chargeHours.selectDeliverableMilestone(driver, "KENZEN Software Testing 2020");		
		
		// Click available Deliverable/Milestone from Deliverable/Milestone dropdown - KENZEN Software Testing 2021 - Project Management
		chargeHours.selectDeliverableMilestone(driver, "KENZEN Software Testing 2021 - Project Management");		
		
		// Click available Deliverable/Milestone from Deliverable/Milestone dropdown - KENZEN Software Testing 2022
		chargeHours.selectDeliverableMilestone(driver, "KENZEN Software Testing 2022");		

		// Click available Deliverable/Milestone from Deliverable/Milestone dropdown - KENZEN Software Testing 2022 - Project Management
		chargeHours.selectDeliverableMilestone(driver, "KENZEN Software Testing 2022 - Project Management");		

		// Click available Deliverable/Milestone from Deliverable/Milestone dropdown - KENZEN Software Testing 2023
		chargeHours.selectDeliverableMilestone(driver, "KENZEN Software Testing 2023");

		// Click available Deliverable/Milestone from Deliverable/Milestone dropdown - KENZEN Software Testing 2023 - Project Management
		chargeHours.selectDeliverableMilestone(driver, "KENZEN Software Testing 2023 - Project Management");
		
		// Closing the browser and Test Completed
		genLogin.closeBrowserAndTestComplete(driver);
		
	}

}
