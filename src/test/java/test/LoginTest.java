package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DashboardPage;
import Page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

  public class LoginTest {

	WebDriver driver;
	
	ExcelReader exlRead = new ExcelReader("mockData\\TF_TestData.xlsx");
	String userName = exlRead.getCellData("LoginInfo", "UserName", 2);
	String passWord = exlRead.getCellData("LoginInfo", "Password", 2);
	String dashboardValidText = exlRead.getCellData("LoginInfo", "DashboardValidation", 2);
	
	
	@Test
	public void ValidusershouldbeabletoLogin()
	{
	driver = BrowserFactory.init();     //// init method will return the webdriver
	
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);   /// with the help of pagefactory we are passing driver,classname
	loginpage.insertUserName(userName);
	loginpage.insertPassWord(passWord);
	loginpage.ClickSignInButton();
	
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.validateDAshboardPage(dashboardValidText);
	
	BrowserFactory.tearDown();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
