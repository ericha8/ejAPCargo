package pages.timetrackerV2.leaveapplication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaveApplication_Reasons {

// Created only for TC007_TimeTracker_LeaveApplication_VerifyReasonsInTheModal in the modal	
private static WebElement drpReason = null;
private static WebElement selectReason = null;


	// Click Reason dropdown
	public WebElement clickReasonDropdown(WebDriver driver) {
		
		System.out.println("Clicking Reason dropdown");
		drpReason = driver.findElement(By.id("reasonDDL"));
		drpReason.click();
		System.out.println("Reason dropdown was clicked");
		
		return drpReason;
	
	}
	
	// Selecting Reason from dropdown
	public WebElement selectReason(WebDriver driver,  String reason) {
		
		selectReason = driver.findElement(By.id("reasonDDL"));
		
		Select objSelectReason = new Select(selectReason);
		objSelectReason.selectByVisibleText(reason);
		
		// Extracted Leave type from dropdown List
		String extracted = objSelectReason.getFirstSelectedOption().getText();
		System.out.print("\n");
		System.out.println(extracted);
		
		ArrayList<String> expectedReason = new ArrayList<String>();
		expectedReason.add("Emergency Leave");
		expectedReason.add("Sick Leave");
		expectedReason.add("Vacation Leave");
		expectedReason.add("Others");
		
		// Selecting Emergency Leave - User should be able to select 'Emergency Leave' from Reason dropdown 
		if(expectedReason.get(0).equals(extracted)) {
			System.out.println("- Displayed Reason: " + (extracted) + " is the same with the expected Reason: " + expectedReason.get(0));
			}
		
		// Selecting Sick Leave - User should be able to select 'Sick Leave' from Reason dropdown 
		else if(expectedReason.get(1).equals(extracted)) {
			System.out.println("- Displayed Reason: " + (extracted) + " is the same with the expected Reason: " + expectedReason.get(1));
			}
		
		// Selecting Vacation Leave - User should be able to select 'Vacation Leave' from Reason dropdown 
		else if(expectedReason.get(2).equals(extracted)) {
			System.out.println("- Displayed Reason: " + (extracted) + " is the same with the expected Reason: " + expectedReason.get(2));
			}
		
		// Selecting Others - User should be able to select 'Others' from Reason dropdown 
		else if(expectedReason.get(3).equals(extracted)) {
			System.out.println("- Displayed Reason: " + (extracted) + " is the same with the expected Reason: " + expectedReason.get(3));
			}				
		
		else{
			driver.close();
		    throw new Error("Reason selected is not in the list");
		}
		
		return selectReason;
		
	}
	
}
