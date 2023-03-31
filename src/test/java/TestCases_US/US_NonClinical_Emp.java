package TestCases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.EmployeeView_EmpModule;
import Page_Objects.Initiatate_OnBoarding;
import Page_Objects.Login_Page;
import Page_Objects.ManagerRecHR_Approval;
import Page_Objects.NewEmp_DirectHire;
import Page_Objects.New_Candidate;
import Page_Objects.New_Client;
import Page_Objects.New_Requirement;
import Page_Objects.OnBoardingStatus_OnBoardingModule;
import Page_Objects.Onboarding_EmpPortal;
import Page_Objects.SearchEmp_DirectHireModule;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Submit_OfferStatus;

@Listeners(ITestListenerClass.class)
public class US_NonClinical_Emp extends BaseClass{

	BaseClass base;
	ExcelTestData ExcelTestdata;

	Login_Page LoginPage;
	New_Client ClientPage;
	New_Requirement ReqPage;
	Search_RequirementType SearchReq;
	New_Candidate CandidatePage;
	Submit_CandidateandRequirement SubmitCandandReq;
	Submit_OfferStatus Submitstatus;
	Initiatate_OnBoarding IntOnboarding;
	ManagerRecHR_Approval ManagerRecHRApproval;
	Onboarding_EmpPortal OnBoardingEmpPortal;
	OnBoardingStatus_OnBoardingModule EmpinOnBoardingModule;
	EmployeeView_EmpModule EmpModule;
	NewEmp_DirectHire NewEmpDH;
	SearchEmp_DirectHireModule SearchEmpDH;
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_NewEmp(String testData) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		ClientPage=new New_Client(driver);
		ReqPage = new New_Requirement(driver);
		SearchReq = new Search_RequirementType(driver);
		CandidatePage=new New_Candidate(driver);
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Submitstatus=new Submit_OfferStatus(driver);
		IntOnboarding=new Initiatate_OnBoarding(driver);
		ManagerRecHRApproval=new ManagerRecHR_Approval(driver);
		OnBoardingEmpPortal=new Onboarding_EmpPortal(driver);
		EmpinOnBoardingModule=new OnBoardingStatus_OnBoardingModule(driver);
		EmpModule=new EmployeeView_EmpModule(driver);

		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);

		ClientPage.Client(hmap);
		ClientPage.ClientApproval(hmap);	
		ReqPage.Create_NewRequirement(hmap);
		SearchReq.Search_Requirement(hmap);
		CandidatePage.Add_NewCandidate(hmap);
		SubmitCandandReq.Submit_Candidate(hmap);
		SubmitCandandReq.Submit_Requirement(hmap);
		Submitstatus.Select_Candidate();
		Submitstatus.Update_OfferRequest(hmap);
		Submitstatus.Select_Candidate();
		Submitstatus.Clinical_OfferAccept(hmap);
		IntOnboarding.InitiateOnboarding(hmap);
		ManagerRecHRApproval.Onboarding_RecManagerApproval(hmap);
		ManagerRecHRApproval.Onboarding_ManagerApproval(hmap);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
		ManagerRecHRApproval.HRPayroll_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
		EmpModule.Emp_EmpModule(hmap);
	}
}
	






















/*
	@Test(priority=0,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewClient(String testData) throws Exception
	{
		ClientPage=new New_Client(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ClientPage.Client(hmap);
		ClientPage.ClientApproval(hmap);
	}

	@Test(priority=1,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewRequirement(String testData) throws Exception
	{
		ReqPage = new New_Requirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ReqPage.Create_NewRequirement(hmap);
	}
	
	@Test(priority=2,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SearchRequirement(String testData) throws Exception
	{
		SearchReq = new Search_RequirementType(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		SearchReq.Search_Requirement(hmap);
	}
	
	@Test(priority=3,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void AddNewCandidate(String testData) throws Exception
	{
		CandidatePage=new New_Candidate(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		CandidatePage.Add_NewCandidate(hmap);
	}
	
	@Test(priority=4,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SubmitCandAndReq(String testData) throws Exception
	{
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		SubmitCandandReq.Submit_Candidate(hmap);
		SubmitCandandReq.Submit_Requirement(hmap);
	}
	
	@Test(priority=5,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferRequest(String testData) throws Exception
	{
		Submitstatus=new Submit_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		Submitstatus.Select_Candidate();
		Submitstatus.Update_OfferRequest(hmap);
	}
	
	@Test(priority=6,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferAccept(String testData) throws Exception
	{
		Submitstatus=new Submit_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		Submitstatus.Select_Candidate();
		Submitstatus.Clinical_OfferAccept(hmap);
	}
	
	@Test(priority=7,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void InititaiteOnBoarding(String testData) throws Exception
	{
		IntOnboarding=new Initiatate_OnBoarding(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		IntOnboarding.InitiateOnboarding(hmap);
	}
	
	@Test(priority=8,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ManagerRecApproval(String testData) throws Exception
	{
		ManagerRecHRApproval=new ManagerRecHR_Approval(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ManagerRecHRApproval.Onboarding_RecManagerApproval(hmap);
	}
	
	@Test(priority=9,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OnBoarding_EmpPortal(String testData) throws Exception
	{
		OnBoardingEmpPortal=new Onboarding_EmpPortal(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);	
	}
	
	@Test(priority=10,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OnBoardingModule(String testData) throws Exception
	{
		EmpinOnBoardingModule=new OnBoardingStatus_OnBoardingModule(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
	}
	
	@Test(priority=11,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void RecHR_WorkflowApproval(String testData) throws Exception
	{
		ManagerRecHRApproval=new ManagerRecHR_Approval(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ManagerRecHRApproval.HRPayroll_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
	}
	
	@Test(priority=12,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Employee_EmpModule(String testData) throws Exception
	{
		EmpModule=new EmployeeView_EmpModule(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		EmpModule.Emp_EmpModule(hmap);
	}
	}
*/




