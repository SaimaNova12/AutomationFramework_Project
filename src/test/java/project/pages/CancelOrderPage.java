package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project.drivers.PageDriver;
import project.utilities.CommonMethods;

public class CancelOrderPage extends CommonMethods{
      public CancelOrderPage() {
    	  PageFactory.initElements(PageDriver.getCurrentDriver(), this);
      }
      
      @FindBy(xpath = "//span[contains(text(),'Help & Support')]")
      WebElement help;
      
      @FindBy(xpath = "//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]")
      WebElement helpcenter;
      
      @FindBy(xpath = "//body/div[1]/div[1]/div[4]/div[1]/div[3]/div[4]")
      WebElement cancelorder;
      
      @FindBy(xpath = "//span[contains(text(),'Cancellation')]")
      WebElement select_cancel;
      /* @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[3]/div[1]/textarea[1]")
      WebElement write;
      
      @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[4]")
      WebElement sendwrite;*/
      
      public void cancel() throws InterruptedException {
    	  timeout();
    	  try {
    		if(help.isDisplayed()) {
    			help.click();
    			
    			timeout();
    		}  
    	  }
    	  catch(Exception e) {
    		  System.out.println("Something went wrong");
    	  }
    	  try {
    		if(helpcenter.isDisplayed()) {
    			helpcenter.click();
    			timeout();
    		}  
    	  }
    	  catch(Exception e) {
    		  System.out.println("Something went wrong");
    	  }
    	  try {
    		if(cancelorder.isDisplayed()) {
    			cancelorder.click();
    			timeout(2000);
    			
    		}  
    	  }
    	  catch(Exception e) {
    		  System.out.println("Something went wrong");
    	  }
    	 /* try {
    		if(write.isDisplayed()) {
    			write.sendKeys("Cancelling Order");
    			timeout(2000);
    		}  
    	  }
    	  catch(Exception e) {
    		  System.out.println("Something went wrong");
    	  } 
    	  try {
    		if(sendwrite.isDisplayed()) {
    			sendwrite.click();
    			timeout(2000);
    		}  
    	  }
    	  catch(Exception e) {
    		  System.out.println("Something went wrong");
    	  }*/
    	  try {
      		if(select_cancel.isDisplayed()) {
      			select_cancel.click();
      			timeout(2000);
      		}  
      	  }
      	  catch(Exception e) {
      		  System.out.println("Something went wrong");
      	  } 
      }
}
