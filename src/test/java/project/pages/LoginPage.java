package project.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import project.drivers.PageDriver;
import project.utilities.CommonMethods;
import project.utilities.GetScreenShot;

public class LoginPage extends CommonMethods{
	
	ExtentTest test;
     public LoginPage(ExtentTest test) {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
         this.test = test;
     }
     
     @FindBys({
    	 @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
     })
     WebElement username;
     
     @FindBys({
    	 @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
     })
     WebElement password;
     
     @FindBy(xpath = "//button[contains(text(),'LOGIN')]")
     WebElement loginButton;
     
     public void login() throws InterruptedException, IOException {
    	 timeout();
    	 try {
    		if(username.isDisplayed()) {
    			username.sendKeys("01644417057");
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Username Sending Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Username Sending Passed");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "UsernamePass.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		} 
    	 }
    	 catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Username sending is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Username Locator");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "UsernameLocator.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(username.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
     	}
    	 
    	 try {
    		if(password.isDisplayed()) {
    			password.sendKeys("saima34");
    			timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Password Sending Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Password Sending Passed");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "PasswordSendPass.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		} 
    	 }
    	 catch(Exception e){
      		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Password sending is Not Working</b></p>");
      		Throwable t = new InterruptedException("Exception");
      		test.fail(t);
      		@SuppressWarnings("unused")
      		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Password Locator");
      		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "PasswordLocator.png";
      		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
      		Assert.assertTrue(password.isDisplayed());
      		PageDriver.getCurrentDriver().quit();
      	}
    	 try {
    		if(loginButton.isDisplayed()) {
    			loginButton.click();
    			timeout(3000);
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Login Button Successful</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login Passed");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "LoginePass.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		} 
    	 }
    	 catch(Exception e){
      		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Login Button is Not Working</b></p>");
      		Throwable t = new InterruptedException("Exception");
      		test.fail(t);
      		@SuppressWarnings("unused")
      		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login Button Locator");
      		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "LoginButtonLocator.png";
      		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
      		Assert.assertTrue(loginButton.isDisplayed());
      		PageDriver.getCurrentDriver().quit();
      	}
     }
}
