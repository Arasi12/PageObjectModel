package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTest {

	@Test
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Arasi\\Selenium\\Selenium Learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

//		LoginPageObjects.userName.sendKeys("Admin");
//		LoginPageObjects.password.sendKeys("admin123");
		
		
		
		
		LoginPageObjects loginpgobj= new LoginPageObjects();

//		LoginPageObjects.userName(driver).sendKeys("Admin");
//		LoginPageObjects.password(driver).sendKeys("admin123");
//		LoginPageObjects.loginBtn(driver).click();

		
		
		/*
		 * WebElement userName= driver.findElement(By.id("txtUsername"));
		 * userName.sendKeys("Admin");
		 * 
		 * WebElement passWord= driver.findElement(By.id("txtPassword"));
		 * passWord.sendKeys("admin123");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement loginBtn= driver.findElement(By.id("btnLogin")); loginBtn.click();
		 */
	}

}
