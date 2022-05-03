package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryAddtoCart {
	
	@FindBy(id = "add")
	private WebElement addbtn;
	
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addcartbtn;




public SkillraryAddtoCart(WebDriver driver) {
	PageFactory.initElements(driver,this);
    }



public WebElement getAddbtn() {
	return addbtn;
}

public void addcart() {
	addcartbtn.click();
}
}
