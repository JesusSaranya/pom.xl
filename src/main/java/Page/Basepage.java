package Page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basepage {

	
	public void selectFromDropDown(WebElement element , String visibleText)
	{
		Select sel = new Select(element);
				sel.selectByVisibleText(visibleText);
	}
	
	public int generateRandomNum(int bountryNum)
	{
		Random rd = new Random();
		int generateNum =rd.nextInt(bountryNum);
		return generateNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
