package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class Edit_Payrate_PerDiem {
	WebDriver driver;
	GenericLib lib;
	Properties  props;
	ReadPropertiesFile Readprop;

	@FindBy(xpath="//*[@id='26'][@class='shm_link001']")
	private WebElement Employee;

	@FindBy(xpath="//*[@class='shm_link002' and @id='29']")
	private WebElement EmpModule;

	@FindBy(xpath="//*[@id='txtEmployeeSearch']")
	private WebElement EmpSearch;

	@FindBy(xpath="//*[@id='txtClientSearch']")
	private WebElement ClientName;

	@FindBy(xpath="//tbody/tr[2]/td[13]/table/tbody/tr/td[1]/a")
	private WebElement Searchimg;

	@FindBy(xpath="//*[@class='ImgbtnView img']")
	private WebElement viewicon;

	@FindBy(xpath="//*[@id='tblRightSideMenu']/tbody/tr[7]/td/a")
	private WebElement payrateedit;

	@FindBy(xpath="//*[@id='Project']/table/tbody/tr/td[1]/a")
	private WebElement Payrateeditview;

	@FindBy(xpath="//*[@name='RateChangeOption'][@value='3']")
	private WebElement Both;

	@FindBy(xpath="//*[@name='RateChangeOption'][@value='2']")
	private WebElement PayRateEdit;

	@FindBy(xpath="//*[@id='btnSaveForm']")
	private WebElement savebtn;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']/table[2]//table/tbody/tr[3]/td/a")
	private WebElement NewBillEffectiveDate;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[2]/input")
	private WebElement BillStartDate;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[3]/input")
	private WebElement BillRate;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[4]/input")
	private WebElement BillOncall;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[5]/input")
	private WebElement Billcallback;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[6]/input")
	private WebElement BillCharge;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[7]/input")
	private WebElement BillHoliday;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[8]/input")
	private WebElement BillOrientation;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[9]/input")
	private WebElement BillOTrate;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[10]/input")
	private WebElement BillDTrate;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//table[2]//table/tbody/tr[3]/td[2]/div/div/div")
	private WebElement POFileupload;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']/table[3]//table/tbody/tr[3]/td/a")
	private WebElement NewPayEffectiveDate;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[2]/select")
	private WebElement PaymentType;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[3]/input")
	private WebElement paystartDate;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[4]/input")
	private WebElement  PayRate;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[5]/input")
	private WebElement  PayOncall;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[6]/input")
	private WebElement  PayCallback;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[7]/input")
	private WebElement  PayCharge;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[8]/input")
	private WebElement  PayHoliday;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[9]/input")
	private WebElement  PayOrientation;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[10]/input")
	private WebElement payOTRate;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[11]/input")
	private WebElement PayDTRate;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[12]/select")
	private WebElement PerDiemType;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[13]/input")
	private WebElement PerDiem;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//table[3]//table/tbody/tr[3]/td[2]/div/div/div")
	private WebElement OfferLetterFileupload;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//table[3]//table/tbody/tr[3]/td[4]/div/div/div")
	private WebElement Orientationfileupload;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']/table[3]//table/tbody/tr[6]/td[2]/div/div/div")
	private WebElement ProofAddressfileupload;

	@FindBy(xpath="//*[@id='btnSaveForm']")
	private WebElement Save;

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

	@FindBy(xpath="//*[@id='chkConfirm']")
	private WebElement Checkbox;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[4]/input")
	private WebElement BillHoliday1;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[5]/input")
	private WebElement BillTATO;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[6]/input")
	private WebElement BillOTrate1;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[7]/input")
	private WebElement BillDTrate1;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[5]/input")
	private WebElement PayHoliday1;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[6]/input")
	private WebElement PayTATO;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[7]/input")
	private WebElement payOTRate1;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[8]/input")
	private WebElement PayDTRate1;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[9]/select")
	private WebElement PerDiemType1;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[10]/input")
	private WebElement PerDiem1;

	public Edit_Payrate_PerDiem(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}

	public void Edit_payRate(Map<String,String> hmap) throws InterruptedException, IOException{
		Thread.sleep(1000);
		Employee.click();
		Thread.sleep(2000);
		EmpModule.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpSearch.sendKeys(hmap.get("EmpName"));
		ClientName.sendKeys(hmap.get("Clientname"));
		Searchimg.click();
		Thread.sleep(3000);
		viewicon.click();
		Thread.sleep(1000);
		payrateedit.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Payrateeditview.click();
		Thread.sleep(3000);
		Both.click();
		Thread.sleep(3000);
		//		NewBillEffectiveDate.click();
		//		Thread.sleep(1000);
		BillStartDate.clear();
		BillStartDate.click();
		BillStartDate.sendKeys(hmap.get("StartDate"));
		BillRate.clear();
		BillRate.sendKeys(hmap.get("Billrate"));
		BillOncall.clear();
		BillOncall.sendKeys(hmap.get("BillOnCall"));
		Billcallback.clear();
		Billcallback.sendKeys(hmap.get("BillCallBack"));
		BillCharge.clear();
		BillCharge.sendKeys(hmap.get("BillCharge"));
		BillHoliday.clear();
		BillHoliday.sendKeys(hmap.get("BillHoliday"));
		BillOrientation.clear();
		BillOrientation.sendKeys(hmap.get("BillOrientation"));
		BillOTrate.clear();
		BillOTrate.click();
		BillOTrate.sendKeys(hmap.get("BillOTrate"));
		Thread.sleep(1000);
		BillDTrate.clear();
		BillDTrate.click();
		BillDTrate.sendKeys(hmap.get("BillDTrate"));
		Thread.sleep(1000);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		//		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.clear();
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate"));	
		PayRate.clear();
		PayRate.sendKeys(hmap.get("Payrate"));
		PayOncall.clear();
		PayOncall.sendKeys(hmap.get("PayOnCall"));
		PayCallback.clear();
		PayCallback.sendKeys(hmap.get("PayCallBack"));
		PayCharge.clear();
		PayCharge.sendKeys(hmap.get("PayCharge"));
		PayHoliday.clear();
		PayHoliday.sendKeys(hmap.get("PayHoliday"));
		PayOrientation.clear();
		PayOrientation.sendKeys(hmap.get("PayOrientation"));
		Thread.sleep(1000);
		payOTRate.click();
		payOTRate.clear();
		payOTRate.sendKeys(hmap.get("PayOTrate"));
		Thread.sleep(1000);
		PayDTRate.click();
		PayDTRate.clear();
		PayDTRate.sendKeys(hmap.get("PayDTrate"));
		lib.select(PerDiemType,hmap.get("PerDiemType"));
		PerDiem.clear();
		PerDiem.sendKeys(hmap.get("Perdiem"));

		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate1"));	
		PayRate.sendKeys(hmap.get("Payrate1"));
		PayOncall.sendKeys(hmap.get("PayOnCall1"));
		PayCallback.sendKeys(hmap.get("PayCallBack1"));
		PayCharge.sendKeys(hmap.get("PayCharge1"));
		PayHoliday.sendKeys(hmap.get("PayHoliday1"));
		PayOrientation.sendKeys(hmap.get("PayOrientation1"));
		Thread.sleep(1000);
		payOTRate.click();
		payOTRate.clear();
		payOTRate.sendKeys(hmap.get("PayOTrate1"));
		Thread.sleep(1000);
		PayDTRate.click();
		PayDTRate.clear();
		PayDTRate.sendKeys(hmap.get("PayDTrate1"));
		PerDiemType.click();
		lib.select(PerDiemType,hmap.get("PerDiemType"));
		Thread.sleep(1000);
		PerDiem.sendKeys(hmap.get("Perdiem"));
		OfferLetterFileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Orientationfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Save.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
			Save.click();
		} catch (TimeoutException e) {
		}
	}

	public void Edit_PerDiem(Map<String,String> hmap) throws InterruptedException, IOException{	
		Thread.sleep(1000);
		Employee.click();
		Thread.sleep(2000);
		EmpModule.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpSearch.sendKeys(hmap.get("EmpName"));
		ClientName.sendKeys(hmap.get("Clientname"));
		Searchimg.click();
		Thread.sleep(3000);
		viewicon.click();
		Thread.sleep(1000);
		payrateedit.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Payrateeditview.click();
		Thread.sleep(3000);
		Both.click();
		Thread.sleep(3000);
		//		NewBillEffectiveDate.click();
		Thread.sleep(1000);
		BillStartDate.clear();
		BillStartDate.click();
		BillStartDate.sendKeys(hmap.get("StartDate"));
		BillRate.clear();
		BillRate.sendKeys(hmap.get("Billrate"));
		BillOncall.clear();
		BillOncall.sendKeys(hmap.get("BillOnCall"));
		Billcallback.clear();
		Billcallback.sendKeys(hmap.get("BillCallBack"));
		BillCharge.clear();
		BillCharge.sendKeys(hmap.get("BillCharge"));
		BillHoliday.clear();
		BillHoliday.sendKeys(hmap.get("BillHoliday"));
		BillOrientation.clear();
		BillOrientation.sendKeys(hmap.get("BillOrientation"));
		BillOTrate.clear();
		BillOTrate.sendKeys(hmap.get("BillOTrate"));
		BillDTrate.clear();
		BillDTrate.sendKeys(hmap.get("BillDTrate"));
		Thread.sleep(1000);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		//		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.clear();
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate"));	
		PayRate.clear();
		PayRate.sendKeys(hmap.get("Payrate"));
		PayOncall.clear();
		PayOncall.sendKeys(hmap.get("PayOnCall"));
		PayCallback.clear();
		PayCallback.sendKeys(hmap.get("PayCallBack"));
		PayCharge.clear();
		PayCharge.sendKeys(hmap.get("PayCharge"));
		PayHoliday.clear();
		PayHoliday.sendKeys(hmap.get("PayHoliday"));
		PayOrientation.clear();
		PayOrientation.sendKeys(hmap.get("PayOrientation"));
		payOTRate.click();
		payOTRate.clear();
		payOTRate.sendKeys(hmap.get("PayOTrate"));
		PayDTRate.clear();
		PayDTRate.sendKeys(hmap.get("PayDTrate"));
		lib.select(PerDiemType,hmap.get("PerDiemType"));
		PerDiem.clear();
		PerDiem.sendKeys(hmap.get("Perdiem"));

		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate1"));	
		PayRate.sendKeys(hmap.get("Payrate"));
		PayOncall.sendKeys(hmap.get("PayOnCall"));
		PayCallback.sendKeys(hmap.get("PayCallBack"));
		PayCharge.sendKeys(hmap.get("PayCharge"));
		PayHoliday.sendKeys(hmap.get("PayHoliday"));
		PayOrientation.sendKeys(hmap.get("PayOrientation"));
		payOTRate.click();
		payOTRate.clear();
		payOTRate.sendKeys(hmap.get("PayOTrate"));
		Thread.sleep(2000);
		PayDTRate.clear();
		PayDTRate.sendKeys(hmap.get("PayDTrate"));
		lib.select(PerDiemType,hmap.get("PerDiemType"));
		PerDiem.clear();
		PerDiem.sendKeys(hmap.get("Perdiem1"));
		OfferLetterFileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Orientationfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Save.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
			Save.click();
		} catch (TimeoutException e) {
		}
	}

	public void NonClinical_PerDiem(Map<String,String> hmap) throws InterruptedException, IOException{	
		Thread.sleep(1000);
		Employee.click();
		Thread.sleep(2000);
		EmpModule.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpSearch.sendKeys(hmap.get("EmpName"));
		ClientName.sendKeys(hmap.get("Clientname"));
		Searchimg.click();
		Thread.sleep(3000);
		viewicon.click();
		Thread.sleep(1000);
		payrateedit.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Payrateeditview.click();
		Thread.sleep(3000);
		Both.click();
		Thread.sleep(3000);
		NewBillEffectiveDate.click();
		Thread.sleep(1000);
		BillStartDate.click();
		BillStartDate.sendKeys(hmap.get("StartDate"));
		BillRate.sendKeys(hmap.get("Billrate"));
		BillHoliday1.sendKeys(hmap.get("BillHoliday"));
		BillTATO.sendKeys(hmap.get("BillTATO"));
		BillOTrate1.sendKeys(hmap.get("BillOTrate"));
		BillDTrate1.sendKeys(hmap.get("BillDTrate"));
		Thread.sleep(1000);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate"));	
		PayRate.sendKeys(hmap.get("Payrate"));
		PayHoliday1.click();
		PayHoliday1.sendKeys(hmap.get("PayHoliday"));
		PayTATO.click();
		PayTATO.sendKeys(hmap.get("PayTato"));
		Thread.sleep(1000);
		payOTRate1.click();
		payOTRate1.clear();
		payOTRate1.sendKeys(hmap.get("PayOTrate"));
		Thread.sleep(1000);
		PayDTRate1.clear();
		PayDTRate1.sendKeys(hmap.get("PayDTrate"));
		lib.select(PerDiemType1,hmap.get("PerDiemType"));
		PerDiem1.sendKeys(hmap.get("Perdiem"));
		OfferLetterFileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Save.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
			Save.click();
		} catch (TimeoutException e) {
		}
	}

	public void NonCli_MulPayRate(Map<String,String> hmap) throws InterruptedException, IOException{	
		Thread.sleep(1000);
		Employee.click();
		Thread.sleep(2000);
		EmpModule.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpSearch.sendKeys(hmap.get("EmpName"));
		ClientName.sendKeys(hmap.get("Clientname"));
		Searchimg.click();
		Thread.sleep(3000);
		viewicon.click();
		Thread.sleep(1000);
		payrateedit.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Payrateeditview.click();
		Thread.sleep(3000);
		Both.click();
		Thread.sleep(3000);
		NewBillEffectiveDate.click();
		Thread.sleep(1000);
		BillStartDate.click();
		BillStartDate.sendKeys(hmap.get("StartDate"));
		BillRate.sendKeys(hmap.get("Billrate"));
		BillHoliday1.sendKeys(hmap.get("BillHoliday"));
		BillTATO.sendKeys(hmap.get("BillTATO"));
		BillOTrate1.sendKeys(hmap.get("BillOTrate"));
		BillDTrate1.sendKeys(hmap.get("BillDTrate"));
		Thread.sleep(1000);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate"));	
		PayRate.sendKeys(hmap.get("Payrate"));
		PayHoliday1.sendKeys(hmap.get("PayHoliday"));
		PayTATO.sendKeys(hmap.get("PayTato"));
		payOTRate1.click();
		payOTRate1.clear();
		payOTRate1.sendKeys(hmap.get("PayOTrate"));
		Thread.sleep(2000);
		PayDTRate1.clear();
		PayDTRate1.sendKeys(hmap.get("PayDTrate"));
		lib.select(PerDiemType1,hmap.get("PerDiemType"));
		PerDiem1.sendKeys(hmap.get("Perdiem"));

		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate1"));	
		PayRate.sendKeys(hmap.get("Payrate1"));
		PayHoliday1.sendKeys(hmap.get("PayHoliday"));
		PayTATO.sendKeys(hmap.get("PayTato1"));
		payOTRate1.click();
		payOTRate1.clear();
		payOTRate1.sendKeys(hmap.get("PayOTrate1"));
		Thread.sleep(1000);
		PayDTRate1.clear();
		PayDTRate1.sendKeys(hmap.get("PayDTrate1"));
		PerDiemType1.click();
		lib.select(PerDiemType1,hmap.get("PerDiemType"));
		Thread.sleep(1000);
		PerDiem1.sendKeys(hmap.get("Perdiem"));

		OfferLetterFileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Save.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
			Save.click();
		} catch (TimeoutException e) {
		}
	}
	public void NonCli_MultiPerDiem(Map<String,String> hmap) throws InterruptedException, IOException{	
		Thread.sleep(1000);
		Employee.click();
		Thread.sleep(2000);
		EmpModule.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpSearch.sendKeys(hmap.get("EmpName"));
		ClientName.sendKeys(hmap.get("Clientname"));
		Searchimg.click();
		Thread.sleep(3000);
		viewicon.click();
		Thread.sleep(1000);
		payrateedit.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Payrateeditview.click();
		Thread.sleep(3000);
		Both.click();
		Thread.sleep(3000);
		NewBillEffectiveDate.click();
		Thread.sleep(1000);
		BillStartDate.click();
		BillStartDate.sendKeys(hmap.get("StartDate"));
		BillRate.sendKeys(hmap.get("Billrate"));
		BillHoliday1.sendKeys(hmap.get("BillHoliday"));
		BillTATO.sendKeys(hmap.get("BillTATO"));
		BillOTrate1.sendKeys(hmap.get("BillOTrate"));
		BillDTrate1.sendKeys(hmap.get("BillDTrate"));
		Thread.sleep(1000);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate"));	
		PayRate.sendKeys(hmap.get("Payrate"));
		PayHoliday1.sendKeys(hmap.get("PayHoliday"));
		PayTATO.sendKeys(hmap.get("PayTato"));
		payOTRate1.click();
		payOTRate1.clear();
		payOTRate1.sendKeys(hmap.get("PayOTrate"));
		Thread.sleep(2000);
		PayDTRate1.clear();
		PayDTRate1.sendKeys(hmap.get("PayDTrate"));
		lib.select(PerDiemType1,hmap.get("PerDiemType"));
		PerDiem1.sendKeys(hmap.get("Perdiem"));

		js.executeScript("arguments[0].scrollIntoView();", NewPayEffectiveDate);
		NewPayEffectiveDate.click();
		lib.select(PaymentType,hmap.get("PaymentType"));
		paystartDate.click();
		paystartDate.sendKeys(hmap.get("StartDate1"));	
		PayRate.sendKeys(hmap.get("Payrate"));
		PayHoliday1.sendKeys(hmap.get("PayHoliday"));
		PayTATO.sendKeys(hmap.get("PayTato"));
		payOTRate1.click();
		payOTRate1.clear();
		payOTRate1.sendKeys(hmap.get("PayOTrate"));
		Thread.sleep(1000);
		PayDTRate1.clear();
		PayDTRate1.sendKeys(hmap.get("PayDTrate"));
		PerDiemType1.click();
		lib.select(PerDiemType1,hmap.get("PerDiemType"));
		Thread.sleep(1000);
		PerDiem1.sendKeys(hmap.get("Perdiem1"));

		OfferLetterFileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Save.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
			Save.click();
		} catch (TimeoutException e) {
		}
	}

	public void Finance_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(4000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		ApproveBtn.click();
		Thread.sleep(4000);

		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task1"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);

		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task2"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);

		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task1"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);
	}
}
