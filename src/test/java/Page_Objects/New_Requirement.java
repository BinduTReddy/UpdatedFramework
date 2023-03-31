package Page_Objects;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class New_Requirement {
	WebDriver driver;
	GenericLib lib;
	Properties  props;
	ReadPropertiesFile Readprop;
	
	//NavTo ReqPage
	@FindBy(xpath = "//*[text()='Sales']")
	private WebElement sales;

	@FindBy(xpath="//*[text()='Requirement']")
	private WebElement reqLink;

	@FindBy(xpath="//a[@href='#tabRequirement' and contains(text(),'Requirement')]")
	private WebElement reqLink2;

	@FindBy(xpath="//*[@class='regular ImgbtnAdd']")
	private WebElement newReqBtn;

	//ReqPage
	@FindBy(xpath="//*[@name='Requirement.RequirementTypeID'][1]")
	private WebElement ReqTypedropdown;

	@FindBy(xpath="//input[@name='ClientID_Display']")
	private List<WebElement> ClientName;

	@FindBy(xpath="//*[@class='ui-corner-all'][1]")
	private WebElement ClientNamedropdown;

	@FindBy(xpath="//*[@id='Requirement_RequirementCategoryID']")
	private WebElement ReqcategoryDropdown;

	@FindBy(xpath="//*[@name='Requirement.RequirementSubCategoryID']")
	private WebElement ReqsubcategoryDropdown;

	@FindBy(xpath="//*[@id='btnNewJobTitle']")
	private WebElement NewJobTitleBtn;

	@FindBy(xpath="//*[@id='JobTitle']")
	private WebElement JobTitle;

	@FindBy(xpath="//*[@id='Requirement_JobTitle']")
	private WebElement reqJobTitle;

	@FindBy(xpath="//body/ul[1]/li/a[1]")
	private WebElement reqJobTitledropdown;

	@FindBy(xpath="//*[@id='Requirement_RequirementNumber']")
	private List<WebElement> ClientReq;
	
	@FindBy(xpath="//*[@id='Requirement_NoOfPosition']")
	private WebElement NoPositions;

	@FindBy(xpath="//*[@id='Requirement_YearOfExp']")
	private WebElement YearsofExp;
	
	@FindBy(xpath="//*[@id='Requirement_ReceivedDate']")
	private WebElement RevOn;

	@FindBy(xpath="//*[@id='Requirement_EndDate']")
	private List<WebElement> SubEndDate;

	@FindBy(xpath="//*[@id='Requirement_DurationInYears']")
	private List<WebElement> DurationinYears;

	@FindBy(xpath="//*[@id='Requirement_DurationInMonths']")
	private List<WebElement> AssignmentDuration;

	@FindBy(xpath="//*[@id='Requirement_DurationInDays']")
	private List<WebElement> Durationindays;	

	@FindBy(xpath="//*[@id='Requirement_ProjectStartDate']")
	private WebElement EstStartDate;

	@FindBy(xpath="//*[@id='btnNewHiringContact']")
	private WebElement NewHiringManagerBtn;
	
	@FindBy(xpath="//*[@id='91'][@name='ContactTypeIDList']")
	private WebElement BillingCheckbox;
	
	@FindBy(xpath="//*[@name='ClientContact.Contact.FirstName']")
	private WebElement contactFirstName;
	
	@FindBy(xpath="//*[@name='ClientContact.Contact.LastName']")
	private WebElement ContactLastName;
	
	@FindBy(xpath="//*[@id='Requirement_HiringMgrContactID']")
	private WebElement HiringManager;
	
	@FindBy(xpath="//*[@id='Requirement_BillFrequencyID']")
	private WebElement Billratetype;

	@FindBy(xpath="//*[@id='Requirement_BillRate']")
	private List<WebElement> BillRatefrom;

	@FindBy(xpath="//*[@id='Requirement_BillRateTo']")
	private List<WebElement> BillRateTo;

	@FindBy(xpath="//*[@id='Requirement_PayFrequencyID']")
	private List<WebElement> Payratetype;

	@FindBy(xpath="//*[@id='Requirement_PayRate']")
	private List<WebElement> payRatefrom;

	@FindBy(xpath="//*[@id='Requirement_PayRateTo']")
	private List<WebElement> payRateTo;

	@FindBy(xpath="//*[@name='EmploymentTypeIDList'][1]")
	private List<WebElement> EmpType;

	@FindBy(xpath="//*[@id='btnAddWorkLocation']")
	private WebElement AddworkLoc;

	@FindBy(xpath="//*[@id='ClientLocation_LocationTypeID']")
	private WebElement LocTypeID;

	@FindBy(xpath="//*[@id='ClientLocation_LocationName']")
	private WebElement LocName;

	@FindBy(xpath="//*[@id='ClientLocation_Address_Address1']")
	private WebElement ClientAddress;

	@FindBy(xpath="//*[@id='ClientLocation_Address_City']")
	private WebElement Clientcity;

	@FindBy(xpath="//*[@id='ClientLocation_Address_CountryID']")
	private WebElement ClientCountry;

	@FindBy(xpath="//*[@id='ClientLocation_Address_StateID']")
	private WebElement Clientstate;

	@FindBy(xpath="//*[@id='ClientLocation_Address_ZipCode']")
	private WebElement ClientZipcode;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='Requirement_WorkLocationID']")
	private WebElement WorkLoc;

	@FindBy(xpath="//div[@class='t-button t-upload-button']")
	private List<WebElement> FileSelect;

	@FindBy(xpath="//*[@id='Requirement_LoadRecruiterBy']")
	private WebElement LoadRecruiter;
	
	@FindBy(xpath="//*[@id='btnLeadRecruiter']")
	private WebElement lookupRecBtn;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//table/tbody/tr[2]/td[3]/button[1]")
	private WebElement Selectone;

	@FindBy(xpath="//*[@id='Requirement_LeadRecruiterID']")
	private WebElement LeadRecID;

	@FindBy(xpath="//*[@id='btnClientToRecruiter']")
	private WebElement LookupClientRecBtn;

	@FindBy(xpath="//*[@id='Requirement_RecruiterID']")
	private List<WebElement> RecID;

	@FindBy(xpath="//select[@name='Requirement.SalesExecutiveID']")
	private List<WebElement> SalesManager;

	@FindBy(xpath="//*[@id='RequirementDetail_MandatorySkills']")
	private WebElement Mandatoryskills;

	@FindBy(xpath="//*[@class='regular ImgbtnSave']")
	private WebElement savebtn;

	@FindBy(xpath="//*[text()='New Requirement']")
	private WebElement newReqPage;


	public New_Requirement(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}

	public void Create_NewRequirement(Map<String,String> hmap) throws Exception{
		lib = new GenericLib(driver);
		Thread.sleep(4000);
		sales.click();
		reqLink.click();
		lib.handlingFrame("frmContent");
		reqLink2.click();
		newReqBtn.click();
		lib.switchOutOfFrame();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		lib.select(ReqTypedropdown, hmap.get("RequirementType"));
		List<WebElement> clientname = ClientName;
		if (clientname.size() > 0) {
			clientname.get(0).sendKeys(hmap.get("Clientname"));
			ClientNamedropdown.click();
		}	
		lib.select(ReqcategoryDropdown, hmap.get("Reqcategory"));
		lib.select(ReqsubcategoryDropdown, hmap.get("ReqSubcategory"));
		Thread.sleep(1000);
		List<WebElement> CReq = ClientReq;
		if (CReq.size() > 0) {
			CReq.get(0).sendKeys(hmap.get("ClientReqNo"));
		}	
		reqJobTitle.sendKeys(hmap.get("RequirementTitle"));
		Thread.sleep(1000);
		reqJobTitledropdown.click();
		Thread.sleep(1000);
		lib.select(YearsofExp,hmap.get("Experience"));
		RevOn.clear();
		Thread.sleep(1000);
		RevOn.click();
		RevOn.sendKeys(hmap.get("ReceivedOn"));
		List<WebElement> Enddate = SubEndDate;
		if (Enddate.size() > 0) {
			Enddate.get(0).click();
			Enddate.get(0).sendKeys(hmap.get("Subenddate"));
		}
		List<WebElement> DurYears = DurationinYears;
		if (DurYears.size() > 0) {
			DurYears.get(0).sendKeys(hmap.get("DurInYears"));
		}
		List<WebElement> DurMonths = AssignmentDuration;
		if (DurMonths.size() > 0) {
			DurMonths.get(0).sendKeys(hmap.get("DurInMonths"));
		}
		List<WebElement> DurDays = Durationindays;
		if (DurDays.size() > 0) {
			DurDays.get(0).sendKeys(hmap.get("DurIndays"));
		}	
		NoPositions.clear();
		NoPositions.sendKeys(hmap.get("Positions"));
		Thread.sleep(1000);
		EstStartDate.sendKeys(hmap.get("Eststartdate"));
		Thread.sleep(1000);
		NewHiringManagerBtn.click();
		Thread.sleep(2000);
		BillingCheckbox.click();
		contactFirstName.sendKeys(hmap.get("FirstName"));
		ContactLastName.sendKeys(hmap.get("LastName"));
		SaveBtn.click();
		Thread.sleep(2000);
		lib.select(HiringManager,hmap.get("Hiringmanager"));
		Thread.sleep(1000);
		lib.select(Billratetype,hmap.get("BillRateType"));
		Thread.sleep(1000);
		List<WebElement> BRFrom = BillRatefrom;
		if (BRFrom.size() > 0) {
			BRFrom.get(0).sendKeys(hmap.get("BillrateFrom"));
		}
		List<WebElement> BRTo = BillRateTo;
		if (BRTo.size() > 0) {
			BRTo.get(0).sendKeys(hmap.get("BillrateTo"));
		}
		List<WebElement> PayrateType = Payratetype;
		if (PayrateType.size() > 0) {
			PayrateType.get(0).sendKeys(hmap.get("PayRateType"));
		}
		List<WebElement> PRfrom = payRatefrom;
		if (PRfrom.size() > 0) {
			PRfrom.get(0).sendKeys(hmap.get("PayRateFrom"));
		}
		List<WebElement> PRTo = payRateTo;
		if (PRTo.size() > 0) {
			PRTo.get(0).sendKeys(hmap.get("PayRateTo"));
		}
		Thread.sleep(1000);
		List<WebElement> Emptype = EmpType;
		if (Emptype.size() > 0) {
			Emptype.get(0).click();
		}
		Thread.sleep(1000);
		AddworkLoc.click();
		Thread.sleep(1000);
		lib.select(LocTypeID,hmap.get("LocType"));
		Thread.sleep(1000);
		LocName.sendKeys(hmap.get("Locname"));
		ClientAddress.sendKeys(hmap.get("Add"));
		Clientcity.sendKeys(hmap.get("city"));
		lib.select(ClientCountry,hmap.get("country"));
		Thread.sleep(1000);
		lib.select(Clientstate,hmap.get("state"));
		Thread.sleep(1000);
		ClientZipcode.sendKeys(hmap.get("Zipcode"));
		SaveBtn.click();
		Thread.sleep(2000);
		lib.select(WorkLoc,hmap.get("Location"));
		Thread.sleep(1000);
		List<WebElement> File = FileSelect;
		if (File.size() > 0) {
			File.get(0).click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath"));
			Thread.sleep(4000);
		}
//		List<WebElement> SalesMan = SalesManager;
//		if (SalesMan.size() > 0) {
//				SalesMan.get(0).sendKeys(hmap.get("SalesManagerName"));
//		}
		lookupRecBtn.click();
		Thread.sleep(2000);
		WebElement List=driver.findElement(By.xpath("//*[@id='CustomFormcpxPopDiv2']//table/tbody/tr[2]/td[1]/select"));
		Select multi=new Select(List);
		multi.selectByIndex(0);
		multi.selectByIndex(1);
		multi.selectByIndex(2);
		multi.selectByIndex(3);
		multi.selectByIndex(4);
		multi.selectByIndex(5);
		multi.selectByIndex(6);
		multi.selectByIndex(7);
		Selectone.click();
		Thread.sleep(2000);
		SaveBtn.click();
		Thread.sleep(2000);
		lib.select(LeadRecID,hmap.get("LeadRecruiterName"));
		Thread.sleep(2000);	
		List<WebElement> Rec = RecID;
		if (Rec.size() > 0) {
			Rec.get(0).sendKeys(hmap.get("RecruiterName"));
		}
		Thread.sleep(1000);
		Mandatoryskills.clear();
		Mandatoryskills.sendKeys(hmap.get("MandatorySkills"));
		Thread.sleep(1000);
		savebtn.click();
		Thread.sleep(4000);
	}

	
}
