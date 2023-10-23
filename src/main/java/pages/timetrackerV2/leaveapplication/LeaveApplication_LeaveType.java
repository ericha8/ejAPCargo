package pages.timetrackerV2.leaveapplication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaveApplication_LeaveType {

// Created only for Test Case TC004_TimeTracker_Leave Application_Verify Leave Types in the modal	
private static WebElement drpLeave = null;
private static WebElement selectleaveType = null;

	// Click Leave type dropdown
	public WebElement clickLeaveDropdown(WebDriver driver) {
		
		System.out.println("Clicking Leave type dropdown");
		drpLeave = driver.findElement(By.id("LeaveType"));
		drpLeave.click();
		System.out.println("Leave dropdown was clicked");
		
		return drpLeave;
	
	}
	
	// Selecting Leave Type from dropdown
	public WebElement selectLeaveType(WebDriver driver,  String leaveType) {
		
		selectleaveType = driver.findElement(By.id("LeaveType"));
		
		Select objSelectLeaveType = new Select(selectleaveType);
		objSelectLeaveType.selectByVisibleText(leaveType);
		
		// Extracted Leave type from dropdown List
		String extracted = objSelectLeaveType.getFirstSelectedOption().getText();
		System.out.print("\n");
		System.out.println(extracted);
		
		ArrayList<String> expectedLeave = new ArrayList<String>();
		expectedLeave.add("Banked General Leave");
		expectedLeave.add("Call Back Vacation Leave");
		expectedLeave.add("Excess Earned Leaves");
		expectedLeave.add("Excess General Leaves");
		expectedLeave.add("General Leave");
		expectedLeave.add("Leave Without Pay");
		expectedLeave.add("On-call Vacation Leave");
		expectedLeave.add("Overtime Vacation Leave");
		expectedLeave.add("Service Incentive Leave");
		expectedLeave.add("Solo Parent Leave");
		expectedLeave.add("Unauthorized LWOP");
		expectedLeave.add("Vacation Leave");
		
		// Selecting Banked General Leave - User should be able to select 'Bank General Leave' from Leave Type dropdown 
		if(expectedLeave.get(0).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(0));
			}
		
		// Selecting Call Back Vacation Leave - User should be able to select 'Call Back Vacation Leave' from Leave Type dropdown 
		else if(expectedLeave.get(1).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(1));
			}
		
		// Selecting Excess Earned Leaves - User should be able to select 'Excess Earned Leaves' from Leave Type dropdown 
		else if(expectedLeave.get(2).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(2));
			}
		
		// Selecting Excess General Leaves - User should be able to select 'Excess General Leaves' from Leave Type dropdown 
		else if(expectedLeave.get(3).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(3));
			}		
		
		// Selecting General Leave - User should be able to select 'General Leave' from Leave Type dropdown 
		else if(expectedLeave.get(4).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(4));
			}		
		
		// Selecting Leave Without Pay - User should be able to select 'Leave Without Pay' from Leave Type dropdown 
		else if(expectedLeave.get(5).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(5));
			}		
		
		// Selecting On-call Vacation Leave - User should be able to select 'On-call Vacation Leave' from Leave Type dropdown 
		else if(expectedLeave.get(6).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(6));
			}		
		
		// Selecting Overtime Vacation Leave - User should be able to select 'Overtime Vacation Leave' from Leave Type dropdown 
		else if(expectedLeave.get(7).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(7));
			}		
		
		// Selecting Service Incentive Leave - User should be able to select 'Service Incentive Leave' from Leave Type dropdown 
		else if(expectedLeave.get(8).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(8));
			}		
		
		// Selecting Solo Parent Leave - User should be able to select 'Solo Parent Leave' from Leave Type dropdown 
		else if(expectedLeave.get(9).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(9));
			}		

		// Selecting Unauthorized LWOP - User should be able to select 'Unauthorized LWOP' from Leave Type dropdown 
		else if(expectedLeave.get(10).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(10));
			}		

		// Selecting Vacation Leave - User should be able to select 'Vacation Leave' from Leave Type dropdown 
		else if(expectedLeave.get(11).equals(extracted)) {
			System.out.println("- Displayed Leave Type: " + (extracted) + " is the same with the expected Leave Type: " + expectedLeave.get(11));
			}		
		
		else{
			driver.close();
		    throw new Error("Leave selected is not in the list");
		}
		
		return selectleaveType;
		
	}
	
}
