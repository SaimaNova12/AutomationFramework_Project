package project.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project.drivers.BaseDriver;
import project.drivers.PageDriver;
import project.pages.DashboardPage;
import project.pages.LoginPage;

public class LoginTest extends BaseDriver{
	
   @BeforeClass
   public void openUrl() {
	   PageDriver.getCurrentDriver().manage().window().maximize(); 
       PageDriver.getCurrentDriver().get(url);
   }
   
   @Test(priority = 0)
   public void loginTest() throws InterruptedException {
	   LoginPage loginPage = new LoginPage();
	   loginPage.login();
   }
   
    @Test(priority = 1)
	public void DashboardTest() throws InterruptedException {
	   DashboardPage dash = new DashboardPage();
	   dash.fashion();
	}
  }


