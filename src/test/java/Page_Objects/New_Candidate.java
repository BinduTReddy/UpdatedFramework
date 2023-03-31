package Page_Objects;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class New_Candidate {
	WebDriver driver;
	GenericLib lib;
	Properties  props;
	ReadPropertiesFile Readprop;
	
	@FindBy(xpath="//a[@class='t-icon t-plus']")
	private WebElement clickonicon;

	@FindBy(xpath = "(//td[@style='width:6%']//a)[1]")
	private WebElement clickonid;

	@FindBy(xpath="//span[contains(text(),'Submit a New Candidate')]")
	private WebElement subnewcand;

	@FindBy(xpath="//*[@id='Candidate_Contact_FirstName']")
	private WebElement FirstName;

	@FindBy(xpath="//*[@id='Candidate_Contact_LastName']")
	private WebElement LastName;

	@FindBy(xpath="//*[@id='Candidate_Contact_EmailID']")
	private WebElement Emailid;

	@FindBy(xpath="//*[@id='Candidate_Contact_Mobile']")
	private WebElement MobileNo;

	@FindBy(xpath="//*[@id='Candidate_Contact_Address1']")
	private WebElement Address;

	@FindBy(xpath="//*[@id='Candidate_Contact_City']")
	private WebElement City;

	@FindBy(xpath="//*[@id='Candidate_Contact_StateID']")
	private WebElement state;

	@FindBy(xpath="//*[@id='Candidate_Contact_ZipCode']")
	private WebElement pincode;

	@FindBy(xpath="//*[@id='Candidate_Contact_CountryID']")
	private WebElement country;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement Resumefile;

	@FindBy(xpath="//*[@id='CandidateResume_ResumeText']")
	private List<WebElement> ResText;
	
	@FindBy(xpath="//*[@id='Candidate_JobPortalID']")
	private WebElement ResSource;

	@FindBy(xpath="//*[@id='Candidate_EducationID']")
	private WebElement Education;
	
	@FindBy(xpath="//*[@id='Candidate_TotalExperience']")
	private WebElement TotalExperience;
	
	@FindBy(xpath="//*[@id='btnCandSaveAndSubmit']")
	private WebElement savesubmit;
	
	@FindBy(xpath="//*[@id='AadharNumber']")
	private WebElement AadharNumber;
	
	@FindBy(xpath="//*[@id='DOB']")
	private WebElement DOB;

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

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CategoryID']")
	private WebElement EmpType;
	
	@FindBy(xpath="//*[@id='SubmissionPSN_OBClassificationID']")
	private WebElement ObJobClassification;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ShiftScheduleID']")
	private WebElement shift;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ProbationPeriodID']")
	private WebElement ProbationPeriod;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_NoticePeriod']")
	private WebElement NoticePeriod;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayrateTypeID']")
	private WebElement PayRateID;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayRate']")
	private WebElement payRate;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTPayRate']")
	private WebElement OtPayRate;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_BillrateTypeID']")
	private WebElement BillRateID;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTBillrate']")
	private WebElement OtBillRate;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayJoiningID']")
	private WebElement PayJoiningList;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_TravelBonus']")
	private WebElement JoiningBonus;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']/table/tbody/tr/td/div/button[2]")
	private WebElement Save;
	
	@FindBy(xpath="//*[@id='jjmenu_main']/span/div[2]/span/span/span[2]")
	private WebElement subexistingcand;

	@FindBy(xpath="//*[@id='AutoCompleteFirstName']")
	private WebElement CandFirstName;

	@FindBy(xpath="//*[@id='AutoCompleteLastName']")
	private WebElement CandLastName;

	@FindBy(xpath="/html/body/ul[1]/li[1]/a")
	private WebElement Autopopupfirstname;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchimgBtn;

	@FindBy(xpath="//*[@id='grdCandReqSearchList']/table/tbody/tr/td/div[1]")
	private WebElement ViewBtn;

	public New_Candidate(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}

	public void Add_NewCandidate(Map<String,String> hmap) throws Exception {

		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickonicon);
		clickonicon.click();	
		js.executeScript("arguments[0].click();", clickonid);
		js.executeScript("arguments[0].click();", clickonid);	
		Thread.sleep(2000);
		subnewcand.click();
		Thread.sleep(4000);
		lib.switchOutOfFrame();
		Thread.sleep(8000);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(FirstName));
		FirstName.sendKeys(hmap.get("Firstname"));
		Thread.sleep(1000);
		LastName.sendKeys(hmap.get("Lastname"));
		Thread.sleep(1000);
		Emailid.sendKeys(hmap.get("Email"));
		Thread.sleep(1000);
		MobileNo.click();
		Thread.sleep(1000);
		MobileNo.sendKeys(hmap.get("MobileNum"));
		Thread.sleep(1000);
		Address.sendKeys(hmap.get("address"));
		Thread.sleep(1000);
		City.sendKeys(hmap.get("CityName"));
		Thread.sleep(1000);
		lib.select(state,hmap.get("stateName"));
		Thread.sleep(1000);
		pincode.sendKeys(hmap.get("Pincode"));
		lib.select(country,hmap.get("Countryname"));
		lib.select(ResSource,hmap.get("Resumesource"));
		Thread.sleep(1000);
		lib.select(Education,hmap.get("Education"));
		Thread.sleep(1000);
		lib.select(TotalExperience,hmap.get("TotalExp"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Resumefile);
		Thread.sleep(1000);
		Resumefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);  
		List<WebElement> ResTxt = ResText;
		if (ResTxt.size() > 0) {
			ResTxt.get(0).sendKeys(hmap.get("ResumeText"));
		}
		Thread.sleep(1000);
		savesubmit.click();
	}

	public void Select_ExistingCandidate(Map<String,String> hmap) throws Exception {
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickonicon);
		clickonicon.click();	
		js.executeScript("arguments[0].click();", clickonid);
		js.executeScript("arguments[0].click();", clickonid);	
		Thread.sleep(1000);
		subexistingcand.click();
		lib.switchOutOfFrame();
		CandFirstName.sendKeys(hmap.get("Firstname"));
		Autopopupfirstname.click();
		Thread.sleep(1000);
		CandLastName.sendKeys(hmap.get("Lastname"));
		CandLastName.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		SearchimgBtn.click();
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(2000);		
	}

	public void India_SubmitNewCandidate(Map<String,String> hmap) throws Exception {

		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		AadharNumber.click();
		AadharNumber.sendKeys(hmap.get("AadharNumber"));
		Thread.sleep(1000);
		DOB.click();
		DOB.sendKeys(hmap.get("DateOfBirth"));
		Thread.sleep(1000);
		Subdate.click();
		Subdate.sendKeys(hmap.get("SubmissionDate"));
		offerRecDate.click();
		offerRecDate.sendKeys(hmap.get("OfferReceivedOn"));
		Thread.sleep(1000);
		EndDate.click();
		EndDate.sendKeys(hmap.get("Enddate"));
		Thread.sleep(1000);
		lib.select(PSNTeamID,hmap.get("TeamLead"));
		Thread.sleep(1000);
		lib.select(PSNRecID,hmap.get("Recruiter"));
		Thread.sleep(1000);
		lib.select(EmpType, hmap.get("EmpType"));
		Thread.sleep(1000);
		lib.select(ObJobClassification, hmap.get("OBJobClassification"));
		Thread.sleep(1000);
		lib.select(shift,hmap.get("Shift"));
		Thread.sleep(1000);
		lib.select(ProbationPeriod,hmap.get("Probation"));
		Thread.sleep(1000);
		NoticePeriod.click();
		NoticePeriod.sendKeys(hmap.get("NP"));
		Thread.sleep(1000);
		lib.select(BillRateID,hmap.get("BillRateType"));
		Thread.sleep(1000);
		OtBillRate.sendKeys(hmap.get("OTBillRate"));
		Thread.sleep(1000);
		lib.select(PayRateID,hmap.get("PayRateType"));
		Thread.sleep(1000);
		payRate.sendKeys(hmap.get("PayRate"));
		OtPayRate.sendKeys(hmap.get("OTPayRate"));
		Thread.sleep(1000);
		lib.select(PayJoiningList,hmap.get("JoiningBonusOn"));
		JoiningBonus.click();
		JoiningBonus.sendKeys(hmap.get("JoiningBonus"));
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);
	}
	
}                       
