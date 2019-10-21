package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	
	public WebDriver logon() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Jata\\groupTest\\src\\main\\java\\resources\\source.properties");		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String url =prop.getProperty("URL");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", url);
			driver=new ChromeDriver();
		}		
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver",url);
			driver=new ChromeDriver();
		}		
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", url);
			driver=new ChromeDriver();
		}
		
		return driver;
		
	}
}
