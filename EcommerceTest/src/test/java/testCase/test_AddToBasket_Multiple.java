package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Functionality.AddBasket;
import Functionality.Login;
import Functionality.Search;

public class test_AddToBasket_Multiple {

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
		search.searchBrand("All");
		search.searchType("All");
		search.searchClick();
		
		AddBasket addbask = new AddBasket(driver);
		addbask.addBasket_Multiple();
		addbask.check_BasketItems();
		System.out.println("Multiple Items added to basket");
		driver.close();
	}

}
