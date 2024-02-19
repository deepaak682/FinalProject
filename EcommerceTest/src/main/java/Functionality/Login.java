-package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
	this.driver=driver;
		
	}
	public void loginclick() {
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='esh-identity-name esh-identity-name--upper']")).click();
		
	}
	
	
	public void username(String text)
	{
		
		driver.findElement(By.xpath("//input[@id='Input_Email']")).sendKeys(text); 
	    
	}
	public void password(String text)
	{
		
		driver.findElement(By.xpath("//input[@id='Input_Password']")).sendKeys(text); 
		
	    
	}
	public void loginbtn() {
		
		driver.findElement(By.className("btn")).click(); 
	}
	
	

	                            



}
