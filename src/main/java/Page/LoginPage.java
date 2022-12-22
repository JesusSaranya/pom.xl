package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	 //WebElement List
	@FindBy(how = How.XPATH , using = "//input[@id='username']")WebElement UserName_Element;
	@FindBy(how = How.XPATH , using = "//input[@id='password']")WebElement PassWord_Element;
	@FindBy(how = How.XPATH , using = "//button[@name='login']")WebElement SignInButton_Element;
	
	
	//Corresponding Methods
	public void insertUserName(String userName)
	{
		 UserName_Element.sendKeys(userName);
	}
	
	public void insertPassWord(String passWord)
	{
		PassWord_Element.sendKeys(passWord);
	}
	
	public void ClickSignInButton()
	{
		SignInButton_Element.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
