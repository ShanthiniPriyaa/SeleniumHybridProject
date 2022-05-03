package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoWishlistPage {
	
	@FindBy(xpath = "//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath ="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	
	public AddtoWishlistPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void play() {
		playbtn.click();
	}
	
	public void pause() {
		pausebtn.click();
	}
	public void wishlistbtn() {
		wishlist.click();
	}

}
