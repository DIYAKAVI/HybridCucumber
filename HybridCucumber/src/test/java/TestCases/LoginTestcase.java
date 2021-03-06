package TestCases;

import java.io.IOException;

import org.testng.annotations.*;

import Baseclass.Libraryclass;
import Pages.Loginpage;
import SeleniumReuseableFunction.Seleniumutility;

public class LoginTestcase extends Libraryclass {

	Seleniumutility selenium;
	Loginpage lp;
	@BeforeMethod
	public void openapp()
	{
		launchapp("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login()
	{
		 lp=new Loginpage(driver);
		lp.login("Admin","admin123");
	}
	
	@AfterMethod
	public void teardown() throws IOException
	{
	 selenium=new Seleniumutility(driver);
		selenium.screenshot("C:\\Users\\divyar\\git\\HybridCucumber\\HybridCucumber\\src\\test\\resources\\Sreenshots\\Login.png");
	closeapp();
	}
	
}
