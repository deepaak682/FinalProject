package Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Search {
	WebDriver driver;
	public Search(WebDriver driver)
	{
	this.driver=driver;
		
	}
	
	public void searchBrand(String BrandName)
	{
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='CatalogModel_BrandFilterApplied']"));
		Select select=new Select (dropdown);	
		List<WebElement> lst=select.getOptions();
		System.out.println("options are....");
		for(WebElement elements:lst) {
			System.out.println(elements.getText());
		}
		select.selectByVisibleText(BrandName);
		System.out.println("option present in index 1 is..." +select.getFirstSelectedOption().getText());
		//WebElement search=driver.findElement(By.xpath("//button[@id='search-categories']"));
		//search.click();	
	}
	
	public void searchType(String typeName)
	{
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='CatalogModel_TypesFilterApplied']"));
		Select select=new Select (dropdown);	
		List<WebElement> lst=select.getOptions();
		System.out.println("options are....");
		for(WebElement elements:lst) {
			System.out.println(elements.getText());
		}
		select.selectByVisibleText(typeName);
		System.out.println("option present in index 1 is..." +select.getFirstSelectedOption().getText());
	}

	public void searchClick()
	{
		WebElement search=driver.findElement(By.xpath("//input[@type='image']"));
		search.click();	
	}
}
