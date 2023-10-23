package pages.timetrackerV2.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageV2 {

private static WebElement txtUsername, txtPassword, btnLogin = null;
private static WebElement lblForValidUsernamePassword = null;
private static WebElement btnLogout = null;
private static WebElement lblForInvalidCredentials = null;
private static WebElement lblForNullUsername, lblForNullPassword = null;
private static WebElement btnAdvance, btnProceed = null;
private static WebElement element = null;

private static String expectedForInvalidCredentials = "Your username or password is incorrect. Please try again.";
private static String expectedForNullValues = "*";

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
	
	// For Username
	public WebElement enterUsername(WebDriver driver, String username) {
		
		txtUsername = driver.findElement(By.id("Username"));
		txtUsername.sendKeys(username);
		System.out.println(" - Username " + username + " was entered");
		return txtUsername;
	
	}
	
	// For Password
	public WebElement enterPassword(WebDriver driver, String password) {

		txtPassword = driver.findElement(By.id("Password"));
		txtPassword.sendKeys(password);
		System.out.println(" - Password " + password + "was entered");
		
		return txtPassword;
	
	}
	
	// Clicking Login button
	public WebElement clickLoginButton(WebDriver driver) {
		
		btnLogin = driver.findElement(By.id("LoginSubmit"));
		btnLogin.click();
		System.out.println(" - Login button was clicked");
		
		return btnLogin;
	
	}
	
	// Verifying that user was able to login
	public WebElement verifyForValidUsernameAndPassword(WebDriver driver) {
		
		System.out.println("Verifying Valid Credentials");
		lblForValidUsernamePassword = driver.findElement(By.xpath("//div[@class='grid_3 padd-left-1 transformLabel']"));
		
		String expectedText = "Timesheet Period:";
		if(expectedText.equals(lblForValidUsernamePassword.getText())) {
			System.out.println(" - User was able to Login - '" + expectedText + "' label was displayed");
			}
		else{
			driver.close();
		    throw new Error("Timesheet Period was not found");
		}
		
		
		return lblForValidUsernamePassword;
		
	}

	// Clicking Logout button
	public WebElement clickLogoutButton(WebDriver driver) {
	
		btnLogout = driver.findElement(By.xpath("//a[@href='/Security/Logout']"));
		System.out.println(" - Logout button was clicked");
		return btnLogout;
		
	}
	
	// Verifying Invalid Credentials
	public WebElement verifyInvalidCredentials(WebDriver driver) {
		
		System.out.println("Verifying Invalid Credentials");
		lblForInvalidCredentials = driver.findElement(By.className("error"));
		
		String expectedText = expectedForInvalidCredentials;
		if(expectedText.equals(lblForInvalidCredentials.getText())) {
			System.out.println(" - Error message '" + (lblForInvalidCredentials.getText()) + "' was displayed");
			}
		else{
			driver.close();
		    throw new Error(" - Error message: " + expectedText + " was not displayed");
		}
		
		return lblForInvalidCredentials;
	}
	
	// Verifying error message for Null Username
	public WebElement verifyNullUsername(WebDriver driver) {
		
		System.out.println("Verifying error message for Null Username");
		lblForNullUsername = driver.findElement(By.xpath("(//span[@class='field-validation-error'])[1]"));
			
		String expectedText = expectedForNullValues;
		if(expectedText.equals(lblForNullUsername.getText())) {
			System.out.println((lblForNullUsername.getText()) + " was displayed for Null Username");
			}
		else{
			driver.close();
		    throw new Error(expectedForNullValues + " for Null values was not displayed");
		}
		
		return lblForNullUsername;
	}
	
	// Verifying error message for Null Password
	public WebElement verifyNullPassword(WebDriver driver) {
		
		System.out.println("Verifying error message for Null Password");
		lblForNullPassword = driver.findElement(By.xpath("(//span[@class='field-validation-error'])[2]"));
			
		String expectedText = expectedForNullValues;
		if(expectedText.equals(lblForNullPassword.getText())) {
			System.out.println((lblForNullPassword.getText()) + " was displayed for Null Password");
			}
		else{
			driver.close();
		    throw new Error(expectedForNullValues + " for Null values was not displayed");
		}
		
		return lblForNullPassword;
	}
	
	// Close the browser and Test Completed
	public void closeBrowserAndTestComplete(WebDriver driver) {
		
		driver.close();
		System.out.println("TEST COMPLETED");
		
	}	
}
