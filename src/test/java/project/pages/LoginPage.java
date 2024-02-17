package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import project.drivers.PageDriver;
import project.utilities.CommonMethods;

public class LoginPage extends CommonMethods{
     public LoginPage() {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
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
     
     public void login() throws InterruptedException {
    	 timeout();
    	 try {
    		if(username.isDisplayed()) {
    			username.sendKeys("01644417057");
    			timeout();
    		} 
    	 }
    	 catch(Exception e) {
    		 System.out.println("Somthing is wrong");
    	 }
    	 
    	 try {
    		if(password.isDisplayed()) {
    			password.sendKeys("saima34");
    			timeout();
    		} 
    	 }
    	 catch(Exception e){
    		 System.out.println("Something is wrong");
    	 }
    	 try {
    		if(loginButton.isDisplayed()) {
    			loginButton.click();
    			timeout(3000);
    		} 
    	 }
    	 catch(Exception e){
    		 System.out.println("Something is wrong");
    	 }
     }
}
