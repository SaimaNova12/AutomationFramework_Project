package project.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import project.drivers.PageDriver;
import project.utilities.CommonMethods;
import project.utilities.GetScreenShot;

public class DashboardPage extends CommonMethods{
     
    ExtentTest test;
	public DashboardPage(ExtentTest test) {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this); 
    	 this.test = test;
     }
     
     @FindBy(xpath = "//span[contains(text(),\"Women's & Girls' Fashion\")]")
     WebElement fashion1;
              
     @FindBy(xpath = "//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[1]/li[2]/a[1]/span[1]")
     WebElement fashion2;
     
     @FindBy(xpath = "//span[contains(text(),'Abayas & Long Dresses')]")
     WebElement fashion3;
     
    /* @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[11]/div[1]/a[1]")
     WebElement fashion4;

     @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
     WebElement cart;
     
     @FindBy(xpath = "//button[contains(text(),'GO TO CART')]")
     WebElement gotocart;
     */
     public void fashion() throws InterruptedException, IOException {
    	 timeout();
    	Actions hover = new Actions(PageDriver.getCurrentDriver());
    	try {
    		if(fashion1.isDisplayed()) {
    			fashion1.click();
    			hover.moveToElement(fashion1).perform();
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Women's & Fashion Sector Hover Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Women's & Fashion Sector Hover");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Women's&FashionSector.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		} 
    	 }
    	catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Women & Fashion Sector is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Womne's & Fashion Hover");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "W&FHoverLocator.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(fashion1.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
    	 }
	    try {
		if(fashion2.isDisplayed()) {
			//fashion2.click();
			hover.moveToElement(fashion2).perform();
			timeout();
			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Muslim's Wear Hover Section Successful</b></p>");
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Muslim's Wear Hover");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Muslim'sWearHover.png";
    		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     } 
	      }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Muslim Wear Hover Sector is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Muslim wear Hover");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "MuslimWearHoverLocator.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(fashion2.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	       }
	    try {
		if(fashion3.isDisplayed()) {
			fashion3.click();
			//hover.moveToElement(fashion3).perform();
			timeout();
			PageDriver.getCurrentDriver().navigate().back();
			timeout();
			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Abaya & etc Section Successful</b></p>");
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Abaya & etc Click");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Abaya&etc.png";
    		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     } 
	     }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Abaya & etc is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Abaya & etc Click");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "AbayaClickLocator.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(fashion3.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	 }
	    /*try {
		if(fashion4.isDisplayed()) {
			fashion4.click();
			hover.moveToElement(fashion3).perform();
			timeout();
			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select a Item Successful</b></p>");
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select a Item");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "SelectaItem.png";
    		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     } 
	     }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Abaya Selection Sector is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Abaya Selection Click");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "AbayaSelection.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(fashion4.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	 }
	    try {
		if(cart.isDisplayed()) {
			cart.click();
			timeout();
			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Add a Item in Cart Successful</b></p>");
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Add a Item in Cart");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "AddaIteminCart.png";
    		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     } 
	     }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Adding in cart is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Add to cart");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "AddtoCartLocator.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(cart.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	 } 
	    try {
		if(gotocart.isDisplayed()) {
			gotocart.click();
			timeout();
			PageDriver.getCurrentDriver().navigate().back();
			timeout();
			PageDriver.getCurrentDriver().navigate().back();
			timeout();
			PageDriver.getCurrentDriver().navigate().back();
			timeout();
			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Cart Detailds Successful</b></p>");
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Cart Detailds");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "CartDetailds.png";
    		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     } 
	     }
	    catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Cart Details is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Cart Details");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "CartDetails.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(gotocart.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
	 } */
   }
}
