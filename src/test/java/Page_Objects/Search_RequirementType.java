package Page_Objects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.GenericLib;

public class Search_RequirementType {

	WebDriver driver;
	GenericLib lib;

	@FindBy(xpath = "//*[text()='Sales']")
	private WebElement sales;

	@FindBy(xpath="//*[text()='Requirement']")
	private WebElement reqLink;

	@FindBy(xpath="//a[@href='#tabRequirement' and contains(text(),'Requirement')]")
	private WebElement reqLink2;

	@FindBy(xpath="//*[@id='AutoCompleteClientName']")
	private WebElement ClientName;

	@FindBy(xpath="//*[@id='RequirementCategoryID']")
	private WebElement ReqCategoryId;

	@FindBy(xpath="//*[@name='PreferredRegionIDList'][1]")
	private WebElement Selcheckbox;

	@FindBy(xpath="//*[@id='AutoCompleteReqTitle']")
	private WebElement ReqTitle;

	@FindBy(xpath="//*[@class='t-button t-state-default'][1]")
	private WebElement Search;


	public Search_RequirementType(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Search_Requirement(Map<String,String> hmap) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3000);
		sales.click();
		reqLink.click();
		lib=new GenericLib(driver);
		lib.handlingFrame("frmContent");
		reqLink2.click();
		Thread.sleep(2000);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ReqTitle.sendKeys(hmap.get("RequirementTitle"));              
		ReqTitle.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		lib.select(ReqCategoryId, hmap.get("Reqcategory"));
		Thread.sleep(1000);
		Selcheckbox.click();
		Thread.sleep(2000);
		Search.click();
		lib.switchOutOfFrame();
	}
}
