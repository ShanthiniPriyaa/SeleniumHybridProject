package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraing;
	
	@FindBy(id="cartArea")
	private WebElement mycartarea;
	
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	
	public TestingPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getSeleniumtraing() {
		return seleniumtraing;
	}


	public WebElement getMycartarea() {
		return mycartarea;
	}


	public WebElement getFacebookicon() {
		return facebookicon;
	}
	
	public void fbicon() {
		facebookicon.click();
	}


}
