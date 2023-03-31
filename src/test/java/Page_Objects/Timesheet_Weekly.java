package Page_Objects;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class Timesheet_Weekly {
	WebDriver driver;
	GenericLib lib;
	Properties  props;
	ReadPropertiesFile Readprop;

	@FindBy(xpath="//*[@id='59'][@class='shm_link001']")
	private WebElement FinanceTab;

	@FindBy(xpath="//*[@id='shm_hmenu']/li[8]/ul/li[2]/a")
	private WebElement TimesheetTab;

	@FindBy(xpath="//*[@id='62'][@class='shm_link003']")
	private WebElement EnterTimesheet;

	@FindBy(xpath="//*[@id='ClientSearchBox']")
	private WebElement Clientname;

	@FindBy(xpath="//html/body/ul[1]/li/a")
	private WebElement Clientnamepopup;

	@FindBy(xpath="//*[@id='EmployeeSearchBox']")
	private WebElement EmpName;

	@FindBy(xpath="//html/body/ul[2]/li/a")
	private WebElement Empnamepopup;

	@FindBy(xpath="//*[@id='ddlEmployeeStatus']")
	private WebElement EmpStatus;

	@FindBy(xpath="//table/tbody/tr[2]/td[8]/a")
	private WebElement Searchimg;

	@FindBy(xpath="//*[@id='grdProjectList']/table/tbody/tr/td[1]/a")
	private WebElement ViewBtn;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/fieldset/div/a")
	private WebElement TimesheetBtn;

	@FindBy(xpath="//*[@id='TSTable']//table/tbody/tr/td/table/tbody/tr[1]/td/div/a[2]")
	private WebElement FillHours;

	@FindBy(xpath="//*[@id='TSTable']//table/tbody/tr[2]/td[2]/div/div/div")
	private WebElement TimesheetAttachment;

	@FindBy(xpath="//*[@id='IsApproved'][@value='False']")
	private WebElement Unapproved;

	@FindBy(xpath="//*[contains(text(),'Un Approved')]")
	private WebElement UnapprovedLink;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']/table/tbody/tr[6]/td/div/button[2]")
	private WebElement ApproveButton;

	@FindBy(xpath="//*[@id='TSTable']//table[3]/tbody/tr/td/div/a[2]")
	private WebElement SaveBtn;

	@FindBy(xpath="/html/body/div[4]/div/a/span")
	private WebElement CloseButton;

	@FindBy(xpath="//*[@id='65'][@class='shm_link002']")
	private WebElement InvoiceTab;

	@FindBy(xpath="//*[@id='66'][@class='shm_link003']")
	private WebElement PendingInvoice;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']//tr/th[7]/div/span")
	private WebElement EmployeeFilter;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']/div[3]/div/input[1]")
	private WebElement SearchText;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']/div[3]/div/button[2]")
	private WebElement FilterIcon;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']/table/tbody/tr[2]/td[3]/a")
	private WebElement InvoiceViewBtn;

	@FindBy(xpath="//*[@name='Submit']")
	private WebElement save;

	@FindBy(xpath="//*[@class='shm_link001'][@id='150']")
	private WebElement Mgmt;

	@FindBy(xpath="//*[@class='shm_link002'][@id='468']")
	private WebElement workflows;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement SearchByword;

	@FindBy(xpath="//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;

	@FindBy(xpath="//*[@id='txtMgmtTask']")
	private WebElement TaskTo;

	@FindBy(xpath="//*[@id='tabMgmtInProgress']//table/tbody/tr/td[7]/a")
	private WebElement SearchBtn;

	@FindBy(xpath="//table/tbody/tr[1]/td[1]/a")
	private WebElement ImgView;

	@FindBy(xpath="//*[@id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[@class='shm_link002'][@id='72']")
	private WebElement ViewInvoice;

	@FindBy(xpath="//*[@id='grdInvoiceList']/table/tbody/tr/td[1]/a")
	private WebElement InvoiceView;

	@FindBy(xpath="//*[@id='cpxPopDiv1']//table[1]/tbody/tr[2]/td/a")
	private WebElement Invoicepdf;

	@FindBy(xpath="/html/body/div[11]/div[1]/a/span")
	private WebElement CrossBtn;

	@FindBy(xpath="//*[@id='cpxPopDiv1']//tbody/tr/td/div/button")
	private WebElement Close;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[2]/input")
	private WebElement Day1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[3]/input")
	private WebElement Day2;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[4]/input")
	private WebElement Day3;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[5]/input")
	private WebElement Day4;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[6]/input")
	private WebElement Day5;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[7]/input")
	private WebElement Day6;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[8]/input")
	private WebElement Day7;

	@FindBy(xpath="/html/body/div[6]/div[2]/div/form/table/tbody/tr[6]/td/table[1]/tbody/tr[3]/td[9]/div")
	private WebElement TotalCount;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[3]/input")
	private WebElement OT;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[5]/td[2]/input")
	private WebElement DT;

	@FindBy(xpath="//*[contains(text(),'Timesheet - Reports')]")
	private WebElement TSReport;

	@FindBy(xpath="//tbody/tr[5]/td/a")
	private WebElement HoursByDayPerDiem;

	@FindBy(xpath="//*[@id='PayRollCodeID']")
	private WebElement PayRollID;

	@FindBy(xpath="//*[@id='PayRollYearID']")
	private WebElement PayRollYear;

	@FindBy(xpath="//*[@id='CalenderID']")
	private WebElement PayRollCal;

	@FindBy(xpath="//table/tbody/tr/td[4]/a")
	private WebElement Search;

	@FindBy(xpath="//tbody[1]/tr[6]/td[3]/input[1]")
	private WebElement Holiday;
	
	@FindBy(xpath="//tbody[1]/tr[6]/td[6]/input[1]")
	private WebElement Holiday1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[7]/td[4]/input")
	private WebElement Sick;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[7]/td[7]/input")
	private WebElement Sick1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[8]/td[3]/input")
	private WebElement Timeoff;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[8]/td[6]/input")
	private WebElement Timeoff1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[11]/td[4]/input")
	private WebElement PTOPay;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[11]/td[7]/input")
	private WebElement PTOPay1;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[15]/td[4]/input")
	private WebElement TATO;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[15]/td[6]/input")
	private WebElement TATO1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[13]/td[3]/input")
	private WebElement Oncall;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[13]/td[6]/input")
	private WebElement Oncall1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[14]/td[5]/input")
	private WebElement Callback;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[14]/td[6]/input")
	private WebElement Callback1;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[15]/td[3]/input")
	private WebElement Charge;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[15]/td[6]/input")
	private WebElement Charge1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[18]/td[6]/input")
	private WebElement Orientation;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[18]/td[8]/input")
	private WebElement Orientation1;

	public Timesheet_Weekly(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}

	public void Clinical_RegTimesheet(Map<String,String> hmap) throws InterruptedException, IOException, ParseException{
		driver.navigate().refresh();
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		TimesheetTab.click();
		Thread.sleep(2500);
		EnterTimesheet.click();
		Thread.sleep(2000);
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpName.click();
		Clientname.sendKeys(hmap.get("Clientname"));
		//Clientnamepopup.click();
		EmpName.sendKeys(hmap.get("EmpName"));
		//Empnamepopup.click();
		lib.select(EmpStatus,hmap.get("Employeestatus"));
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(3000);
		lib.switchOutOfFrame();
		TimesheetBtn.click();
		Thread.sleep(5000);	

		WebElement dateElement = driver.findElement(By.xpath("//*[@id='lblDate1']"));
		String dateText = dateElement.getText();
		String[] DAY= dateText.split("\n");	
		String dayOfWeek = DAY[1].trim();
		System.out.println(dayOfWeek);
		
		if (dayOfWeek.equalsIgnoreCase("Monday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day3"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day5"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;

			Holiday.sendKeys(hmap.get("Holiday"));
			Sick.sendKeys(hmap.get("Sick"));
			Timeoff.sendKeys(hmap.get("Timeoff"));
			PTOPay.sendKeys(hmap.get("PtoPay"));
			Oncall.sendKeys(hmap.get("Oncall"));
			Callback.sendKeys(hmap.get("Callback"));
			Charge.sendKeys(hmap.get("Charge"));
			Orientation.sendKeys(hmap.get("Orientation"));
		}
		else if(dayOfWeek.equalsIgnoreCase("Thursday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Holiday1.sendKeys(hmap.get("Holiday"));
			Sick1.sendKeys(hmap.get("Sick"));
			Timeoff1.sendKeys(hmap.get("Timeoff"));
			PTOPay1.sendKeys(hmap.get("PtoPay"));
			Oncall1.sendKeys(hmap.get("Oncall"));
			Callback1.sendKeys(hmap.get("Callback"));
			Charge1.sendKeys(hmap.get("Charge"));
			Orientation.sendKeys(hmap.get("Orientation"));
		}
		else if(dayOfWeek.equalsIgnoreCase("Friday"))
			{
				Day1.sendKeys(hmap.get("Day1"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day4.sendKeys(hmap.get("Day2"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day5.sendKeys(hmap.get("Day3"));;
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
				Day6.sendKeys(hmap.get("Day4"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day7.sendKeys(hmap.get("Day5"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick1.sendKeys(hmap.get("Sick"));
				Timeoff1.sendKeys(hmap.get("Timeoff"));
				PTOPay1.sendKeys(hmap.get("PtoPay"));
				Oncall1.sendKeys(hmap.get("Oncall"));
				Callback.sendKeys(hmap.get("Callback"));
				Charge1.sendKeys(hmap.get("Charge"));
				Orientation.sendKeys(hmap.get("Orientation"));
			}
		
			else if(dayOfWeek.equalsIgnoreCase("Saturday"))
				{
					Day3.sendKeys(hmap.get("Day1"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day4.sendKeys(hmap.get("Day2"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day5.sendKeys(hmap.get("Day3"));;
					driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
					Day6.sendKeys(hmap.get("Day4"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day7.sendKeys(hmap.get("Day5"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Holiday1.sendKeys(hmap.get("Holiday"));
					Sick.sendKeys(hmap.get("Sick"));
					Timeoff1.sendKeys(hmap.get("Timeoff"));
					PTOPay.sendKeys(hmap.get("PtoPay"));
					Oncall1.sendKeys(hmap.get("Oncall"));
					Callback.sendKeys(hmap.get("Callback"));
					Charge1.sendKeys(hmap.get("Charge"));
					Orientation.sendKeys(hmap.get("Orientation"));
				}

				else if(dayOfWeek.equalsIgnoreCase("Sunday"))
					{
						Day2.sendKeys(hmap.get("Day1"));
						driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
						Day3.sendKeys(hmap.get("Day2"));
						driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
						Day4.sendKeys(hmap.get("Day3"));;
						driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
						Day5.sendKeys(hmap.get("Day4"));
						driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
						Day6.sendKeys(hmap.get("Day5"));
						driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
						Holiday.sendKeys(hmap.get("Holiday"));
						Sick.sendKeys(hmap.get("Sick"));
						Timeoff.sendKeys(hmap.get("Timeoff"));
						PTOPay.sendKeys(hmap.get("PtoPay"));
						Oncall.sendKeys(hmap.get("Oncall"));
						Callback.sendKeys(hmap.get("Callback"));
						Charge.sendKeys(hmap.get("Charge"));
						Orientation.sendKeys(hmap.get("Orientation"));
					}			
		Thread.sleep(2000);
		Unapproved.click();
		Thread.sleep(2000);
		TimesheetAttachment.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(4000);
		SaveBtn.click();
	}
	
	public void ApproveTimesheet() throws InterruptedException{
		Thread.sleep(7000);
		UnapprovedLink.click();
		Thread.sleep(2000);
		ApproveButton.click();
		Thread.sleep(4000);
		CloseButton.click();
	}

	public void CloseTimesheet() throws InterruptedException{
		Thread.sleep(4000);
		CloseButton.click();
	}
	
	public void NonClinical_RegTimesheet(Map<String,String> hmap) throws InterruptedException, IOException, ParseException{
		driver.navigate().refresh();
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(3000);
		TimesheetTab.click();
		Thread.sleep(4000);
		EnterTimesheet.click();
		Thread.sleep(3000);
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmpName.click();
		Clientname.sendKeys(hmap.get("Clientname"));
		//Clientnamepopup.click();
		EmpName.sendKeys(hmap.get("EmpName"));
		//Empnamepopup.click();
		lib.select(EmpStatus,hmap.get("Employeestatus"));
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(3000);
		lib.switchOutOfFrame();
		TimesheetBtn.click();
		Thread.sleep(5000);	

		WebElement dateElement = driver.findElement(By.xpath("//*[@id='lblDate1']"));
		String dateText = dateElement.getText();
		String[] DAY= dateText.split("\n");	
		String dayOfWeek = DAY[1].trim();
		System.out.println(dayOfWeek);
		
		if (dayOfWeek.equalsIgnoreCase("Monday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day3"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day5"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Holiday.sendKeys(hmap.get("Holiday"));
			Sick.sendKeys(hmap.get("Sick"));
			Timeoff.sendKeys(hmap.get("Timeoff"));
			PTOPay.sendKeys(hmap.get("PtoPay"));
			TATO.sendKeys(hmap.get("Tato"));
		}
		else if(dayOfWeek.equalsIgnoreCase("Thursday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Holiday1.sendKeys(hmap.get("Holiday"));
			Sick1.sendKeys(hmap.get("Sick"));
			Timeoff1.sendKeys(hmap.get("Timeoff"));
			PTOPay1.sendKeys(hmap.get("PtoPay"));
			TATO1.sendKeys(hmap.get("Tato"));
		}
		else if(dayOfWeek.equalsIgnoreCase("Friday"))
			{
				Day1.sendKeys(hmap.get("Day1"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day4.sendKeys(hmap.get("Day2"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day5.sendKeys(hmap.get("Day3"));;
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
				Day6.sendKeys(hmap.get("Day4"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day7.sendKeys(hmap.get("Day5"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick1.sendKeys(hmap.get("Sick"));
				Timeoff1.sendKeys(hmap.get("Timeoff"));
				PTOPay1.sendKeys(hmap.get("PtoPay"));
				TATO.sendKeys(hmap.get("Tato"));
			}
		
			else if(dayOfWeek.equalsIgnoreCase("Saturday"))
				{
					Day3.sendKeys(hmap.get("Day1"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day4.sendKeys(hmap.get("Day2"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day5.sendKeys(hmap.get("Day3"));;
					driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
					Day6.sendKeys(hmap.get("Day4"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day7.sendKeys(hmap.get("Day5"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Holiday1.sendKeys(hmap.get("Holiday"));
					Sick.sendKeys(hmap.get("Sick"));
					Timeoff1.sendKeys(hmap.get("Timeoff"));
					PTOPay.sendKeys(hmap.get("PtoPay"));
					TATO.sendKeys(hmap.get("Tato"));
				}

				else if(dayOfWeek.equalsIgnoreCase("Sunday"))
					{
					Day2.sendKeys(hmap.get("Day1"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day3.sendKeys(hmap.get("Day2"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day4.sendKeys(hmap.get("Day3"));;
					driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
					Day5.sendKeys(hmap.get("Day4"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Day6.sendKeys(hmap.get("Day5"));
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
					Holiday.sendKeys(hmap.get("Holiday"));
					Sick.sendKeys(hmap.get("Sick"));
					Timeoff.sendKeys(hmap.get("Timeoff"));
					PTOPay.sendKeys(hmap.get("PtoPay"));
					TATO.sendKeys(hmap.get("Tato"));
					}			
		Thread.sleep(2000);
		Unapproved.click();
		Thread.sleep(2000);
		TimesheetAttachment.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(4000);
		SaveBtn.click();
	}


	public void Reg_SaveInvoice(Map<String,String> hmap) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		InvoiceTab.click();
		Thread.sleep(2000);
		PendingInvoice.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		EmployeeFilter.click();
		Thread.sleep(1000);
		SearchText.sendKeys(hmap.get("EmpName"));
		FilterIcon.click();
		Thread.sleep(4000);
		InvoiceViewBtn.click();
		Thread.sleep(5000);
		lib.switchOutOfFrame();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", save);
		save.click();
	}

	public void RegInvoice_Approval(Map<String,String> hmap) throws InterruptedException, IOException{
		Thread.sleep(2000);
		Mgmt.click();
		Thread.sleep(2000);
		workflows.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		SearchByword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		TaskTo.sendKeys(hmap.get("TaskTo"));
		SearchBtn.click();
		Thread.sleep(3000);
		ImgView.click();
		lib.switchOutOfFrame();
		ApproveBtn.click();
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Close);
		Close.click();
	}

	public void Reg_TSReport(Map<String,String> hmap) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		TimesheetTab.click();
		Thread.sleep(2000);
		TSReport.click();		
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		driver.findElement(By.xpath("//*[@id='txtEmployeeSearch']")).click();
		HoursByDayPerDiem.click();
		Thread.sleep(2000);
		lib.select(PayRollID,hmap.get("PayrollId"));
		lib.select(PayRollYear,hmap.get("Payrollyear"));
		lib.select(PayRollCal,hmap.get("Payrollcalender"));
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(4000);

		WebElement scroll = driver.findElement(By.xpath("//*[@id='grdDynamicTSReport']/div/div[3]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		Thread.sleep(6000);
		lib.switchOutOfFrame();

	}	
}










