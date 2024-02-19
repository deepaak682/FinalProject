package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Functionality.Login;

public class test_Invalid_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver= new ChromeDriver();
		
		driver.get("https://eshop-onweb-webinar-demo2.azurewebsites.net/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	Login login = new Login(driver);
    	login.loginclick();
		login.username("demouser@microsoft");
		login.password("Pass@word");
		login.loginbtn();
		System.out.println("Invalid login attempt");
	}

}
