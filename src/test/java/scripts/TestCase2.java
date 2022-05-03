package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
	
	@Test
	
	public void tc2() throws IOException {
		
		SkillraryLoginPage LP = new SkillraryLoginPage(driver);
		LP.gearsbutton();
		LP.skillrarydemoapplication();
		
		SkillraryDemoApp Demo = new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.dropDown(Demo.getDropdown(),pdata.getPropertyfiledata("dropdownddata"));
		
		TestingPage TP = new TestingPage(driver);
		Point loc = TP.getMycartarea().getLocation();
		
		int x = loc.getX();
		int y = loc.getY();
		driverUtilities.scrollBar(driver, x, y);
		
		driverUtilities.dragandDrop(driver,TP.getSeleniumtraing(),TP.getMycartarea());
		
		Point loc1 = TP.getFacebookicon().getLocation();
		int x1 = loc1.getX();
		int y1 = loc1.getY();
		driverUtilities.scrollBar(driver,x1,y1);
	    
	}
}
