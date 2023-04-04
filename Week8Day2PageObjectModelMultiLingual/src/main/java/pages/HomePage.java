package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	//public ChromeDriver driver;
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyHomePage clickCRMSFALink() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);

	}
	
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed)
			System.out.println("Home Page is displayed");
		else
			System.out.println("Home Page is not displayed");
		
			}
	
	
	public LoginPage clickLogoutbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	
	
}
