package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	@FindBy(id="txtUsername")
	public static WebElement userName;
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	@FindBy(id = "btnLogin")
	public static WebElement loginBtn;
	
	/*
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("txtUsername"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));
	}
	
	public static WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.id("btnLogin"));
	}
	*/
}
