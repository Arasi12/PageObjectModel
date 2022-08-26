package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UpdateProfileObjects {

	@FindBy(id = "menu_pim_viewMyDetails")
	public static WebElement myinfo;
	@FindBy(id = "btnSave")
	public static WebElement editbtn;
	@FindBy(id = "personal_txtEmpMiddleName")
	public static WebElement midname;
	@FindBy(id = "personal_txtEmployeeId")
	public static WebElement empid;
	@FindBy(id = "personal_cmbNation")
	public static WebElement ddid;
	
	public static void nationality(int index) {
	      Select drop1 = new Select(ddid);
	      drop1.selectByIndex(index);  
	}
	
	
	
	/*
	public static WebElement myinfo(WebDriver driver) {
		return driver.findElement(By.id("menu_pim_viewMyDetails"));
	}
	
	public static WebElement editbtn(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
	}
	
	public static WebElement midname(WebDriver driver) {
		return driver.findElement(By.id("personal_txtEmpMiddleName"));
	}
	
	public static WebElement empid(WebDriver driver) {
		return driver.findElement(By.id("personal_txtEmployeeId"));
	}
	*/
}



