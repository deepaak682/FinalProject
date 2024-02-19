package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Functionality.Login;
import Functionality.Search;

public class test_Search_Unavailable_Type {

	public static void main(String[] args) {
		WebDriver driver;		
		driver= new ChromeDriver();		
		driver.get("https://eshop-onweb-webinar-demo2.azurewebsites.net/");		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	Login login = new Login(driver);
    	login.loginclick();
		login.username("demouser@microsoft.com");
		login.password("Pass@word1");
		login.loginbtn();
		
		Search search = new Search(driver);
		search.searchBrand(".NET");
		try
		{
		search.searchType("Cup");
		}
		catch(Exception ex)
		{
			System.out.println("Selected type in unavailable: " + ex);
			driver.close();
		};

	}

}
