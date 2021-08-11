package pageobject.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffloginpagePF {

	WebDriver driver;
	
	public rediffloginpagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/a")
	WebElement signin;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/a")
	WebElement redifflink;
	
	
	public WebElement emailid() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement signin() {
		return signin;
	}
	
	
	public WebElement redifflink() {
		return redifflink;
	}
	
	
	
	
}
