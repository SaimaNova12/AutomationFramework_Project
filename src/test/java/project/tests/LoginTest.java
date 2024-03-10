package project.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import project.drivers.BaseDriver;
import project.drivers.PageDriver;
import project.pages.DashboardPage;
import project.pages.LoginPage;
import project.pages.SearchPage;
import project.utilities.ExtentFactory;

public class LoginTest extends BaseDriver{
	ExtentReports report;
	ExtentTest parentTest1;
	ExtentTest parentTest2;
	ExtentTest parentTest3;
	ExtentTest childTest1;
	ExtentTest childTest2;
	ExtentTest childTest3;
	
   @BeforeClass
   public void openUrl() {
	   PageDriver.getCurrentDriver().manage().window().maximize(); 
       PageDriver.getCurrentDriver().get(url);
 	   report = ExtentFactory.getInstance();
 	   parentTest1 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Login Test</b></p>").assignAuthor("QA TEAM").assignDevice("window");
 	   report = ExtentFactory.getInstance();
 	   parentTest2 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>DashBoard Test</b></p>").assignAuthor("QA TEAM").assignDevice("window");
 	   report = ExtentFactory.getInstance();
	   parentTest3 = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Search Test</b></p>").assignAuthor("QA TEAM").assignDevice("window");
   }
   
   @Test(priority = 0)
   public void loginTest() throws InterruptedException, IOException {
	   childTest1 = parentTest1.createNode("<p style = \"color:#3E96E7; font-size:20px\">LOGIN TEST</p>");
	   LoginPage loginPage = new LoginPage(childTest1);
	   loginPage.login();
   }
   
    @Test(priority = 1)
	public void DashboardTest() throws InterruptedException, IOException {
       childTest2 = parentTest2.createNode("<p style = \"color:#3E96E7; font-size:20px\">Dashboard Item Selection TEST</p>");
	   DashboardPage dash = new DashboardPage(childTest2);
	   dash.fashion();  
	}
    
   @Test(priority = 2)
    public void SearchTest() throws IOException {
	   childTest3 = parentTest3.createNode("<p style = \"color:#3E96E7; font-size:20px\">Search TEST</p>");
    	SearchPage ser = new SearchPage(childTest3);
    	ser.Search();
    }
 
 @AfterClass  
 public void afterclass() {
	 report.flush();
 }
  }


