package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By Uname = By.xpath("//input[@id='user_email']");
	By pwd = By.xpath("//input[@id='user_password']");	
	By button = By.xpath("//input[@value='Log In']");
	
	public WebElement Uname()
	{
		return driver.findElement(Uname);
	}
	
	public WebElement Password()
	{
		return driver.findElement(pwd);
	}

	public WebElement button()
	{
		return driver.findElement(button);
	}
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
}
