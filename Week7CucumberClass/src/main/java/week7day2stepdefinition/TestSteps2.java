package week7day2stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps2 {
	public ChromeDriver driver;
	
	@Given ("Open browser and load leaftaps application using {string}")
	public void launchbrowser(String url) {
		//driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allows-origins=*"));
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get(url);
        driver.manage().window().maximize();	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@And ("Enter username as {string}")	
	public void username(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
		
		
	@And("Enter password as {string}")
	public void password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@When("Click Login button")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
			
	}
	
	
	@Then("Verify welcome page is displayed")
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
	   @And("Enter Company Name as {string}") 
	   public void enterCompanyName(String cname) 
	   {
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	   }
	   @And("Enter First Name as {string}")
	   public void enterfirstname(String fname) 
	   {
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	   }
	   @And("Enter Last Name as {string}")
	   public void enterlastname(String lname) 
	   {
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	   }
	   @When("Click Create Lead")  
	   public void clickcreateLead() 
	   {
		   driver.findElement(By.name("submitButton")).click();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	   }
	   
	   @Then("Verify Lead is created")
	   public void verifyLead() 
	   {
		   String getFirstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		   if (getFirstname.equals("Ram") || getFirstname.equals("Ragav"))
		   {
			   System.out.println("Lead is created");
		   }
		   else
		   {
			   System.out.println("Lead is not created");
		   }
	   }
   }
	



