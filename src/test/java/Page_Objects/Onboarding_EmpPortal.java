package Page_Objects;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class Onboarding_EmpPortal {
	WebDriver driver;
	GenericLib lib;
	WebDriverWait wait;
	Properties  props;
	ReadPropertiesFile Readprop;
	
	@FindBy(xpath="//*[contains(text(),'Admin')]")
	private WebElement AdminBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='583']")
	private WebElement History;

	@FindBy(xpath="//*[@class='shm_link003' and @id='599']")
	private WebElement EmailHistory;

	@FindBy(xpath="//*[@id='txtToMail']")
	private WebElement ToEmail;

	@FindBy(xpath="//*[@id='ddlCategory']")
	private WebElement Category;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement Viewlogo;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]")
	private WebElement GetUserPwd;
	
	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]/div/font/a")
	private WebElement GetUsrPwdLink;
	
	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]/p/a")
	private WebElement GetUsrPwdLink1;
	
	@FindBy(xpath="//*[@id='UserName']")
	private WebElement UserName;

	@FindBy(xpath="//*[@id='Password']")
	private WebElement Password;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement Login;

	@FindBy(xpath="//*[@id='NewPassword']")
	private WebElement Newpwd;

	@FindBy(xpath="//*[@id='ConfirmPassword']")
	private WebElement Confirmpwd;

	@FindBy(xpath="//*[@id='btnContinue']")
	private WebElement Continue;
	
	@FindBy(xpath="//*[@class='text-button-continue']/a")
	private WebElement ContBtn;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_DoYouHaveSSN']")
	private WebElement SSNBtn;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_DOB']")
	private WebElement SSNDOB;
	
	@FindBy(xpath="//*[@name='SaveAndContinue']")
	private WebElement SaveandContinue;

	@FindBy(xpath="//*[@id='vm_SSNDetail_SSN']")
	private WebElement SSNnumber;

	@FindBy(xpath="//*[@id='vm_SSNDetail_ConfirmSSN']")
	private WebElement ConfirmSSN;

	@FindBy(xpath="//*[@id='vm_SSNDetail_MaritalStatusID']")
	private WebElement MaritalStatus;

	@FindBy(xpath="//*[@id='vm_SSNDetail_IhaveVerifiedMySSN']")
	private WebElement VerificationBtn;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_IhaveVerifiedMySIN']")
	private WebElement SINVerBtn;

	@FindBy(xpath="//*[@id='vm_AddressInfo_IsSamePhysical' and @value='True']")
	private WebElement MailingAddress;

	@FindBy(xpath="//*[@name='vm_EmergencyContact.FirstName']")
	private WebElement EmergencyFName;

	@FindBy(xpath="//*[@name='vm_EmergencyContact.LastName']")
	private WebElement EmergencyLName;

	@FindBy(xpath="//*[@name='vm_EmergencyContact.RelationshipID']")
	private WebElement Relationship;

	@FindBy(xpath="//*[@id='vm_EmergencyContact_MobilePhone']")
	private WebElement EmergencyMobileNo;

	@FindBy(xpath="//a[contains(text(),'Skip this step')]")
	private WebElement SkipstepBtn;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_PanCardNo']")
	private WebElement PanCardNumber;

	@FindBy(xpath="//*[@id='vm_SSNDetail_UANNo']")
	private WebElement UANNumber;

	@FindBy(xpath="//*[@id='vm_SSNDetail_IhaveVerifiedMyAadhar']")
	private WebElement Declarationcheckbox;

	@FindBy(xpath="//*[@class='regular ImgbtnAdd']")
	private WebElement AddEducation;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_SchoolOrCollegeName']")
	private WebElement InstituteName;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_UniversityID']")
	private WebElement University;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_DegreeID']")
	private WebElement Degree;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_StartPeriodMonth']")
	private WebElement InstituteStartMonth;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_StartPeriodYear']")
	private WebElement InstituteStartYear;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_EndPeriodMonth']")
	private WebElement InstituteEndMonth;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_EndPeriodYear']")
	private WebElement InstituteEndYear;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_City']")
	private WebElement InstituteCity;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_CountryID']")
	private WebElement InstituteCountry;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_StateID']")
	private WebElement collegeState;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_WereYouFullTime'][@value='True']")
	private WebElement fulltimeradioBtn;
	
	@FindBy(xpath="//*[@id='vm_CollegeInfo_DidYouGraduate'][@value='True']")
	private WebElement DidyouGraduate;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']/table[2]/tbody/tr/td/div/button[2]")
	private WebElement Save;
	
	@FindBy(xpath="//*[@id='vm_Agreement_DoYouAgreeAgreement'][@value='True']")
	private WebElement VmAgreement;

	@FindBy(xpath="//*[@id='vm_INDeposit_IsBankAccountAvailable' and @value='True']")
	private WebElement AxisBankAcc;
	
	@FindBy(xpath="//*[@id='vm_INDeposit_First_FinancialInstitution']")
	private WebElement BankName;
	
	@FindBy(xpath="//*[@id='vm_INDeposit_First_AccountNumber']")
	private WebElement AccountNumber;
	
	@FindBy(xpath="//*[@id='vm_INDeposit_First_RoutingNumber']")
	private WebElement RoutingNumber;
	
	@FindBy(xpath="//*[@id='vm_INDeposit_First_AccountTypeID']")
	private WebElement AxisAccountType;

	@FindBy(xpath="//*[@id='tblTwoCloums']//tbody/tr/td[2]/div/div/div")
	private WebElement SelectCheck;
	
	@FindBy(xpath="//*[@id='vm_EEOC_GenderID']")
	private WebElement Gender;

	@FindBy(xpath="//*[@id='vm_EEOC_RaceOrEthnicityID']")
	private WebElement Ethnicity;

	@FindBy(xpath="//*[@id='vm_VeteranStatus_ArmedForcesServiceMedal']")
	private WebElement VeteranStatus;
	
	@FindBy(xpath="//a[contains(text(),'Add Family')]")
	private WebElement AddFamily;
	
	@FindBy(xpath="//*[@id='vm_Dependent_DependentTypeID']")
	private WebElement Relation;
	
	@FindBy(xpath="//*[@id='vm_Dependent_FirstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//*[@id='vm_Dependent_LastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//*[@id='vm_Dependent_DateOfBirth']")
	private WebElement DOB;
	
	@FindBy(xpath="//*[@id='vm_Dependent_GenderID']")
	private WebElement GenderID;

	@FindBy(xpath="//*[@id='vm_BackgroundCheck_DoYouAgreeBackgroundCheck'][@value='True']")
	private WebElement Backgroundtest;

	@FindBy(xpath="//*[@id='vm_DrugTest_DoYouAgreeDrugTest'][@value='True']")
	private WebElement Drugtest;

	@FindBy(xpath="//*[@id='vm_OfferLetter_DoYouAcceptOfferLetter' and @value='True']")
	private WebElement offerletter;

	@FindBy(xpath="//*[@id='vm_RulesAndPolicies_HandBookIAgree' and @value='True']")
	private WebElement HandbookBtn;

	@FindBy(xpath="//*[@id='vm_RulesAndPolicies_PayrollScheduleIAgree' and @value='True']")
	private WebElement payrollbtn;
	
	@FindBy(xpath="//*[@name='vm_I9EligibilityInstructions.I9Eligibility'][@value='True']")
	private WebElement I9Eligibility;
	
	@FindBy(xpath="//*[@id='vm_I9Documents_ListAorBC'][@value='True']")
	private WebElement I9DocEntry;
	
	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1DocumentTypeID']")
	private WebElement DocTitle;
	
	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1IssuedBy']")
	private WebElement DocIssuedBy;

	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1DocumentNo']")
	private WebElement I9DocNo;

	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1ValidTillDate']")
	private WebElement ValidDate;

	@FindBy(xpath="//*[@id='tblListA']/tbody/tr[6]/td/table/tbody/tr/td[2]/div/div/div")
	private WebElement DocUpload;
	
	@FindBy(xpath="//*[@id='vm_W4Withholdings_MaritalStatusID']")
	private WebElement W4Maritalstatus;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_IAgreeAllowances']")
	private WebElement W4IAgreeCheckbox;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter1'][@value='1']")
	private WebElement fillingStatusradioBtn;
	
	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsYoueself']")
	private WebElement NJW4CheckBox;

	@FindBy(xpath="//*[@id='content']//table[1]/tbody/tr[2]/td[2]/input")
	private WebElement SWTotalNum;
	
	@FindBy(xpath="//*[@id='content']//table[1]/tbody/tr[3]/td[2]/input")
	private WebElement SWTotalNum1;
	
	@FindBy(xpath="//*[@id='content']//table[1]/tbody/tr[3]/td[2]/input")
	private WebElement SWAddAmount;
	
	@FindBy(xpath="//*[@id='content']//table[1]/tbody/tr[4]/td[2]/input")
	private WebElement SWAddAmount1;

	@FindBy(xpath="//*[@id='content']//table[4]/tbody/tr[1]/td[2]/input")
	private WebElement StateWMinnesota;
	
	@FindBy(xpath="//*[@id='content']//table[4]/tbody/tr[2]/td[2]/input")
	private WebElement StateWMinnesota1;
	
	@FindBy(xpath="//*[@id='vm_Deposit_NumberOfAccounts']")
	private WebElement NoofBankAcc;

	@FindBy(xpath="//*[@id='vm_Deposit_First_FinancialInstitution']")
	private WebElement FinancialInstitution;

	@FindBy(xpath="//*[@id='vm_Deposit_First_FinancialInstitution_Confirm']")
	private WebElement ConfirmFinancialInstitution;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountNumber']")
	private WebElement AccountNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountNumber_Confirm']")
	private WebElement ConfirmAccountNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_RoutingNumber']")
	private WebElement RoutingNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_RoutingNumber_Confirm']")
	private WebElement ConfirmRoutingNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountTypeID']")
	private WebElement AccountType;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountTypeID_Confirm']")
	private WebElement ConfirmAccountType;

	@FindBy(xpath="//*[@id='vm_Deposit_HasVoidedCheck' and @value='True']")
	private WebElement VoidedCheck;
	
	@FindBy(xpath="//*[@id='tblAcc1']//tbody/tr/td[2]/div/div/div")
	private WebElement FileUpload;
	
	@FindBy(xpath="//*[@id='vm_401K_Is401Selected'][@value='1']")
	private WebElement VmSelect;
	
	@FindBy(xpath="//*[@id='vm_401K_K401Amount']")
	private WebElement vmAmount;
	
	@FindBy(xpath="//*[@id='vm_401K_IsManagedAccount'][@value='1']")
	private WebElement VmManagedAcc;
	
	@FindBy(xpath="//*[@id='vm_MealAndRestBreak_DoYouAcceptMealAndRestBreak'][@value='True']")
	private WebElement MealandRest;
	
	@FindBy(xpath="//*[@id='vm_MealBreakWaiver_DoYouAcceptMealBreakWaiver'][@value='True']")
	private WebElement MealWaiver;

	@FindBy(xpath="//*[@id='IConfirm' and @value='True']")
	private WebElement ConfirmProcessBtn;

	@FindBy(xpath="//*[@id='vm_401K_Is401Selected'][@value='2']")
	private WebElement IsdeclinedBtn;

	@FindBy(xpath="//*[@name='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath="//*[@class='text-button-continue']")
	private WebElement ContinueBtn;
	
	@FindBy(xpath="//*[@id='contentAcceptance']//table[2]/tbody/tr[4]/td[2]/a")
	private WebElement SignForms;
	
	@FindBy(xpath="//*[@id='vm_ESignAgree_IAgree']")
	private WebElement ESignIAgree;

	@FindBy(xpath="//*[@id='vm_ESignAgree_UserName']")
	private WebElement EsignUserName;

	@FindBy(xpath="//*[@id='vm_ESignAgree_Password']")
	private WebElement EsignPwd;

	@FindBy(xpath="//*[@id='vm_ESignAgree_SSN']")
	private WebElement EsignSSN;

	@FindBy(xpath="//*[@name='btnSign']")
	private WebElement ClickToSign;

	@FindBy(xpath="//tbody/tr[2]/td[2]/button[1]")
	private WebElement ClickToSign1;

	@FindBy(xpath="//tbody/tr[3]/td[2]/button[1]")
	private WebElement ClickToSign2;

	@FindBy(xpath="//tbody/tr[4]/td[2]/button[1]")
	private WebElement ClickToSign3;

	@FindBy(xpath="//tbody/tr[5]/td[2]/button[1]")
	private WebElement ClickToSign4;

	@FindBy(xpath="//tbody/tr[6]/td[2]/button[1]")
	private WebElement ClickToSign5;

	@FindBy(xpath="//tbody/tr[7]/td[2]/button[1]")
	private WebElement ClickToSign6;

	@FindBy(xpath="//tbody/tr[8]/td[2]/button[1]")
	private WebElement ClickToSign7;
	
	@FindBy(xpath="//tbody/tr[9]/td[2]/button[1]")
	private WebElement ClickToSign8;
	
	@FindBy(xpath="//tbody/tr[10]/td[2]/button[1]")
	private WebElement ClickToSign9;

	@FindBy(xpath="//tbody/tr[11]/td[2]/button[1]")
	private WebElement ClickToSign10;
	
	@FindBy(xpath="//tbody/tr[12]/td[2]/button[1]")
	private WebElement ClickToSign11;
	
	@FindBy(xpath="//*[contains(text(),'Continue')]")
	private WebElement Cont;

	@FindBy(xpath="//*[@onclick='CPXWindow_Close(this);']")
	private WebElement close;

	@FindBy(xpath="//a[contains(text(),'Sign Off')]")
	private WebElement Signoff;
	
	@FindBy(xpath="//tbody/tr[2]/td[1]/a/img")
	private WebElement upload1;
	
	@FindBy(xpath="//tbody/tr[3]/td[1]/a/img")
	private WebElement upload2;
	
	@FindBy(xpath="//tbody/tr[4]/td[1]/a/img")
	private WebElement upload3;

	@FindBy(xpath="//tbody/tr[5]/td[1]/a/img")
	private WebElement upload4;

	@FindBy(xpath="//tbody/tr[6]/td[1]/a/img")
	private WebElement upload5;

	@FindBy(xpath="//tbody/tr[7]/td[1]/a/img")
	private WebElement upload6;

	@FindBy(xpath="//tbody/tr[8]/td[1]/a/img")
	private WebElement upload7;

	@FindBy(xpath="//tbody/tr[9]/td[1]/a/img")
	private WebElement upload8;

	@FindBy(xpath="//tbody/tr[10]/td[1]/a/img")
	private WebElement upload9;

	@FindBy(xpath="//tbody/tr[11]/td[1]/a/img")
	private WebElement upload10;

	@FindBy(xpath="//tbody/tr[12]/td[1]/a/img")
	private WebElement upload11;

	@FindBy(xpath="//tbody/tr[13]/td[1]/a/img")
	private WebElement upload12;

	@FindBy(xpath="//tbody/tr[14]/td[1]/a/img")
	private WebElement upload13;

	@FindBy(xpath="//tbody/tr[15]/td[1]/a/img")
	private WebElement upload14;

	@FindBy(xpath="//*[@id='cpxPopDiv1']//table/tbody/tr[3]/td[2]")
	private WebElement choosefile;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td/div/button[2]")
	private WebElement UploadBtn;

	public Onboarding_EmpPortal(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}

	public void EmpPortalLink_EmailHistory(Map<String,String> hmap) throws Exception {

		Thread.sleep(3000);
		AdminBtn.click();
		Thread.sleep(1000);
		History.click();
		EmailHistory.click();

		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(2000);
		ToEmail.click();
		ToEmail.sendKeys(hmap.get("Email"));
		Thread.sleep(1000);
		lib.select(Category,hmap.get("category"));
		SearchImg.click();
		Thread.sleep(2000);
		Viewlogo.click();
		lib.switchOutOfFrame();
	}

	public void EmpPor_OBProcess(Map<String,String> hmap) throws Exception
	{
		driver.switchTo().parentFrame();
		String str = GetUserPwd.getText();
		String un = str.split("User ID : ")[1].split("Password:")[0];
		String pwd = str.split("Password:")[1].substring(1,7);
		System.out.println(pwd);
		try {
		    wait.until(ExpectedConditions.visibilityOf(GetUsrPwdLink));
		    Actions a=new Actions(driver);
			a.keyDown(Keys.CONTROL).build().perform();
			GetUsrPwdLink.click();
			a.keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3000);
		} catch (TimeoutException e) {}		
		try {
		    wait.until(ExpectedConditions.visibilityOf(GetUsrPwdLink1));
		    Actions a=new Actions(driver);
			a.keyDown(Keys.CONTROL).build().perform();
			GetUsrPwdLink1.click();
			a.keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3000);
		} catch (TimeoutException e) {}
		
		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}}
		
		UserName.sendKeys(un);
		Password.sendKeys(pwd);
		Login.click();
		Thread.sleep(2000);
		lib = new GenericLib(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Newpwd.sendKeys(hmap.get("NewPassword"));
		Confirmpwd.sendKeys(hmap.get("ConfirmPassword"));
		Continue.click();
		Thread.sleep(1000);
		SSNDOB.click();
		SSNDOB.sendKeys(hmap.get("vm_DOB"));
		lib.select(MaritalStatus,hmap.get("Maritalstatus"));
		Thread.sleep(1000);
		SSNnumber.sendKeys(hmap.get("SSN"));
		ConfirmSSN.sendKeys(hmap.get("confirmSSN"));
		try {
		    wait.until(ExpectedConditions.visibilityOf(VerificationBtn));
		    VerificationBtn.click();
		} catch (TimeoutException e) {}
		try {
		    wait.until(ExpectedConditions.visibilityOf(SINVerBtn));
		    SINVerBtn.click();
		} catch (TimeoutException e) {}
		
		SaveandContinue.click();
		Thread.sleep(1000);
		MailingAddress.click();
		SaveandContinue.click();
		Thread.sleep(1000);
		EmergencyFName.sendKeys(hmap.get("FName"));
		EmergencyLName.sendKeys(hmap.get("LName"));
		lib.select(Relationship,hmap.get("Relationship"));
		Thread.sleep(1000);
		EmergencyMobileNo.click();
		EmergencyMobileNo.sendKeys(hmap.get("EmerMobileNo"));
		SaveandContinue.click();
		Thread.sleep(1000);
		AddEducation.click();
		Thread.sleep(2000);
		InstituteName.sendKeys(hmap.get("Institutename"));
		Thread.sleep(1000);
		lib.select(Degree,hmap.get("degree"));
		lib.select(InstituteStartMonth,hmap.get("InstituteStartmonth"));
		lib.select(InstituteStartYear,hmap.get("InstituteStartYear"));
		Thread.sleep(1000);
		lib.select(InstituteEndMonth,hmap.get("InstituteEndMonth"));
		lib.select(InstituteEndYear,hmap.get("InstituteEndYear"));
		Thread.sleep(1000);
		InstituteCity.sendKeys(hmap.get("InstituteCity"));
		Thread.sleep(1000);
		lib.select(InstituteCountry,hmap.get("InstituteCountry"));
		Thread.sleep(1000);
		lib.select(collegeState,hmap.get("collegeState"));
		Thread.sleep(1000);
		fulltimeradioBtn.click();
		DidyouGraduate.click();
		Save.click();	
		Thread.sleep(3000);
		ContBtn.click();
		try {
		    wait.until(ExpectedConditions.visibilityOf(SkipstepBtn));
		    SkipstepBtn.click();
		} catch (TimeoutException e) {
		}
		lib.select(Gender,hmap.get("gender"));
		lib.select(Ethnicity,hmap.get("ethnicity"));
		SaveandContinue.click();
		Thread.sleep(1000);
		lib.select(VeteranStatus,hmap.get("Veteranstatus"));
		SaveandContinue.click();
		Thread.sleep(1000);
		try {
		    WebElement Background = wait.until(ExpectedConditions.visibilityOf(Backgroundtest));
		    Background.click();
		    SaveandContinue.click();
		} catch (TimeoutException e) {
		}	
		try {
		    WebElement Drug = wait.until(ExpectedConditions.visibilityOf(Drugtest));
		    Drug.click();
			SaveandContinue.click();
		} catch (TimeoutException e) {
		}
		js.executeScript("arguments[0].scrollIntoView();", offerletter);
		Thread.sleep(1000);
		offerletter.click();
		SaveandContinue.click();
		Thread.sleep(1000);
		HandbookBtn.click();
		payrollbtn.click();
		Thread.sleep(1000);
		SaveandContinue.click();
		Thread.sleep(1000);
		try {
		    wait.until(ExpectedConditions.visibilityOf(I9Eligibility));
		    I9Eligibility.click();
		    SaveandContinue.click();
		} catch (TimeoutException e) {
		}	
		try {
		    wait.until(ExpectedConditions.visibilityOf(I9DocEntry));
		    I9DocEntry.click();
		    lib.select(DocTitle,hmap.get("DocumentTitle"));
		    DocIssuedBy.sendKeys(hmap.get("IssuedBy"));
		    I9DocNo.sendKeys(hmap.get("DocNo"));
		    ValidDate.click();
		    ValidDate.sendKeys(hmap.get("ExpDate"));
		    DocUpload.click();
		    Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
		    Thread.sleep(3000);
		    SaveandContinue.click();
		} catch (TimeoutException e) {
		}
		try {
		    wait.until(ExpectedConditions.visibilityOf(W4Maritalstatus));
		    lib.select(W4Maritalstatus,hmap.get("W4Maritalstatus"));
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView();", W4IAgreeCheckbox);
			W4IAgreeCheckbox.click();
			SaveandContinue.click();
		} catch (TimeoutException e) {
		}
		try {
		    wait.until(ExpectedConditions.visibilityOf(SWTotalNum));
		    SWTotalNum.sendKeys(hmap.get("SWTotal"));
		    js.executeScript("arguments[0].style.display='block';", SWAddAmount);
		    wait.until(ExpectedConditions.visibilityOf(SWAddAmount));
		    SWAddAmount.sendKeys(hmap.get("SWAddAmt"));
		    js.executeScript("arguments[0].style.display='none';", SWAddAmount);
			Thread.sleep(1000);
			SaveandContinue.click();
		} catch (TimeoutException e) {}
		try {
		    wait.until(ExpectedConditions.visibilityOf(fillingStatusradioBtn));
		    fillingStatusradioBtn.click();
		    Thread.sleep(1000);
			NJW4CheckBox.click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			SaveandContinue.click();
			} catch (TimeoutException e) {
		}
		try {
		    wait.until(ExpectedConditions.visibilityOf(fillingStatusradioBtn));
		    fillingStatusradioBtn.click();
		    Thread.sleep(2000);
		    StateWMinnesota.sendKeys(hmap.get("SWTotal"));
		    StateWMinnesota1.sendKeys(hmap.get("SWAddAmt"));
			Thread.sleep(2000);
			SaveandContinue.click();
		} catch (TimeoutException e) {
		}
		
		Thread.sleep(1500);
		js.executeScript("arguments[0].scrollIntoView();", NoofBankAcc);
		lib.select(NoofBankAcc,hmap.get("BankAccounts"));
		FinancialInstitution.sendKeys(hmap.get("financialInstitution"));
		ConfirmFinancialInstitution.sendKeys(hmap.get("ConfirmfinancialInstitution"));
		AccountNo.sendKeys(hmap.get("AccountNo"));
		Thread.sleep(1000);
		ConfirmAccountNo.sendKeys(hmap.get("ConfirmAccountNo"));
		RoutingNo.sendKeys(hmap.get("RoutingNo"));
		ConfirmRoutingNo.sendKeys(hmap.get("ConfRoutingNo"));
		lib.select(AccountType,hmap.get("AccType"));
		lib.select(ConfirmAccountType,hmap.get("ConfAccType"));
		VoidedCheck.click();
		FileUpload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		SaveandContinue.click();
		try {
			wait.until(ExpectedConditions.visibilityOf(VmSelect));
			VmSelect.click();
			vmAmount.sendKeys(hmap.get("VmAmount"));
			VmManagedAcc.click();
			SaveandContinue.click();
			}catch(TimeoutException e) {}
		try {
			wait.until(ExpectedConditions.visibilityOf(MealandRest));
			MealandRest.click();
			SaveandContinue.click();
			Thread.sleep(1000);
			}catch(TimeoutException e) {}		
		try {
			wait.until(ExpectedConditions.visibilityOf(MealWaiver));
			MealWaiver.click();
			SaveandContinue.click();
			Thread.sleep(1000);
			}catch(TimeoutException e) {}
		try {
		wait.until(ExpectedConditions.visibilityOf(SaveandContinue));
		SaveandContinue.click();
		Thread.sleep(1000);
		}catch(TimeoutException e) {}
		js.executeScript("arguments[0].scrollIntoView();", ConfirmProcessBtn);
		ConfirmProcessBtn.click();
		Thread.sleep(1000);
		submitBtn.click();
		Thread.sleep(2000);
		
		SignForms.click();
		Thread.sleep(2000);
		ESignIAgree.click();
		EsignUserName.sendKeys(hmap.get("EsignEmail"));
		EsignPwd.sendKeys(hmap.get("EsignNewPassword"));
		EsignSSN.click();
		EsignSSN.sendKeys(hmap.get("EsignSSN"));
		ClickToSign.click();
		Thread.sleep(2000);
		ClickToSign1.click();
		Thread.sleep(2000);
		ClickToSign2.click();
		Thread.sleep(2000);
		ClickToSign3.click();
		Thread.sleep(2000);
		try {
		    wait.until(ExpectedConditions.visibilityOf(ClickToSign4));
		    ClickToSign4.click();
		} catch (TimeoutException e) {
		}Thread.sleep(2000);
		try {
		    wait.until(ExpectedConditions.visibilityOf(ClickToSign5));
		    ClickToSign5.click();
		} catch (TimeoutException e) {
		}
		Thread.sleep(2000);
		try {
		    wait.until(ExpectedConditions.visibilityOf(ClickToSign6));
		    ClickToSign6.click();
		} catch (TimeoutException e) {
		}
		Thread.sleep(2000);
		try {
		    wait.until(ExpectedConditions.visibilityOf(ClickToSign7));
		    ClickToSign7.click();
		} catch (TimeoutException e) {
		}
		Thread.sleep(2000);
		try {
		    wait.until(ExpectedConditions.visibilityOf(ClickToSign8));
		    ClickToSign8.click();
		} catch (TimeoutException e) {
		}
		Thread.sleep(1500);
		try {
		    wait.until(ExpectedConditions.visibilityOf(Cont));
		    Cont.click();
		} catch (TimeoutException e) {
		}
		Signoff.click();
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentWindow);
		close.click();
	}

	
	public void IndiaInstanceClinicalEmpPor_LoginProcess(Map<String,String> hmap) throws Exception {

		driver.switchTo().parentFrame();
		String str = GetUserPwd.getText();
		System.out.println(str);
		String un = str.split("User ID : ")[1].split("Password:")[0];
		String pwd = str.split("Password:")[1].trim();
		pwd =pwd.split("T")[0];
		System.out.println(un+"=="+pwd);
		Thread.sleep(2000);

		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		GetUsrPwdLink.click();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);

		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		UserName.sendKeys(un);
		Thread.sleep(1000);
		Password.sendKeys(pwd);
		Thread.sleep(1000);
		Login.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Continue);
		Continue.click();
		Thread.sleep(2000);
    	driver.navigate().back();
    	driver.navigate().back();
		Thread.sleep(2000);
		UserName.clear();
		UserName.sendKeys(un);
		Password.sendKeys(pwd);
		Login.click();
		Thread.sleep(2000);
		Newpwd.sendKeys(hmap.get("NewPassword"));
		Confirmpwd.sendKeys(hmap.get("ConfirmPassword"));
		Continue.click();
		Thread.sleep(3000);

		PanCardNumber.sendKeys(hmap.get("PanCard"));
		UANNumber.sendKeys(hmap.get("UANNumber"));
		lib = new GenericLib(driver);
		lib.select(MaritalStatus,hmap.get("Maritalstatus"));
		Declarationcheckbox.click();
		Thread.sleep(2000);
		SaveandContinue.click();
		Thread.sleep(1000);

		MailingAddress.click();
		SaveandContinue.click();
		Thread.sleep(1000);

		EmergencyFName.sendKeys(hmap.get("FName"));
		EmergencyLName.sendKeys(hmap.get("LName"));
		lib.select(Relationship,hmap.get("Relationship"));
		EmergencyMobileNo.click();
		EmergencyMobileNo.sendKeys(hmap.get("EmerMobileNo"));
		Thread.sleep(2000);
		SaveandContinue.click();
		Thread.sleep(1000);

		AddEducation.click();
		Thread.sleep(2000);
		InstituteName.sendKeys(hmap.get("Institutename"));
		Thread.sleep(1000);
		lib.select(University,hmap.get("university"));
		Thread.sleep(1000);
		lib.select(Degree,hmap.get("degree"));
		lib.select(InstituteStartMonth,hmap.get("InstituteStartmonth"));
		lib.select(InstituteStartYear,hmap.get("InstituteStartYear"));
		Thread.sleep(1000);
		lib.select(InstituteEndMonth,hmap.get("InstituteEndMonth"));
		lib.select(InstituteEndYear,hmap.get("InstituteEndYear"));
		Thread.sleep(1000);
		InstituteCity.sendKeys(hmap.get("InstituteCity"));
		Thread.sleep(1000);
		lib.select(InstituteCountry,hmap.get("InstituteCountry"));
		Thread.sleep(1000);
		lib.select(collegeState,hmap.get("collegeState"));
		Thread.sleep(1000);
		fulltimeradioBtn.click();
		Save.click();
		Thread.sleep(4000);
		
		ContinueBtn.click();
		Thread.sleep(2000);
	
		VmAgreement.click();
		SaveandContinue.click();
		Thread.sleep(2000);

		HandbookBtn.click();
		payrollbtn.click();
		Thread.sleep(1000);
		SaveandContinue.click();
		Thread.sleep(1000);
		
		AxisBankAcc.click();
		BankName.sendKeys(hmap.get("BankName"));
		Thread.sleep(1000);
		AccountNumber.sendKeys(hmap.get("AccountNo"));
		RoutingNumber.sendKeys(hmap.get("IFSCCode")); 
		Thread.sleep(1000);
		lib.select(AxisAccountType,hmap.get("AccountType"));
		SelectCheck.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		SaveandContinue.click();
		Thread.sleep(1000);
		
		AddFamily.click();
		Thread.sleep(1000);
		lib.select(Relation,hmap.get("RelationType")); 
		FirstName.sendKeys(hmap.get("FirstName"));
		LastName.sendKeys(hmap.get("LastName"));
		DOB.click();
		DOB.sendKeys(hmap.get("DateofBirth"));
		lib.select(GenderID,hmap.get("Gender")); 
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(4000);
		ContinueBtn.click();
		ContinueBtn.click();
		
		js.executeScript("arguments[0].scrollIntoView();", ConfirmProcessBtn);
		ConfirmProcessBtn.click();
		ContinueBtn.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		upload1.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload2.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath2"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload3.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload4.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload5.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath2"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload6.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload7.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload8.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath2"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload9.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload10.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload11.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath2"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload12.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload13.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		upload14.click();
		Thread.sleep(3000);
		choosefile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath2"));
		Thread.sleep(3000);
		UploadBtn.click();
		Thread.sleep(2000);
		Signoff.click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindow);
		close.click();

	}

}

