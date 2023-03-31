package Page_Objects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.GenericLib;

public class SearchEmp_DirectHireModule {
	WebDriver driver;
	GenericLib lib;


	@FindBy(xpath = "//a[@class='shm_link001'][@id='514']")
	private WebElement DirectHireTab;

	@FindBy(xpath="//input[@id='txtEmployeeSearch']")
	private WebElement Empsearch;

	@FindBy(xpath="//input[@id='txtClientSearch']")
	private WebElement Clientsearch;

	@FindBy(xpath="//input[@id='txtEmailSearch']")
	private WebElement Email;

	@FindBy(xpath="//*[@id=\"grdDirectHireEmployeeList\"]/table/tbody/tr/td[2]")
	private WebElement ViewBtn;

	public SearchEmp_DirectHireModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void SearchEmployee_DirectHireModule(Map<String,String> hmap) throws Exception{

		lib = new GenericLib(driver);
		Thread.sleep(1000);
		DirectHireTab.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Empsearch.sendKeys(hmap.get("CandName"));
		Thread.sleep(1000);
		Clientsearch.sendKeys(hmap.get("Clientname"));
		Thread.sleep(1000);
		Email.sendKeys(hmap.get("Email"));
		Email.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ViewBtn.click();

	}
}
