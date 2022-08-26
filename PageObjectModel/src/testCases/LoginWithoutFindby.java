package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginWithoutFindby {

	@Test
	public void Login() {
			
	System.setProperty("webdriver.chrome.driver", "F:\\Arasi\\Selenium\\Selenium Learning\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	PageFactory.initElements( driver, LoginPageObjects.class);
	
	LoginPageObjects.userName.sendKeys("Admin");
	LoginPageObjects.password.sendKeys("admin123");
	LoginPageObjects.loginBtn.click();
	
	}
}
