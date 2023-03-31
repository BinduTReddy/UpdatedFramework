package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class OnBoardingStatus_OnBoardingModule {

	WebDriver driver;
	GenericLib lib;
	WebDriverWait wait;
	Properties  props;
	ReadPropertiesFile Readprop;

	@FindBy(xpath="//*[@class='shm_link001' and @id='380']")
	private WebElement OnBoarding;

	@FindBy(xpath="//*[@class='shm_link002 shm_highLight_2Tier' and @id='381']")
	private WebElement Dashboard;

	@FindBy(xpath="//*[@id='txtCandidateName']")
	private WebElement CandName;

	@FindBy(xpath="//html/body/ul[1]/li/a")
	private WebElement CandPopup;
	
	@FindBy(xpath="//*[@id='txtClientName']")
	private WebElement ClientName;

	@FindBy(xpath="//html/body/ul[2]/li/a")
	private WebElement ClientPopup;
	
	@FindBy(xpath="//*[@class=' ImgbtnView  img']")
	private WebElement viewlogo;

	@FindBy(xpath="//a[contains(text(),'Edit')]")
	private WebElement EditBtn;

	@FindBy(xpath="//tbody/tr[3]/td[2]/div[1]/div[1]/div[1]")
	private WebElement PurchaseBtn;

	@FindBy(xpath="//tbody/tr[4]/td[2]/div[1]/div[1]/div[1]")
	private WebElement WorksheetBtn;

	@FindBy(xpath="//tbody/tr[5]/td[2]/div[1]/div[1]/div[1]")
	private WebElement EVeifyBtn;

	@FindBy(xpath="//tbody/tr[6]/td[2]/div[1]/div[1]/div[1]")
	private WebElement ProofofAdd;

	@FindBy(xpath="//tbody/tr[7]/td[2]/div[1]/div[1]/div[1]")
	private WebElement Orientation;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']/div[3]/table[2]/tbody/tr[3]/td[3]/div/a/img")
	private WebElement BackGroundCheck;

	@FindBy(xpath="//*[@id='OB_BackgroundCheck_StatusID']")
	private WebElement BackgroundStatus;

	@FindBy(xpath="//*[@id='tabOBDashboard']/div[3]/table[3]/tbody/tr[3]/td[3]/div/a/img")
	private WebElement Drugtest;

	@FindBy(xpath="//*[@id='OB_DrugTest_StatusID']")
	private WebElement Drugteststatus;

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[2]/a")
	private  WebElement Summaraytab;

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[1]/a")
	private WebElement Dashboardtab;

	@FindBy(xpath="//*[@id='tdOBStepsApproval']/a/img")
	private WebElement OnboardingstepreviewBtn;

	@FindBy(xpath="//button[contains(text(),'Verified')]")
	private WebElement VerifiedBtn;

	@FindBy(xpath="//input[@id='VerifyDoc']")
	private WebElement VerifySignature;

	@FindBy(xpath="//button[contains(text(),'Approve')]")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[3]/td[5]/a/img")
	private WebElement FirstAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[3]/td[1]/a/img")
	private WebElement FirstUploadDocBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[4]/td[5]/a/img")
	private WebElement SecondAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[4]/td[1]/a/img")
	private WebElement SecondUploadDocBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[5]/td[5]/a/img")
	private WebElement ThirdAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[5]/td[1]/a/img")
	private WebElement ThirdUploadDocBtn;
	
	@FindBy(xpath="//*[@class='t-widget t-upload']/div/div")
	private WebElement fileUpload;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[6]/td[5]/a/img")
	private WebElement FourthAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[6]/td[1]/a/img")
	private WebElement FourthUploadDocBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[7]/td[5]/a/img")
	private WebElement FifthAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[7]/td[1]/a/img")
	private WebElement FifthUploadDocBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[8]/td[5]/a/img")
	private WebElement SixthAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[8]/td[1]/a/img")
	private WebElement SixthUploadDocBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[9]/td[5]/a/img")
	private WebElement SevenAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[9]/td[1]/a/img")
	private WebElement SevenUploadDocBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[10]/td[5]/a/img")
	private WebElement EightAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[10]/td[1]/a/img")
	private WebElement EightUploadDocBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[11]/td[5]/a/img")
	private WebElement NineAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[11]/td[1]/a/img")
	private WebElement NineUploadDocBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[12]/td[5]/a/img")
	private WebElement TenAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[12]/td[1]/a/img")
	private WebElement TenUploadDocBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[13]/td[5]/a/img")
	private WebElement ElevenAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[13]/td[1]/a/img")
	private WebElement ElevenUploadDocBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[14]/td[5]/a/img")
	private WebElement TwelveAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[14]/td[1]/a/img")
	private WebElement TwelveUploadDocBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[15]/td[5]/a/img")
	private WebElement ThirteenAppRejBtn;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[15]/td[1]/a/img")
	private WebElement ThirteenUploadDocBtn;

	@FindBy(xpath="//a[@id='aOB_VerifyCompleted']")
	private WebElement ReviewCompleted;
	
	@FindBy(xpath="//tbody/tr[3]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn1;
	
	@FindBy(xpath="//tbody/tr[4]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn2;
	
	@FindBy(xpath="//tbody/tr[5]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn3;
	
	@FindBy(xpath="//tbody/tr[6]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn4;
	
	@FindBy(xpath="//tbody/tr[7]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn5;
	
	@FindBy(xpath="//tbody/tr[8]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn6;
	
	@FindBy(xpath="//tbody/tr[9]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn7;
	
	@FindBy(xpath="//tbody/tr[10]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn8;
	
	@FindBy(xpath="//tbody/tr[11]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn9;
	
	@FindBy(xpath="//tbody/tr[12]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn10;
	
	@FindBy(xpath="//tbody/tr[13]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn11;
	
	@FindBy(xpath="//tbody/tr[14]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn12;
	
	@FindBy(xpath="//tbody/tr[15]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn13;
	
	@FindBy(xpath="//tbody/tr[16]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn14;
	
	@FindBy(xpath="//tbody/tr[17]/td[5]/div[1]/a[1]/img[1]")
	private WebElement ChangeBtn15;
	
	@FindBy(xpath="//*[@id='aOB_IsForceable']")
	private WebElement Forcecomplete;
	
	public OnBoardingStatus_OnBoardingModule(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}


	public void OnBoarding_NewEmp(Map<String,String> hmap) throws Exception{
		Thread.sleep(3000);
		OnBoarding.click();
		Thread.sleep(1000);
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(6000);
		CandName.sendKeys(hmap.get("EmpName"));
		CandPopup.click();
		Thread.sleep(2000);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		viewlogo.click();
		lib.switchOutOfFrame();
		Thread.sleep(4000);		
		EditBtn.click();
		Thread.sleep(3000);
		PurchaseBtn.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2000);
		WorksheetBtn.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(2000);
		EVeifyBtn.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2000);
		ProofofAdd.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(2000);
		try {
			wait.until(ExpectedConditions.visibilityOf(Orientation));
			Orientation.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath"));
			Thread.sleep(2000);
		} catch (TimeoutException e) {}
		SaveBtn.click();
		Thread.sleep(2000);
		Summaraytab.click();
		Thread.sleep(2000);
		Dashboardtab.click();
		Thread.sleep(2000);
		try {
			wait.until(ExpectedConditions.visibilityOf(BackGroundCheck));
			BackGroundCheck.click();
			lib.select(BackgroundStatus,hmap.get("BackGroundStatus"));
			SaveBtn.click();
		} catch (TimeoutException e) {}
		try {
			wait.until(ExpectedConditions.visibilityOf(Drugtest));
			Drugtest.click();
			lib.select(Drugteststatus,hmap.get("DrugStatus"));
			SaveBtn.click();
		} catch (TimeoutException e) {}
		
		OnboardingstepreviewBtn.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", VerifiedBtn);
		VerifiedBtn.click();	
		Thread.sleep(2000);
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(FirstUploadDocBtn));
			FirstUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(3000);
			FirstAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}		
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(SecondUploadDocBtn));
			SecondUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(3000);
			SecondAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}		
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(ThirdUploadDocBtn));
			ThirdUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(3000);
			ThirdAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}		
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(FourthUploadDocBtn));
			FourthUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			FourthAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}		
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(FifthUploadDocBtn));
			FifthUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			FifthAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}		
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(SixthUploadDocBtn));
			SixthUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			SixthAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}	
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(SevenUploadDocBtn));
			SevenUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			SevenAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}		
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(EightUploadDocBtn));
			EightUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			EightAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}		
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(NineUploadDocBtn));
			NineUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			NineAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}	
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(TenUploadDocBtn));
			TenUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			TenAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(ElevenUploadDocBtn));
			ElevenUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			ElevenAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(TwelveUploadDocBtn));
			TwelveUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			TwelveAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(ThirteenUploadDocBtn));
			ThirteenUploadDocBtn.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(2000);
			ThirteenAppRejBtn.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
		} catch (TimeoutException e) {}
		try {
			wait.until(ExpectedConditions.visibilityOf(ReviewCompleted));
			ReviewCompleted.click();
		}catch(TimeoutException e){}		

	}
	
	
	public void IndiaInstance_OnBoardnewemployee(Map<String,String> hmap) throws Exception{

		Thread.sleep(3000);
		OnBoarding.click();
		Thread.sleep(1000);
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(3000);
		CandName.sendKeys(hmap.get("candname"));
		CandPopup.click();
		Thread.sleep(1000);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientPopup.click();
		ClientName.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		viewlogo.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);

		EditBtn.click();
		Thread.sleep(4000);
		PurchaseBtn.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2000);
		WorksheetBtn.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(2000);
		SaveBtn.click();
		Thread.sleep(2000);
		Summaraytab.click();
		Thread.sleep(3000);
		Dashboardtab.click();
		Thread.sleep(2000);
		
		OnboardingstepreviewBtn.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", VerifiedBtn);
		VerifiedBtn.click();
		Thread.sleep(3000);

		ChangeBtn1.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn2.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn3.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn4.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn5.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", ChangeBtn6);
		ChangeBtn6.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn7.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn8.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn9.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn10.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn11.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn12.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn13.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn14.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		ChangeBtn15.click();
		Thread.sleep(1000);
		VerifySignature.click();
		ApproveBtn.click();
		Thread.sleep(1000);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", Forcecomplete);
		Forcecomplete.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
}