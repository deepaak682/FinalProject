package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddBasket {

	WebDriver driver;
	
	public AddBasket(WebDriver driver)
	{
	this.driver=driver;
		
	}
	public void addBasket()
	{
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click(); 
		                             
	}
	
	public void addBasket_Multiple()
	{
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[6]/form[1]/input[1]")).click(); 
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[4]/form[1]/input[1]")).click(); 	
		
	}
	
	public void check_BasketItems()
	{
		driver.findElement(By.xpath("//div[@class='esh-basketstatus-badge']")).click(); 
	}
}
