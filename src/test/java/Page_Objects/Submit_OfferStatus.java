package Page_Objects;

import java.util.List;
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

public class Submit_OfferStatus {

	WebDriver driver;
	GenericLib lib;
	WebDriverWait wait;

	@FindBy(xpath="//a[@class='t-icon t-plus']")
	private WebElement clickicon;

	@FindBy(xpath="//*[@style='text-decoration:underline']")
	private WebElement Submitted;

	@FindBy(xpath="//*[@id='RequirementCandidateHistory_CandidateReqStatusID']")
	private WebElement Statuschange;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement savebtn;

	@FindBy(xpath="//*[@id='liEngagementAccept']")
	private WebElement PSN;

	@FindBy(xpath="//*[@onclick='clickOnFacilityAdd()']")
	private WebElement Facilitymenu;

	@FindBy(xpath="//*[@id='ClientFacility_FacilityName']")
	private WebElement AddFacility;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Savebtn;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_FacilityID']")
	private WebElement facdropdown;

	@FindBy(xpath="//*[@id='SubmissionPSN_SubmissionDate']")
	private WebElement Subdate;

	@FindBy(xpath="//*[@id='SubmissionPSN_OfferReceivedOn']")
	private WebElement offerRecDate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_EndDate']")
	private WebElement EndDate;

	@FindBy(xpath="//*[@id='SubmissionPSN_RecruiterID']")
	private WebElement PSNRecID;

	@FindBy(xpath="//*[@id='SubmissionPSN_TeamLeadID']")
	private WebElement PSNTeamID;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayrateTypeID']")
	private WebElement PayRateType;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_BillrateTypeID']")
	private WebElement BillRateType;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTPayRate']")
	private List<WebElement> OTpayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_HolidayPR']")
	private List<WebElement> Holidaypayrate;
	
	@FindBy(xpath="//*[@id='SubmissionPSN_TatoPR']")
	private List<WebElement> TatoPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OncallPR']")
	private List<WebElement> OncallPayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CallBackPR']")
	private  List<WebElement> callbackpayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ChargePR']")
	private List<WebElement> Chargepayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PerDiemTypeID']")
	private WebElement PerDiemType;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PerDiem']")
	private WebElement PerDiem;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_StandardHours']")
	private List<WebElement> ExpectedHours;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_MinGuarantHours']")
	private List<WebElement> GuaranteedHours;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OrientHours']")
	private List<WebElement> OrientationHours;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PaidOrientHours']")
	private List<WebElement> PaidorientationHours;

	@FindBy(xpath="//*[@id='Mobile']")
	private WebElement Mobile;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_NoofShifts']")
	private List<WebElement> NoofShifts;

	@FindBy(xpath="//*[@class='regular ImgbtnSave']")
	private WebElement save;

	@FindBy(xpath="//*[@id='ExceptionNotes']")
	private WebElement ExpNotes;

	public Submit_OfferStatus(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}


	public void Select_Candidate() {
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		clickicon.click();
		Submitted.click();
		lib.switchOutOfFrame();		
	}


	public void Update_OfferRequest(Map<String,String> hmap) throws InterruptedException {
		lib = new GenericLib(driver);
		Thread.sleep(2000);
		lib.select(Statuschange,hmap.get("StatusChangeTo"));
		savebtn.click();
	}


	
	public void Clinical_OfferAccept(Map<String,String> hmap) throws InterruptedException 
	{	
		Thread.sleep(1000);
		lib = new GenericLib(driver);
		lib.select(Statuschange,hmap.get("StatusChangeTo1"));
		PSN.click();
		Facilitymenu.click();
		Thread.sleep(1000);
		AddFacility.sendKeys(hmap.get("Facility"));
		Savebtn.click();
		Thread.sleep(2000);
		lib.select(facdropdown,hmap.get("facilitydropdown"));
		Subdate.click();
		Subdate.sendKeys(hmap.get("SubmissionDate"));
		Thread.sleep(1000);
		offerRecDate.click();
		offerRecDate.sendKeys(hmap.get("OfferReceivedOn"));
		Thread.sleep(1000);
		EndDate.click();
		EndDate.sendKeys(hmap.get("Enddate"));
		Thread.sleep(1000);
		lib.select(PSNRecID,hmap.get("Recruiter"));
		Thread.sleep(1000);
		lib.select(PSNTeamID,hmap.get("TeamLead"));
		try {
		    wait.until(ExpectedConditions.visibilityOf(PayRateType));
		    lib.select(PayRateType,hmap.get("PRType"));
		} catch (TimeoutException e) {}	
			
		List<WebElement> OTpr = OTpayrate;
		if (OTpr.size() > 0) {
			OTpr.get(0).click();
			OTpr.get(0).clear();
			OTpr.get(0).sendKeys(hmap.get("Otpr"));
		}
		List<WebElement> HolPR = Holidaypayrate;
		if (HolPR.size() > 0) {
			HolPR.get(0).clear();
			HolPR.get(0).sendKeys(hmap.get("Holidaypr"));
		}
		List<WebElement> TATOPR = TatoPayRate;
		if (TATOPR.size() > 0) {
			TATOPR.get(0).sendKeys(hmap.get("TatoPR"));
		}		
		List<WebElement> OncallPr = OncallPayrate;
		if (OncallPr.size() > 0) {
			OncallPr.get(0).clear();
			OncallPr.get(0).sendKeys(hmap.get("OncallPr"));
		}
		List<WebElement> callbackpr = callbackpayrate;
		if (callbackpr.size() > 0) {
			callbackpr.clear();
			callbackpr.get(0).sendKeys(hmap.get("callbackpr"));
		}
		List<WebElement> Chargepr = Chargepayrate;
		if (Chargepr.size() > 0) {
			Chargepr.get(0).clear();
			Chargepr.get(0).sendKeys(hmap.get("Chargepr"));
		}
		lib.select(PerDiemType,hmap.get("PerdiemType"));
		Thread.sleep(1000);
		PerDiem.sendKeys(hmap.get("Perdiem"));
		List<WebElement> ExpHrs = ExpectedHours;
		if (ExpHrs.size() > 0) {
			ExpHrs.get(0).clear();
			ExpHrs.get(0).sendKeys(hmap.get("ExpectedHrs"));
		}
		try {
		    wait.until(ExpectedConditions.visibilityOf(BillRateType));
		    lib.select(BillRateType,hmap.get("BRType"));
		} catch (TimeoutException e) {}	
			
		List<WebElement> GtdHrs = GuaranteedHours;
		if (GtdHrs.size() > 0) {
			GtdHrs.get(0).clear();
			GtdHrs.get(0).sendKeys(hmap.get("GuaranteedHrs"));
		}
		List<WebElement> OtnHours = OrientationHours;
		if (OtnHours.size() > 0) {
			OtnHours.get(0).clear();
			OtnHours.get(0).sendKeys(hmap.get("OrientationHrs"));
		}
		List<WebElement> PaidOtnHrs = PaidorientationHours;
		if (PaidOtnHrs.size() > 0) {
			PaidOtnHrs.get(0).clear();
			PaidOtnHrs.get(0).sendKeys(hmap.get("PaidorientationHrs"));
		}
		Thread.sleep(1000);
		List<WebElement> Shifts = NoofShifts;
		if (Shifts.size() > 0) {
			lib.select(Shifts.get(0),hmap.get("shifts"));
		}
		save.click();
		Thread.sleep(2000);
		try {
		    WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
		    exceptionNotes.sendKeys(hmap.get("ExceptionNotes"));
		    save.click();
		} catch (TimeoutException e) {
		}
	} 
}


