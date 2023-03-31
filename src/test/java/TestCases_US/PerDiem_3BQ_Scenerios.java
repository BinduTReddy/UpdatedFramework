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
public class PerDiem_3BQ_Scenerios extends BaseClass{
	Login_Page LoginPage;
	Edit_Payrate_PerDiem PayRate;
	Timesheet_Weekly RegularTS;

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Multi_PR_No_PD_change_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test1");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test2");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test3");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_Comp_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test4");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test5");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_MoreThanShifts_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test6");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test7");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_WorkedMorethan_StndHrs_Hourly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test8");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_Hourly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test9");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test10");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test11");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test12");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_Comp_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test13");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test14");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_MoreThanShifts_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test15");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NotComp_Shifts_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test16");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Comp_Shifts_WorkedMorethan_StndHrs_Weekly(String testData) throws Exception
	{
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test17");
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
		RegularTS.Reg_TSReport(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NonClinicalTS_PD_Weekly(String testData) throws Exception
	{
		PayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test18");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test19");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test20");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test21");
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
		Map<String,String> hmap = ExcelTestData.readDataToMap("Test22");
		RegularTS.NonClinical_RegTimesheet(hmap);
		RegularTS.CloseTimesheet();
	}
}
