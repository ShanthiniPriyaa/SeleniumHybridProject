package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtrainingbtn;
	
	@FindBy(name = "addresstype")
	private WebElement dropdown;
	
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraing;
	
	public WebElement getSeleniumtraing() {
		return seleniumtraing;
	}

	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}

	public void seleniumtraining() {
	seleniumtrainingbtn.click();
	}
	
	public WebElement getDropdown() {
		return dropdown;
	}


}
