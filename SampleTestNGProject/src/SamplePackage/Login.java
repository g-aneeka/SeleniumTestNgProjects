package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    String driverPath = "D:\\VMware Workspace\\DriverFile\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ;
    
    
    @BeforeTest
    public void launchBrowser() {
    	System.out.println("launching chrome browser");
    	System.setProperty("webdriver.chrome.driver", driverPath);
    	driver = new ChromeDriver();
    	driver.get(baseUrl);
    }
    
    
  @Test//(priority = 0)
  public void HomeTitleVerify() {
      String expectedTitle = "OrangeHRM";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      System.out.println(actualTitle);
  }
     
  @Test//(priority = 1)    
  public void LoginValidation() {
      WebElement username=driver.findElement(By.id("txtUsername")); 
      WebElement password=driver.findElement(By.id("txtPassword")); 
      WebElement login=driver.findElement(By.id("btnLogin")); 
      username.clear();
      password.clear();
      System.out.println("Text Field Cleared");
      username.sendKeys("Admin"); password.sendKeys("admin123"); 
      login.click(); 
      String actualUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard"; 
      String expectedUrl= driver.getCurrentUrl(); 
      //Assert.assertEquals(expectedUrl,actualUrl);
      if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
    	  System.out.println("Test passed"); 
    	  } 
      else { 
    	  System.out.println("Test failed"); 
    	  }
      
      
  }
  
  
  @AfterTest
  public void terminateBrowser(){
	  driver.close();
  }
  
  
}
