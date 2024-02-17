package project.tests;

import org.testng.annotations.Test;

import project.drivers.BaseDriver;
import project.pages.DashboardPage;

public class DashboardTest extends BaseDriver{
	
	@Test(priority = 1)
	public void DashboardTest() throws InterruptedException {
    DashboardPage dash = new DashboardPage();
	dash.fashion();
	}
}
