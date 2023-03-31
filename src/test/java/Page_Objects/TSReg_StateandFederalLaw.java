package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base_Programs.ReadPropertiesFile;
import Reusable_Methods.GenericLib;

public class TSReg_StateandFederalLaw {
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

	@FindBy(xpath="/html/body/div[6]/div[2]/div/form/table/tbody/tr[6]/td/table[1]/tbody/tr[3]/td[9]/div")
	private WebElement TotalCount;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[3]/input")
	private WebElement OT;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[5]/td[2]/input")
	private WebElement DT;
	
	@FindBy(xpath="//*[contains(text(),'Timesheet_Weekly - Reports')]")
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

	public TSReg_StateandFederalLaw(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new ReadPropertiesFile();
		props = Readprop.getproperties();
	}

	public void Reg_Timesheet(Map<String,String> hmap) throws InterruptedException, IOException{
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
		Clientnamepopup.click();
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

		WebElement text=driver.findElement(By.xpath("//*[@id='TSTable']/tbody/tr[2]/td//table/tbody/tr[1]/td[4]"));
		String Location=text.getText();
		WebElement text1=driver.findElement(By.xpath("//*[@id='TSTable']/tbody/tr[2]/td//table/tbody/tr[5]/td[4]"));
		String workLocation=text1.getText();

		if (Location.equals("Non-Exempt") && workLocation.equals("California"))
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

			WebElement Total=Day1;
			WebElement Total1=Day2;
			WebElement Total2=Day3;
			WebElement TotalOt=OT;
			WebElement TotalDt=DT;
			String Count=Total.getAttribute("value");
			String Count1=Total1.getAttribute("value");
			String Count2=TotalOt.getAttribute("value");
			String Count3=TotalDt.getAttribute("value");
			String Count4=Total2.getAttribute("value");
			int numberDay1 = Integer.parseInt(Count);
			int numberDay2 = Integer.parseInt(Count1);
			int numberDay3 = Integer.parseInt(Count4);
			int numbercountOT = Integer.parseInt(Count2);
			int numbercountDT = Integer.parseInt(Count3);

			if(numberDay1<=8 && numberDay2<=8 && numberDay3<=8 && numbercountOT<=4 && numbercountDT<=12) {
				System.out.printf("Splitted successfully");}
			else {
				Assert.fail("Not Splitted successfully");}
		}

