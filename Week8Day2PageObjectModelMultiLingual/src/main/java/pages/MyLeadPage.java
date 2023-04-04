package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public MyLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.xpath(prop.getProperty("MyLeadPage.CreateLead.Xpath"))).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return new CreateLeadPage(driver);
	}
	
}
