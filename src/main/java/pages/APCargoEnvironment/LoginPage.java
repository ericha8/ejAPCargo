package pages.APCargoEnvironment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginPage {

private static WebElement txtEmail = null;
private static WebElement txtPassword = null;
private static WebElement btnSignIn = null;
private static WebElement btnLogout = null;

	// Open the browser and navigate to URL
	public void openBrowserAndNavigateURL(WebDriver driver) {
		
		System.out.println("Opening the Browser and navigating to URL");
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--ignore-ssl-errors");
        chromeOptions.addArguments("--test-type");
        chromeOptions.setBrowserVersion("114");
        driver = new ChromeDriver(chromeOptions);
        // DesiredCapabilities test = new DesiredCapabilities();
		driver.get("http://localhost:19000/");
		driver.manage().window().maximize();
		System.out.println(" - Browser was open and navigated to URL");
		
	}	

	// Log in to AP Cargo - Entering Email
	public WebElement enterEmail(WebDriver driver) {
		
		txtEmail = driver.findElement(By.xpath("//input[@id='userNameInput']"));
		txtEmail.sendKeys("nigel@apcargo.com.ph");
		System.out.println(" - Email was entered");
		return txtEmail;
	}
	
	// Log in to AP Cargo - Entering Password
	public WebElement enterPassword(WebDriver driver) {

		txtPassword = driver.findElement(By.xpath("//input[@id='passwordInput']"));
		txtPassword.sendKeys("Ap123456%");
		System.out.println(" - Password was entered");
		return txtPassword;
	
	}
	
	// Log in to AP Cargo - Clicking Sign in button
	public WebElement clickSignInButton(WebDriver driver) {

		btnSignIn = driver.findElement(By.xpath("//span[@id='submitButton']"));
		btnSignIn.click();
		System.out.println(" - Login button was clicked");
		return btnSignIn;
	
	}
	
	// Clicking Logout button
	public WebElement clickLogoutButton(WebDriver driver) {
	
		btnLogout = driver.findElement(By.xpath("//div[contains(text(),'Logout')]"));
		System.out.println(" - Logout button was clicked");
		return btnLogout;
		
	}
	
	// Close the browser
	public void closeBrowser(WebDriver driver) {
		
		driver.close();
		System.out.println("Browser is Closed");
		
	}	

}
