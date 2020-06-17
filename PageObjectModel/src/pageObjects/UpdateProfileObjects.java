package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects {
	
	//@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	public static WebElement myprofilebtn;
	
	
	//@FindBy(xpath = "//*[@id=\"profilefrm\"]/div/div/div[2]/div[5]/div/input")
	@FindBy(name="address2")
	public static WebElement address2;
	
	//@FindBy(xpath="//*[@id=\"profilefrm\"]/div/div/div[3]/div[1]/div/input")
	@FindBy(name="city")
	public static WebElement city;
	
	@FindBy(xpath = "//*[@id=\"profilefrm\"]/div/div/div[7]/div/button")
	public static WebElement Submitbtn;
	
}
