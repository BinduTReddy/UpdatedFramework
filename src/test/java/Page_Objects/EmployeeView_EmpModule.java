package Page_Objects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.GenericLib;

public class EmployeeView_EmpModule {

	WebDriver driver;
	GenericLib lib;

	@FindBy(xpath="//*[@class='shm_link001' and @id='26']")
	private WebElement EmpModule;

	@FindBy(xpath="//*[@class='shm_link002' and @id='29']")
	private WebElement EmpSubModule;

	@FindBy(xpath="//*[@id='txtEmployeeSearch']")
	private WebElement EmpNametxtBox;

	@FindBy(xpath="//body[1]/ul[2]/li[1]/a[1]")
	private WebElement EmpNamepopup;

	@FindBy(xpath="//*[@id='grdEmployeeList']/div[2]/table/tbody/tr[1]/td[1]/a")
	private WebElement Plusicon;

	@FindBy(xpath="//*[@class='ImgbtnView img']")
	private WebElement Viewicon;

	public EmployeeView_EmpModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Emp_EmpModule(Map<String,String> hmap) throws Exception {

		Thread.sleep(4000);
		EmpModule.click();
		Thread.sleep(2000);
		EmpSubModule.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpNametxtBox.sendKeys(hmap.get("EmpName"));
		EmpNamepopup.click();
		EmpNametxtBox.sendKeys(Keys.ENTER);
		Plusicon.click();
		Thread.sleep(1000);
		Viewicon.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();


	}
}
