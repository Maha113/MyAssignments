package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
  public static void main(String[] args) {
		ChromeDriver driver  = new  ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		
		
		//Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		

	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    
	    // By Id createLeadForm_companyName,createLeadForm_firstName, createLeadForm_lastName & createLeadForm_firstNameLocal
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Diana1");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Williams1");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dia");
	    
	    
	    //By Name - departmentName & description  - name
	    driver.findElement(By.name("departmentName")).sendKeys("Sales");
	    driver.findElement(By.name("description")).sendKeys("Sales Department");
	    
	    //Thread.sleep(1000);
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Dianawilliams1@gmail.com");
	    
	    
	    WebElement statedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd = new Select(statedd);
	    dd.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    
	   
	            
	    String createTitle = driver.getTitle();
	    System.out.println(createTitle);
	    
	    //Duplicate
	    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
	    
	    driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	    String duplicateLeadTitle = driver.getTitle();
		System.out.println(duplicateLeadTitle);
}
}
