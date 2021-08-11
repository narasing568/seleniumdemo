package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.model.rediffhomepage;
import pageobject.model.rediffloginpage;

public class Loginapplication {

	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rediffloginpage rd=new rediffloginpage(driver);
		rd.emailid().sendKeys("hari@gmail.com");
		rd.password().sendKeys("7416458745");
		rd.signin().click();
		rd.redifflink().click();
		rediffhomepage rh=new rediffhomepage(driver);
		rh.search().sendKeys("mobiles");
		rh.submit().click();
		
	}
	
	
	
}
