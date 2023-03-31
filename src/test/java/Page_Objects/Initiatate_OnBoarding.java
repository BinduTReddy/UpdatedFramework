package Page_Objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Reusable_Methods.GenericLib;

public class Initiatate_OnBoarding {

	WebDriver driver;
	GenericLib lib;
	WebDriverWait wait;

	@FindBy(xpath="//*[@id='divWfh']/table/tbody/tr[2]/td/div/button[2]")
	private WebElement RemotePopup;

	@FindBy(xpath="//*[@id='OB_Consultant_SSN']")
	private WebElement SSNField;

	@FindBy(xpath="//*[@id='OB_Consultant_DOB']")
	private WebElement DOBfield;

	@FindBy(xpath="//*[@id='OB_Consultant_OBClassificationID']")
	private WebElement OBjobcla;

	@FindBy(xpath="//*[@id='OB_Consultant_ClassificationID']")
	private WebElement payrollClassification;

	@FindBy(xpath="//*[@name='CountryID'][@class='valid']")
	private WebElement Country;

	@FindBy(xpath="//*[@id='OB_Consultant_CategoryID']")
	private WebElement Emptype;

	@FindBy(xpath="//*[@id='PayrollCodeID']")
	private WebElement PayRollCode;

	@FindBy(xpath="//*[@id='OB_Consultant_OfferLetterTemplateID']")
	private WebElement OfferLetterTemp;

	@FindBy(xpath="//*[@id='OB_Consultant_BenefitEligibilityClassID']")
	private WebElement BenefitEligibilityClass;

	@FindBy(xpath="//*[@id='OB_Consultant_BenefitEligibilityDate']")
	private WebElement BenefitEligibilityDate;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_ReferenceNo']")
	private WebElement PORef;

	@FindBy(xpath="//*[@id='OB_Consultant_StartDate']")
	private WebElement StartDate;

	@FindBy(xpath="//*[@id='OB_Consultant_ScheduledEndDate']")
	private WebElement Scheduledenddate;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_InvoiceFrequencyID']")
	private WebElement Invoicefreq;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_TimesheetTemplateID']")
	private WebElement TSTemplate;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_TimesheetFrequencyID']")
	private WebElement TsFrequency;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_NoofShifts']")
	private WebElement NoofShifts;

	@FindBy(xpath="//*[@id='OB_Consultant_HolidayBR']")
	private WebElement HolBillRate;

	@FindBy(xpath="//*[@id='OB_Consultant_HolidayPR']")
	private WebElement HolPayrate;

	@FindBy(xpath="//*[@id='OB_Consultant_OTBillrate']")
	private WebElement OBbillrate;

	@FindBy(xpath="//*[@id='OB_Consultant_OTPayrate']")
	private WebElement OBPayrate;

	@FindBy(xpath="//*[@id='OB_Consultant_DTBillrate']")
	private WebElement DTbillrate;

	@FindBy(xpath="//*[@id='OB_Consultant_DTPayrate']")
	private WebElement DTPayrate;

	@FindBy(xpath="//*[@id='OB_Consultant_OncallBR']")
	private WebElement OncallRate;

	@FindBy(xpath="//*[@id='OB_Consultant_CallBackBR']")
	private WebElement CallbackRate;

	@FindBy(xpath="//*[@id='OB_Consultant_ChargeBR']")
	private WebElement ChargeRate;

	@FindBy(xpath="//*[@id='OB_Consultant_OrientationBR']")
	private WebElement OrientBR;

	@FindBy(xpath="//*[@id='OB_Consultant_OrientationPR']")
	private WebElement OrientPR;

	@FindBy(xpath="//*[@id='OB_Consultant_TATOBR']")
	private WebElement TatoBR;

	@FindBy(xpath="//*[@id='OB_Consultant_TATOPR']")
	private WebElement TatoPR;

	@FindBy(xpath="//*[@id='OB_Consultant_TravelBonus']")
	private WebElement joiningbonus;

	@FindBy(xpath="//*[@id='OB_Consultant_PayJoiningID']")
	private WebElement joiningdropdown;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_PerdiemTypeID']")
	private WebElement perDiemdropdown;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_PerDiem']")
	private WebElement Perdiem;

