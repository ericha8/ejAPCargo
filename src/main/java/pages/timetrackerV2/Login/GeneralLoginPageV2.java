package pages.timetrackerV2.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralLoginPageV2 {

// Created General Log in for Leave Application and Charge Hours
private static WebElement txtUsername = null;
private static WebElement txtPassword = null;
private static WebElement btnLogin = null;
private static WebElement btnLogout = null;
private static WebElement element = null;
private static WebElement btnAdvance = null;
private static WebElement btnProceed = null;

	// Open the browser and navigate to URL
	public void openBrowserAndNavigateURL(WebDriver driver) {
		
		System.out.println("Opening the Browser and navigating to URL");
		driver.get("https://timetracker21.srv.pointwest.com.ph/");
		driver.manage().window().maximize();
		System.out.println(" - Browser was open and navigated to URL");
		
	}
	
	// Accessing Timetracker V2
	public WebElement accessTimetrackerV2(WebDriver driver) {
		
		System.out.println("Accessing Timetracker V2");
		btnAdvance = driver.findElement(By.id("details-button"));
		btnAdvance.click();
		System.out.println(" - Advance button was clicked");
		
		btnProceed = driver.findElement(By.id("proceed-link"));
		btnProceed.click();
		System.out.println(" - Proceed Link was clicked");
		return element;
		
	}
	

	// Log in to Timetracker - Entering Username
	public WebElement enterUsername(WebDriver driver) {
		
		txtUsername = driver.findElement(By.id("Username"));
		txtUsername.sendKeys("ericha.ancheta");
		System.out.println(" - Username was entered");
		return txtUsername;
	}
	
	// Log in to Timetracker - Entering Password
	public WebElement enterPassword(WebDriver driver) {

		txtPassword = driver.findElement(By.id("Password"));
		txtPassword.sendKeys("zOKdMi6t");
		System.out.println(" - Password was entered");
		return txtPassword;
	
	}
	
	// Log in to Timetracker - Clicking Login button
	public WebElement clickLoginButton(WebDriver driver) {

		btnLogin = driver.findElement(By.id("LoginSubmit"));
		btnLogin.click();
		System.out.println(" - Login button was clicked");
		return btnLogin;
	
	}

	// Clicking Logout button
	public WebElement clickLogoutButton(WebDriver driver) {
	
		btnLogout = driver.findElement(By.xpath("//a[@href='/Security/Logout']"));
		System.out.println(" - Logout button was clicked");
		return btnLogout;
		
	}
	
	// Close the browser and Test Completed
	public void closeBrowserAndTestComplete(WebDriver driver) {
		
		driver.close();
		System.out.println("TEST COMPLETED");
		
	}	

}
