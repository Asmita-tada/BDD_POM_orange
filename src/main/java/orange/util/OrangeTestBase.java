package orange.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class OrangeTestBase
{
	public static WebDriver driver;
    public static Properties prop;
    
    public OrangeTestBase() throws IOException {
    
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Selenium_WorkSpace\\BDD_POM_OrangeHRMF\\src\\main\\java\\orange\\config\\config.properties");
        prop.load(fis);
    }
    
    public static void initializeOrange() {
        
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);
        if(browserName.equals("Firefox")) {
            System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(OrangeTestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(OrangeTestUtil.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        
        driver.get(prop.getProperty("url"));
    }
	
	

}
