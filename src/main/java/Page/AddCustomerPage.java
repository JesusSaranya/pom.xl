package Page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends Basepage{

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//WEBELEMENTS LIST
		//@FindBy(how = How.XPATH , using = "//*[@id='account']")WebElement FULLNAME_ELEMENT;
		@FindBy(how = How.XPATH , using = "//input[@name='account']")WebElement FULLNAME_ELEMENT;
		@FindBy(how = How.XPATH,  using = "//*[@id='cid']")WebElement COMPANY_DROPDOWN_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id='email']")WebElement EMAIL_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id='phone']")WebElement PHONE_ELEMENT;
		@FindBy(how = How.XPATH , using = "//*[@id='address']")WebElement ADDRESS_ELEMENT;
		@FindBy(how = How.XPATH , using = "//*[@id='city']")WebElement CITY_ELEMENT;
		@FindBy(how = How.XPATH , using = "//*[@id='state']")WebElement STATE_ELEMENT;
		@FindBy(how = How.XPATH , using = "//*[@id='zip']")WebElement ZIP_ELEMENT;
		@FindBy(how = How.XPATH , using = "//*[@id=\"country\"]")WebElement COUNTRY_ELEMENT;
		@FindBy(how = How.XPATH , using = "//*[@id='submit']")WebElement SAVE_BUTTON_ELEMENT;
		@FindBy(how =How.XPATH , using = "//a[contains(text(),'Add Customers']")WebElement ADD_CUSTOMER_ELEMENT;
		@FindBy(how =How.XPATH , using = "//a[contains(text(),'List Customers']")WebElement LIST_CUSTOMER_ELEMENT;
		
		String insertedname;
		public void insertFullName(String FullName)
		{
			int genNum = generateRandomNum(999);
			insertedname=FullName+genNum;
			FULLNAME_ELEMENT.sendKeys(insertedname);
		}
	
		public void selectCompanyDropDown(String Company)
		{
			selectFromDropDown(COMPANY_DROPDOWN_ELEMENT , Company);	
		}
		
		public void insertEmail(String email)
		{
			String insertedEmail = generateRandomNum(9999) + email;
			EMAIL_ELEMENT.sendKeys(insertedEmail);
		}
	
		public void insertPhone(String phone)
		{
		PHONE_ELEMENT.sendKeys(phone + generateRandomNum(9999));	
		}
		
		public void insertaddress(String address)
		{
			ADDRESS_ELEMENT.sendKeys(address);
		}
		
		public void insertcity(String city)
		{
			CITY_ELEMENT.sendKeys(city);
		}
		
		public void insertState(String state)
		{
			STATE_ELEMENT.sendKeys(state);
		}
		
		public void insertZip(String zip)
		{
			ZIP_ELEMENT.sendKeys(zip);
		}
		
		public void insertCountry(String country)
		{
			selectFromDropDown(COUNTRY_ELEMENT, country);
		}
		
		public void ClicksaveButton()
		{
			 SAVE_BUTTON_ELEMENT.click();
		}
		
		/*//tbody/tr[3]/td[3]/a
		 //tbody/tr[2]/td[3]
	   //tbody/tr[3]/td[3]
	    //tbody/tr[i]/td[3]
	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[3]/a";
	
	public void verifyInsertedName()
	{
		for(int i =0; i<=10; i++)
		{
			String enteredName = driver.findElement(By.xpath(before_xpath  + i  + after_xpath)).getText();
			System.out.println(enteredName);
			//Assert.assertEquals(enteredName, insertname , "entered name does not match");
			if(enteredName.contentEquals(insertname))
			{
				System.out.println("Entered name matched");
			}
		}
	}*/
	
		//String before_xpath ="//tbody/tr[";
		//String after_xpath = "]/td[3]";
		
		
		/*public void verifyInsertednmae()
		{
		for(int i=1; i<=10; i++)
		{
			String enteredname = driver.findElement(By.xpath(before_xpath + i +after_xpath)).getText();
			System.out.println(enteredname );
			Assert.assertEquals(enteredname, insertedname , "inserted name is not available");
			break;
		}
		
		}*/
		
		
		String befor_xpath ="//tbody/tr[";
		String after_xpath = "]/td[3]";
		String after_xpath_delete ="]/td[3]/following-sibling::td[4]/a[2]";
		
		public void verifyInsertedCustomeraNameAnddelete()
		{
		for(int i=1; i<=10; i++)
		{
			String enteredname = driver.findElement(By.xpath(befor_xpath + i +after_xpath)).getText();
			if(enteredname.contentEquals(insertedname))
			{
				System.out.println("Inserted name exist");
				driver.findElement(By.xpath(befor_xpath  + i + after_xpath_delete)).click();
			}
			
		}
		
		}

		
		
		
	
	
	
	
	
}
