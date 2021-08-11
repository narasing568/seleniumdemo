package pageobject.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffhomepage {

	WebDriver driver;
	
	public rediffhomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(xpath="//*[@id='queryTop']/input")
	WebElement searchlink;
	
	
	public WebElement search() {
		return search;
	}
	
	public WebElement submit() {
		return searchlink;
	}
	
	
	
}
