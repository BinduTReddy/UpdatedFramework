package Page_Objects;

import java.io.*;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class New_Client {
	WebDriver driver;
	GenericLib lib;
	Properties  props;
	ReadPropertiesFile Readprop;
	
	//click on client
	@FindBy(xpath = "//*[@id='2']")
	private WebElement client;

	@FindBy(xpath = "//*[@id='4']")
	private WebElement Newclient;

	//New Client	
	@FindBy(xpath = "//input[@id='Client_ClientName']")
	private WebElement C_Name;
	
	@FindBy(xpath="//*[@id='Client_GSTNo']")
	private List<WebElement> C_GST;
	
	@FindBy(xpath="//*[@id='Client_PANCardNo']")
	private List<WebElement> C_PanCardNo;

	@FindBy(xpath = "//input[@id='Client_Address1']")
	private WebElement C_Add;

	@FindBy(xpath = "//*[@id='Client_City']")
	private WebElement C_city;

	@FindBy(xpath = "//*[@id='Client_CountryID']")
	private WebElement C_country;

	@FindBy(xpath = "//*[@id='Client_StateID']")
	private WebElement C_State;

	@FindBy(xpath = "//*[@id='Client_ZipCode']")
	private WebElement C_zipcode;
	
	@FindBy(xpath="//*[@id='Client_Website']")
	private List<WebElement> C_Website;

	@FindBy(xpath = "//*[@id='Client_StatusID']")
	private WebElement C_Status;

	@FindBy(xpath="//*[@id='Client_TimesheetFrequencyID']")
	private WebElement C_TSFrequency;
	
	@FindBy(xpath = "//*[@id='Client_TimesheetTemplateID']")
	private WebElement C_Timesheet;

	@FindBy(xpath="//*[@id='Client_TimesheetTypeID']")
	private WebElement C_TimesheetType;
	
	@FindBy(xpath = "//*[@id='Client_AccountManagerID']")
	private WebElement AccountManager;

	@FindBy(xpath="//*[@id='Client_SalesManagerID']")
	private WebElement SalesManager;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement C_MSADoc;

	@FindBy(xpath = "//*[@id='Client_InvoiceFlagID']")
	private WebElement c_invoiceflag;

	@FindBy(xpath = "//*[@id='Client_InvoiceFrequencyID']")
	private WebElement c_invoicefrequency;

	@FindBy(xpath = "//*[@id='Client_InvoiceMethodID']")
	private WebElement c_invoicemethod;

	@FindBy(xpath = "//*[@id='Client_InvoiceAttentionTo']")
	private WebElement c_invoiceAttentionTo;

	@FindBy(xpath = "//*[@id='Client_InvoiceEmailID']")
	private WebElement c_invoiceEmailTo;

	@FindBy(xpath="//*[@id='Client_ApplyTaxOnInvoice'][@value='True']")
	private List<WebElement> TaxInvoice;
	
	@FindBy(xpath="//*[@id='Client_RatesIncludeTax'][@value='True']")
	private List<WebElement> RatesincTax;
	
	@FindBy(xpath = "//*[@id='Client_PaymentTerm']")
	private WebElement c_PaymentTerms;

	@FindBy(xpath = "//*[@id='BusinessTypesIDList']")
	private WebElement c_BusinessType;

	@FindBy(xpath="//*[@id='tabStripNewClientDetails']/ul/li[2]/a")
	private WebElement AdditionalDetails;

	@FindBy(xpath="//*[@id='VerticalTypesIDList']")
	private WebElement VerticalList;

	@FindBy(xpath="//*[@id='Client_IsBackgroundCheckRequired'][@value='True']")
	private List<WebElement> BackgroundCheck;

	@FindBy(xpath="//*[@id='Client_IsDrugCheckRequired'][@value='True']")
	private List<WebElement> DrugCheck;

	@FindBy(xpath = "//*[@class='regular ImgbtnSave']")
	private WebElement c_savebtn;

	//client Approval
	@FindBy(xpath = "//*[@class='shm_link001' and @id='150']")
	private WebElement MgmtBtn;

	@FindBy(xpath = "//*[@class='shm_link002' and @id='468']")
	private WebElement Workflowmenu;

	@FindBy(xpath = "//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

	@FindBy(xpath = "//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;
	
	@FindBy(xpath="/html/body/ul[1]/li/a")
	private WebElement Clientpopup;

	@FindBy(xpath = "//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath = "//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;

	public New_Client(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}
	 
	public void Client(Map<String, String> hmap) throws Exception {
		lib = new GenericLib(driver);
		Thread.sleep(2000);
		client.click();
		Thread.sleep(1000);
		Newclient.click();
		Thread.sleep(1000);
		C_Name.sendKeys(hmap.get("Clientname"));
		List<WebElement> GST = C_GST;
		if (GST.size() > 0) {
			GST.get(0).sendKeys(hmap.get("ClientGST"));
		}
		List<WebElement> Pancard = C_PanCardNo;
		if (Pancard.size() > 0) {
			Pancard.get(0).sendKeys(hmap.get("ClientGST"));
		}
		C_Add.sendKeys(hmap.get("Clientadd"));
		C_city.sendKeys(hmap.get("ClientCity"));
		lib.select(C_country, hmap.get("ClientCountry"));
		Thread.sleep(1000);
		lib.select(C_State, hmap.get("Clientstate"));
		Thread.sleep(1000);
		C_zipcode.sendKeys(hmap.get("ClientzipCode"));
		List<WebElement> website = C_Website;
		if (website.size() > 0) {
			website.get(0).sendKeys(hmap.get("Website"));
		}
		lib.select(C_Status, hmap.get("Clientstatus"));
		Thread.sleep(1000);
		lib.select(C_TSFrequency,hmap.get("ClientTSFreq"));
		lib.select(C_Timesheet, hmap.get("ClientTimesheet"));
		Thread.sleep(1000);
		lib.select(C_TimesheetType,hmap.get("ClientTimesheetType"));
		Thread.sleep(1000);
		lib.select(AccountManager,hmap.get("Accountmanager")); 
//		lib.select(SalesManager,hmap.get("Salesmanager"));
		Thread.sleep(1000);
		C_MSADoc.click();
		Thread.sleep(1500);
        Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		lib.select(c_invoiceflag, hmap.get("ClientinvoiceflagType"));
		Thread.sleep(1000);
		lib.select(c_invoicefrequency, hmap.get("Clientinvoicefreq"));
		Thread.sleep(1000);
		lib.select(c_invoicemethod, hmap.get("Clientinvoicemethod"));
		Thread.sleep(1000);
		c_invoiceAttentionTo.clear();
		c_invoiceAttentionTo.sendKeys(hmap.get("ClientinvoiceAttention"));
		c_invoiceEmailTo.sendKeys(hmap.get("ClientinvoiceEMail"));
		Thread.sleep(1000);
		lib.select(c_PaymentTerms, hmap.get("Clientpaymentterms"));
		Thread.sleep(1000);
		List<WebElement> TaxInv = TaxInvoice;
		if (TaxInv.size() > 0) {
			TaxInv.get(0).click();
		}
		List<WebElement> IncTax = RatesincTax;
		if (IncTax.size() > 0) {
			IncTax.get(0).click();
		}
		lib.select(c_BusinessType,hmap.get("CBusinessType"));
		Thread.sleep(1000);
		lib.select(c_BusinessType,hmap.get("CBusinessType1"));
		Thread.sleep(1000);
		AdditionalDetails.click();
		WebElement List1 = VerticalList;
		Select multi1 = new Select(List1);
		multi1.selectByIndex(0);
		Thread.sleep(1000);
		multi1.selectByIndex(4);
		Thread.sleep(1000);
		multi1.selectByIndex(5);
		Thread.sleep(1000);
		multi1.selectByIndex(7);
		Thread.sleep(1000);
		List<WebElement> BGV = BackgroundCheck;
		if (BGV.size() > 0) {
			BGV.get(0).click();
		}
		List<WebElement> Drug = DrugCheck;
		if (Drug.size() > 0) {
			Drug.get(0).click();
		}
		Thread.sleep(1000);
		c_savebtn.click();
		Thread.sleep(1000);
	}



	
	
	public void ClientApproval(Map<String, String> hmap) throws InterruptedException {

		Thread.sleep(4000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		Thread.sleep(2000);
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("Clientname"));
		Thread.sleep(1000);
		Clientpopup.click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(2000);
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(1000);
	}
}
