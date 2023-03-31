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
import Page_Objects.Timesheet_Weekly;


@Listeners(ITestListenerClass.class)
public class PerDiem_7FEC_Scenerios extends BaseClass{
	Login_Page LoginPage;
	Edit_Payrate_PerDiem PayRate;
	Timesheet_Weekly RegularTS;

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Multi_PR_No_PD_change_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test67");
		PayRate.Edit_payRate(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void PD_change_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test68");
		PayRate.Edit_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_NotComp_StndHrs_Hourly(String testData) throws Exception 
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test69");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_Comp_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test70");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test71");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_MoreThanShifts_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test72");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test73");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_WorkedMorethan_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test74");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test75");
		PayRate.NonClinical_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Multi_PR_No_PD_change_Weekly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test76");
		PayRate.Edit_payRate(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void PD_change_Weekly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test77");
		PayRate.Edit_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_NotComp_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test78");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_Comp_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test79");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test80");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_MoreThanShifts_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test81");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test82");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_WorkedMorethan_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test83");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_Weekly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test84");
		PayRate.NonClinical_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Multi_PR_No_PD_change_PerDay(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test85");
		PayRate.NonCli_MulPayRate(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void PD_change_PerDay(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test86");
		PayRate.NonCli_MultiPerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_PerDay(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test87");
		PayRate.NonClinical_PerDiem(hmap);
		PayRate.Finance_Approval(hmap);
		RegularTS.NonClinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void UnApprovedTS(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test88");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.CloseTimesheet();
	}
}
