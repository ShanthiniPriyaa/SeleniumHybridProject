package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryAddtoCart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {

	@Test
	public void tc1() {
		SkillraryLoginPage LP = new SkillraryLoginPage(driver);
		LP.gearsbutton();
		LP.skillrarydemoapplication();
		
		SkillraryDemoApp Demo = new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.mouseHover(driver, Demo.getCoursetab());
		Demo.seleniumtraining();
		
		SkillraryAddtoCart cart = new SkillraryAddtoCart(driver);
		driverUtilities.doubleClick(driver, cart.getAddbtn());
		cart.addcart();
	}
}
