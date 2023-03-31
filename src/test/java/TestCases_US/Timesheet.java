package TestCases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.TSReg_StateandFederalLaw;


@Listeners(ITestListenerClass.class)
public class Timesheet extends BaseClass{

	BaseClass base;
	ExcelTestData ExcelTestdata;
	TSReg_StateandFederalLaw RegularTS;

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void RegularTimeSheet(String testData) throws Exception
	{
		RegularTS=new TSReg_StateandFederalLaw(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		RegularTS.Reg_Timesheet(hmap);		
	    RegularTS.Reg_SaveInvoice(hmap);
	    RegularTS.RegInvoice_Approval(hmap);
	}
}
