package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoWishlistPage;
import pomPages.CoreJavaforSeleniumPage;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass {
	
	@Test
	
	public void tc3() throws IOException {
		SkillraryLoginPage LP = new SkillraryLoginPage(driver);
		LP.searchtextbox(pdata.getPropertyfiledata("courseName"));
		LP.search();
		
		CoreJavaforSeleniumPage CJS = new CoreJavaforSeleniumPage(driver);
		CJS.corejavacourse();
		
		AddtoWishlistPage WP = new AddtoWishlistPage(driver);
		driverUtilities.switchtoFrames(driver);
		WP.play();
		WP.pause();
		driverUtilities.switchback(driver);
		WP.wishlistbtn();
	}

}
