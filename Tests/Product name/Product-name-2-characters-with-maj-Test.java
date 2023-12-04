// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Productname2characterswithmajTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void productname2characterswithmaj() {
    // Test name: Product name 2 characters with maj
    // Step # | name | target | value | comment
    // 1 | open | https://skrylexx.github.io/Products_CRUDS/ |  | 
    driver.get("https://skrylexx.github.io/Products_CRUDS/");
    // 2 | setWindowSize | 974x1039 |  | 
    driver.manage().window().setSize(new Dimension(974, 1039));
    // 3 | click | id=inputName |  | 
    driver.findElement(By.id("inputName")).click();
    // 4 | type | id=inputName | Aa | 
    driver.findElement(By.id("inputName")).sendKeys("Aa");
    // 5 | click | id=inputPrice |  | 
    driver.findElement(By.id("inputPrice")).click();
    // 6 | type | id=inputPrice | 751 | 
    driver.findElement(By.id("inputPrice")).sendKeys("751");
    // 7 | click | id=inputCondition |  | 
    driver.findElement(By.id("inputCondition")).click();
    // 8 | select | id=inputCondition | label=Bad | 
    {
      WebElement dropdown = driver.findElement(By.id("inputCondition"));
      dropdown.findElement(By.xpath("//option[. = 'Bad']")).click();
    }
  }
}
