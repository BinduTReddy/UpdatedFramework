package Base_Programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import Page_Objects.Login_Page;
import java.io.*;
import java.util.*;

public class BaseClass{

	public static WebDriver driver;
	Login_Page LoginPage;
	ReadPropertiesFile Readprop;

	@BeforeClass	
	public void openBrowser() throws IOException
	{
		Readprop = new ReadPropertiesFile();
		Properties props = Readprop.getproperties();
		System.setProperty("webdriver.chrome.driver",props.getProperty("chromepath"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.9");
		options.addArguments("profile.managed_default_content_settings.popups", "1");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		LoginPage=new Login_Page(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test1");
		LoginPage.LoginIntoApp(hmap);
	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}	
}
