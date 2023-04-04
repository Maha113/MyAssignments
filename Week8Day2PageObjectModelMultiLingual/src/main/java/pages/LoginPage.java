package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage enterUsername() throws InterruptedException, IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
			reportStep("Username is entered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportStep("Username is not entered successfully..."+e ,"fail");
		}
		return this;
	}
	
	public LoginPage enterPassword() throws InterruptedException, IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			reportStep("password is entered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportStep("password is not entered successfully...."+e,"fail");
		}
		return this;
		
	}
	
	public HomePage clickLoginButton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Login button is clicked","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportStep("Login button is not clicked","pass");
		}
		return new HomePage(driver);

	}

}
