package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Functionality.Login;

public class test_Invalid_Login_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver= new ChromeDriver();
		
		driver.get("https://eshop-onweb-webinar-demo2.azurewebsites.net/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	Login login = new Login(driver);
    	login.loginclick();
		login.username("");
		login.password("");
		login.loginbtn();
		System.out.println("The Email field is required.");
		System.out.println("The Password field is required.");

	}

}
