package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjects {
	
	@FindBy(how=How.NAME,using = "username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath ="//*[@id=\"loginfrm\"]/button")
	public static WebElement submit;
	
		

}
