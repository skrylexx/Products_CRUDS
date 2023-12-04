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
public class ProductconditionTest {
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
  public void productcategoryempty() {
    // Test name: Product-category-empty
    // Step # | name | target | value | comment
    // 1 | open | https://skrylexx.github.io/Products_CRUDS/ |  | 
    driver.get("https://skrylexx.github.io/Products_CRUDS/");
    // 2 | setWindowSize | 974x1032 |  | 
    driver.manage().window().setSize(new Dimension(974, 1032));
    // 3 | click | id=inputName |  | 
    driver.findElement(By.id("inputName")).click();
    // 4 | type | id=inputName | Aaa | 
    driver.findElement(By.id("inputName")).sendKeys("Aaa");
    // 5 | click | id=inputPrice |  | 
    driver.findElement(By.id("inputPrice")).click();
    // 6 | type | id=inputPrice | 750 | 
    driver.findElement(By.id("inputPrice")).sendKeys("750");
    // 7 | click | id=inputCategory |  | 
    driver.findElement(By.id("inputCategory")).click();
    // 8 | select | id=inputCategory | label=MOBILE | 
    {
      WebElement dropdown = driver.findElement(By.id("inputCategory"));
      dropdown.findElement(By.xpath("//option[. = 'MOBILE']")).click();
    }
    // 9 | click | id=btnAdd |  | 
    driver.findElement(By.id("btnAdd")).click();
    // 10 | click | id=alertCondition |  | 
    driver.findElement(By.id("alertCondition")).click();
    // 11 | assertElementPresent | id=alertCondition |  | 
    {
      List<WebElement> elements = driver.findElements(By.id("alertCondition"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void productcategoryfilled() {
    // Test name: Product-category-filled
    // Step # | name | target | value | comment
    // 1 | open | https://skrylexx.github.io/Products_CRUDS/ |  | 
    driver.get("https://skrylexx.github.io/Products_CRUDS/");
    // 2 | setWindowSize | 974x1032 |  | 
    driver.manage().window().setSize(new Dimension(974, 1032));
    // 3 | click | id=inputName |  | 
    driver.findElement(By.id("inputName")).click();
    // 4 | type | id=inputName | Aaa | 
    driver.findElement(By.id("inputName")).sendKeys("Aaa");
    // 5 | click | id=inputPrice |  | 
    driver.findElement(By.id("inputPrice")).click();
    // 6 | type | id=inputPrice | 741 | 
    driver.findElement(By.id("inputPrice")).sendKeys("741");
    // 7 | click | id=inputCategory |  | 
    driver.findElement(By.id("inputCategory")).click();
    // 8 | select | id=inputCategory | label=MOBILE | 
    {
      WebElement dropdown = driver.findElement(By.id("inputCategory"));
      dropdown.findElement(By.xpath("//option[. = 'MOBILE']")).click();
    }
    // 9 | click | id=inputCondition |  | 
    driver.findElement(By.id("inputCondition")).click();
    // 10 | select | id=inputCondition | label=Good | 
    {
      WebElement dropdown = driver.findElement(By.id("inputCondition"));
      dropdown.findElement(By.xpath("//option[. = 'Good']")).click();
    }
    // 11 | click | id=btnAdd |  | 
    driver.findElement(By.id("btnAdd")).click();
  }
}
