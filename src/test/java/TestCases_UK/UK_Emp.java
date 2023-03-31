package TestCases_UK;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.EmployeeView_EmpModule;
import Page_Objects.ManagerRecHR_Approval;
import Page_Objects.New_Candidate;
import Page_Objects.New_Client;
import Page_Objects.New_Requirement;
import Page_Objects.OnBoardingStatus_OnBoardingModule;
import Page_Objects.Onboarding_EmpPortal;
import Page_Objects.Search_RequirementType;

@Listeners(ITestListenerClass.class)
public class UK_Emp extends BaseClass{
	
	New_Client ClientPage;
	New_Requirement ReqPage;
	Search_RequirementType SearchReq;
	New_Candidate CandidatePage;
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
		ManagerRecHRApproval=new ManagerRecHR_Approval(driver);
		OnBoardingEmpPortal=new Onboarding_EmpPortal(driver);
		EmpinOnBoardingModule=new OnBoardingStatus_OnBoardingModule(driver);
		ManagerRecHRApproval=new ManagerRecHR_Approval(driver);
		EmpModule=new EmployeeView_EmpModule(driver);
		
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		
		ClientPage.Client(hmap);
		ClientPage.ClientApproval(hmap);
		ReqPage.Create_NewRequirement(hmap);
		SearchReq.Search_Requirement(hmap);
		CandidatePage.Add_NewCandidate(hmap);
		CandidatePage.India_SubmitNewCandidate(hmap);
		ManagerRecHRApproval.IndiaInstance_ManagerRecApprovalScreen(hmap);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.IndiaInstanceClinicalEmpPor_LoginProcess(hmap);
		EmpinOnBoardingModule.IndiaInstance_OnBoardnewemployee(hmap);
		ManagerRecHRApproval.IndiaHRPayroll_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
		EmpModule.Emp_EmpModule(hmap);
	}
}	
	















