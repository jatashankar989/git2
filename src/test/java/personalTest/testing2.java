package personalTest;

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


public class testing2  extends base{

	public static Logger log = LogManager.getLogger(base.class.getName());		
    @Test
    public void login() throws IOException
	{
    	driver=logon();
     	driver.get("http://www.qaclickacademy.com");
       log.info("Succesfully reached on Site");
	     	
	        HomePage hp = new HomePage(driver);
	        //Assert.assertEquals(hp.text().getText(),"FEATURED");
	        Assert.assertTrue(hp.Navigation().isDisplayed());	
	        log.info("Found the Navigation Messge on the website");
	}
    @AfterTest   
    public void endingClause()
    {
      driver.close();	
      log.info("Succesfully close the browser");
    }
    
    
    
    
    
}
