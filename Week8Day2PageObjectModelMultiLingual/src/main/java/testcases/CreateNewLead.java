package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateNewLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelfilename = "TC0011";
		testName = "CreateLead";
		testDescription = "Create Lead with mandatory information";
		testCategory = "functional";
		testAuthor ="Hari";
		
	}
	@Test(dataProvider = "sendData")
	public void verifyNewLead(String cName, String fName, String lName) throws InterruptedException, IOException {
		
	    LoginPage lp = new LoginPage(driver);
	    System.out.println(driver);
	    
	     lp.enterUsername()
	    .enterPassword()
	    .clickLoginButton()
	    .clickCRMSFALink()
	    .clickLeadsLink()
	    .clickCreateLeadLink()
	    .enterCompanyName(cName)
	    .enterFirstName(fName)
	    .enterLastName(lName)
	    .clickCreateLeadButton()
	    .verifyFirstName();
	    
	
	
	}

}
