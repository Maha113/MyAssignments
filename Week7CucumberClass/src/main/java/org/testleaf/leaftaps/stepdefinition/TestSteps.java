package org.testleaf.leaftaps.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	public ChromeDriver driver;
	
	@Given("Open the browser")
	public void launchbrowser() {
		//driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allows-origins=*"));
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        		driver.manage().window().maximize();	
	}
	
	@And("Load leaftaps application URL")
	public void launchApp() {
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
	
	@And("Enter username")
	public void username() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		
	}
	@And("Enter password")
	public void password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
	}
	@When("Click Login")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
			
	}
	
	
	@Then ("Verify welcome page is displayed or not")
	public void verifyhomepage() {
		if (driver.findElement(By.xpath("//h2[contains(text(),'Welcome ')]")).getText().contains("Welcome"))
		{
			System.out.println("Welcome Page Displayed");
		}
		else
		{
			System.out.println("Welcome Page Not launched");
		}
		
	}
   @When ("Click on CRMS hyperlink")
   public void clickCRM() {
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   
   }	   
	   @Then ("Verify Home page is displayed")
	   public void verifyHomePage() {
	
		   boolean displayed = driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
		   if (displayed == true)
		   {
			   System.out.println("Home Page is displayed");
		   }
		   else
		   {
			   System.out.println("Home Page is not displayed");

		   }

	   }
	   
	   @And("Click Create New Lead")
	   public void createLead() 
	   {
		   driver.findElement(By.linkText("Create Lead")).click();
	   }
	   @And ("Enter Company Name") 
	   public void enterCompanyName() 
	   {
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	   }
	   @And ("Enter First name")
	   public void enterfirstname() 
	   {
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Darshu");
	   }
	   @And ("Enter Last name")
	   public void enterlastname() 
	   {
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
	   }
	   @When("Click Create Lead")  
	   public void clickcreateLead() 
	   {
		   driver.findElement(By.name("submitButton")).click();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	   }
	   
	   @Then("Verify Lead name in View Lead page")
	   public void verifyLead() 
	   {
		   String getFirstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		   if (getFirstname.equals("Darshu"))
		   {
			   System.out.println("Lead is created");
		   }
		   else
		   {
			   System.out.println("Lead is not created");
		   }
	   }
   }
	



