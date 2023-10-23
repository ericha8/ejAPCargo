package pages.timetrackerV2.leaveapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeaveApplication {

private static WebElement btnFileALeave, lblFileALeaveModal = null;
private static WebElement btnCloseButton = null;
private static WebElement lblDateApplied = null;
private static WebElement lblFromDate, lblToDate = null;
private static WebElement chckbxHalfDay = null;
private static WebElement txtLeaveReason = null;

private static String expectedFileALeaveModal = "File a leave";
private static String expectedCloseFileALeaveModal = "close";
private static String expectedDateApplied = "8/4/2023";
private static String comment = "Testing entering Leave Application Reason";

	// TC001_TimeTracker_File_a_Leave_Actions_Button
	// Locate File a Leave button and Click File a Leave button
	public WebElement clickFileALeave(WebDriver driver) {

		System.out.println("Locating File a Leave button and Clicking File a Leave button");
		btnFileALeave = driver.findElement(By.xpath("(//a[@class='fileLeaveLink'])[31]"));
		btnFileALeave.click();
		System.out.println(" - File a Leave button was located and was clicked");
		
		return btnFileALeave;
	
	}
	
	// Verifying that File a leave pop-up is displayed
	public WebElement verifyFileALeaveModal(WebDriver driver) {
		
		System.out.println("Verifying that File a leave pop-up is displayed");
		lblFileALeaveModal = driver.findElement(By.id("ui-dialog-title-dialog-modal-leave"));
		
		String expectedText = expectedFileALeaveModal;
		if(expectedText.equals(lblFileALeaveModal.getText())) {
			System.out.println(" - " + (lblFileALeaveModal.getText()) + " modal is displayed");
			}
		else{
			driver.close();
		    throw new Error(expectedText + " is not displayed");
		}
		
		return lblFileALeaveModal;
		
	}	
	
	// TC002_TimeTracker_File a Leave pop up_Close button
	// Click Close button (x) in 'File a Leave' pop-up
	public WebElement clickCloseButton(WebDriver driver) {
		
		System.out.println("Clicking Close button (x) in 'File a Leave' pop-up");
		btnCloseButton = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[5]"));
		
		String expectedText = expectedCloseFileALeaveModal;
		if(expectedText.equals(btnCloseButton.getText())) {
			System.out.println(" - " + (btnCloseButton.getText()) + " is displayed and clickable");
			btnCloseButton.click();
			}
		else{
			driver.close();
		    throw new Error(expectedText + " is not displayed and clicked");
		}
		
		return btnCloseButton;
	
	}
	
	// TC003_TimeTracker_File a Leave pop up_Date applied
	// Verifying the Date applied
	public WebElement verifyDateApplied(WebDriver driver) {
		
		System.out.println("Verifying the Date applied");
		lblDateApplied = driver.findElement(By.xpath("(//div[@class='grid_6 alpha'])[1]"));
		
		String expectedText = expectedDateApplied;
		if(expectedText.equals(lblDateApplied.getText())) {
			System.out.println(" - Displayed Date Applied: " + (lblDateApplied.getText()) 
					+ " is the same with the expected Date Applied: " + expectedDateApplied);
			}
		else{
			driver.close();
		    throw new Error(" - Date Applied is not " + expectedDateApplied);
		}
		
		return lblDateApplied;
		
	}

	// TC004_TimeTracker_Leave Application_Verify Leave Types in the modal is in separate class "LeaveApplication_LeaveType"
	
	// TC005_TimeTracker_Leave Application_Verify From and To in the modal
	// Verify From Date of Leave
	public WebElement verifyFromDate(WebDriver driver) {
		
		System.out.println("Verifying From Date of Leave");
		lblFromDate = driver.findElement(By.id("LeaveFrom"));
		lblFromDate.isDisplayed();
		System.out.println(" - The From Date of Leave was displayed");
		return lblFromDate;
	
	}
	
	// Verify To Date of Leave
	public WebElement verifyToDate(WebDriver driver) {
		
		System.out.println("Verifying To Date of Leave");
		lblToDate = driver.findElement(By.id("LeaveTo"));
		lblToDate.isDisplayed();
		System.out.println(" - The To Date of Leave was displayed");
		return lblToDate;
	
	}
	
	// TC006_TimeTracker_Leave Application_Verify Half Day checkbox in the modal
	// Click checkbox for Half Day
	public WebElement checkHalfDayCheckBox(WebDriver driver) {

		System.out.println("Clicking checkbox for Half Day");
		chckbxHalfDay = driver.findElement(By.id("IsHalfday"));
		chckbxHalfDay.click();
		System.out.println(" - Half Day checkbox is checked");
		
		return chckbxHalfDay;
	
	}
	
	// Click checkbox for Half Day again to uncheck
	public WebElement uncheckHalfDayCheckBox(WebDriver driver) {
		
		System.out.println("Clicking checkbox for Half Day again to uncheck");
		chckbxHalfDay = driver.findElement(By.id("IsHalfday"));
		chckbxHalfDay.click();
		System.out.println(" - Half Day checkbox is unchecked");
		
		return chckbxHalfDay;
	
	}
	
	// TC007_TimeTracker_LeaveApplication_VerifyReasonsInTheModal is in separate class "LeaveApplication_Reasons"

	// TC008_TimeTracker_FileALeavePopUp_Comment
	// Enter remarks regarding the Leave to be filed in Comments/Remarks text field
	public WebElement enterLeaveReason(WebDriver driver) {
		
		System.out.println("Entering remarks regarding the Leave to be filed in Comments/Remarks text field");
		txtLeaveReason = driver.findElement(By.id("LeaveReason"));
		txtLeaveReason.sendKeys(comment);
		System.out.println(" - Comments/Remarks: '" + comment + "' was entered");
		
		return btnCloseButton;
	
	}
	
}
