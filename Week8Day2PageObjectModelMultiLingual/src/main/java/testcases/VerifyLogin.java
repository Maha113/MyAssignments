package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{

	
	@BeforeTest
	public void setData() {
		//excelfilename = "TC0011";
		testName = "VerifyLogin";
		testDescription = "Login with valid credentials";
		testCategory = "Smoke";
		testAuthor ="Ram";
		
	}  
	
	@Test
	  public void runVerifyLogin() throws InterruptedException, IOException {
		  
		  LoginPage lp = new LoginPage(driver);
		  System.out.println(driver);
		  lp.enterUsername()
		  .enterPassword().
		  clickLoginButton()
		  .verifyHomePage();
		  
	  }
}
