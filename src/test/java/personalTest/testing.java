package personalTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.Log;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import resources.base;

public class testing  extends base{

	public static Logger log = LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void startingCommand() throws IOException
	{
		
	}
	
    @Test(dataProvider="getData")
    public void login(String Username, String Password) throws IOException
	{
    	driver=logon();
     	driver.get("http://www.qaclickacademy.com");
	     	log.info("Succesfully invoke the URL");
	        HomePage hp = new HomePage(driver);
	        hp.Log().click();	        
	        log.info("Succesfully click on the Login Anchor Tab");
	        LoginPage lp =new LoginPage(driver);
	        lp.Uname().sendKeys(Username);
	        lp.Password().sendKeys(Password);
	        log.info("Successfully Enter the UserName and the password on the Field");
	        lp.button().click();	     
	}
    @DataProvider
    public Object[][] getData()
    {
    	Object[][] data = new Object[1][2];   	
    	data[0][0]="rajashankar@gmail.com";
    	data[0][1]="jaibabaji";    	
    	return data;   	
    }
    
    @AfterTest
    public void closingCommand()
    {
    	driver.close();
    }
}
