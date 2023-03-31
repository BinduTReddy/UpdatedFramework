package TestCases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Edit_Payrate_PerDiem;
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
import Page_Objects.Timesheet_BiWeekly;
import Page_Objects.Timesheet_Weekly;
import Page_Objects.US_AcceptOffer;

@Listeners(ITestListenerClass.class)
public class US_Clinical_Emp extends BaseClass{

	ExcelTestData ExcelTestdata;
	New_Client ClientPage;
	New_Requirement ReqPage;
	Search_RequirementType SearchReq;
	New_Candidate CandidatePage;
	Submit_CandidateandRequirement SubmitCandandReq;
	Submit_OfferStatus Submitstatus;
	Initiatate_OnBoarding IntOnboarding;
	ManagerRecHR_Approval ManagerRecHRApproval;
	US_AcceptOffer AcceptOffer;
	Onboarding_EmpPortal OnBoardingEmpPortal;
	OnBoardingStatus_OnBoardingModule EmpinOnBoardingModule;
	EmployeeView_EmpModule EmpModule;
	Edit_Payrate_PerDiem EditpayRate;
	Timesheet_Weekly RegularTS;
	Timesheet_BiWeekly RegularTS1;
	
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
		AcceptOffer=new US_AcceptOffer(driver);
		OnBoardingEmpPortal=new Onboarding_EmpPortal(driver);
		EmpinOnBoardingModule=new OnBoardingStatus_OnBoardingModule(driver);
		EmpModule=new EmployeeView_EmpModule(driver);
		EditpayRate=new Edit_Payrate_PerDiem(driver);
		RegularTS=new Timesheet_Weekly(driver);
		RegularTS1=new Timesheet_BiWeekly(driver);

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
		AcceptOffer.Accept_Offer(hmap);
		ManagerRecHRApproval.Onboarding_ManagerApproval(hmap);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
		ManagerRecHRApproval.HRPayroll_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();	
	}
}


//	EditpayRate.Edit_payRate(hmap);
//	EditpayRate.Finance_Approval(hmap);
//	EditpayRate.Edit_PerDiem(hmap);
//	RegularTS.Clinical_RegTimesheet(hmap);
//	RegularTS.ApproveTimesheet();	
//	RegularTS1.Clinical_BIWeeklyRegTimesheet(hmap);
//	RegularTS1.ApproveTimesheet();	

	
	
	
	
	
	
	
	
	
