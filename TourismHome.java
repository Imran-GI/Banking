package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TourismHome {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://nichethyself.com/tourism/home.html");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("stc123");
	  driver.findElement(By.name("password")).sendKeys("12345");
	  driver.findElement(By.xpath("//form[@name='loginform']/button")).click();
	  String expectedOutput = driver.getTitle();
	  
	  if(driver.getTitle().equals(expectedOutput)){
		  System.out.println("Login Successfull");
	  }
	  else
	  {
		  System.out.println("Login Unsuccessfull");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\workspace\\WebDriverTraining\\Test\\Resources\\chromedriver-91.exe");
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
