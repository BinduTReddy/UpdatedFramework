package Page_Objects;


import java.io.*;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.GenericLib;

public class Login_Page{
	WebDriver driver;
	GenericLib lib;
	Properties  props;
	
	@FindBy(xpath="//input[@id='UserName']")
	private WebElement userNameTxtBox;

	@FindBy(xpath="//input[@id='Password']")
	private WebElement pwdTxtBox;

	@FindBy(xpath="//input[@value='logon']")
	private WebElement loginBtn;

	public Login_Page(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	 
	public void LoginIntoApp(Map<String,String> hmap) throws IOException
	{	
		driver.get(hmap.get("url"));
		userNameTxtBox.sendKeys(hmap.get("UserName"));
		pwdTxtBox.sendKeys(hmap.get("Password"));
		loginBtn.click();
	}
}


