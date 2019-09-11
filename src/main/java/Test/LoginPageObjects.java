package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class LoginPageObjects 
{
 
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By id= By.id("form1");
	By proceed= By.id("proceed-button");
	
	
	public WebElement getid()
	{
		return driver.findElement(id);
	}
	
	public WebElement proceed()
	{
		return driver.findElement(proceed);
	}
	
}
