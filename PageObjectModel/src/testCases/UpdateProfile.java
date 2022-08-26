package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfile {

	@Test
	public void updateProfile() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\Arasi\\Selenium\\Selenium Learning\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	PageFactory.initElements(driver, LoginPageObjects.class);
	LoginPageObjects.userName.sendKeys("Admin");
	LoginPageObjects.password.sendKeys("admin123");
	LoginPageObjects.loginBtn.click();
	
	PageFactory.initElements(driver, UpdateProfileObjects.class);
	UpdateProfileObjects.myinfo.click();
	UpdateProfileObjects.editbtn.click();
	UpdateProfileObjects.midname.sendKeys("Tyrion");
	UpdateProfileObjects.empid.sendKeys("45787878");
	UpdateProfileObjects.nationality(11);
	UpdateProfileObjects.editbtn.click();
	

	/*
	LoginPageObjects.userName(driver).sendKeys("Admin");
	LoginPageObjects.password(driver).sendKeys("admin123");
	LoginPageObjects.loginBtn(driver).click();
 	*/
//	UpdateProfileObjects profbj= new UpdateProfileObjects();
	
	
	
/*	
	UpdateProfileObjects.myinfo(driver).click();
	UpdateProfileObjects.editbtn(driver).click();
	UpdateProfileObjects.midname(driver).sendKeys("Tyrion");
	UpdateProfileObjects.empid(driver).sendKeys("566589");
	UpdateProfileObjects.editbtn(driver).click();
	
	
*/	
	
	
	//update profile
/*	WebElement myinfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
	myinfo.click();
	
	WebElement editbtn = driver.findElement(By.id("btnSave"));
	editbtn.click();
	
	WebElement midname= driver.findElement(By.id("personal_txtEmpMiddleName"));
	midname.sendKeys("Tyrion");
	
	WebElement empid= driver.findElement(By.id("personal_txtEmployeeId"));
	empid.sendKeys("784545798");
	
	editbtn.click();
	
*/
	
	}
	
}
