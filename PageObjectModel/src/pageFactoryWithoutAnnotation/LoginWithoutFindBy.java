package pageFactoryWithoutAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

// This code is used to find elements without using FindElement() and using Page Factor but should not use @FindBy method
public class LoginWithoutFindBy {
	
	public static WebElement txtUsername; // here the WebElement is searching whether ID is matching then search with Name. Both are not matching then exeception will throw.
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsure\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
	}

	

}
