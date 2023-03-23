package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'Drag me around')]"));
		WebElement draggableElement  = driver.findElement(By.xpath("//p[contains(text(),'Drag to target')]"));
		WebElement draggabletarget  = driver.findElement(By.xpath("//span[contains(text(),'Droppable Target')]"));
		Point location = findElement.getLocation();
		int x= location.getX();
		int y= location.getY();
		System.out.println("X : " + x + "Y  : " +  y);
		
		System.out.println("Action 1");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(findElement, x+100, y+10).perform();
		Point finalLocation = findElement.getLocation();
		int destination_x= finalLocation.getX();
		int destination_y= finalLocation.getY();
		System.out.println("X : " + destination_x + "Y  : " +  destination_y);
		System.out.println("Action 2");
		builder.dragAndDrop(draggableElement, draggabletarget).perform();
		
		
	}

}
