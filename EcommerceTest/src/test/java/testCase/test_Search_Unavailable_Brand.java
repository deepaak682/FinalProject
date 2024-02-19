package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Functionality.Login;
import Functionality.Search;

public class test_Search_Unavailable_Brand {

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
		try
		{
		search.searchBrand("Hero");
		}
		catch(Exception ex)
		{
		System.out.println("Selected brand in unavailable: " +ex);
		driver.close();
		}

	}

}
