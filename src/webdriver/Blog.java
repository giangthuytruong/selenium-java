package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Blog {
 
    public static WebDriver driver;
 
    @BeforeTest
    public void setUp() {
    	//String projectPath = System.getProperty("user.dir");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\selenium-java-testng\\browserDriver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
 
        // to launch the chrome browser window
        driver = new ChromeDriver(options);
 
    }
 
    @Test
    public void loginPage() {
        driver.get("https://www.google.com/");
 
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("pcloudy");
        searchField.sendKeys(Keys.ENTER);
 
        WebElement pcloudyLink = driver.findElement(By.xpath("//a[@class='B1uW2d ellip PZPZlf']"));
        pcloudyLink.click();
 
        WebElement loginPage = driver.findElement(By.xpath("//*[text()='Login']"));
        loginPage.click();
    }
 
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
