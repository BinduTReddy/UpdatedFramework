package TestCases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Edit_Payrate_PerDiem;
import Page_Objects.Login_Page;
import Page_Objects.Timesheet_BiWeekly;


@Listeners(ITestListenerClass.class)
public class PerDiem_BiWeekly_Scenerios extends BaseClass{
	Login_Page LoginPage;
	Edit_Payrate_PerDiem PayRate;
	Timesheet_BiWeekly RegularTS;

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Multi_PR_No_PD_change_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test23");
		PayRate.Edit_payRate(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void PD_change_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test24");
		PayRate.Edit_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_NotComp_StndHrs_Hourly(String testData) throws Exception 
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test25");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_Comp_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test26");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test27");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_MoreThanShifts_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test28");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test29");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_WorkedMorethan_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test30");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test31");
		PayRate.NonClinical_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_BiweeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Multi_PR_No_PD_change_Weekly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test32");
		PayRate.Edit_payRate(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void PD_change_Weekly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test33");
		PayRate.Edit_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_NotComp_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test34");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_Comp_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test35");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test36");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_MoreThanShifts_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test37");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test38");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_WorkedMorethan_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test39");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_Weekly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test40");
		PayRate.NonClinical_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_BiweeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Multi_PR_No_PD_change_PerDay(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test41");
		PayRate.NonCli_MulPayRate(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_BiweeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void PD_change_PerDay(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test42");
		PayRate.NonCli_MultiPerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_BiweeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_PerDay(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test43");
		PayRate.NonClinical_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_BiweeklyRegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void UnApprovedTS(String testData) throws Exception
	{
		RegularTS=new Timesheet_BiWeekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test44");
		RegularTS.Clinical_BIWeeklyRegTimesheet(hmap);
		RegularTS.CloseTimesheet();
	}
}
