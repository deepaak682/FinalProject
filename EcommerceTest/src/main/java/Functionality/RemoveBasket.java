package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveBasket {

	WebDriver driver;
	
	public RemoveBasket(WebDriver driver)
	{
	this.driver=driver;
		
	}
	
	public void RemoveFromBasket()
	{
		
		WebElement textBox = driver.findElement(By.xpath("//input[@name='Items[0].Value']"));
		textBox.clear(); 
		textBox.sendKeys(String.valueOf(0));                    
	}
	
	public void RemoveMultipleFromBasket()
	{
		
		WebElement textBox_1 = driver.findElement(By.xpath("//input[@name='Items[0].Value']"));
		textBox_1.clear(); 
		textBox_1.sendKeys(String.valueOf(0));      
		
		WebElement textBox_2 = driver.findElement(By.xpath("//input[@name='Items[1].Value']"));
		textBox_2.clear(); 
		textBox_2.sendKeys(String.valueOf(0));   
		
		

	}
}