	@FindBy(xpath="//*[@id='OB_Consultant_StandardHours']")
	private WebElement standardHrs;

	@FindBy(xpath="//*[@id='OB_Consultant_MinGuarantHours']")
	private WebElement MinGuarenteedHrs;

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

	@FindBy(xpath="//*[@id='OB_Consultant_Project_BillingContact1']")
	private WebElement billingct;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_WorkerCompStateID']")
	private WebElement Workerscomp;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_Attention']")
	private WebElement Attentionto;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_InvoiceEmailID']")
	private WebElement Invoiceemail;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_ClientPaymentTerms']")
	private WebElement clientpayterms;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_VisaTypeID']")
	private WebElement Visatype;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_OBOwnerID']")
	private WebElement OnBoardingowner;

	@FindBy(xpath="//*[contains(text(),'Tax/Comm/Misc')]")
	private WebElement taxBtn;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_VMSRefID']")
	private WebElement VMSref;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_CommRecipient1']")
	private WebElement Recipientdropdown;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_CommSplit1']")
	private WebElement split;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_CommLocationID1']")
	private WebElement BranchLoc;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='ExceptionNotes']")
	private WebElement ExpNotes;

	@FindBy(xpath="//a[@class='t-icon t-plus']")
	private WebElement clickonicon;

	@FindBy(xpath="//*[@id='OB_Consultant_BillrateTypeID']")
	private WebElement BRtype;

	@FindBy(xpath="//*[@id='OB_Consultant_PayrateTypeID']")
	private WebElement PRtype;

	public Initiatate_OnBoarding(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	public void InitiateOnboarding(Map<String,String> hmap) throws InterruptedException
	{
		Thread.sleep(2500);
		try {
			wait.until(ExpectedConditions.visibilityOf(RemotePopup));
			RemotePopup.click();
		} catch (TimeoutException e) {
		}	
		Thread.sleep(1000);
		SSNField.click();
		SSNField.sendKeys(hmap.get("SSN"));
		DOBfield.click();
		DOBfield.sendKeys(hmap.get("DOB"));
		lib=new GenericLib(driver);
		lib.select(OBjobcla,hmap.get("OBJobClassification"));
		Thread.sleep(1000);
		lib.select(payrollClassification,hmap.get("payrollclassification"));
		Thread.sleep(1000);
//		lib.select(Country,hmap.get("country"));
		Thread.sleep(1000);
		lib.select(Emptype,hmap.get("emptype"));
		Thread.sleep(2000);
		lib.select(PayRollCode,hmap.get("PayrollCode"));
		Thread.sleep(1000);	
		try {
			wait.until(ExpectedConditions.visibilityOf(OfferLetterTemp));
			lib.select(OfferLetterTemp,hmap.get("OfferLetTemp"));
		} catch (TimeoutException e) {}	
		try {
			wait.until(ExpectedConditions.visibilityOf(BenefitEligibilityClass));
			lib.select(BenefitEligibilityClass,hmap.get("BenefitEligibilityclass"));
		} catch (TimeoutException e) {}	

		PORef.sendKeys(hmap.get("PoReference"));
		StartDate.click();
		StartDate.sendKeys(hmap.get("startDate"));
		Scheduledenddate.click();
		Thread.sleep(1000);
		Scheduledenddate.sendKeys(hmap.get("ScheduledEnddate"));
		Thread.sleep(1000);
		lib.select(Invoicefreq,hmap.get("Invoicefreq"));
		Thread.sleep(1000);
		lib.select(TSTemplate,hmap.get("TSTemp"));	
		lib.select(TsFrequency,hmap.get("TSFreq"));
		try {
			wait.until(ExpectedConditions.visibilityOf(BRtype));
			lib.select(BRtype,hmap.get("BRType"));
		} catch (TimeoutException e) {
		}	
		try {
			wait.until(ExpectedConditions.visibilityOf(PRtype));
			lib.select(PRtype,hmap.get("PRType"));
		} catch (TimeoutException e) {
		}	
		try {
			WebElement Shift = wait.until(ExpectedConditions.visibilityOf(NoofShifts));
			Shift.sendKeys(hmap.get("Shifts"));
		} catch (TimeoutException e) {
		}		
		try {
			WebElement oncall = wait.until(ExpectedConditions.visibilityOf(OncallRate));
			oncall.sendKeys(hmap.get("Oncallrate"));
		} catch (TimeoutException e) {
		}		
		try {
			WebElement callback = wait.until(ExpectedConditions.visibilityOf(CallbackRate));
			callback.sendKeys(hmap.get("callbackrate"));
		} catch (TimeoutException e) {
		}
		try {
			WebElement charge = wait.until(ExpectedConditions.visibilityOf(ChargeRate));
			charge.sendKeys(hmap.get("chargerate"));
		} catch (TimeoutException e) {
		}
		try {
			wait.until(ExpectedConditions.visibilityOf(OrientBR));
			OrientBR.sendKeys(hmap.get("orientBr"));
		} catch (TimeoutException e) {
		}
		try {
			wait.until(ExpectedConditions.visibilityOf(OrientPR));
			OrientPR.sendKeys(hmap.get("orientPr"));	
		} catch (TimeoutException e) {
		}
		HolBillRate.sendKeys(hmap.get("Holbillrate"));
		OBbillrate.sendKeys(hmap.get("OBBillrate"));
		OBPayrate.clear();
		OBPayrate.click();
		OBPayrate.sendKeys(hmap.get("NegotiatedPayRate"));
		DTbillrate.sendKeys(hmap.get("DTBillrate"));
		DTPayrate.clear();
		DTPayrate.click();
		DTPayrate.sendKeys(hmap.get("NegotiatedPayRate"));
		try {
			wait.until(ExpectedConditions.visibilityOf(TatoBR));
			TatoBR.sendKeys(hmap.get("TatoBR"));
		} catch (TimeoutException e) {
		}
		try {
			wait.until(ExpectedConditions.visibilityOf(TatoPR));
			TatoPR.sendKeys(hmap.get("TatoPR"));	
		} catch (TimeoutException e) {
		}

		joiningbonus.sendKeys(hmap.get("JoiningBonus"));
		lib.select(joiningdropdown,hmap.get("Joiningdropdown"));
		Thread.sleep(1000);	
		lib.select(perDiemdropdown,hmap.get("PerDiemDropdown"));
		Thread.sleep(1000);
		Perdiem.clear();
		Perdiem.sendKeys(hmap.get("perdiem"));
//		try {
//			WebElement MinGtdHrs = wait.until(ExpectedConditions.visibilityOf(MinGuarenteedHrs));
//			MinGtdHrs.sendKeys(hmap.get("MinGuarenteedHrs"));
//		} catch (TimeoutException e) {
//		}
//		try {
//			WebElement stdHours = wait.until(ExpectedConditions.visibilityOf(standardHrs));
//			stdHours.sendKeys(hmap.get("StndHrs"));
//		} catch (TimeoutException e) {
//		}
		Thread.sleep(1000);
		billingctMenu.click();
		billingcheckbox.click();
		Thread.sleep(1000);
		FirstName.sendKeys(hmap.get("BillingFirstName"));
		LastName.sendKeys(hmap.get("BillingLastName"));
		SaveButton.click();
		Thread.sleep(2000);
		lib.select(billingct,hmap.get("BillingCt"));
		Thread.sleep(2000);
		lib.select(Workerscomp,hmap.get("workerscomp"));
		Thread.sleep(1000);
		lib.select(clientpayterms,hmap.get("Clientpayterm"));
		Thread.sleep(1000);
		lib.select(Visatype,hmap.get("VisaType"));
		Thread.sleep(1000);
		lib.select(OnBoardingowner,hmap.get("onboardingowner"));
		Thread.sleep(1000);
		taxBtn.click();
		VMSref.sendKeys(hmap.get("VMSRef"));
		try {
			wait.until(ExpectedConditions.visibilityOf(Recipientdropdown));
			lib.select(Recipientdropdown,hmap.get("RepicientName"));
			split.sendKeys(hmap.get("split"));
			lib.select(BranchLoc,hmap.get("LocBranch"));
		} catch (TimeoutException e) {
		}
		SaveBtn.click();
		Thread.sleep(3000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys(hmap.get("ExceptionNotes"));
			SaveBtn.click();
		} catch (TimeoutException e) {
		}
	}

}


