package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project.drivers.PageDriver;
import project.utilities.CommonMethods;

public class SearchPage extends CommonMethods{
    public SearchPage() {
    	PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }
    
    @FindBy(xpath = "//input[@id='q']")
    WebElement search;
    
    @FindBy(xpath = "//button[contains(text(),'SEARCH')]")
    WebElement entersearch;
    
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[20]/div[1]/a[1]")
    WebElement sel_saree;
   
    
    public void Search() {
    	try {
    		if(search.isDisplayed()) {
    			search.sendKeys("saree");
    			timeout();
    		}
    	}
    	catch(Exception e) {
    		System.out.println("Somethign went Wrong");
    	}
    	try {
    		if(entersearch.isDisplayed()) {
    			entersearch.click();
    			timeout();
    		}
    	}
    	catch(Exception e) {
    		System.out.println("Somethign went Wrong");
    	}
    	try {
    		if(sel_saree.isDisplayed()) {
    			sel_saree.click();
    			timeout();
    			PageDriver.getCurrentDriver().navigate().back();
    			timeout();
    			PageDriver.getCurrentDriver().navigate().back();
    			timeout();
    		}
    	}
    	catch(Exception e) {
    		System.out.println("Somethign went Wrong");
    	}
    }
}
