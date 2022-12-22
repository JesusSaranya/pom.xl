package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddCustomerPage;
import Page.DashboardPage;
import Page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	
	 WebDriver driver;
		
	   ExcelReader exlRead = new ExcelReader("mockData\\TF_TestData.xlsx");
		String userName = exlRead.getCellData("LoginInfo", "UserName", 2);
		String passWord = exlRead.getCellData("LoginInfo", "Password", 2);
		String dashboardValidText = exlRead.getCellData("LoginInfo", "Dashboardvalidation", 2);
		
		String fullname = exlRead.getCellData("AddContactInfo", "FullName", 2);
		String company = exlRead.getCellData("AddContactInfo", "CompanyName", 2);
		String email =exlRead.getCellData("AddContactInfo", "Email", 2);
		String phoneNum =exlRead.getCellData("AddContactInfo", "Phone", 2);
		String address = exlRead.getCellData("AddContactInfo", "Address", 2);
		String city =exlRead.getCellData("AddContactInfo", "City", 2);
		String Country =exlRead.getCellData("AddContactInfo", "Country", 2);
		String state =exlRead.getCellData("AddContactInfo", "State", 2);
		String zip =exlRead.getCellData("AddContactInfo", "Zip", 2);
		
		

		
		@Test
		public void validUserShouldBeabletoAddCustomer() throws InterruptedException
		{
			driver = BrowserFactory.init();
			
			Page.LoginPage loginpage = PageFactory.initElements(driver, Page.LoginPage.class);
		    loginpage.insertUserName(userName);
		    loginpage.insertPassWord(passWord);
		    loginpage.ClickSignInButton();
		    
		    DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		    dashboard.validateDAshboardPage(dashboardValidText);
		    dashboard.clickCustomerMenuButton();
		    dashboard.clickAddCustomerMenuButton();
		    dashboard.clickListCustomerMenuButton();
		    
		    
		    AddCustomerPage addcus = PageFactory.initElements(driver, AddCustomerPage.class);
		    Thread.sleep(4000);
		    addcus.insertFullName(fullname);
		    addcus.selectCompanyDropDown(company);
		    addcus.insertEmail(email);
		    addcus.insertPhone(phoneNum);
		    addcus.insertaddress(address);
		    addcus.insertcity(city);
		    addcus.insertCountry(Country);
		    addcus.insertState(state);
		    addcus.insertEmail(zip);
		    addcus.ClicksaveButton(); 
		    
		  // addcus.verifyInsertednmae();
		   addcus.verifyInsertedCustomeraNameAnddelete();
		    
		   // Browsefactory.tearDown();
		}
	
	
	
		
		
		
		
	}


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

