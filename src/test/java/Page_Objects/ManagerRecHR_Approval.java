package Page_Objects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Reusable_Methods.GenericLib;

public class ManagerRecHR_Approval {

	WebDriver driver;
	GenericLib lib;
	WebDriverWait wait;
	
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

	@FindBy(xpath="//tbody/tr[3]/td[3]/span[1]/input[1]")
	private WebElement StateW4Reviewed;

	@FindBy(xpath="//tbody/tr[4]/td[3]/span[1]/input[1]")
	private WebElement W4Federalreviewed;

	@FindBy(xpath="//tbody/tr[5]/td[3]/span[1]/input[1]")
	private WebElement paperlesspolicyreviewed;

	@FindBy(xpath="//tbody/tr[6]/td[3]/span[1]/input[1]")
	private WebElement DirectdepositReviewed;
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/span[1]/input[1]")
	private WebElement VoidedchkReviewed;

	@FindBy(xpath="//input[@name='IsPODocRecollect' and @value='false']")
	private WebElement POReviewed;

	@FindBy(xpath="//input[@name='IsWorksheetRecollect' and @value='false']")
	private WebElement WorksheetReviewed;

	@FindBy(xpath="//input[@name='ReviewDocList[0].IsRecollectReq' and @value='false']")
	private WebElement DocListReview;
	
	@FindBy(xpath="//*[@name='ReviewDocList[1].IsRecollectReq'][@value='false']")
	private WebElement DocListReview1;
	
	@FindBy(xpath="//*[@name='ReviewDocList[2].IsRecollectReq'][@value='false']")
	private WebElement DocListReview2;

	@FindBy(xpath="//*[@id='ImgBtnOK']")
	private WebElement Complete;

	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_Project_BillingContact1']")
	private WebElement billingct;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_Project_InvoiceFlagID']")
	private WebElement InvoiceFlag;
	
	@FindBy(xpath="//*[@id='NewObject_PayrollCodeID']")
	private WebElement Payrollcode;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_EEOCategoryID']")
	private List<WebElement> EEOCat;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_Project_InvoiceFrequencyID']")
	private WebElement InvoiceFreq;

	public ManagerRecHR_Approval(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	public void Onboarding_RecManagerApproval(Map<String,String> hmap) throws Exception {

		Thread.sleep(3500);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Payrollcode);
		lib.select(Payrollcode,hmap.get("PayrollCode"));
		Thread.sleep(1000);
		ApproveBtn.click();
	}
	
	public void Onboarding_ManagerApproval(Map<String,String> hmap) throws Exception {
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskTo2"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Payrollcode);
		lib.select(Payrollcode,hmap.get("PayrollCode"));
		List<WebElement> EEO = EEOCat;
		if (EEO.size() > 0) {
			lib.select(EEO.get(0),hmap.get("EEOcategory"));
		}
		ApproveBtn.click();
		Thread.sleep(2000);
	}

	public void HRPayroll_Approval(Map<String,String> hmap) throws InterruptedException {
		Thread.sleep(4000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.click();
		Taskto.sendKeys(hmap.get("Taskto"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(2000);
		POReviewed.click();
		Thread.sleep(1000);
		WorksheetReviewed.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		lib.select(InvoiceFreq,hmap.get("Invoicefreq"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", billingct);
		lib.select(billingct,hmap.get("BillingCt"));
		Thread.sleep(1000);
		ApproveBtn.click();		
		Thread.sleep(3000);

		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.click();
		Taskto.sendKeys(hmap.get("TaskTo1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		StateW4Reviewed.click();
		Thread.sleep(1000);
		W4Federalreviewed.click();
		Thread.sleep(1000);
		try {
			wait.until(ExpectedConditions.visibilityOf(paperlesspolicyreviewed));
			paperlesspolicyreviewed.click();
		} catch (TimeoutException e) {}
		try {
			wait.until(ExpectedConditions.visibilityOf(DirectdepositReviewed));
			DirectdepositReviewed.click();
		} catch (TimeoutException e) {}
		try {
			wait.until(ExpectedConditions.visibilityOf(VoidedchkReviewed));
			VoidedchkReviewed.click();
		} catch (TimeoutException e) {}
		
		ApproveBtn.click();
		Thread.sleep(3000);

		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Taskto"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		DocListReview.click();
		try {
			wait.until(ExpectedConditions.visibilityOf(DocListReview1));
			DocListReview1.click();
		} catch (TimeoutException e) {}
		try {
			wait.until(ExpectedConditions.visibilityOf(DocListReview2));
			DocListReview2.click();
		} catch (TimeoutException e) {}
		ApproveBtn.click();
		Thread.sleep(1000);
	}

	public void CreateEmployee_Approval(Map<String,String> hmap) throws InterruptedException {
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskTo2"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		Complete.click();
		Thread.sleep(3000);
	}
	
	public void IndiaInstance_ManagerRecApprovalScreen(Map<String,String> hmap) throws InterruptedException {
		
		Thread.sleep(3000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.click();
		Taskto.sendKeys(hmap.get("Task"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(1000);
		lib.select(Payrollcode,hmap.get("PayrollCode"));
		Thread.sleep(2000);
		ApproveBtn.click();
		
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(1000);
	}
	
	public void IndiaHRPayroll_Approval(Map<String,String> hmap) throws InterruptedException {
		Thread.sleep(3000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.click();
		Taskto.sendKeys(hmap.get("TaskTo"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(1000);
		POReviewed.click();
		Thread.sleep(1000);
		WorksheetReviewed.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", InvoiceFlag);
		lib.select(InvoiceFlag,hmap.get("ClientinvoiceflagType"));
		js.executeScript("arguments[0].scrollIntoView();", billingct);
		lib.select(billingct,hmap.get("Hiringmanager"));
		ApproveBtn.click();		
		Thread.sleep(1000);

		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskTo1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(1000);

		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskTo"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		DocListReview.click();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(1000);
	}
}
