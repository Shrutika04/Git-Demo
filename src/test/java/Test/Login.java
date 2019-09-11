package Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login 
{
	
	public WebDriver driver;
 @Test
 public void base()
	{
	 	//System.out.println(System.getProperty("user.dir"));
	 	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.ultimatix.net");
        LoginPageObjects lo = new LoginPageObjects(driver);
        lo.getid().sendKeys("1194957");
        lo.proceed().click();
        
	}
 
 public void GitTestClass()
 {
	
	 System.out.println("This is demo git program");
			 
 }
}
