package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Functionality.Login;
import Functionality.Logout;

public class test_Logout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver= new ChromeDriver();
		
		driver.get("https://eshop-onweb-webinar-demo2.azurewebsites.net/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	Login login = new Login(driver);
    	login.loginclick();
		login.username("demouser@microsoft.com");
		login.password("Pass@word1");
		login.loginbtn();
		System.out.println("Successfull login");
		
		Logout logout = new Logout(driver);
		logout.logOutwindow();
	}

}
