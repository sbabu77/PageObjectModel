package functionalTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfiles {
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsure\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		
		// We use Page Factory pattern to initialize web elements which are defined in Page Objects. ... 
		// initElements() static method takes the driver instance of the given class and the class type, 
		// and returns a Page Object with its fields fully initialized.
		PageFactory.initElements(driver, LoginObjects.class);  
		
		LoginObjects.username.sendKeys("user@phptravels.com");
		LoginObjects.password.sendKeys("demouser");
		LoginObjects.submit.click();
		
		Thread.sleep(7000);
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		UpdateProfileObjects.address2.sendKeys("250 main streeet");
		UpdateProfileObjects.city.sendKeys("Manchester");
		UpdateProfileObjects.Submitbtn.click();
		
		
		
	}

}
