package pageobject.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffloginpage {

	WebDriver driver;
	
	public rediffloginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By username=By.id("login1");
	By password=By.id("password");
	By signin =By.name("proceed");
	By redifflink=By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a");
	
	
	
	public WebElement emailid() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement signin() {
		return driver.findElement(signin);
	}
	
	
	public WebElement redifflink() {
		return driver.findElement(redifflink);
	}
	
	
	
	
}