		else {
			if (Location.equals("Non-Exempt") && workLocation.equals("Virginia")||workLocation.equals("Alabama")||workLocation.equals("New Jersey")||workLocation.equals("Arizona")||
					workLocation.equals("Arkansas")||workLocation.equals("Connecticut")||workLocation.equals("Delaware")||workLocation.equals("Florida")||workLocation.equals("Georgia")||
					workLocation.equals("Hawaii")||workLocation.equals("Idaho")||workLocation.equals("Illinois")||workLocation.equals("Indiana")||workLocation.equals("Iowa")||
					workLocation.equals("Kansas")||workLocation.equals("Kentucky")||workLocation.equals("Louisiana")||workLocation.equals("Maine")||workLocation.equals("Maryland")||
					workLocation.equals("Massachusetts")||workLocation.equals("Michigan")||workLocation.equals("Minnesota")||workLocation.equals("Mississippi")||workLocation.equals("Missouri")||
					workLocation.equals("Montana")||workLocation.equals("Nebraska")||workLocation.equals("New Hampshire")||workLocation.equals("New Mexico")||workLocation.equals("New York")||
					workLocation.equals("North Carolina")||workLocation.equals("North Dakota")||workLocation.equals("Ohio")||workLocation.equals("Oklahoma")||workLocation.equals("Oregon")||
					workLocation.equals("Pennsylvania")||workLocation.equals("Rhode Island")||workLocation.equals("South Carolina")||workLocation.equals("South Dakota")||workLocation.equals("Tennessee")||
					workLocation.equals("Texas")||workLocation.equals("Utah")||workLocation.equals("Vermont")||workLocation.equals("Virginia")||workLocation.equals("Washington")||
					workLocation.equals("West Virginia")||workLocation.equals("Wisconsin")||workLocation.equals("Wyoming"))
			{
				Day1.sendKeys(hmap.get("Day1"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day2.sendKeys(hmap.get("Day2"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day3.sendKeys(hmap.get("Day3"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day4.sendKeys(hmap.get("Day4"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
				Day5.sendKeys(hmap.get("Day5"));
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

				WebElement Total=Day1;
				WebElement Total1=Day2;
				WebElement TotalOt=OT;
				String Count=Total.getAttribute("value");
				String Count1=Total1.getAttribute("value");
				String Count2=TotalOt.getAttribute("value");
				int numberDay1 = Integer.parseInt(Count);
				int numberDay2 = Integer.parseInt(Count1);
				int numbercountOT = Integer.parseInt(Count2);

				if(numberDay1<=24 && numberDay2<=24 && numbercountOT<=24) {
					System.out.printf("Splitted successfully");}
				else {
					Assert.fail("Not Splitted successfully");}
			}
			else {
				if (Location.equals("Non-Exempt") && workLocation.equals("Alaska")||workLocation.equals("Nevada")||workLocation.equals("Puerto Rico"))
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

					WebElement Total=Day1;
					WebElement Total1=Day2;
					WebElement TotalOt=OT;
					String Count=Total.getAttribute("value");
					String Count1=Total1.getAttribute("value");
					String Count2=TotalOt.getAttribute("value");
					int numberDay1 = Integer.parseInt(Count);
					int numberDay2 = Integer.parseInt(Count1);
					int numbercountOT = Integer.parseInt(Count2);

					if(numberDay1<=8 && numberDay2<=8 && numbercountOT<=16) {
						System.out.printf("Splitted successfully");}
					else {
						Assert.fail("Not Splitted successfully");}
				}

				else {
					if (Location.equals("Non-Exempt") && workLocation.equals("Colorado"))
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

						WebElement Total=Day1;
						WebElement Total1=Day2;
						WebElement TotalOt=OT;
						String Count=Total.getAttribute("value");
						String Count1=Total1.getAttribute("value");
						String Count2=TotalOt.getAttribute("value");
						int numberDay1 = Integer.parseInt(Count);
						int numberDay2 = Integer.parseInt(Count1);
						int numbercountOT = Integer.parseInt(Count2);

						if(numberDay1<=12 && numberDay2<=12 && numbercountOT<=12) {
							System.out.printf("Splitted successfully");}
						else {
							Assert.fail("Not Splitted successfully");}
					}

					else {
						if (Location.equals("Exempt") && workLocation.equals("California")||workLocation.equals("Virginia")||workLocation.equals("Alabama")||workLocation.equals("New Jersey")||workLocation.equals("Arizona")||
								workLocation.equals("Arkansas")||workLocation.equals("Connecticut")||workLocation.equals("Delaware")||workLocation.equals("Florida")||workLocation.equals("Georgia")||
								workLocation.equals("Hawaii")||workLocation.equals("Idaho")||workLocation.equals("Illinois")||workLocation.equals("Indiana")||workLocation.equals("Iowa")||
								workLocation.equals("Kansas")||workLocation.equals("Kentucky")||workLocation.equals("Louisiana")||workLocation.equals("Maine")||workLocation.equals("Maryland")||
								workLocation.equals("Massachusetts")||workLocation.equals("Michigan")||workLocation.equals("Minnesota")||workLocation.equals("Mississippi")||workLocation.equals("Missouri")||
								workLocation.equals("Montana")||workLocation.equals("Nebraska")||workLocation.equals("New Hampshire")||workLocation.equals("New Mexico")||workLocation.equals("New York")||
								workLocation.equals("North Carolina")||workLocation.equals("North Dakota")||workLocation.equals("Ohio")||workLocation.equals("Oklahoma")||workLocation.equals("Oregon")||
								workLocation.equals("Pennsylvania")||workLocation.equals("Rhode Island")||workLocation.equals("South Carolina")||workLocation.equals("South Dakota")||workLocation.equals("Tennessee")||
								workLocation.equals("Texas")||workLocation.equals("Utah")||workLocation.equals("Vermont")||workLocation.equals("Virginia")||workLocation.equals("Washington")||
								workLocation.equals("West Virginia")||workLocation.equals("Wisconsin")||workLocation.equals("Wyoming")||workLocation.equals("Alaska")||workLocation.equals("Nevada")||
								workLocation.equals("Puerto Rico")|| workLocation.equals("Colorado")||workLocation.equals("D.C"))
						{
							Day1.sendKeys(hmap.get("Day1"));
							driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
							Day2.sendKeys(hmap.get("Day2"));
							driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
							Day3.sendKeys(hmap.get("Day3"));
							driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
							Day4.sendKeys(hmap.get("Day4"));
							driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
							Day5.sendKeys(hmap.get("Day5"));
							driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

							WebElement Total=Day1;
							WebElement Total1=Day2;
							WebElement Total2=Day3;
							WebElement Total3=Day4;
							WebElement Total4=Day5;
							String Count=Total.getAttribute("value");
							String Count1=Total1.getAttribute("value");
							String Count2=Total2.getAttribute("value");
							String Count3=Total3.getAttribute("value");
							String Count4=Total4.getAttribute("value");
							int numberDay1 = Integer.parseInt(Count);
							int numberDay2 = Integer.parseInt(Count1);
							int numberDay3 = Integer.parseInt(Count2);
							int numberDay4 = Integer.parseInt(Count3);
							int numberDay5 = Integer.parseInt(Count4);
							
							int TotalCount = numberDay1+numberDay2+numberDay3+numberDay4+numberDay5;
							
							if(TotalCount>40) {
								driver.switchTo().alert().accept();
								
							}
						}
					}
				}
			}
		}
		Thread.sleep(2000);
		Unapproved.click();
		Thread.sleep(2000);
		TimesheetAttachment.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(4000);
		SaveBtn.click();
		Thread.sleep(7000);
		UnapprovedLink.click();
		Thread.sleep(2000);
		ApproveButton.click();
		Thread.sleep(4000);
	    CloseButton.click();
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
		Thread.sleep(3000);
		TimesheetTab.click();
		Thread.sleep(3000);
		TSReport.click();		
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		driver.findElement(By.xpath("//*[@id='txtEmployeeSearch']")).click();
		HoursByDayPerDiem.click();
		Thread.sleep(3000);
		lib.select(PayRollID,hmap.get("PayrollId"));
		lib.select(PayRollYear,hmap.get("Payrollyear"));
		lib.select(PayRollCal,hmap.get("Payrollcalender"));
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(4000);
		
		WebElement scroll = driver.findElement(By.xpath("//*[@id='grdDynamicTSReport']/div/div[3]"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView()", scroll);
	    Thread.sleep(10000);
		lib.switchOutOfFrame();
		
	}	
}










