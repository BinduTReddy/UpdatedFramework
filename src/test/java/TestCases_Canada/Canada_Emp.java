package TestCases_Canada;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.EmployeeView_EmpModule;
import Page_Objects.Initiatate_OnBoarding;
import Page_Objects.ManagerRecHR_Approval;
import Page_Objects.New_Candidate;
import Page_Objects.New_Client;
import Page_Objects.New_Requirement;
import Page_Objects.OnBoardingStatus_OnBoardingModule;
import Page_Objects.Onboarding_EmpPortal;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Submit_OfferStatus;

@Listeners(ITestListenerClass.class)
public class Canada_Emp extends BaseClass{

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

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Employee(String testData) throws Exception
	{
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
		
		




