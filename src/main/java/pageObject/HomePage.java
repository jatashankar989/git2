package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;	
	By Log = By.linkText("Login");	
	By text= By.xpath("//div[@class='text-center']/h2");
	By Navigation = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public WebElement Log()
	{
		return driver.findElement(Log);
	}
	
	public WebElement text()
	{
		return driver.findElement(text);
	}
	
	public WebElement Navigation()
	{
		return driver.findElement(Navigation);
	}
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	

}
