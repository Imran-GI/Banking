package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MultiSelectCars {
	RemoteWebDriver driver;
  @Test
  public void handlingMultiSelect() throws InterruptedException {
	  driver.get("https://demoqa.com/select-menu");
	  driver.manage().window().maximize();
	  WebElement MultiSelect = driver.findElement(By.id("cars"));
	  Select ColorSelect = new Select(MultiSelect);
	  ColorSelect.selectByVisibleText("Volvo");
	  Thread.sleep(2000);
	  ColorSelect.selectByVisibleText("Saab");
	  Thread.sleep(2000);
	  ColorSelect.selectByVisibleText("Opel");
	  Thread.sleep(2000);
	  ColorSelect.selectByVisibleText("Audi");
	  Thread.sleep(4000);
	  System.out.println(ColorSelect.getAllSelectedOptions().size());
	  ColorSelect.deselectByVisibleText("Saab");
	  Thread.sleep(3000);
	  ColorSelect.deselectByVisibleText("Opel");
	System.out.println("For Git");
	  
  }
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace\\WebDriverTraining\\Test\\Resources\\chromedriver-91.exe");
	  //driver = new ChromeDriver();
	  DesiredCapabilities caps = new DesiredCapabilities();
	  	caps.setBrowserName("chrome");
	  driver = new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"), caps);


  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
