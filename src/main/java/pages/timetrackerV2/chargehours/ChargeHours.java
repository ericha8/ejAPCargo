package pages.timetrackerV2.chargehours;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChargeHours {

private static WebElement element = null;
private static WebElement btnInputWhizHours, lblInputWhizHoursModal = null;
private static WebElement btnCloseButton = null;
private static WebElement lblMonthYearDisplayed, lblDayDisplayed = null;
private static WebElement drpProjects, selectProjects = null;
private static WebElement drpMilestone = null;
private static List<WebElement> selectDeliverableMilestoneList = null;
private static WebElement selectAvailableProject = null;
private static WebElement tabAllTasks, selectTask = null;
private static WebElement tabGeneralTasks, btnOK, selectProjectGeneralTasks = null;

private static String expectedInputWhizHoursModal = "Daily Work Hours";
private static String expectedCloseInputWhizHoursModal = "close";
private static String expectedMonthYearDisplayed = "Aug 2023";
private static String expectedDayDisplayed = "31";

	// TC001_TimeTracker_Input Whiz Hours (Charge Hours)_Actions
	// Locate 'Input Whiz Hours (Charge Hours)' button and Click 'Input Whiz Hours (Charge Hours)' button
	public WebElement clickChargeHours(WebDriver driver) {
		
		System.out.println("Locating 'Input Whiz Hours (Charge Hours)' button and "
				+ "Clicking 'Input Whiz Hours (Charge Hours)' button");
		btnInputWhizHours = driver.findElement(By.xpath("(//a[@class='inputWhizHours'])[21]"));
		btnInputWhizHours.click();
		System.out.println(" - 'Input Whiz Hours (Charge Hours)' button was located and was clicked");
		
		return btnInputWhizHours;
	
	}
	
	// Verifying that Input Whiz Hours (Charge Hours) pop-up is displayed
	public WebElement verifyInputWhizHoursModal(WebDriver driver) {
		
		System.out.println("Verifying that Input Whiz Hours (Charge Hours) pop-up is displayed");
		lblInputWhizHoursModal = driver.findElement(By.xpath("(//span[@class='ui-dialog-title'])[5]"));
		
		String expectedText = expectedInputWhizHoursModal;
		if(expectedText.equals(lblInputWhizHoursModal.getText())) {
			System.out.println(" - " + (lblInputWhizHoursModal.getText()) + " modal is displayed");
			}
		else{
			driver.close();
		    throw new Error(expectedText + " is not displayed");
		}
		
		return lblInputWhizHoursModal;
		
	}	
	
	// TC002_TimeTracker_Daily Work Hours_Close button
	// Click Close button (x) in 'Daily Work Hours' pop-up
	public WebElement clickCloseButton(WebDriver driver) {
		
		System.out.println("Clicking Close button (x) in 'Daily Work Hours' pop-up");
		btnCloseButton = driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-close ui-corner-all'])[5]"));
		
		String expectedText = expectedCloseInputWhizHoursModal;
		if(expectedText.equals(btnCloseButton.getText())) {
			System.out.println(" - " + (btnCloseButton.getText()) + " is displayed and clickable");
			JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click()", btnCloseButton); 
			}
		else{
			driver.close();
		    throw new Error(expectedText + " is not displayed and clicked");
		}
		
		return btnCloseButton;
	
	}

	// TC003_TimeTracker_Daily Work Hours pop up_Date displayed
	// Verifying the Date displayed
	public WebElement verifyDateDisplayed(WebDriver driver) {
		
		System.out.println("Verifying the Date displayed");
		lblMonthYearDisplayed = driver.findElement(By.xpath("(//td[@class='bgHead'])[2]"));
		lblDayDisplayed = driver.findElement(By.xpath("//td[@class='bgWhite metrouicss font-xl']"));
		
		String expectedText = expectedMonthYearDisplayed;
		String expectedText1 = expectedDayDisplayed;
		
		if(expectedText.equals(lblMonthYearDisplayed.getText())) {
			}
		else if(expectedText1.equals(lblDayDisplayed.getText())) {
		}
		else{
			driver.close();
		    throw new Error("Date displayed is not " + expectedDayDisplayed + " of " + expectedMonthYearDisplayed);
		}
		System.out.println(" - Displayed Date: " + (lblDayDisplayed.getText()) + " of " + (lblMonthYearDisplayed.getText()) 
				+ " is the same with the expected Date displayed: " + expectedDayDisplayed  + " of " + expectedMonthYearDisplayed);
		
		return element;
		
	}

	// TC004_TimeTracker_Daily Work Hours pop up_Projects Dropdown
	// Click Projects dropdown
	public WebElement clickProjectDropdown(WebDriver driver) {
		
		System.out.println("Clicking Projects dropdown");
		drpProjects = driver.findElement(By.id("ddlProjects"));
		drpProjects.click();
		System.out.println(" - Projects dropdown was clicked");
		
		return drpProjects;
	
	}
	
	// Selecting Projects from dropdown
	public WebElement selectProjects(WebDriver driver,  String projects) {
		
		System.out.println("Selecting Projects from dropdown");
		selectProjects  = driver.findElement(By.id("ddlProjects"));
		Select objSelectAllProjects = new Select(selectProjects);
		objSelectAllProjects.selectByVisibleText(projects);
		System.out.println(" - " + projects + " was selected from the Projects dropdown");
		return selectProjects;
		
	}

	// TC005_TimeTracker_Daily Work Hours pop up_Deliverable/Milestone
	// Click available Project from Projects dropdown
	public WebElement selectAvailableProject(WebDriver driver,  String availableProject) {
			
		System.out.println("Clicking available Project from Projects dropdown");
		selectAvailableProject  = driver.findElement(By.id("ddlProjects"));
		selectAvailableProject.click();
		Select objSelectAvailableProjects = new Select(selectAvailableProject);
		objSelectAvailableProjects.selectByVisibleText(availableProject);
		System.out.println(" - Available Project " + availableProject + " was selected from the Projects dropdown");
		
		return selectProjects;
			
	}
	
	// Click Deliverable/Milestone dropdown
	public WebElement clickDeliverableMilestoneDropdown(WebDriver driver) {
		
		System.out.println("Clicking Deliverable/Milestone dropdown");
		drpMilestone = driver.findElement(By.id("ddlDMS"));
		drpMilestone.click();
		System.out.println(" - Deliverable/Milestone dropdown was clicked");		
		
		return drpProjects;
	
	}
	
	// Click available Deliverable/Milestone from Deliverable/Milestone dropdown 
	public void selectDeliverableMilestone(WebDriver driver, String deliverableMilestone) {
		
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	// User should be able to select a Deliverable/Milestone from list
	System.out.println("Clicking available Deliverable/Milestone from Deliverable/Milestone dropdown");
	List<WebElement> selectDeliverableMilestoneList = driver.findElements(By.xpath("//select[@id='ddlDMS']/optgroup[@label='Deliverables']/option"));	
	String value = deliverableMilestone;
		for(int i = 0; i < selectDeliverableMilestoneList.size(); i++) { 
			if(selectDeliverableMilestoneList.get(i).getText().contains(value)) {
				selectDeliverableMilestoneList.get(i).click();
				System.out.println(" - Deliverable/Milestone: " + value + " was selected");
				break;
			}
		}
		
	}

	// TC006_TimeTracker_Daily Work Hours pop up_All Tasks tab_Tasks
	// Clicking All Tasks tab
	public WebElement clickAllTasksTab(WebDriver driver) {
		
		System.out.println("Clicking All Tasks tab");
		tabAllTasks  = driver.findElement(By.id("all"));
		tabAllTasks.click();
		System.out.println(" - All Tasks tab was clicked");
		
		return tabAllTasks;
		
	}
	
	// Click any of task in All Tasks tab	
	public WebElement clickAnyTask(WebDriver driver) {
		
		System.out.println("Clicking any of task in All Tasks tab");
		selectTask  = driver.findElement(By.xpath("(//span[@class='taskName'])[1]"));
		selectTask.click();
		System.out.println(" - Task: " + selectTask.getText() + " was selected");
		
		return tabAllTasks;
		
	}

	// TC007_TimeTracker_Daily Work Hours pop up_General Tasks tab
	// Click General Tasks tab
	public WebElement clickGeneralTasksTab(WebDriver driver) {
		
		System.out.println("Clicking General Tasks tab");
		tabGeneralTasks  = driver.findElement(By.id("general"));
		tabGeneralTasks.click();
		System.out.println(" - " + tabGeneralTasks.getText() + " tab was clicked");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tabGeneralTasks;
		
	}
	
	// Click OK button in My Task Log pop up
	public WebElement clickOKbuttonInPopUp(WebDriver driver) {
		
		System.out.println("Clicking OK button in My Task Log pop up");
		btnOK  = driver.findElement(By.className("ui-button-text"));
		btnOK.click();
		System.out.println(" - OK button in My Task Log pop up was clicked");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return btnOK;
		
	}
	
	// Selecting Project from dropdown to proceed to General Tasks tab
	public WebElement selectProjectsForGeneralTasks(WebDriver driver,  String project) {
		
		System.out.println("Selecting Project from dropdown to proceed to General Tasks tab");
		selectProjectGeneralTasks  = driver.findElement(By.id("ddlProjects"));
		Select objSelectProjectGeneralTasks = new Select(selectProjectGeneralTasks);
		objSelectProjectGeneralTasks.selectByVisibleText(project);
		System.out.println(" - " + project + " was selected from the Projects dropdown");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return selectProjectGeneralTasks;
		
	}	
}
