package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project.drivers.PageDriver;
import project.utilities.CommonMethods;

public class DashboardPage extends CommonMethods{
     

	public DashboardPage() {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this); 
     }
     
     @FindBy(xpath = "//span[contains(text(),\"Women's & Girls' Fashion\")]")
     WebElement fashion1;
              
     @FindBy(xpath = "//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[1]/li[2]/a[1]/span[1]")
     WebElement fashion2;
     
     @FindBy(xpath = "//span[contains(text(),'Abayas & Long Dresses')]")
     WebElement fashion3;
     
     @FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]")
     WebElement fashion4;
     
     @FindBy(xpath = "//body/div[@id='container']/div[@id='root']/div[@id='block-_4sUzDww8j']/div[@id='block-TcoRtQ-uf9']/div[@id='block-nInSf-_rzA']/div[@id='block-W4qa6DVWM4']/div[@id='module_add_to_cart']/div[1]/button[2]")
     WebElement cart;
     
     @FindBy(xpath = "//button[contains(text(),'GO TO CART')]")
     WebElement gotocart;
     
     @FindBy(className = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")
     WebElement payment;
     
     public void fashion() throws InterruptedException {
    	 timeout();
    	Actions hover = new Actions(PageDriver.getCurrentDriver());
    	try {
    		if(fashion1.isDisplayed()) {
    			fashion1.click();
    			hover.moveToElement(fashion1).perform();
    			timeout();
    		} 
    	 }
    	catch(Exception e) {
    		System.out.println("Something went wrong");
    	 }
	    try {
		if(fashion2.isDisplayed()) {
			//fashion2.click();
			hover.moveToElement(fashion2).perform();
			timeout();
		     } 
	      }
	    catch(Exception e) {
		System.out.println("Something went wrong");
	       }
	    try {
		if(fashion3.isDisplayed()) {
			fashion3.click();
			hover.moveToElement(fashion3).perform();
			timeout();
		     } 
	     }
	    catch(Exception e) {
		System.out.println("Something went wrong");
	 }
	    try {
		if(fashion4.isDisplayed()) {
			fashion4.click();
			timeout();
		     } 
	     }
	    catch(Exception e) {
		System.out.println("Something went wrong");
	 }
	    try {
		if(cart.isDisplayed()) {
			cart.click();
			timeout();
		     } 
	     }
	    catch(Exception e) {
		System.out.println("Something went wrong");
	 } 
	    try {
		if(gotocart.isDisplayed()) {
			gotocart.click();
			timeout();
		     } 
	     }
	    catch(Exception e) {
		System.out.println("Something went wrong");
	 } 
	    try {
		if(payment.isDisplayed()) {
			payment.click();
			timeout(2000);
		     } 
	     }
	    catch(Exception e) {
		System.out.println("Something went wrong");
	 }
   }
}
