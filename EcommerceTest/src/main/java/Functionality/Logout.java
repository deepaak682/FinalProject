package Functionality;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Logout {
	WebDriver driver;
	
	public Logout(WebDriver driver)
	{
	this.driver=driver;
		
	}
	
	public void logOutwindow()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));           
	  WebElement logoutbtn=  driver.findElement(By.xpath("//*[(text()='demouser@microsoft.com')]"));
	  logoutbtn.click();
	  driver.findElement(By.xpath("//div[normalize-space()='Log Out']")).click();                         
		System.out.println("loged out successfully");
	}
}
