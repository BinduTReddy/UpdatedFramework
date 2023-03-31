package Page_Objects;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.GenericLib;

public class NewEmp_DirectHire {

	WebDriver driver;
	GenericLib lib;

	@FindBy(xpath = "//*[@id='NegotiatedSalary']")
	private WebElement NewNegotiatedSalary;

	@FindBy(xpath="//*[@id='ClientCommission']")
	private WebElement clientcommission;

	@FindBy(xpath="//*[@id='InvoiceDate']")
	private WebElement InvoiceDate;

	@FindBy(xpath="//*[@id='btnBillingContact']")
	private WebElement billingctMenu;

	@FindBy(xpath="//*[@id='91' and @type='checkbox']")
	private WebElement billingcheckbox;

	@FindBy(xpath="//*[@id='ClientContact_Contact_FirstName']")
	private WebElement FirstName;

	@FindBy(xpath="//*[@id='ClientContact_Contact_LastName']")
	private WebElement LastName;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement SaveButton;

	@FindBy(xpath="//*[@id='Project_BillingContact1']")
	private WebElement billingct;

	@FindBy(xpath="//*[@id='Project_ClientPaymentTerms']")
	private WebElement ClientpayTerms;

	@FindBy(xpath="//*[@id='Project_InvoiceMethodID']")
	private WebElement InvoiceMethod;

	@FindBy(xpath="//*[@id='CommSplit1_RecipientID']")
	private WebElement CommSplitName;

	@FindBy(xpath="//*[@class='regular ImgbtnSave']")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@class='shm_link001' and @id='150']")
	private WebElement MgmtBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='468']")
	private WebElement Workflowmenu;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

	@FindBy(xpath="//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;

	@FindBy(xpath="//*[@id='txtMgmtTask']")
	private WebElement Taskto;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;

	public NewEmp_DirectHire(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Create_DirectHire(Map<String,String> hmap) throws Exception{

		lib = new GenericLib(driver);
		Thread.sleep(3000);
		NewNegotiatedSalary.sendKeys(hmap.get("NewNegSalary"));
		Thread.sleep(1000);
		clientcommission.sendKeys(hmap.get("PlacementFee"));
		Thread.sleep(1000);
		InvoiceDate.click();
		InvoiceDate.sendKeys(hmap.get("Invoicedate"));
		Thread.sleep(1000);
		billingctMenu.click();
		Thread.sleep(1000);
		billingcheckbox.click();
		FirstName.sendKeys(hmap.get("BillingFirstname"));
		LastName.sendKeys(hmap.get("BillingLastname"));
		SaveButton.click();
		Thread.sleep(2000);
		lib.select(billingct,hmap.get("BillingContact"));
		Thread.sleep(2000);
		lib.select(InvoiceMethod,hmap.get("Invoicemethod"));
		Thread.sleep(1000);
		lib.select(ClientpayTerms,hmap.get("clientPayTerms"));
		Thread.sleep(1000);
		lib.select(CommSplitName,hmap.get("CommRecName"));
		Thread.sleep(1000);
		SaveBtn.click();
	}

	public void DirectHireApproval(Map<String,String> hmap) throws InterruptedException {

		Thread.sleep(4000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		Thread.sleep(1000);
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskBy"));
		Thread.sleep(1000);
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);

	}
}
