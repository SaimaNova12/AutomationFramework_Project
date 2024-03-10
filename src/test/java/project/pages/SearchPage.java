package project.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import project.drivers.PageDriver;
import project.utilities.CommonMethods;
import project.utilities.GetScreenShot;

public class SearchPage extends CommonMethods{
	
	ExtentTest test;
    public SearchPage(ExtentTest test) {
    	PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }
    
    @FindBy(xpath = "//input[@id='q']")
    WebElement search;
    
    @FindBy(xpath = "//button[contains(text(),'SEARCH')]")
    WebElement entersearch;
    
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[20]/div[1]/a[1]")
    WebElement sel_saree;
   
    
    public void Search() throws IOException {
    	try {
    		if(search.isDisplayed()) {
    			search.sendKeys("saree");
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Sending Search Item Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending Search Item Passed");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SendingSearchItem.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		}
    	}
    	catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Searching is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Searching in Site");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Searching in Site.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(search.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
    	}
    	try {
    		if(entersearch.isDisplayed()) {
    			entersearch.click();
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Entering Search Item Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Entering Search Item Passed");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Entering Search Item.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		}
    	}
    	catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Sending Search Item is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SendingSearchItem");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SendingSearchItem.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(entersearch.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
    	}
    	try {
    		if(sel_saree.isDisplayed()) {
    			sel_saree.click();
    			timeout();
    			PageDriver.getCurrentDriver().navigate().back();
    			timeout();
    			PageDriver.getCurrentDriver().navigate().back();
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select an Search Item Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select an Search Item Passed");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select an Search Item.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    			
    		}
    	}
    	catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Select a Visible Item</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SelectaVisibleItem");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SelectaVisibleItem.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(sel_saree.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
    	}
    }
}
