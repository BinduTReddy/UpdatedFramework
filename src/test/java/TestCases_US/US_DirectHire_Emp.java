package TestCases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Login_Page;
import Page_Objects.ManagerRecHR_Approval;
import Page_Objects.NewEmp_DirectHire;
import Page_Objects.New_Candidate;
import Page_Objects.New_Client;
import Page_Objects.New_Requirement;
import Page_Objects.SearchEmp_DirectHireModule;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Submit_OfferStatus;

@Listeners(ITestListenerClass.class)
public class US_DirectHire_Emp extends BaseClass{

	BaseClass base;
	ExcelTestData ExcelTestdata;

	Login_Page LoginPage;
	New_Client ClientPage;
	New_Requirement ReqPage;
	Search_RequirementType SearchReq;
	New_Candidate CandidatePage;
	Submit_CandidateandRequirement SubmitCandandReq;
	Submit_OfferStatus Submitstatus;
	ManagerRecHR_Approval ManagerRecHRApproval;
	NewEmp_DirectHire NewEmpDH;
	SearchEmp_DirectHireModule SearchEmpDH;

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewClient(String testData) throws Exception
	{
		ClientPage=new New_Client(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ClientPage.Client(hmap);
		ClientPage.ClientApproval(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewRequirement(String testData) throws Exception
	{
		ReqPage = new New_Requirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ReqPage.Create_NewRequirement(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SearchRequirement(String testData) throws Exception
	{
		SearchReq = new Search_RequirementType(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		SearchReq.Search_Requirement(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void AddNewCandidate(String testData) throws Exception
	{
		CandidatePage=new New_Candidate(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		CandidatePage.Add_NewCandidate(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SubmitCandAndReq(String testData) throws Exception
	{
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		SubmitCandandReq.Submit_Candidate(hmap);
		SubmitCandandReq.Submit_DirectHireRequirement(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferRequest(String testData) throws Exception
	{
		Submitstatus=new Submit_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		Submitstatus.Select_Candidate();
		Submitstatus.Update_OfferRequest(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferAccept(String testData) throws Exception
	{
		Submitstatus=new Submit_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		Submitstatus.Select_Candidate();
		Submitstatus.Clinical_OfferAccept(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Create_DirectHire(String testData) throws Exception
	{
		NewEmpDH=new NewEmp_DirectHire(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		NewEmpDH.Create_DirectHire(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void DirectHireApproval(String testData) throws Exception
	{
		ManagerRecHRApproval=new ManagerRecHR_Approval(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		NewEmpDH.DirectHireApproval(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OnBoarding_EmpPortal(String testData) throws Exception
	{
		SearchEmpDH=new SearchEmp_DirectHireModule(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		SearchEmpDH.SearchEmployee_DirectHireModule(hmap);
	}
	
	
}


