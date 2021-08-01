package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class HerocuappDropdown {
	WebDriver driver;
  @Test
  public void option2(){
	  driver.get("http://the-internet.herokuapp.com/dropdown");
	  WebElement makeDropdown = driver.findElement(By.id("dropdown"));
	  Select dropdown = new Select(makeDropdown);
	  dropdown.selectByVisibleText("Option 2");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\workspace\\WebDriverTraining\\Test\\Resources\\chromedriver-91.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
